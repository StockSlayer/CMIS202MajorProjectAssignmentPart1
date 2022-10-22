//package com.cmis202projectassignments.assignmentnumber1again;
//
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//
//public class BondPane extends GridPane {
//
//    Bonds b = new Bonds();
//
//    private TextField typeOfBond = new TextField();
//    private TextField tfAnnualInterestRate = new TextField();
//    private TextField tfNumberOfYears = new TextField();
//    private TextField tfLoanAmount = new TextField();
//    private TextField tfMonthlyPayment = new TextField();
//    private TextField tfTotalPayment = new TextField();
//    private Button btCalculate = new Button("Calculate");
//
//
//    public BondPane() {
//        draw();
//    }
//
//    private void draw() {
//        GridPane gridPane = new GridPane();
//        gridPane.setHgap(5);
//        gridPane.setVgap(5);
//
//        gridPane.add(new Label("TypeOfBond"), 0, 0);
//        gridPane.add(tfAnnualInterestRate, 1, 0);
//
//        gridPane.add(new Label("Annual Interest Rate:"), 0, 1);
//        gridPane.add(tfAnnualInterestRate, 1, 1);
//
//        gridPane.add(new Label("Number of Years:"), 0, 2);
//        gridPane.add(tfNumberOfYears, 1, 2);
//
//        gridPane.add(new Label("Loan Amount:"), 0, 3);
//        gridPane.add(tfLoanAmount, 1, 3);
//
//        gridPane.add(new Label("Quarterly Interest:"), 0, 4);
//        gridPane.add(tfMonthlyPayment, 1, 4);
//
//        gridPane.add(new Label("Total Gained:"), 0, 5);
//        gridPane.add(tfTotalPayment, 1, 5);
//
//        gridPane.add(btCalculate, 1, 6);
//    }
//}
