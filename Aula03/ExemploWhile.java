import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class ExemploWhile {

    public static void main(String[] args) {
        exemploQuantidadePorCategoria();
    }

    private static void exemplo01(){

        int indice = 0;
        while(indice < 4){
            System.out.println("Olá mundo!!");

            // indice = 0 + 1 => 1
            // indice = 1 + 1 => 2
            // indice = 2 + 1 => 3
            indice = indice + 1;
        }
    }

    private static void exemploSoma(){
        //Solicitar o nome do paciente 3 vezes
        int indice = 0;
        int quantidadePaciente = 3;
        int soma = 0;

        while(indice < quantidadePaciente){
            String nomePaciente = JOptionPane.showInputDialog("Digite o nome do(a) Paciente");
            int idadePaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) " + nomePaciente));
            soma = soma + idadePaciente;
            indice = indice + 1;
        }

        JOptionPane.showMessageDialog(null,  "A soma das idades é: " + soma);
    }

    private static void exemploMaiorNumero(){
        //Solicitar x números e apresentar o maior número
        int indice = 0;
        int maiorNumero = 0;
        while(indice < 5){
            int numero =Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

            if(numero > maiorNumero){
                maiorNumero = numero;
            }
            indice = indice + 1;
        }

        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero);
    }

    private static void exemploMenorNumero(){

        //Solicitar x peso e apresentar o menor peso
        int indice = 0;
        double menorPeso = 1000;
        String nomeMenorPeso = "";
        while(indice < 4){
            String nome = JOptionPane.showInputDialog("Digite o nome");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));

            if(peso < menorPeso){
                menorPeso = peso;
                nomeMenorPeso = nome;
            }

            indice = indice + 1;
        }
        JOptionPane.showMessageDialog(null,nomeMenorPeso + " tem o menor Peso: " + menorPeso);
    }

    private static void exemploMedia(){
        int quantidadeDesejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada"));

        int indice = 0;
        double soma = 0;
        while (indice < quantidadeDesejada) {
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

            soma = soma + salario;
            indice = indice + 1;
            
        }
        double media = soma / quantidadeDesejada;
        JOptionPane.showMessageDialog(null, "A média salarial é de: " + media);
    }

    private static void exemploQuantidadePorCategoria(){
        int indice = 0;

        int quantidadeStarWars = 0, quantidadeHarryPotter = 0, quantidadeEldenRing = 0, quantidadeOutros = 0;
        while (indice < 0) {
            String categoria = JOptionPane.showInputDialog("Digite o nome da categoria").trim().toLowerCase();

            if(categoria.equals("star wars")){
                quantidadeStarWars = quantidadeStarWars + 1;
            }else if(categoria.equals("harry potter")){
                quantidadeHarryPotter = quantidadeHarryPotter + 1;
            }else if(categoria.equals("elden ring")){
                quantidadeEldenRing = quantidadeEldenRing + 1;
            }else{
                quantidadeOutros = quantidadeOutros + 1;
            }
        }

        JOptionPane.showMessageDialog(null,
            "Quantidade Star Wars: " + quantidadeStarWars +
            "Quantidade Elden Ring: " + quantidadeEldenRing +
            "Quantidade Harry Potter: " + quantidadeHarryPotter +
            "Quantidade Outros: " + quantidadeOutros
        );
    }
}   
