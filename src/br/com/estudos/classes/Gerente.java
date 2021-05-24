package br.com.estudos.classes;

import br.com.estudos.interface1.Autenticavel;

//Gerente é um Funcionario, o Gerente herda da classe Funcionario, e "assina o contrato" da Autenticação.
public class Gerente extends Funcionario implements Autenticavel {

    private SenhaAutenticacao autenticador;

    public Gerente() {
        this.autenticador = new SenhaAutenticacao();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação de GERENTE");
        return super.getSalario(); //atributo da classe mãe(super classe)
    }      //chamando o método da classe EstudosJava.Funcionario

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}




