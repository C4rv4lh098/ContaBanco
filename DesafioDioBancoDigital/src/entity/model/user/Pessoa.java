package entity.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pessoa {
    private String cpf;

    private String nome;

    private String email;
}

