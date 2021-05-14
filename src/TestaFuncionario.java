public class TestaFuncionario {
    public static void main(String[] args) {

        //inicializando o objeto
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("João");
        funcionario1.setSalario(3000);
        funcionario1.getBonificacao();
        funcionario1.setCpf("222.222.222-22");


        System.out.println("Carregando informações sobre o funcionário...");
        System.out.println("Nome do Funcionário: " + funcionario1.getNome());
        System.out.println("CPF: " + funcionario1.getCpf());
        System.out.println("Salário Atual: " + funcionario1.getSalario());
        System.out.println("Valor da bonificação: " + funcionario1.getBonificacao());

    }
}
