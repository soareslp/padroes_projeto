package padroescomportamentais.command;

public class Procedimento {

    private String tipoProcedimento;
    private String situacao;

    public Procedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void agendarProcedimento(){
        this.situacao = "Procedimento agendado!";
    }

    public void executarProcedimento(){
        this.situacao = "Procedimento realizado!";
    }

    public void finalizarProcedimento(){
        this.situacao = "Procedimento finalizado!";
    }
}
