package padroesestruturais.adapter;

public class PorteAdapter extends PortePeso{

    private IPorte porteTamanho;

    public PorteAdapter(IPorte porteTamanho){
        this.porteTamanho = porteTamanho;
    }

    public String recuperarPorte() {
        if(this.getPeso() < 5.0f)
            porteTamanho.setPorte("Mini");
        else
            if(this.getPeso() >= 5.0f)
                porteTamanho.setPorte("Pequeno");
            else
                if(this.getPeso() >= 10.0f)
                    porteTamanho.setPorte("Peq-Médio");
                else
                    if(this.getPeso() >= 15.0f)
                        porteTamanho.setPorte("Médio");
                    else
                        if(this.getPeso() >= 20.0f)
                         porteTamanho.setPorte("Med-Grande");
                        else
                            if(this.getPeso() >= 25.0f)
                                porteTamanho.setPorte("Grande");
                            return porteTamanho.getPorte();
    }

        public void salvarPorte(){
            if(porteTamanho.getPorte().equals("Mini"))
                this.setPeso(4.0f);
            else
                if(porteTamanho.getPorte().equals("Pequeno"))
                    this.setPeso(5.0f);
                else
                    if(porteTamanho.getPorte().equals("Med-Pequeno"))
                        this.setPeso(10.0f);
                    else
                        if(porteTamanho.getPorte().equals("Médio"))
                            this.setPeso(15.0f);
                        else
                            if(porteTamanho.getPorte().equals("Med-Grande"))
                                this.setPeso(20.0f);
                            else
                                if(porteTamanho.getPorte().equals("Grande"))
                                    this.setPeso(25.0f);
        }
}
