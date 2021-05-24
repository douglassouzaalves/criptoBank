package br.com.estudos.classes;

import br.com.estudos.interface1.Autenticavel;

public class SegurancaBanco implements Autenticavel {
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }
}
