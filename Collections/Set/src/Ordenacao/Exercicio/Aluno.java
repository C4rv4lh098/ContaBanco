package Ordenacao.Exercicio;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private Long matricula;

    private String nome;

    private double media;

    public Aluno(Long matricula, String nome, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }
}

class ComparatorNota implements Comparator<Aluno>{
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getMedia(), aluno2.getMedia());
    }
}