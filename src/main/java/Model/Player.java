package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player implements Comparable<Player>{

    public static List<Player> playerList = new ArrayList<>();

    public String username;
    public String nickname;
    public String password;
    public int highScore;
    public int coins;
    public int level;
    public int experience;
    private int BestTime;

    private Player(String username,String nickname,String password){
        this.username=username;
        this.nickname=nickname;
        this.password=password;
        this.coins = 0;
        this.highScore = 0;
        this.level = 1;
        this.experience = 0;
        this.BestTime = Integer.MAX_VALUE ;
    }

    public void gameOverUpdate(int coins , int score , int timer){
        this.coins+=coins;
        experience+=score;
        if(highScore<score){
            highScore=score;
        }
        if(BestTime>timer){
            BestTime = timer;
        }
        updateLevel();
    }
    private void updateLevel(){
        while(experience>(level*level)*5){
            experience-=((level*level)*5);
            level++;
        }
    }

    public int getBestTime() {
        return BestTime;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void setBestTime(int bestTime) {
        BestTime = bestTime;
    }

    public static List<Player> getSortedPlayerListByBestTime(){
//        List<Player> tempPlayers = new ArrayList<>() ;
//        tempPlayers.addAll(playerList);
//
//        Collections.sort(tempPlayers, Comparator.comparing(Player::getBestTime).reversed().thenComparing(Player::getLevel).thenComparing(Player::getExperience));
//        return tempPlayers ;
        List<Player> sortedPlayers = new ArrayList<>(playerList); // Create a copy of the original list
        Collections.sort(sortedPlayers); // Sort using the compareTo method
        return sortedPlayers;
    }

    public static Result addPlayer(String username, String nickname, String password){
        if (!username.matches("[\\w\\d_]+")){
            return new Result(false, "Name can only contains letters and numbers and underscore!");
        }
        if(getPlayerByUsername(username)!=null){
            return new Result(false , "This user already exists!");
        }
        if ((password.length()<8 || password.length()>30)){
            return new Result(false, "Password is too short or too long!");
        }
        if ((!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*") || !password.matches(".*[]!@#$%^&*()_+\\-=\\[\\]{}?<>/?~].*")) && !password.equals("random")){
            return new Result(false, "Password is too weak!");
        }
        playerList.add(new Player(username,nickname,password));
        return new Result(true , "");
    }
    public static Player getPlayerByUsername(String username){
        for (Player player : playerList) {
            if (player.username.equals(username)) {
                return player;
            }
        }
        return null;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        // Compare based on best time (ascending order)
        int timeComparison = Double.compare(this.BestTime, otherPlayer.BestTime);
        if (timeComparison != 0) {
            return timeComparison;
        }

        // If best time is the same, compare by level (descending order)
        int levelComparison = Integer.compare(otherPlayer.level, this.level);
        if (levelComparison != 0) {
            return levelComparison;
        }

        // If level is also the same, compare by experience (descending order)
        return Integer.compare(otherPlayer.experience , this.experience);
    }

}
