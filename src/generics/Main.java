package generics;

public class Main {
    public static void main(String[] args) {
        Player joe = new BaseballPlayer("Joe");
        Player pat = new FootballPlayer("Pat");
        Player beckham = new SoccerPlayer("Beckham");

        Team team = new Team("Team");
        team.addPlayer(joe);
        team.addPlayer(pat);
        team.addPlayer(beckham);

        System.out.println(team.numPlayer());
    }
}
