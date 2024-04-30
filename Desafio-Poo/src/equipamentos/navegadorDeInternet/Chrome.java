package equipamentos.navegadorDeInternet;

public class Chrome implements NavegadorDeInternet {
    @Override
    public void adicinarNovaAba() {
        System.out.println("Nova Aba!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar!");
    }
}
