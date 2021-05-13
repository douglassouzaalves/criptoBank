public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();

        gerente1.setNome("Carlos");
        gerente1.setCpf("222-222-333-05");
        gerente1.setSenha(123);
        gerente1.setSalario(5000);

        boolean conseguiuLogar = gerente1.autentica(123);
        System.out.println("Senha autenticada? " + conseguiuLogar);
        System.out.println(gerente1.getNome());
        System.out.println(gerente1.getSalario());
        System.out.println(gerente1.getBonificacao());

    }
}
