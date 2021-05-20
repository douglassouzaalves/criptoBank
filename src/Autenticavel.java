//contrato Autenticavel
//quem "assina" esse contrato precisa implementa-lo.
//método setSenha
//método autentica

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}