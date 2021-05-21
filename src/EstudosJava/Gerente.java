package EstudosJava;

//EstudosJava.Gerente é um EstudosJava.Funcionario, o EstudosJava.Gerente herda da classe EstudosJava.Funcionario, e "assina o contrato" da Autenticacao
public class Gerente extends Funcionario implements Autenticavel {

    private SenhaAutenticacao autenticador;

    public Gerente() {
        this.autenticador = new SenhaAutenticacao();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação de GERENTE");
        return super.getSalario(); //atributo da classe mãe(super classe)
    }      //chamando o método da classe EstudosJava.Funcionario

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}




