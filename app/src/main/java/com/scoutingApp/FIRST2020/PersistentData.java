package com.scoutingApp.FIRST2020;

import java.io.Serializable;
import java.util.ArrayList;

class PersistentData implements Serializable {
    //local/cached data arrays

    ArrayList<SubmittedData> perSubData = new ArrayList<>();
    ArrayList<Info> perCacheData = new ArrayList<>();

    //variables that remain consistent

    private String perAlliance;
    private int rowNumber = 0;
    private SheetsAccess sheet = new SheetsAccess();
    private static int tabNum;

    static int getTabNum() {
        return tabNum;
    }

    static void setTabNum(int tabNum) {
        PersistentData.tabNum = tabNum;
    }
    //getters and setters

    SheetsAccess getSheet() {
        return sheet;
    }

    String getPerAlliance() {
        return perAlliance;
    }

    void setPerAlliance(String perAlliance) {
        this.perAlliance = perAlliance;
    }

    int getRowNumber() {
        return rowNumber;
    }

    void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }
}
