public class Administrador extends Funcionario implements Autenticacao {

    private int senha;

    @Override
    public double getBonificacao() {
        return 1000;
    }

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
