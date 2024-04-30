# DIO - Trilha Java Básico

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

###### Diagrama UML:

![UML desafio POO](./images/Diagrama_de_Classes_do_Iphone_black.drawio.png)

###### Estrutura:
* equipamentos:
    * aparelhoTelefonico:
        Arquivo  | Tipo
        ---------|----------
        `AparelhoTelefonico.java`| **interface**
        `TelefoneFixo.java` | **class**
        `TelefoneFixoSemFio.java`| **class**
    <br>

    * navegadordeInternet:
        Arquivo  | Tipo
        ---------|----------
        `NavegadorDeInternet.java`| **interface**
        `Chrome.java` | **class**
        `Opera.java`| **class**
    <br>    

    * reprodutorMusical:
        Arquivo  | Tipo
        ---------|----------
        `ReprodutorMusical.java`| **interface**
        `Ipod.java` | **class**
        `Walkman.java`| **class**
    <br>  

    * apple:
        Arquivo  | Tipo
        ---------|----------
        `Iphone.java`| **class**
    <br>
* user:
    Arquivo | Tipo
    ---------|----------
    `User.java`| **class main**
<br>

