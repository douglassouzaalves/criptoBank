package br.com.estudos.interface1;
//"termo" Autenticavel
//quem "assina" esse termo precisa implementa-lo.
//método setSenha
//método autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}