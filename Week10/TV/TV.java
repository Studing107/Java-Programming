package com.zjnu.tv;

public class TV {
    int channel = 1;
    int volimeLevel = 1;
    boolean on = false;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120)
            this.channel = channel;
    }

    public void setVolime(int volimeLevel) {
        if(on&&volimeLevel>=1&&volimeLevel<=7) {
            this.volimeLevel = volimeLevel;
        }
    }
    public void channelUp(){
        if(on&&channel<120)
            channel++;
    }
    public void channelDown(){
        if(on&&channel>1)
            channel--;
    }
    public void volimeUp(){
        if(on&&volimeLevel<7)
            volimeLevel++;
    }
    public void volimeDown(){
        if(on&&volimeLevel>1)
            volimeLevel--;
    }
}

