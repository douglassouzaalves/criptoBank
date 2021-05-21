package EstudosJava;

public class SistemaInterno {

    private final int senha = 2222; //senha interna do sistema

    public void autentica(Autenticavel usuarioAutenticavel) {
        boolean autenticou = usuarioAutenticavel.autentica(this.senha);
        if(autenticou) {
            System.out.println("Login efetuado com sucesso.");
        } else {
            System.out.println("Login falhou.");
        }
    }
}
