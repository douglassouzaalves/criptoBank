public class TestaCliente {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();

        novoCliente.setSenha(2222);

        SistemaInterno validacao = new SistemaInterno();
        validacao.autentica(novoCliente);



    }
}
