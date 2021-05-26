package br.com.estudos.classes;

//classe abstrata
public  abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //método abstrato
    public abstract double getBonificacao(); //assinatura do método

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

}
