package com.mycompany.tempconverter;

import java.text.DecimalFormat;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLController implements Initializable {
    
    double temp,Celsius,Farenheit;
    
    private DecimalFormat df = new DecimalFormat("#.##");
    
    private Label label;
    @FXML
    private Label CelLabel;
    @FXML
    private Label FarLabel;
    @FXML
    private TextField FarenheitInput;
    @FXML
    private TextField Result;
    @FXML
    private Label ResLabel;
    @FXML
    private Button ConvFarenheit;
    @FXML
    private Button ConvCelsius;
    @FXML
    private TextField CelsiusInput;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == ConvFarenheit){
        
            temp = Double.parseDouble(CelsiusInput.getText());
            Farenheit = ((temp/5.0)*9) + 32;
            String FarResult = df.format(Farenheit);
            Result.setText(FarResult + " Degree Fahrenheit");
        }
        else if(event.getSource() == ConvCelsius){
            
            temp = Double.parseDouble(FarenheitInput.getText());
            Celsius = ((temp - 32)*5)/9.0;
            String CelResult = df.format(Celsius);
            Result.setText(CelResult+ " Degree Celsius");
        }
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
