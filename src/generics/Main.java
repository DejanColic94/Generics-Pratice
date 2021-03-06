package generics;

public class Main {
    public static void main(String[] args) {
        BaseballPlayer joe = new BaseballPlayer("Joe");
        FootballPlayer pat = new FootballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<BaseballPlayer> team = new Team<>("Team");
        team.addPlayer(joe);
//        team.addPlayer(pat);
//        team.addPlayer(beckham);

        System.out.println(team.numPlayer());

        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester United");
        soccerTeam.addPlayer(beckham);


//        Team<String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("Fake team");


        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> inter = new Team<>("Inter");
        Team<SoccerPlayer> juventus = new Team<>("Juventus");

        liverpool.matchResult(juventus,2,1);
        inter.matchResult(juventus,7,0);


        System.out.println("Rankings :");
        System.out.println(liverpool.getName() + " : " + liverpool.ranking());
        System.out.println(inter.getName() + " : " + inter.ranking());
        System.out.println(juventus.getName() + " : " + juventus.ranking());

        System.out.println(liverpool.compareTo(juventus));
        System.out.println(juventus.compareTo(inter));
        System.out.println(inter.compareTo(liverpool));
    }
}
