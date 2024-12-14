import javax.swing.JOptionPane;

public class ExemploWhile {

    public static void main(String[] args) {
        
        Exemplo02();
    }

    private static void Exemplo01(){

        int indice = 0;
        while(indice < 4){
            System.out.println("Olá mundo!!");

            // indice = 0 + 1 => 1
            // indice = 1 + 1 => 2
            // indice = 2 + 1 => 3
            indice = indice + 1;
        }
    }

    private static void Exemplo02(){
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
}   
