import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo_Selecionando {
    public static String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    public static String [] candidatosResultado = {"","","","",""};
    public static double salarioBase = 2000.0;

    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();

    }

    static void imprimirSelecionados(){
        System.out.println("................................");
        System.out.println("Imprimindo a lista de candidatos");

        for(String candidato: candidatosResultado){
            if(!Objects.equals(candidato, "")){
                System.out.println("O candidato SELECIONADO foi: " + candidato);
            }
        }
    }

    static void selecaoCandidatos(){
        int candidatosAtual = 0;
        int candidatosSelecionados = 0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){

            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosResultado[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    void analisarCandidato(double salarioPretendido){

         if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

}
