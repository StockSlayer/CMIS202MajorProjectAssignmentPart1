
/**
 *Title: SortingUtility
 *
 *Author: Sean Laverty
 *
 *Course Section: CMIS201-ONL1 (Seidel) Fall 2022
 *
 * File: Assignment1FxDriver.java
 *
 * Description: Creates a GUI Driver for the pane class
 *
 *
 * */
package com.cmis202projectassignments.assignmentnumber1again;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Assignment1FxDriver extends Application {


    private Instruments st;
    private MarketStock ms;

    /***Creates an instance of the pane class**/
    private Pane pane = new Pane();

    private java.util.Date pDate;

//    final int SYMBOL = 10;
//    final int VOLUME = 35;
//    final int OPEN = 15;
//    final int CLOSE = 15;
//    final int CURRP = 15;
//    final int PRECP = 15;
//    final int QURTP = 15;
//    final int STRP = 15;

    final int STOCK = 32;
    final int NET = 32;
    final int PER = 10;
    final int QUR = 10;
    final int YTD = 10;
    protected int count = 0;

    @Override
    public void start(Stage stage) throws IOException {

        // Create and register handlers
        pane.btAdd.setOnAction(e -> add());
        pane.btFirst.setOnAction(e -> first());
        pane.btNext.setOnAction(e -> next());
        pane.btPrevious.setOnAction(e -> previous());
        pane.btLast.setOnAction(e -> last());
        pane.btUpdate.setOnAction(e -> update());
        pane.btCalculate.setOnAction(e -> calculateStockPerformance());


        Scene scene = new Scene(pane, 700, 250);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static<T> void printArray(T []a){
        for(T t : a){
            System.out.println(t);
        }
    }

    /** Write an address to file */
    private void add() {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("InvestmentShares.dat", "rw");
        ) {
            inout.seek(inout.length());
            write(inout);
        }
        catch (FileNotFoundException ex) {}
        catch (IOException ex) {}
        catch (IndexOutOfBoundsException ex) {}
    }

    /** Read the first address from the file */
    private void first() {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("InvestmentShares.dat", "rw");
        ) {
            if (inout.length() > 0) {
                inout.seek(0);
                read(inout);
                System.out.println("Reading Share #1");
                count = 1;
            }
            else {
                System.out.println("Address is empty!");
            }
        }
        catch (IOException ex) {}
    }

    /** Read the next Address from the file */
    private void next() {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("InvestmentShares.dat", "rw");
        ) {
            if (count * 91 < inout.length()) {
                inout.seek(count * 91);
                read(inout);
                count++;
                System.out.println("Reading Share #" + count);
            }
            else {
                System.out.println("End of file!");
            }
        }
        catch (IOException ex) {}
    }

    /** Read the previous Address from the file */
    private void previous() {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("InvestmentShares.dat", "rw");
        ) {
            if (count > 1)
                count--;
            else
                count = 1;
            inout.seek((count * 91) - 91);
            read(inout);
            System.out.println("Reading Share #" + count);
        }
        catch (IOException ex) {}
    }


    /** Read last address from file */
    private void last() {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("InvestmentShares.dat", "rw");
        ) {
            count = ((int)inout.length()) / 91;
            inout.seek((count * 91) - 91);
            read(inout);
            System.out.println("Reading Share #" + count);
        }
        catch (IOException ex) {}
    }


    /** Edit and address in file */
    private void update() {
        try ( // Create a random access file
              RandomAccessFile inout =
                      new RandomAccessFile("InvestmentShares.dat", "rw");
        ) {
            inout.seek(count * 91 - 91);
            write(inout);
        }
        catch (FileNotFoundException ex) {}
        catch (IOException ex) {}
    }

    /** Write addreass to file */
    private void write(RandomAccessFile inout) throws IOException {
//        inout.write(fixedLength(pane.tfSymbol.getText().getBytes(), SYMBOL));
//        inout.write(fixedLength(pane.tfVolume.getText().getBytes(), VOLUME));
//        inout.write(fixedLength(pane.tfOpening.getText().getBytes(), OPEN));
//        inout.write(fixedLength(pane.tfClosing.getText().getBytes(), CLOSE));
//        inout.write(fixedLength(pane.tfcurrentPrice.getText().getBytes(), CURRP));
//        inout.write(fixedLength(pane.tfprevClosPrice.getText().getBytes(), PRECP));
//        inout.write(fixedLength(pane.tfquarterlyPrice.getText().getBytes(), QURTP));
//        inout.write(fixedLength(pane.tfannualStPri.getText().getBytes(), STRP));
        inout.write(fixedLength(pane.tfSt.getText().getBytes(), STOCK));
        inout.write(fixedLength(pane.tfNet.getText().getBytes(), NET));
        inout.write(fixedLength(pane.tfPerCh.getText().getBytes(), PER));
        inout.write(fixedLength(pane.tfQCh.getText().getBytes(), QUR));
        inout.write(fixedLength(pane.tfYTD.getText().getBytes(), YTD));
        System.out.println("Stock #" + count + " saved!");
    }


    /** Read address from file */
    private void read(RandomAccessFile inout) throws IOException {
        int pos;
//        byte[] v = new byte[VOLUME];
//        pos = inout.read(v);
//        pane.tfSt.setText(new String(v));
//
//        byte[] o = new byte[OPEN];
//        pos = inout.read(o);
//        pane.tfSt.setText(new String(o));
//
//        byte[] c = new byte[CLOSE];
//        pos = inout.read(c);
//        pane.tfSt.setText(new String(c));
//
//        byte[] curp = new byte[CURRP];
//        pos = inout.read(curp);
//        pane.tfSt.setText(new String(curp));
//
//        byte[] sy = new byte[SYMBOL];
//        pos = inout.read(sy);
//        pane.tfSt.setText(new String(sy));
//
//        byte[] pre = new byte[PRECP];
//        pos = inout.read(pre);
//        pane.tfSt.setText(new String(pre));
//
//        byte[] q = new byte[QURTP];
//        pos = inout.read(q);
//        pane.tfSt.setText(new String(q));
//
//        byte[] srt = new byte[STRP];
//        pos = inout.read(srt);
//        pane.tfSt.setText(new String(srt));

        byte[] s = new byte[STOCK];
        pos = inout.read(s);
        pane.tfSt.setText(new String(s));

        byte[] n = new byte[NET];
        pos += inout.read(n);
        pane.tfNet.setText(new String(n));

        byte[] p = new byte[PER];
        pos += inout.read(p);
        pane.tfPerCh.setText(new String(p));

        byte[] u = new byte[QUR];
        pos += inout.read(u);
        pane.tfQCh.setText(new String(u));

        byte[] y = new byte[YTD];
        pos += inout.read(y);
        pane.tfYTD.setText(new String(y));
    }


    /** Return a byte[] of fixed-length */
    private byte[] fixedLength(byte[] x, int n) {
        byte[] b = new byte[n];
        for (int i = 0; i < x.length; i++) {
            b[i] = x[i];
        }
        return b;
    }
    /**Calculates a Investments performance **/
    public void calculateStockPerformance() {
        double current = Double.parseDouble(pane.tfcurrentPrice.getText());
        double prev =Double.parseDouble(pane.tfprevClosPrice.getText());
        double qur = Double.parseDouble(pane.tfquarterlyPrice.getText());
        double an = Double.parseDouble(pane.tfannualStPri.getText());
        MarketStock s = new MarketStock(current, prev, qur, an);
        pane.tfNet.setText(String.format("%.2f", s.getNetChange()));
        pane.tfPerCh.setText(String.format("%.2f",s.getDailyPercentChange())+"%");
        pane.tfQCh.setText(String.format("%.2f", s.getQuarterlyPerChange())+ "%");
        pane.tfYTD.setText(String.format("%.2f", s.getYTDPercentChange()) + "%");
    }

    public static void main(String[] args) {
        launch();
    }
}