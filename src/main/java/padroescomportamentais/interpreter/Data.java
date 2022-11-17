package padroescomportamentais.interpreter;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Data {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void interpretar() {
        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setValueContainsLiteralCharacters(false);
            setTexto(mascara.valueToString(texto));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
