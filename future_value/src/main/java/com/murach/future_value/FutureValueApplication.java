package com.murach.future_value;

import javafx.application.Application;
import java.text.NumberFormat;

import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class FutureValueApplication extends Application {
    
    private TextField investmentField;
    private TextField interestRateField;    
    private TextField yearsField;   
    private TextField futureValueField;   

    @Override
    public void start(Stage primaryStage) {
        
     //   var javaVersion = SystemInfo.javaVersion();
     //   var javafxVersion = SystemInfo.javafxVersion();

        
     //   Label investmentLabel = new Label("Monthly Investment:");
        
      //  var scene = new Scene(new StackPane(label), 640, 480);
        
        
        //Set stage title
        primaryStage.setTitle("Future Value Calculator");
        
        //Create grid, create scene, and add grid to scene
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25,25,25,25));
        grid.setHgap(10);
        grid.setVgap(10);
        
        Scene scene = new Scene(grid);
        
        
        grid.add(new Label("Monthly Investment:"),0,0);
        investmentField = new TextField();
        grid.add(investmentField,1,0);
        
        grid.add(new Label("Yearly Interest Rate:"),0,1);
        interestRateField = new TextField();
        grid.add(interestRateField,1,1);        
        
        grid.add(new Label("Years:"),0,2);
        yearsField = new TextField();
        grid.add(yearsField,1,2);       
        
        
        grid.add(new Label("Future Value:"),0,3);
        futureValueField = new TextField();
        futureValueField.setEditable(false);
        grid.add(futureValueField,1,3);
        
        
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> calculateButtonClicked());
        
        
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> exitButtonClicked());
         
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().add(calculateButton);
        buttonBox.getChildren().add(exitButton); 
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(buttonBox,0,4,2,1);
        
     
        //Set scene and display stage
        primaryStage.setScene(scene);
        primaryStage.show();
    } //end start
    
       

    
    /*
    
    */
    private void calculateButtonClicked(){
        
        
        
        Validation v = new Validation();
        
        String errorMsg = "";
        
        errorMsg += v.isDouble(investmentField.getText(),"Monthly Investment");
        errorMsg += v.isDouble(interestRateField.getText(),"Yearly Interest Rate");
        errorMsg += v.isInteger(yearsField.getText(),"Years");
        
        
        if(errorMsg.isEmpty())
        {
            
            double investment = Double.parseDouble(
              investmentField.getText());
            
              double rate = Double.parseDouble(
              interestRateField.getText());
              
              int years = Integer.parseInt(
              yearsField.getText());
              
              double futureValue = 23.22;
              
              NumberFormat currency = NumberFormat.getCurrencyInstance();
              futureValueField.setText(currency.format(futureValue));
           
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Invalid Data");
            alert.setContentText(errorMsg);
            alert.showAndWait();
        }
        
        /*Get data from text fields
        double investment = Double.parseDouble(investmentField.getText());
        double rate = Double.parseDouble(interestRateField.getText());    
        int years = Integer.parseInt(yearsField.getText());    
        */
        
        //Calculate future value
        double futureValue = 23.23;
        
        //Set data in read only
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        futureValueField.setText(currency.format(futureValue));
        
    }
    
    
    private void exitButtonClicked(){
        
        
        System.exit(0);      
        
        
    }
    
    
    //MAIN
    public static void main(String[] args) {
        launch(args);
    }
    
}