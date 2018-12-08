
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Summa implements Komento {
    TextField tuloskentta, syotekentta;
    Button nollaa, undo; 
    Sovelluslogiikka sovellus;

    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
