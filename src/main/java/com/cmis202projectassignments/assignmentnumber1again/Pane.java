/**
 *Title: Pane
 *
 *Author: Sean Laverty
 *
 *Course Section: CMIS201-ONL1 (Seidel) Fall 2022
 *
 * File: Pane.java
 *
 * Description: Creates a pane that displays the MarketStock GridPane
 *
 * */
package com.cmis202projectassignments.assignmentnumber1again;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class Pane extends BorderPane {
    /**Attributes**/
    protected Instruments dispShare;

    /**Text Fields**/
    protected TextField tfSymbol;
    protected TextField tfVolume;
    protected TextField tfOpening;
    protected TextField tfClosing;

    public TextField tfcurrentPrice;
    public TextField tfprevClosPrice;
    public TextField tfquarterlyPrice;
    public TextField tfannualStPri;

    protected TextField tfSt;
    protected TextField tfNet;
    protected TextField tfPerCh;
    protected TextField tfQCh;
    protected TextField tfYTD;

    /**Buttons**/
    protected Button btAdd = new Button("Add");
    protected Button btFirst = new Button("First");
    protected Button btNext = new Button("Next");
    protected Button btPrevious = new Button("Previous");
    protected Button btLast = new Button("Last");
    protected Button btUpdate = new Button("Update");
    protected Button btCalculate = new Button("Calculate");
//    protected Button btSaveToText = new Button("SaveToFile");

    /**Initialize instances of GridPane and FlowPane**/
    private GridPane paneForInfo = new GridPane();
    private FlowPane paneForButtons = new FlowPane(5, 5);
//    private HBox paneForButtons = new HBox(5);

    /**Constructor that's holds the draw method **/
    public Pane() {
        draw();
    }

    private void draw() {
        dispShare = new MarketStock();
        /**Initialize text fields*/
        tfSymbol = new TextField(dispShare.getSymbol());
        tfVolume = new TextField(dispShare.getVolume()+"");
        tfOpening = new TextField(dispShare.getOpening()+"");
        tfClosing = new TextField(dispShare.getClosing()+"");
        tfSymbol.setEditable(true);
        tfVolume.setEditable(true);
        tfOpening.setEditable(true);
        tfClosing.setEditable(true);
        tfSt = new TextField(((MarketStock) dispShare).getCompany());
        tfcurrentPrice = new TextField(((MarketStock) dispShare).getCurrentPrice() + "");
        tfprevClosPrice = new TextField(((MarketStock) dispShare).getPrevClosPrice() + "");
        tfquarterlyPrice = new TextField(((MarketStock) dispShare).getQuarterlyPrice() + "");
        tfannualStPri = new TextField(((MarketStock) dispShare).getQuarterlyPrice() + "");
        tfSt.setEditable(true);
        tfcurrentPrice.setEditable(true);
        tfprevClosPrice.setEditable(true);
        tfquarterlyPrice.setEditable(true);
        tfannualStPri.setEditable(true);
        /**Lay out for pane***/
        paneForInfo = new GridPane();
        paneForInfo.add(new Label("Symbol:"), 0, 0);
        paneForInfo.add(tfSymbol,0,1);

        paneForInfo.add(new Label("Volume:"), 1, 0);
        paneForInfo.add( tfVolume,1,1);

        paneForInfo.add(new Label("Open:"), 2, 0);
        paneForInfo.add(tfOpening ,2,1);

        paneForInfo.add(new Label("Close:"), 3, 0);
        paneForInfo.add(tfClosing,3,1);

        paneForInfo.add(new Label("Company:"), 4, 0);
        paneForInfo.add(tfSt,4,1);

        paneForInfo.add(new Label("Current Price:"), 0, 2);
        paneForInfo.add(tfcurrentPrice,0,3);

        paneForInfo.add(new Label("Previous Closing Price:"), 1, 2);
        paneForInfo.add(tfprevClosPrice, 1, 3);

        paneForInfo.add( new Label("Quarterly price: "), 2,2);
        paneForInfo.add(tfquarterlyPrice, 2, 3);

        paneForInfo.add(new Label("Starting Year price: "), 3,2);
        paneForInfo.add(tfannualStPri, 3, 3);

        tfNet = new TextField();
        paneForInfo.add(new Label("NetChange: "), 0, 4);
        paneForInfo.add(tfNet, 0, 5);
        tfPerCh = new TextField();
        paneForInfo.add(new Label("PercentChange:"), 1, 4);
        paneForInfo.add(tfPerCh, 1, 5);
        tfQCh = new TextField();
        paneForInfo.add(new Label("QuarterChange:"), 2, 4);
        paneForInfo.add(tfQCh, 2, 5);
        tfYTD = new TextField();
        paneForInfo.add(new Label("YTDChange:"),3, 4);
        paneForInfo.add(tfYTD, 3,5 );

        paneForInfo.setPadding(new Insets(10, 10, 0, 10));
        paneForInfo.setHgap(5);
        paneForInfo.setVgap(5);

        paneForButtons.getChildren().addAll(btAdd, btFirst, btNext,
                 btPrevious, btLast, btUpdate, btCalculate);
//        paneForButtons.getChildren().addAll(btAdd, btFirst, btNext, btPrevious,
//                btLast, btUpdate, btCalculate, btSaveToText);
        paneForButtons.setAlignment(Pos.CENTER);
        // Place nodes in pane
        setCenter(paneForInfo);
        setBottom(paneForButtons);
    }
}
