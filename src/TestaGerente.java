public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();


        gerente1.setNome("Carlos");
        gerente1.setCpf("222-222-333-05");
        gerente1.setSenha(123);
        gerente1.setSalario(3000);

        Funcionario editor = new EditorVideo();
        editor.setSalario(2000);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        controle.registra(editor);

        //Testando bonificação do Editor de Vídeos
        System.out.println(editor.getBonificacao());


        boolean conseguiuLogar = gerente1.autentica(123);
        System.out.println("Senha autenticada? " + conseguiuLogar);
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("Salário atual: " + gerente1.getSalario());
        System.out.println("Salário + Bonificação " + gerente1.getBonificacao());
        System.out.println();

        System.out.println("Novo salário " + controle.getSoma());


    }
}
