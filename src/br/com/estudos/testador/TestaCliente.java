package br.com.estudos.testador;

import br.com.estudos.classes.Cliente;
import br.com.estudos.classes.SistemaInterno;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();

        novoCliente.setSenha(2222);

        SistemaInterno validacao = new SistemaInterno();
        validacao.autentica(novoCliente);



    }
}
