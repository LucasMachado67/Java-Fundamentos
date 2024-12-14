
import javax.swing.JOptionPane;

public class ExerciciosWhile {

    public static void main(String[] args) {
        exercicio10();

    }

    private static void exercicio01(){
        
        int indice = 0;
        while (indice < 5) {
            String nome = JOptionPane.showInputDialog("Digite um nome");

            JOptionPane.showMessageDialog(null, "Nome: "+  nome);
            indice += 1;
        }
    }

    private static void exercicio02(){
        
        int indice = 0;
        int quantidadeNumerosPositivos = 0, quantidadeNumerosNegativos = 0, quantidadeNumerosNeutros = 0, quantidadeNumerosPares = 0, quantidadeNumerosImpares = 0;   
        int soma = 0;
        
        while (indice < 10) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

            if(numero > 0){
                quantidadeNumerosPositivos = quantidadeNumerosPositivos + 1;
                soma = soma + numero;
            }else if(numero < 0){
                quantidadeNumerosNegativos = quantidadeNumerosNegativos + 1;
                soma = soma + numero;
            }else {
                quantidadeNumerosNeutros = quantidadeNumerosNeutros + 1;
                soma = soma + numero;
            }

            if(numero % 2 == 0){
                quantidadeNumerosPares = quantidadeNumerosPares + 1;
            }else{
                quantidadeNumerosImpares = quantidadeNumerosImpares + 1;
            }
            indice += 1;
        }

        double media = soma / 10;

        JOptionPane.showMessageDialog(null,
            "A quantidade de numeros Positivos foi de: " + quantidadeNumerosPositivos +
            "\nA quantidade de numeros Negativos foi de: " + quantidadeNumerosNegativos +
            "\nA quantidade de numeros Neutros foi de: " + quantidadeNumerosNeutros +
            "\nA quantidade de numeros Pares foi de: " + quantidadeNumerosPares +
            "\nA quantidade de numeros Ímpares foi de: " + quantidadeNumerosImpares +
            "\nA média foi de: " + media
        
        );
    }

    private static void exercicio03(){

        int indice = 0;
        while (indice < 4) {
            
            String nome = JOptionPane.showInputDialog("Digite o seu nome");
            String sobreNome = JOptionPane.showInputDialog("Digite o seu sobre nome");
            double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua primeira nota"));
            double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua segunda nota"));
            double nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua terceira nota"));
            double media =  (nota1 + nota2 + nota3) / 3;
            String condicao = "";
            if(media >= 7){
                condicao = "Aprovado";
            }else if(media < 5){
                condicao = "Reprovado";
            }else{
                condicao = "Em exame";
            }

            JOptionPane.showMessageDialog(null,
                "Nome: " + nome +
                "\nSobrenome: " + sobreNome +
                "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2 +
                "\nNota 3: " + nota3 +
                "\nVocê está: " + condicao + " com uma média de: " + media
            
            );


            
            indice = indice + 1;
        }
    }

    private static void Exercicio04(){


        int indice = 0;
        int menorQuantidade = 123123123;
        int maiorQuantidade = 0;
        String produtoSalvoMenorQuantidade = "";
        String produtoSalvoMaiorQuantidade = "";
        while (indice < 5) {

            String nome = JOptionPane.showInputDialog("Digite o nome do produto"); 
            int quantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do estoque"));
            
            if(quantidadeEstoque < menorQuantidade){
                menorQuantidade = quantidadeEstoque;
                produtoSalvoMenorQuantidade = nome;
            }
            if(quantidadeEstoque > maiorQuantidade){
                maiorQuantidade = quantidadeEstoque;
                produtoSalvoMaiorQuantidade = nome;
            }



            indice = indice + 1;
        }

        JOptionPane.showMessageDialog(null,
            "Nome: " + produtoSalvoMenorQuantidade +
            "\nQuantidade em estoque: " + menorQuantidade +
            "\nNome: " + produtoSalvoMaiorQuantidade +
            "\nQuantidade em estoque: " + maiorQuantidade
        );
    }

    private static void exercicio05(){
        int indice = 0;
        double somaSalario = 0;
        double menorSalario = 99999.99;
        double maiorSalario = 0;
        double media = 0;
        while (indice < 6) {
            
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

            somaSalario = somaSalario + salario;
            if(salario < menorSalario){
                menorSalario = salario;
            }
            if(salario > maiorSalario){
                maiorSalario = salario;
            }
            media = somaSalario / 6;

            indice++;
        }

        JOptionPane.showMessageDialog(null, 
            "A soma de todos os salários: " + somaSalario + 
            "\nA média de todos os salários: " + media + 
            "\nO menor salário: " + menorSalario + 
            "\nO menor salário: " + maiorSalario 
        
        );
    }
    private static void exercicio06(){

        int indice = 0;
        int maiorNumero = 0;
        int menorNumero = 99999990;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        while (indice < 10) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            if(numero < menorNumero){
                menorNumero = numero;
            }

            if(numero % 2 == 0){
                quantidadePares = quantidadePares +1;
            }else{
                quantidadeImpares = quantidadeImpares + 1;
            }
            indice += 1;
        }

        JOptionPane.showMessageDialog(null, 
            "O maior número foi: " + maiorNumero +
            "\nO menor número foi: " + menorNumero +
            "\nA quantidade de números ímpares é de: " + quantidadeImpares +
            "\nA quantidade de números pares é de: " + quantidadePares
        
        );
    }
    private static void exercicio07(){
        int indice = 0;
        int maiorIdade = 0;
        int menorIdade = 99999990;
        int somaIdade = 0;

        while (indice < 5) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade2"));

            if(idade > maiorIdade){
                maiorIdade = idade;
            }
            if(idade < menorIdade){
                menorIdade = idade;
            }

            somaIdade = somaIdade + idade;
            indice += 1;
        }

        double media = somaIdade / 5;

        JOptionPane.showMessageDialog(null, 
            "A maior idade foi de: " + maiorIdade +
            "\nA menor idade foi de: " + menorIdade +
            "\nA soma das idade foi de: " + somaIdade +
            "\nA média das idades foi de: " + media
        
        );
    }
    private static void exercicio08(){
        
        int indice = 0;
        double maisPesada = 0;
        String nomePessoaMaisPesada = "";
        String nomePessoaMenosPesada = "";
        double menosPesada = 123123123;
        double somaPesos = 0;
        while(indice < 4){

            String nome = JOptionPane.showInputDialog("Digite o nome:");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));

            if(peso < menosPesada){
                menosPesada = peso;
                nomePessoaMenosPesada = nome;
            }
            if(peso > maisPesada){
                maisPesada = peso;
                nomePessoaMaisPesada = nome;
            }

            somaPesos = somaPesos + peso;
            indice += 1;
        }
        double media = somaPesos / 4;

        JOptionPane.showMessageDialog(null,
            "O(a) " + nomePessoaMaisPesada + " é a mais pesada, com: " + maisPesada +
            "\nO(a) " + nomePessoaMenosPesada + " é o menos pesado, com: " + menosPesada +
            "\nA média dos pesos é de: " + media
        );

        
    }
    private static void exercicio09(){
        
        int indice = 0;
        String menorNome = "awdaczsczcszksmzksmzkzkmzmwidáiwdai";
        String maiorNome = "";
        while (indice < 3) {

            String nome =JOptionPane.showInputDialog("Digite o seu nome");
            
            if(nome.length() < menorNome.length()){
                menorNome = nome;
            }
            if(nome.length() > maiorNome.length()){
                maiorNome = nome;
            }
            
            indice++;
        }
        JOptionPane.showMessageDialog(null, "O maior nome é: " + maiorNome +
            "\nO menor nome é: " + menorNome
        );

    }
    private static void exercicio10(){
        int indice = 0;
        double menorValor = 1231231231;
        double maiorValor = 0;
        double somaDasVendas = 0;
        while (indice < 5) {
            
            double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda"));
            if(valorVenda < menorValor){
                menorValor = valorVenda;
            }
            if(valorVenda > maiorValor){
                maiorValor = valorVenda;
            }

            somaDasVendas = somaDasVendas + valorVenda;
            indice++;
        }
        double media = somaDasVendas / 5;

        JOptionPane.showMessageDialog(null, 
            "A soma das vendas foi de: " + somaDasVendas +
            "\nA média das vendas foi de: " + media +
            "\nO menor valor das vendas foi de: " + menorValor +
            "\nO maior das vendas foi de: " + maiorValor
        );
    }
}
