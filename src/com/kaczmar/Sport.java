package com.kaczmar;

public abstract class Sport {

    private String sportName;

    public Sport(String sportName) {
        this.sportName = sportName;
    }

    public String getSportName() {
        return sportName;
    }
}
