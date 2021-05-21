package EstudosJava;

public class Programador extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação aplicada");
        return 500;
    }
}
