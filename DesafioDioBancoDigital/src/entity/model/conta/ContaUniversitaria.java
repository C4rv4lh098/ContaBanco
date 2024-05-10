package entity.model.conta;

import entity.model.user.Pessoa;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ContaUniversitaria extends Conta{
    private static int SEQUENCIAL = 1;

    public ContaUniversitaria(Pessoa pessoa) {
        super(pessoa);
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("   ==== Extrato Conta Universitária ====   ");
        super.imprimirExtrato();
    }
}
