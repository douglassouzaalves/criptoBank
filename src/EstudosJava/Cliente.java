package EstudosJava;

public class Cliente implements Autenticavel {

    private SenhaAutenticacao autenticador; //declarando como atributo para poder acessa-lo.

    public Cliente() {
        this.autenticador = new SenhaAutenticacao(); //instanciando senhaAutenticacao
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha); //chamando autenticador e usando setSenha dele
    }

    @Override
    public boolean autentica(int senha) {
            return this.autenticador.autentica(senha);
        }
    }

