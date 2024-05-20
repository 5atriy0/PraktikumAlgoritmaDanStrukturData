package Pertemuan14Kuis2;

/**
 * EplMain
 */
public class EplMain {

    public static void main(String[] args) {
        Epl team = new Epl();

        team.addTeam("Arsenal", 38, 18, 7, 13, 61, 55, 39, 16);
        team.addTeam("Liverpool", 38, 20, 9, 9, 69, 68, 42, 26);
        team.addTeam("Manchester City", 38, 27, 5, 6, 86, 83, 32, 51);
        team.addTeam("Manchester United", 38, 21, 11, 6, 74, 73, 44, 29);
        team.addTeam("Chelsea", 38, 19, 10, 9, 67, 58, 36, 22);
        team.addTeam("West Ham United", 38, 19, 8, 11, 65, 62, 47, 15);
        team.addTeam("Leicester City", 38, 20, 6, 12, 66, 68, 50, 18);
        team.addTeam("Tottenham Hotspur", 38, 18, 8, 12, 62, 68, 45, 23);
        team.addTeam("Leeds United", 38, 18, 5, 15, 59, 62, 54, 8);
        team.addTeam("Aston Villa", 38, 16, 7, 15, 55, 55, 46, 9);
        team.addTeam("Everton", 38, 17, 8, 13, 59, 47, 48, -1);
        team.addTeam("Wolverhampton Wanderers", 38, 12, 9, 17, 45, 36, 52, -16);
        team.addTeam("Sheffield United", 38, 7, 2, 29, 23, 20, 63, -43);
        team.addTeam("West Bromwich Albion", 38, 5, 11, 22, 26, 35, 76, -41);
        team.addTeam("Burnley", 38, 10, 9, 19, 39, 33, 55, -22);
        team.addTeam("Fullham", 38, 5, 13, 20, 28, 27, 53, -26);
        team.addTeam("Crystal Palace", 38, 12, 8, 18, 44, 41, 66, -25);
        team.addTeam("Southampton", 38, 12, 7, 19, 43, 47, 68, -21);
        team.addTeam("Brighton & Hove Albion", 38, 9, 14, 15, 41, 40, 46, -46);
        team.addTeam("Newcastle United", 38, 12, 9, 17, 45, 46, 62, -16);

        team.bubbleSort();
        team.print();
    }
}