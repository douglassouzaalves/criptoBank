//Gerente é um Funcionario, o Gerente herda da classe Funcionario, "assina o contrato" Autenticacao
public class Gerente extends Funcionario implements Autenticacao {
    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Salário de GERENTE");
        return super.getSalario(); //atributo da classe mãe(super classe)
    }      //chamando o método da classe Funcionario

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}




