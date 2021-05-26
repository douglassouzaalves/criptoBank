package br.com.estudos.classes;


import br.com.estudos.interface1.Autenticavel;

public class SistemaInterno {

    private static final int senha = 2222; //senha  padrão interna do sistema

    public void autentica(Autenticavel usuarioAutenticavel) {
        boolean autenticou = usuarioAutenticavel.autentica(this.senha);
        if(autenticou) {
            System.out.println("Login efetuado com sucesso.");
        } else {
            System.out.println("Falha no login, senha incorreta");
        }
    }
}
