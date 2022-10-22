//package com.cmis202projectassignments.assignmentnumber1again;
//
//public class Investment extends MarketStock {
//    /***
//     * future value = present value x (1+ interest rate)^n
//     * ROI = Net income / Cost of investment x 100.
//     * dividends: Annual net income - net change in retained earnings = dividends paid.
//     * Return on an investment
//     *      *      *  How to Calculate Return on Investment (ROI)
//     *      *      *  ROI= (FVI−IVI / Cost of Investment)×100%
//     *      *      *  where:
//     *      *      *  FVI=Final value of investment
//     *      *      *  IVI=Initial value of investment
//     *
//     *       Expected portfolio return = (Asset 1 Weight x Expected Return) + (Asset 2 Weight x Expected Return)...
//     *      *      * Asset	Weight    Expected Return
//     *      *      * A	     35%	        6%
//     *      *      * B	     25%	        7%
//     *      *      * C	     40%	       10%
//     *      *      * (35% x 6%) + (25% x 7%) + (40% x 10%) = 7.85%
//     *
//     * Return on an investment
//     *      *      *  How to Calculate Return on Investment (ROI)
//     *      *      *  ROI= (FVI−IVI / Cost of Investment)×100%
//     *      *      *  where:
//     *      *      *  FVI=Final value of investment
//     *      *      *  IVI=Initial value of investment
//     *      *
//     *      *      Annualized ROI=[(1+ROI)^(1/n) −1]×100%
//     *      *      * where:
//     *      *      * n=Number of years investment is held
//     *
//     *      *      Comparing Investments and Annualized ROI
//     *      *      * AROIx =[(1+0.50)^(1/5) −1]×100 = 8.45%
//     *      *      * AROIy =[(1+0.30)^(1/3) −1]×100 = 9.14%
//     *      *      * where:
//     *      *      * AROIx = Annualized ROI for stock X
//     *      *      * AROIy = Annualized ROI for stock Y
//     * **/
//
//    private double initialValueInvestment;
//    private double finalValueOfInvestment;
//    private double numberOfShares;
//    private int numberOfYearsHolding;
//    private final double costOfInvestment = numberOfShares*initialValueInvestment;
//    private final double roi =
//            ((initialValueInvestment - finalValueOfInvestment) / (numberOfShares * initialValueInvestment)) * 100.00;
//    /**
//     * * Expected portfolio return = (Asset 1 Weight x Expected Return) + (Asset 2 Weight x Expected Return)...
//     *      * Asset	Weight    Expected Return
//     *      * A	     35%	        6%
//     *      * B	     25%	        7%
//     *      * C	     40%	       10%
//     *      * (35% x 6%) + (25% x 7%) + (40% x 10%) = 7.85%
//     *
//     * *
//     * **/
//    public Investment(String symbol) {
//        super(symbol);
//    }
//
//    //    /***/
//    double returnOnInvestment =
//            ((initialValueInvestment - finalValueOfInvestment) / (numberOfShares * initialValueInvestment)) * 100.00;
////
////    /***/
////    double annulROI = (1 + returnOnInvestment)^ Math.exp(1.0 / numberOfYearsHolding) - 1) * 100;
//
//    /***/
//    double annulROI1 = ((1 + returnOnInvestment) * Math.expm1(1 / numberOfYearsHolding) - 1) * 100;
//
//    /**Return on investment */
//    public double getPersonalReturnOnInvestment(){
//        return ((initialValueInvestment - finalValueOfInvestment) / (numberOfShares * initialValueInvestment)) * 100.00;
//    }
////
////    /**Annual Return on investment */
////    public double getPersonalAnnualReturnOnInvestment(){
////        return annulROI;
////    }
//
//    @Override
//    public int compareTo(MarketStock s) {
//        return 0;
//    }
//}
