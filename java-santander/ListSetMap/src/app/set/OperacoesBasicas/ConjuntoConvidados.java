package app.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("John", 123);
        conjuntoConvidados.adicionarConvidado("Jane", 456);
        conjuntoConvidados.adicionarConvidado("Jane", 456);
        conjuntoConvidados.adicionarConvidado("Bob", 789);
        conjuntoConvidados.exibirConvidados();

        int totalConvidados = conjuntoConvidados.contarConvidados();
        System.out.println("Total de convidados: " + totalConvidados);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(456);
        conjuntoConvidados.exibirConvidados();

        totalConvidados = conjuntoConvidados.contarConvidados();
        System.out.println("Total de convidados: " + totalConvidados);


        Convidado convidado = new Convidado("Alice", 999);
        conjuntoConvidados.adicionarConvidado(convidado.getNome(), convidado.getCodigoConvite());
        conjuntoConvidados.exibirConvidados();

        totalConvidados = conjuntoConvidados.contarConvidados();
        System.out.println("Total de convidados: " + totalConvidados);

    }

}
