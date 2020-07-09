package com.kaczmar;

public class Main {

    public static void main(String[] args) {

        League<Team<Football>> NFL = new League<>("NFL");
        Team<Football> minesota_vikings = new Team<>("Minesota Vikings");
        Team<Football> new_england_patriots = new Team<>("New England Patriots");
        Team<Football> buffalo_bills = new Team<>("Buffalo Bills");
        Team<Football> tenesee_titans = new Team<>("Tenesee Titans");
        Team<Basketball> chicago_bulls = new Team<>("Chicago Bulls");

        NFL.addTeamToTheLeague(minesota_vikings);
        NFL.addTeamToTheLeague(new_england_patriots);
        NFL.addTeamToTheLeague(new_england_patriots);
        NFL.addTeamToTheLeague(buffalo_bills);
        NFL.addTeamToTheLeague(tenesee_titans);

        NFL.gameDay(minesota_vikings, 24, buffalo_bills,21);
        NFL.gameDay(minesota_vikings, 13, new_england_patriots,21);
        NFL.gameDay(tenesee_titans, 24, minesota_vikings,42);
        NFL.gameDay(new_england_patriots, 24, buffalo_bills,21);
        NFL.gameDay(new_england_patriots, 24, tenesee_titans,21);
        NFL.gameDay(buffalo_bills, 10, tenesee_titans,10);

        NFL.showLeagueTable();


    }
}
