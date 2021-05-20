public class TestaFuncionarios {
    public static void main(String[] args) {

        //polimorfismo
        Funcionario gerente1 = new Gerente();

        gerente1.setNome("Fulano");
        gerente1.setSalario(5000);

        EditorVideo editorDeVideo = new EditorVideo();
        editorDeVideo.setSalario(2000);

        //polimorfismo
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        controle.registra(editorDeVideo);

        //testando bonificação editorDeVideo
        System.out.println("Bonificação " + editorDeVideo.getBonificacao());


        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("Salário atual: " + gerente1.getSalario());
        System.out.println();


        Gerente novoGerente = new Gerente();
        novoGerente.setNome("Carlos");
        novoGerente.setSalario(6000);
        novoGerente.setSenha(2222);
        boolean autenticou = novoGerente.autentica(2222);


        System.out.println("Nome " + novoGerente.getNome());
        System.out.println("Cargo e Salário: " + novoGerente.getBonificacao());
        System.out.println("-=-=-=-=-=-=-=-=-");

        //Instanciando um novo adm
        Administrador adm = new Administrador();
        adm.setSenha(2222);

        SegurancaBanco seguranca = new SegurancaBanco();
        seguranca.setSenha(3333);

        //testando autenticação de  usuário.
        SistemaInterno sistemaValida = new SistemaInterno();
        sistemaValida.autentica(novoGerente);
        sistemaValida.autentica(adm);
        sistemaValida.autentica(seguranca);



    }
}
