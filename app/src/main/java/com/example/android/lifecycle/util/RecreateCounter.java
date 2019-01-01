package com.example.android.lifecycle.util;

public class RecreateCounter {
    private int recreateCount;
    private static RecreateCounter ourInstance = new RecreateCounter();

    //プライベートコンストラクタ
    private RecreateCounter(){
        recreateCount = 0;
    }

    public static RecreateCounter getInstance() {
        return ourInstance;
    }

    public void countUp(){
        recreateCount++;
    }
    public int getRecreateCount(){
        return recreateCount;
    }
    public void setRecreateCount(int count){
        this.recreateCount = count;
    }
}
