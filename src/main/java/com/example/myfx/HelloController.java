package com.example.myfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    public double firstNr;

    @FXML
    private Button testButton1;

    @FXML
    private Button testButton2;

    @FXML
    private Button testButton3;

    @FXML
    private Button testButton4;

    @FXML
    private Button testButton5;

    @FXML
    private Button testButton6;

    @FXML
    private Button testButton7;

    @FXML
    private Button testButton8;

    @FXML
    private Button testButton9;

    @FXML
    private Button testButton0;

    @FXML
    private TextField testField;

    @FXML
    protected void onClearButtonClick() { testField.clear(); }
    @FXML
    protected void onButtonClick1() { testField.appendText("1"); }
    @FXML
    protected void onButtonClick2() { testField.appendText("2"); }
    @FXML
    protected void onButtonClick3() { testField.appendText("3"); }
    @FXML
    protected void onButtonClick4() { testField.appendText("4"); }
    @FXML
    protected void onButtonClick5() { testField.appendText("5"); }
    @FXML
    protected void onButtonClick6() { testField.appendText("6"); }
    @FXML
    protected void onButtonClick7() { testField.appendText("7"); }
    @FXML
    protected void onButtonClick8() { testField.appendText("8"); }
    @FXML
    protected void onButtonClick9() { testField.appendText("9"); }
    @FXML
    protected void onButtonClick0() { testField.appendText("0"); }
    @FXML
    protected void onSumButtonClick() {
        String str = testField.getText();
        firstNr = Double.parseDouble(str);
        testField.clear();
        testField.setText("+");
    }
    @FXML
    protected void onMinusButtonClick() {
        String str = testField.getText();
        firstNr = Double.parseDouble(str);
        testField.clear();
        testField.setText("-");
    }
    @FXML
    protected void onMultiplyButtonClick() {
        String str = testField.getText();
        firstNr = Double.parseDouble(str);
        testField.clear();
        testField.setText("*");
    }
    @FXML
    protected void onDivideButtonClick() {
        String str = testField.getText();
        firstNr = Double.parseDouble(str);
        testField.clear();
        testField.setText("/");
    }
    @FXML
    protected void onEqualsButtonClick() {
        String str = testField.getText();
        String sign = Character.toString(str.charAt(0));
        String string = str.substring(1);
        double secNr = Double.parseDouble(string);
        switch (sign) {
            case "+":
                testField.setText(Double.toString(firstNr + secNr));
                break;
            case "-":
                testField.setText(Double.toString(firstNr - secNr));
                break;
            case "*":
                testField.setText(Double.toString(firstNr * secNr));
                break;
            case "/":
                testField.setText(Double.toString(firstNr / secNr));
                break;
        }
    }
}