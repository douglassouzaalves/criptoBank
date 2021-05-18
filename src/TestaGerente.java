public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();

        //polimorfismo
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);


        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("Salário atual: " + gerente1.getSalario());
        System.out.println("Salário + Bonificação " + gerente1.getBonificacao());
        System.out.println();


        Autenticacao referencia = new Gerente();

        Gerente novoGerente = new Gerente();
        novoGerente.setNome("Douglas");
        novoGerente.setSalario(6000);
        novoGerente.setSenha(2222);
        boolean autenticou = novoGerente.autentica(2222);


        System.out.println("Nome " + novoGerente.getNome());
        System.out.println("Cargo e Salário: " + novoGerente.getBonificacao());
        System.out.println("-=-=-=-=-=-=-=-=-");

        //Instanciando um novo adm
        Administrador adm = new Administrador();
        adm.setSenha(3333);

        //testando autenticação de  usuário.
        SistemaInterno sistemaValida = new SistemaInterno();
        sistemaValida.autentica(novoGerente);
        sistemaValida.autentica(adm);



    }
}
