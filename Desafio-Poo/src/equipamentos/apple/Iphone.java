package equipamentos.apple;

import equipamentos.aparelhoTelefonico.AparelhoTelefonico;
import equipamentos.navegadorDeInternet.NavegadorDeInternet;
import equipamentos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
    // AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Iphone está realizando uma chamada...");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamado pelo Iphone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe uma mensagem após o sinal!");
    }

    // NavegadorDeInternet
    @Override
    public void adicinarNovaAba() {
        System.out.println("Adicionar nova aba ao Safari!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página atual!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página no Safari!");
    }

    // ReprodutorMusical
    @Override
    public void pausar() {
        System.out.println("Pausar reprodutor!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Seleção do Apple Music!");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo Música Selecionada!");
    }   
}
