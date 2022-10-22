/**
 *
 *Title: Instruments
 *
 *Author: Sean Laverty
 *
 *Course Section: CMIS201-ONL1 (Seidel) Fall 2022
 *
 * File: Instruments.java
 *
 * Description: Abstract class of general attributes that get inhabited by the rest of the program
 *
 *
 * */
package com.cmis202projectassignments.assignmentnumber1again;

/** Attrubutes*/
public abstract class Instruments {
    private String symbol;
    private long volume;
    private double opening;
    private double closing;
    /**Constructor*/
    public Instruments(String symbol) {
        this.symbol = symbol;
    }
    /**Constructor*/
    public Instruments(String symbol, long volume, double opening, double closing) {
        this.symbol = symbol;
        this.volume = volume;
        this.opening = opening;
        this.closing = closing;
    }
    /**Constructor*/
    public Instruments() {
        super();
    }
    ////////////////////////////////////////////////////////////////////////////
    /**Getter ad setter methods*/
    public String getSymbol() {
        return symbol;
    }
    /**Getter ad setter methods*/
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    /**Getter ad setter methods*/
    public long getVolume() {
        return volume;
    }
    /**Getter ad setter methods*/
    public void setVolume(long volume) {
        this.volume = volume;
    }
    /**Getter ad setter methods*/
    public double getOpening() {
        return opening;
    }
    /**Getter ad setter methods*/
    public void setOpening(double opening) {
        this.opening = opening;
    }
    /**Getter ad setter methods*/
    public double getClosing() {
        return closing;
    }
    /**Getter ad setter methods*/
    public void setClosing(double closing) {
        this.closing = closing;
    }
    ////////////////////////////////////////////////////////////////////
    /**toString*/
    @Override
    public String toString() {
        return "[Symbol = '" + symbol +'\'' +
                ", volume = " + volume +
                ", opening = " + opening +
                ", closing = " + closing + ']';
    }

    /**equals method*/
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**abstract compareTo Method*/
    public abstract int compareTo(MarketStock s);
}
