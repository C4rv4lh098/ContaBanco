package equipamentos.reprodutorMusical;

public class Walkman implements ReprodutorMusical {
    @Override
    public void selecionarMusica() {
        System.out.println("Seleção Musical!");
    }

    @Override
    public void tocar() {
        System.out.println("Música Tocando!!");
    }
    @Override
    public void pausar() {
        System.out.println("Pausa!");
    }
}
