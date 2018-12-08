package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa implements Komento {

    TextField tuloskentta, syotekentta;
    Button nollaa, undo;
    Sovelluslogiikka sovellus;
    int edellinenTulos;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
        edellinenTulos = sovellus.tulos();
    }

    @Override
    public void suorita() {
        edellinenTulos = sovellus.tulos();
        sovellus.nollaa();
        syotekentta.setText("0");
        tuloskentta.setText("");
    }

    @Override
    public void peru() {
        sovellus.setTulos(edellinenTulos);
        tuloskentta.setText(Integer.toString(edellinenTulos));
    }
}
