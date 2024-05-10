package entity.model.user;

import entity.model.conta.Conta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Banco {
    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public void exibirContas(){
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("============= DIO BANK CONTAS =============");
        for (Conta conta : contas){
            System.out.println("Agência: " + conta.getAgencia() + " | Número: " + conta.getNumero());
            System.out.println("Cliente: " + conta.getCliente().getNome());
            System.out.println("___________________________________________");
        }
    }
}
