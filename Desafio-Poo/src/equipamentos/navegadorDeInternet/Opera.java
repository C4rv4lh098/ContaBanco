package equipamentos.navegadorDeInternet;

public class Opera implements NavegadorDeInternet {
    @Override
    public void adicinarNovaAba() {
        System.out.println("Adicionar Nova Aba!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Página!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Página!");
    }
}
