package com.scoutingApp.FIRST2020;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SubmittedData implements Serializable {
    //each instance of this class is a final submission object
    private boolean mainDefense;
    private boolean mainClimb;
    private boolean park;

    private boolean extrasRedCard;
    private boolean extrasYellowCard;
    private boolean noShow;
    private boolean movement;
    private int extrasFinalScore;

    private int team;
    private String match;
    private String name;
    private String alliance;
    private String notes = "";

    private boolean revolve;
    private boolean select;
    private int pg1;
    private int pg2;
    private int pg3;
    private int apg1;
    private int apg2;
    private int apg3;

    List<Object> setValues() {
        return Arrays.asList(
            ((Object)mainDefense),
            mainClimb,
            extrasRedCard,
            extrasYellowCard,
            noShow,
            movement,
            extrasFinalScore,
            team,
            match,
            name,
            alliance,
            notes,
            revolve,
            select,
            pg1,
            pg2,
            pg3,
            apg1,
            apg2,
            apg3,
            park
        );
    }

    void setPark(boolean park) { this.park = park; }
    void setApg1(int apg1) { this.apg1 = apg1; }
    void setApg2(int apg2) { this.apg2 = apg2; }
    void setApg3(int apg3) { this.apg3 = apg3; }
    void setRevolve(boolean revolve) {
        this.revolve = revolve;
    }
    void setSelect(boolean select) {
        this.select = select;
    }
    void setPg1(int pg1) {
        this.pg1 = pg1;
    }
    void setPg2(int pg2) {
        this.pg2 = pg2;
    }
    void setPg3(int pg3) {
        this.pg3 = pg3;
    }
    void setNotes(String notes) {this.notes = notes;}
    void setMainDefense(boolean mainDefense) {this.mainDefense = mainDefense;}
    void setMainClimb(boolean mainClimb) {this.mainClimb = mainClimb;}
    void setExtrasRedCard(boolean extrasRedCard) {this.extrasRedCard = extrasRedCard;}
    void setExtrasYellowCard(boolean extrasYellowCard) {this.extrasYellowCard = extrasYellowCard;}
    void setNoShow(boolean noShow) {this.noShow = noShow;}
    void setMovement(boolean movement) {this.movement = movement;}
    void setExtrasFinalScore(int extrasFinalScore) {this.extrasFinalScore = extrasFinalScore;}
    void setTeam(int team) {this.team = team;}
    void setMatch(String match) {this.match = match;}
    public void setName(String name) {this.name = name;}
    void setAlliance(String alliance) {this.alliance = alliance;}

    String getMatchNumber() {return match;}
}
