package equipamentos.aparelhoTelefonico;

public class TelefoneFixoSemFio implements AparelhoTelefonico{
    @Override
    public void atender() {
        System.out.println("Atendendo Chamada!");  
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz Acionado!");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando ligação para...");
    }
        
}
