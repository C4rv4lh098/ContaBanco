package equipamentos.reprodutorMusical;

public class Ipod implements ReprodutorMusical{
    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo Música...");
    }
    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }
}
