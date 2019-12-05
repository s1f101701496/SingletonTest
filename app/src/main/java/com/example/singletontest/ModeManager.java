package com.example.singletontest;

import android.graphics.Color;

public class ModeManager {
    private static final ModeManager ourInstance = new ModeManager();

    private  DisplayMode mode;
    private int bgColor;
    private int fontColor;
    private float fontSize;

    public static ModeManager getInstance() { return ourInstance; }

    private ModeManager() {
        changeMode(DisplayMode.Default);
    }

    public void changeMode(DisplayMode mode) {
        if(mode == DisplayMode.Default) {
            bgColor = Color.WHITE;
            fontColor = Color.BLACK;
            fontSize = 14;
        }else if (mode == DisplayMode.Easy){
            bgColor = Color.BLACK;
            fontColor = Color.WHITE;
            fontSize = 30;

        }
       // ModeManager modeManager = ModeManager.getInstance()

    }

    public DisplayMode getMode() { return this.mode; }

    public int getBgColor(){ return this.bgColor; }

    public int getFontColor(){ return this.fontColor; }


    public float getFontSize() { return fontSize; }


}
//test
