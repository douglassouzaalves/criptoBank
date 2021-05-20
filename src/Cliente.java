public class Cliente implements Autenticavel {

    private SenhaAutenticacao autenticador;

    public Cliente() {
        this.autenticador = new SenhaAutenticacao();
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

