/**
 *
 *Title: MarketStock
 *
 *Author: Sean Laverty
 *
 *Course Section: CMIS201-ONL1 (Seidel) Fall 2022
 *
 * File: MarketStock.java
 *
 * Description: Abstract class of general attributes that get inhabited by the rest of the program
 *
 *
 * */
package com.cmis202projectassignments.assignmentnumber1again;
import java.util.Comparator;
public class MarketStock extends Instruments implements Comparable<MarketStock>{

    /**Attributes*/
    private String company;
    private double currentPrice;
    private double prevClosPrice;
    private double quarterlyPrice;
    private double annualStPrice;

    /**Constructor*/
    public MarketStock(String symbol) {
        super(symbol);
    }

    /**Constructor*/
    public MarketStock() {
        super();
    }
    /**Constructor*/
    public MarketStock(String symbol, String company, double currentPrice,
                       double prevClosPrice, double quarterlyPrice, double annualStPrice) {
        super(symbol);
        this.company = company;
        this.currentPrice = currentPrice;
        this.prevClosPrice = prevClosPrice;
        this.quarterlyPrice = quarterlyPrice;
        this.annualStPrice = annualStPrice;
    }

    /**Constructor*/
    public MarketStock(String symbol, long volume, double opening, double closing,
                       String company, double currentPrice, double prevClosPrice,
                       double quarterlyPrice, double annualStPrice) {

        super(symbol, volume, opening, closing);
        this.company = company;
        this.currentPrice = currentPrice;
        this.prevClosPrice = prevClosPrice;
        this.quarterlyPrice = quarterlyPrice;
        this.annualStPrice = annualStPrice;
    }


    /**Constructor*/
    public MarketStock(double currentPrice, double prevClosPrice, double quarterlyPrice, double annualStPrice) {
        this.currentPrice = currentPrice;
        this.prevClosPrice = prevClosPrice;
        this.quarterlyPrice = quarterlyPrice;
        this.annualStPrice = annualStPrice;
    }


    /////////////////////////////////////////////////////////////////

    /**Getter ad setter methods*/
    public String getCompany() {
        return company;
    }

    /**Getter ad setter methods*/
    public void setCompany(String company) {
        this.company = company;
    }

    /**Getter ad setter methods*/
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**Getter ad setter methods*/
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**Getter ad setter methods*/
    public double getPrevClosPrice() {
        return prevClosPrice;
    }

    /**Getter ad setter methods*/
    public void setPrevClosPrice(double prevClosPrice) {
        this.prevClosPrice = prevClosPrice;
    }

    /**Getter ad setter methods*/
    public double getQuarterlyPrice() {
        return quarterlyPrice;
    }

    /**Getter ad setter methods*/
    public void setQuarterlyPrice(double quarterlyPrice) {
        this.quarterlyPrice = quarterlyPrice;
    }

    /**Getter ad setter methods*/
    public double getAnnualPrice() {
        return annualStPrice;
    }

    /**Getter ad setter methods*/
    public void setAnnualPrice(double annualPrice) {
        this.annualStPrice = annualPrice;
    }

    ///////////////////////////////////////////////////////////////////
    /**
     The year to date/return % formula is as follows:
     Year to date = ((Current value - Beginning value) / Beginning value) * 100
     **/

    /**Net Change */
    public double getNetChange() {
        return (currentPrice - annualStPrice);
    }

    /**Daily Percent Change */
    public double getDailyPercentChange() {
        return ((currentPrice - prevClosPrice) / prevClosPrice) * 100;
    }

    /**Quarterly Percent Change */
    public double getQuarterlyPerChange(){
        return ((currentPrice - quarterlyPrice) /  quarterlyPrice) * 100;
    }

    /**YTD Percent Change */
    public double getYTDPercentChange(){
        return ((currentPrice - annualStPrice) /  annualStPrice) * 100;
    }
///////////////////////////////////////////////////////////////////////////////
//    /** Find monthly Return */
//    public double getMonthlyReturn() {
//        double monthlyInterestRate = annualInterestRate / 1200;
//        double monthlyReturn = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
//        return monthlyReturn;
//    }
////////////////////////////////////////////////////////////////////////
    /**toString*/
    @Override
    public String toString(){
        //DecimalFormat dfrmt = new DecimalFormat();
        String result=super.toString()+"\n";
        result += "Company: "+getCompany()+"\n";
        result +=  (getNetChange() > 0) ? "Net Change +" +((int)(getNetChange() * 100) / 100.0) :
                "NetChange:" + ((int)(getNetChange() * 100) / 100.0)+ "\n";
        result += String.format("Percent Change: %4.2f",getDailyPercentChange())+"%\n";
        result += String.format("QuarterlyChange: %4.2f", getQuarterlyPerChange())+"%\n";
        result += String.format("YTD Return: %4.2f",getYTDPercentChange())+"%\n";
        return result;
    }

//    /***/
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//    /***/
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**compareTo*/
    @Override
    public int compareTo(MarketStock s) {
        return company.compareTo(s.company);
    }

    /////////////////////////////////////////////////////////////////////////////

    /**Allow SortingUtility to compare and sort by the BY_SYMBOL
     * Comparator<MarketStock> BY_SYMBOL
     * */
    public static final Comparator<MarketStock> BY_SYMBOL = (s1, s2) -> s1.getSymbol().compareTo(s2.getSymbol());

    /** Allow SortingUtility to compare and sort by the BY_COMPANY
     * Comparator<MarketStock> BY_COMPANY
     * */
    public static final Comparator<MarketStock> BY_COMPANY = (s1, s2) -> s1.compareTo(s2);

    /** Allow SortingUtility to compare and sort by the BY_CURRENT_PRICE
     * Comparator<MarketStock> BY_CURRENT_PRICE
     * */
    public static final Comparator<MarketStock> BY_CURRENT_PRICE = (s1, s2) -> {

        if(s1.getCurrentPrice() < s2.getCurrentPrice())
            return -1;
        else if(s1.getCurrentPrice() > s2.getCurrentPrice())
            return 1;
        else
            return s1.getCompany().compareTo(s2.getCompany());
    };
    /**Allow SortingUtility to compare and sort by the BY_NET
     * Comparator<MarketStock> BY_NET
     * */
    public static final Comparator<MarketStock> BY_NET= (s1, s2) -> {

        if(s1.getNetChange() < s2.getNetChange())
            return -1;
        else if(s1.getNetChange() > s2.getNetChange())
            return 1;
        else
            return s1.getCompany().compareTo(s2.getCompany());
    };

    /**Allow SortingUtility to compare and sort by the BY_PERCENT_CHANGE
     * Comparator<MarketStock> BY_PERCENT_CHANGE
     * */
    public static final Comparator<MarketStock> BY_PERCENT_CHANGE = (s1, s2) -> {
        if(s1.getDailyPercentChange() < s2.getDailyPercentChange())
            return -1;
        else if (s1.getDailyPercentChange() > s2.getDailyPercentChange())
            return 1;
        else
            return s1.getCompany().compareTo(s2.getCompany());

    };

    /**Allow SortingUtility to compare and sort by the BY_QUART
     *  Comparator<MarketStock> BY_PERCENT_CHANGE
     * */
    public static final Comparator<MarketStock> BY_QUART = (s1, s2) -> {
        if(s1.getQuarterlyPerChange() < s2.getQuarterlyPerChange())
            return -1;
        else if (s1.getQuarterlyPerChange() > s2.getQuarterlyPerChange())
            return 1;
        else
            return s1.getCompany().compareTo(s2.getCompany());

    };

    /**Allow SortingUtility to compare and sort by the BY_YTD
     * Comparator<MarketStock> BY_YTD
     * */
    public static final Comparator<MarketStock> BY_YTD = (s1, s2) -> {
        if(s1.getYTDPercentChange() < s2.getYTDPercentChange())
            return -1;
        else if (s1.getYTDPercentChange() > s2.getYTDPercentChange())
            return 1;
        else
            return s1.getCompany().compareTo(s2.getCompany());

    };
}
