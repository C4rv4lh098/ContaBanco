package user;

import equipamentos.aparelhoTelefônico.TelefoneFixo;
import equipamentos.aparelhoTelefônico.TelefoneFixoSemFio;
import equipamentos.apple.Iphone;
import equipamentos.navegadorDeInternet.Chrome;
import equipamentos.navegadorDeInternet.Opera;
import equipamentos.reprodutorMusical.Ipod;
import equipamentos.reprodutorMusical.Walkman;

public class User {
    public static void main(String[] args){
        System.out.println("\n==== Telefones ====");
        TelefoneFixo telefoneUm = new TelefoneFixo();
        telefoneUm.atender();
        telefoneUm.ligar();
        telefoneUm.iniciarCorreioVoz();
        System.out.println("Classe: " + telefoneUm.getClass() + "\n");

        TelefoneFixoSemFio telefoneDois = new TelefoneFixoSemFio();
        telefoneDois.iniciarCorreioVoz();
        telefoneDois.ligar();
        telefoneDois.atender();
        System.out.println("Classe: " + telefoneDois.getClass()+"\n");
        
        System.out.println("\n==== Navegadores ====");
        Chrome navegadorUm = new Chrome();
        navegadorUm.exibirPagina();
        navegadorUm.atualizarPagina();
        navegadorUm.adicinarNovaAba();
        System.out.println("Classe: " + navegadorUm.getClass()+"\n");

        Opera navewgadorDois = new Opera();
        navewgadorDois.adicinarNovaAba();
        navewgadorDois.exibirPagina();
        navewgadorDois.atualizarPagina();
        System.out.println("Classe: " + navewgadorDois.getClass()+"\n");

        System.out.println("\n==== Musica ====");
        Ipod ipod = new Ipod();
        ipod.selecionarMusica();
        ipod.tocar();
        ipod.pausar();
        System.out.println("Classe: " + ipod.getClass()+"\n");

        Walkman walkman = new Walkman();
        walkman.tocar();
        walkman.pausar();
        walkman.selecionarMusica();
        System.out.println("Classe: " + walkman.getClass()+"\n");
        
        System.out.println("\n==== Smartphone Apple - Iphone ====");
        Iphone iphone = new Iphone();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.adicinarNovaAba();
        iphone.exibirPagina();
        iphone.pausar();
        iphone.iniciarCorreioVoz();
        iphone.atualizarPagina();
        iphone.ligar();
        iphone.atender();
        System.out.println("Classe: " + iphone.getClass()+"\n");
    }
}
