/**
 *Title: SortTestDriver
 *
 *Author: Sean Laverty
 *
 *Course Section: CMIS201-ONL1 (Seidel) Fall 2022
 *
 * File: SortTestDriver.java
 *
 * Description: meant to test SortingUtilitys
 * */
package com.cmis202projectassignments.assignmentnumber1again;
import java.io.IOException;
import java.io.Serializable;

public class SortTestDriver<T extends Comparable<? super T>> implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // UserPortfolio p = new UserPortfolio();
//        MarketStock[] StockList = {
//        System.out.println("====USING MERGESORT CLASS=======");
//        m.mergeSort(StockList, 0, StockList.length - 1);
//        System.out.println(Arrays.toString(StockList));

//        System.out.println("***************************************************************");
//
//        System.out.println("====USING USER PORTFOLIO CLASS=======");
//
//        MarketStock tester1 = new MarketStock();
//        MarketStock tester2 = new MarketStock();
//        MarketStock tester3 = new MarketStock();
//
//        System.out.println((p.addStock(tester1)) ? "Added" : "Error");
//        System.out.println((p.addStock(tester2)) ? "Added" : "Error");
//        System.out.println((p.addStock(tester3)) ? "Added" : "Error");
//
//        //Original list
//        System.out.println("\n==== ORIGINAL LIST ===");
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        // Basic sort
//        System.out.println("\n==== BASIC SORT ===");
//        Collections.sort(p.getPortfolio());
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        // Sort by Ticker
//        System.out.println("\n==== SYMBOL SORT ===");
//        p.sort(MarketStock.BY_SYMBOL);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        // Sort by Name using Comparator
//        System.out.println("\n==== COMPARATOR NAME SORT ===");
//        p.sort(MarketStock.BY_COMPANY);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        // Sort by Price
//        System.out.println("\n==== CURRENT SORT ===");
//        p.sort(MarketStock.BY_CURRENT_PRICE);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        System.out.println("\n==== COMPARATOR BY_PERCENT_CHANGE SORT ===");
//        p.sort(MarketStock.BY_PERCENT_CHANGE);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        System.out.println("\n==== COMPARATOR BY_PERCENT_CHANGE SORT ===");
//        p.sort(MarketStock.BY_PERCENT_CHANGE);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        System.out.println("\n==== COMPARATOR BY_YTD SORT ===");
//        p.sort(MarketStock.BY_YTD);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
//        System.out.println("\n==== COMPARATOR BY_ROI SORT ===");
//        p.sort(MarketStock.BY_ROI);
//        p.listPortfolio();
//        System.out.println("***************************************************************");
////        System.out.println("\n==== COMPARATOR BY_ROI SORT ===");
////        p.sort(MarketStock.BY_ANNUAL_ROI);
////        p.listPortfolio();
//        System.out.println("***************************************************************");
//        System.out.println("***************************************************************");
//        String symbol, long volume, double opening, double closing,
//        String company, double currentPrice, double prevClosPrice,
//        double quarterlyPrice, double annualStPrice)
//        System.out.println("====USING HEAP SORT CLASS=======");
//        HeapSort<MarketStock> h = new HeapSort<>();
//        h.add(new MarketStock("(BGAIX)", 0, 25.49, 25.49,
//                "Baron Global Advantage Fund Institutional Shares",
//                25.49, 26.48, 28.57, 52.29));
//        h.add(new MarketStock("(SPIDX)", 0, 38.63, 38.63,
//                "Invesco S&P 500 Index Fund Class Y",
//                38.63, 39.57, 41.16, 51.18	));
//        h.add(new MarketStock("(VADDX)", 0, 63.46, 63.46,
//                "Invesco Equally-Weighted S&P 500 Fund Class Y",
//                63.46, 64.97, 66.75, 79.72));
//
//
//
//        System.out.println("***************************************************************");
//        //HeapSort<MarketStock> h1 = new HeapSort<>(MarketStock.BY_NET);
//
//        System.out.println("***************************************************************");
//        MergeSort<MarketStock> m = new MergeSort<>();
//        MarketStock[] stockList = {
//                new MarketStock("(BGAIX)", 0, 25.49, 25.49,
//                        "Baron Global Advantage Fund Institutional Shares", 25.49, 26.48,
//                        28.57, 52.29),
//                new MarketStock("(SPIDX)", 0, 38.63, 38.63,
//                        " S&P 500 Index Fund Class Y", 38.63,
//                        39.57, 41.16, 51.18),
//                new MarketStock("(VADDX)", 0, 63.46, 63.46,
//                        " Equally-Weighted S&P 500 Fund Class Y",
//                        63.46, 64.97, 66.75, 79.72)};
//        m.mergeSort(stockList, 0, stockList.length - 1);
//        System.out.println(Arrays.toString(stockList));

        MarketStock[] st = new MarketStock[3];
        MarketStock s = new MarketStock("(BGAIX)", 0, 25.49, 25.49,
                "Baron Global Advantage Fund Institutional Shares",
                25.49, 26.48, 28.57, 52.29);
        st[0] = s;
        s = new MarketStock("(SPIDX)", 0, 38.63, 38.63,
                "S&P 500 Index Fund Class Y", 38.63,
                39.57, 41.16, 51.18);
        st[1] = s;
        s = new MarketStock("(VADDX)", 0, 63.46, 63.46,
                "Equally-Weighted S&P 500 Fund Class Y",
                63.46, 64.97, 66.75, 79.72);
        st[2] = s;


        System.out.println("\nSorting in ascending order on basis of MarketStock\n");
        printArray(st);
        System.out.println("************************************************************");
        System.out.println("After sorting...");
        System.out.println("\n==== SYMBOL SORT ===");
        SortingUtility.sort(st, MarketStock.BY_SYMBOL);
        printArray(st);
        System.out.println("====BY_COMPANY====");
        SortingUtility.sort(st, MarketStock.BY_COMPANY);
        printArray(st);
        System.out.println("BY_NET");
        SortingUtility.sort(st, MarketStock.BY_NET);
        printArray(st);
        System.out.println("BY_PERCENT_CHANGE");
        SortingUtility.sort(st, MarketStock.BY_PERCENT_CHANGE);
        printArray(st);
        System.out.println("===By 3rd QUARTERLY_PRICE====");
        SortingUtility.sort(st, MarketStock.BY_QUART);
        printArray(st);
        System.out.println("===BY_YTD====");
        SortingUtility.sort(st, MarketStock.BY_YTD);
        printArray(st);

  }

    public static<T> void printArray(T []a){
        for(T t : a){
            System.out.println(t);
        }
    }

}
