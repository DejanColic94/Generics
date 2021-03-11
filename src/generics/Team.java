package generics;

import java.util.ArrayList;

public class Team<T> {
    private String name;
    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private int played = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getTied() {
        return tied;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<T> members) {
        this.members = members;
    }

    public boolean addPlayer (T player) {
        if(members.contains(player)) {
            System.out.println("Player "+((Player)player).getName()+" is already on the team.");
            return false;
        }else {
            members.add(player);
            System.out.println("Player "+((Player)player).getName()+" picked for team "+this.name);
            return true;
        }
    }

    public int numPlayer() {
        return members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
            System.out.println("Won against "+opponent.getName());
        }else if(ourScore < theirScore) {
            lost++;
            System.out.println("Lost to "+opponent.getName());
        }else {
            tied++;
            System.out.println("Tied with "+opponent.getName());
        }
        played++;

        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}





















