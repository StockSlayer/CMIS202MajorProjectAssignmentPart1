//package com.cmis202projectassignments.assignmentnumber1again;
//
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.TextInputDialog;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//
//import java.util.Optional;
//
//public class FxUtility {
//    public static void showFXMessage(String title, String header, String content, String imgFileName) {
//        Alert alert = new Alert(AlertType.CONFIRMATION, content, ButtonType.OK, ButtonType.CANCEL);
//        if (title != null)
//            alert.setTitle(title);
//        if (header != null)
//            alert.setHeaderText(header);
//        if (imgFileName != null) {
//            ImageView imgV = new ImageView();
//            imgV.setImage(new Image(imgFileName));
//            imgV.setPreserveRatio(true);
//            imgV.setSmooth(true);
//            imgV.setCache(true);
//            alert.setGraphic(imgV);
//        }
//        Optional<ButtonType> result=alert.showAndWait();
//    }
//
//    public static void showFXMessage(String title, String header, String content) {
//        showFXMessage(title, header, content, null);
//    }
//
//    public static void showFXMessage(String content) {
//        showFXMessage(null, null, content, null);
//    }
//
//    public static boolean getYesNo(String title, String header) {
//        Alert alert = new Alert(AlertType.CONFIRMATION, "Please select Yes or No:", ButtonType.YES, ButtonType.NO);
//        if (title != null)
//            alert.setTitle(title);
//        if (header != null)
//            alert.setHeaderText(header);
//        Optional<ButtonType> result=alert.showAndWait();
//        return result.get()==ButtonType.YES;
//    }
//
//
//    public static String showFXInput(String title, String header, String content, String defaultTxt, String imgFileName) {
//        TextInputDialog input = new TextInputDialog(defaultTxt);
//        if (title != null)
//            input.setTitle(title);
//        if (header != null)
//            input.setHeaderText(header);
//        if (imgFileName != null) {
//            ImageView imgV = new ImageView();
//            imgV.setImage(new Image(imgFileName));
//            imgV.setPreserveRatio(true);
//            imgV.setSmooth(true);
//            imgV.setCache(true);
//            input.setGraphic(imgV);
//        }
//        Optional<String> result=input.showAndWait();
//        if (result.isPresent())
//            return result.get().trim();
//        else
//            return null;
//    }
//    public static String showFXInput(String title, String header, String content) {
//        return showFXInput(title, header, content, "", null);
//    }
//
//    public static String showFXInput(String content) {
//        return showFXInput(null, null, content, "", null);
//    }
//
//}
