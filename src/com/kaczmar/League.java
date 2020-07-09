package com.kaczmar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>{


    private String leagueName;
    private List<T> leagueMembers = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeamToTheLeague(T team){
        if(leagueMembers.contains(team)){
            System.out.println("Sorry we can't add your team to the league, becasue it exists");
            return false;
        }else {
            leagueMembers.add(team);
            System.out.println("Team added to the league");
            return true;
        }
    }

    public void gameDay(T firstTeam, int firstTeamPoints, T secondTeam, int secondTeamPoints){
        if(firstTeamPoints > secondTeamPoints){
            firstTeam.setWin(firstTeam.getWin() + 1);
            secondTeam.setLose(secondTeam.getLose() + 1);
        }else if(firstTeamPoints < secondTeamPoints){
            secondTeam.setWin(secondTeam.getWin() + 1);
            firstTeam.setLose(firstTeam.getLose() + 1);
        }else{
            firstTeam.setDraw(firstTeam.getDraw() + 1);
            secondTeam.setDraw(firstTeam.getDraw() + 1);
        }

    }

    public void showLeagueTable(){
        Collections.sort(leagueMembers);
        int i = 1;
        System.out.println("Welcome in: " + leagueName);
        for(T t : leagueMembers){
            System.out.println(i + " " + t.toString());
            i++;
        }
    }

//    @Override
//    public int compareTo(League<T> o) {
//        return 0;
//    }

//    public void printALeague(){
//        System.out.println("Hi, it is league: " + leagueName);
//        System.out.println("Check the table:");
//        Collections.sort(leagueMembers);
//    }

}
