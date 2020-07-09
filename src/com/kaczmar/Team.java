package com.kaczmar;

public class Team<T extends Sport> implements Comparable<Team<T>> {

    private String teamName;
    private int win = 0;
    private int lose = 0;
    private int draw = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public int getScore(){
        return win * 3 + draw;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getScore() > team.getScore()){
            return -1;
        }else if(this.getScore() < team.getScore()){
            return 1;
        }else {
            return 0;
        }
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public String getTeamName() {
        return teamName;
    }


    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getDraw() {
        return draw;
    }

    @Override
    public String toString() {
        return getTeamName() + " " + getScore() + " " + getWin() + " " + getDraw() + " " + getLose();
    }
}
