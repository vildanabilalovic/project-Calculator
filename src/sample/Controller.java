package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private double broj;
    private String operacija;

    @FXML
    private TextField ekran;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void handleNulaAction(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        String stariText = ekran.getText();
        String newText = stariText + digit;
        ekran.setText("0");
        ekran.setText(newText);
    }
        @FXML
    private void handleDigitAction(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        String stariText = ekran.getText();
        String newText = stariText + digit;
        ekran.setText(newText);
    }
    @FXML
    private void handleAddOperation(ActionEvent event) {
        String Text = ekran.getText();
        int broj = Integer.parseInt(Text);
        ekran.setText("");
    }
    @FXML
    private void handleEqualOperation(ActionEvent event) {
        String noviText = ekran.getText();
        int noviBroj = Integer.parseInt(noviText);
        switch (operacija) {
            case "+":
                broj = broj + noviBroj;
                break;
            case "-":
                broj = broj - noviBroj;
                break;
            case "*":
                broj = broj * noviBroj;
                break;
            case "/":
                broj = broj / noviBroj;
                break;
                default:
                    break;
        }
        ekran.setText("" + broj);
    }
    @FXML
    public void handleMinusOperation(ActionEvent event) {
        String Text = ekran.getText();
        broj = Integer.parseInt(Text);
        ekran.setText("");
        operacija = ((Button) event.getSource()).getText();
    }
    @FXML
    public void handleMnozenjeOperation(ActionEvent event) {
        String Text = ekran.getText();
        broj = Double.parseDouble(Text);
        ekran.setText("");
        operacija = ((Button) event.getSource()).getText();
    }
    @FXML
    public void handleDijeljenjeOperation(ActionEvent event) {
        String Text = ekran.getText();
        broj = Double.parseDouble(Text);
        ekran.setText("");
        operacija = ((Button) event.getSource()).getText();
    }
    @FXML
    public void handleDecimalaAction(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        String stariText = ekran.getText();
        String newText = stariText + digit;
        ekran.setText(newText);
    }
    @FXML
    private void handleOperation(ActionEvent event) {
        String Text = ekran.getText();
        broj = Integer.parseInt(Text);
        ekran.setText("");
        operacija = ((Button) event.getSource()).getText();
    }
}
