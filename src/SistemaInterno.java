public class SistemaInterno {

    private int senha = 2222; //senha interna do sistema

    public void autentica(Autenticacao funcionarioAutenticavel) {
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if(autenticou) {
            System.out.println("Login efetuado com sucesso.");
        } else {
            System.out.println("Login falhou.");
        }
    }
}
