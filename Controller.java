
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.text.NumberFormat;
import javafx.event.ActionEvent;

public class Controller {

    Rechteck rechteck;

    @FXML
    TextField txtBreite;

    @FXML
    TextField txtLaenge;

    @FXML
    Label lblErg;

    @FXML
    void initialize() {
        rechteck = new Rechteck();

    }

    @FXML
    void berechneFlaeche(ActionEvent event) {
        try{
            rechteck.setBreite(Double.parseDouble(txtBreite.getText()));
            rechteck.setLaenge(Double.parseDouble(txtLaenge.getText()));

            double erg = rechteck.berechneFlaeche();
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);

            lblErg.setText("Die Fläche des Rechtecks ist "+ n.format(erg) );
        } catch(Exception ex){}
    }

    @FXML
    void berechneUmfang(ActionEvent event) {
        try{
            rechteck.setBreite(Double.parseDouble(txtBreite.getText()));
            rechteck.setLaenge(Double.parseDouble(txtLaenge.getText()));

            double erg = rechteck.berechneUmfang();
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);

            lblErg.setText("Der Umfang des Rechtecks ist "+ n.format(erg));
        } catch(Exception ex){}
    }

    @FXML
    void berecheDiagonale(ActionEvent event) {
        try{
            rechteck.setBreite(Double.parseDouble(txtBreite.getText()));
            rechteck.setLaenge(Double.parseDouble(txtLaenge.getText()));

            double erg = rechteck.berechneDiagonale();
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);

            lblErg.setText("Die Diagonale des Rechtecks ist "+ n.format(erg));
        } catch(Exception ex){}
    }

}