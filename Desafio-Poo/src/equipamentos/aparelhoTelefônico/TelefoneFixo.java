package equipamentos.aparelhoTelefônico;

public class TelefoneFixo implements AparelhoTelefonico{
    @Override
    public void atender() {
        System.out.println("Atendendo...");  
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Acionando Correio de Voz");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }
        
}
