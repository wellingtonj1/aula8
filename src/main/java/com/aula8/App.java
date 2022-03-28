package com.aula8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // clean console
        help.print("\033[H\033[2J");

        // create a person
        Pessoa empregado = new Pessoa("João", 33, "Masculino");

        // create employe Ana
        Empregado empregadoAna = new Empregado("Ana", 21, "Feminino", 5000.00, "1400");

        // create a new client Almir
        Cliente clienteAlmir = new Cliente("Almir", 21, "Masculino", 2000.00, 1976); 

        // create a new gerente Tania 
        Gerente gerenteTania = new Gerente("Tania", 30, "Feminino", 15000.00, "1300", "Atendimento");

        // create a new Vendedor Igor
        Vendedor vendedorIgor = new Vendedor("Igor", null, null, 10000.00, null, 14000.00, 120);

        // print person Igor
        help.print("\nPessoa: ");
        help.print(
            "Nome: " + empregado.getNome() + 
            "\nIdade: " + empregado.getIdade().toString() + 
            "\nSexo: " + empregado.getSexo()
        );

        // print employe Ana
        help.print("\nEmpregado: ");
        help.print(
            "Nome: " + empregadoAna.getNome() + 
            "\nIdade: " + empregadoAna.getIdade().toString() + 
            "\nSexo: " + empregadoAna.getSexo() + 
            "\nSalário: " + empregadoAna.getSalario().toString() + 
            "\nMatrícula: " + empregadoAna.getMatricula()
        );

        // print client Almir
        help.print("\nCliente: ");
        help.print(
            "Nome: " + clienteAlmir.getNome() + 
            "\nIdade: " + clienteAlmir.getIdade().toString() + 
            "\nSexo: " + clienteAlmir.getSexo() + 
            "\nValor da Dívida: " + clienteAlmir.getValorDivida().toString() +
            "\nAno de Nascimento: " + clienteAlmir.getAnoNascim().toString()
        );

        // print gerente Tania
        help.print("\nGerente: ");
        help.print(
            "Nome: " + gerenteTania.getNome() + 
            "\nIdade: " + gerenteTania.getIdade().toString() + 
            "\nMatrícula: " + gerenteTania.getMatricula() + 
            "\nNome de Gerencia: " + gerenteTania.getNomeGerencia() + 
            "\nValor do Inss: " + gerenteTania.getValorInss().toString()
        );
    
        // print vendedor Igor
        help.print("\nVendedor: ");
        help.print(
            "Nome: " + vendedorIgor.getNome() + 
            "\nSalário: " + vendedorIgor.getSalario().toString() + 
            "\nValor das Vendas: " + vendedorIgor.getValorVendas().toString() +
            "\nQuantidade Vendas: " + vendedorIgor.getQntVendas().toString()
        );

    }
}
