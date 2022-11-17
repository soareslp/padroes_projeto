package padroescomportamentais.interpreter;

public class InterpretarData implements Interpretador{
    public String interpretar(String texto) {
        String aux = null;

        if (texto.matches("[0-9]*")){
            Data data = new Data();
            data.setTexto(texto);
            data.interpretar();
            aux = data.getTexto();
        }
        else {
            throw new IllegalArgumentException("Data inválida");
        }
        return aux;
    }

}
