package com.jude;

/**
 * Created by tengf on 2016/10/26.
 */
public class HeartsPrisoner implements Prisoner {
    int totalCount;
    int totalPerson;
    @Override
    public String getName() {
        return "滕飞宇2016212694";
    }
    @Override
    public void begin(Manager manager,int totalPerson,int totalCount){
        this.totalCount = totalCount;
        this.totalPerson = totalPerson;
    }

    @Override
    public int take(int index, int last) {
        return ((totalCount-last)/(index+4) + totalCount/totalPerson)/2;

    }

    @Override
    public void result(boolean survived) {

    }
}
