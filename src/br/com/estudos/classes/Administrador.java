package br.com.estudos.classes;

import br.com.estudos.interface1.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {

    private SenhaAutenticacao autenticador;

    public Administrador() {
        this.autenticador = new SenhaAutenticacao();
    }

    @Override
    public double getBonificacao() { //polimorfismo
        return 1000;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
