package br.com.estudos.classes;

public class EditorVideo extends Funcionario{
    @Override
    public double getBonificacao() {
        System.out.println("Bonificação aplicada");
        return + 150;
    }
}
