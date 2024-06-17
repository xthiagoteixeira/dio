package app.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        Contato contato = new Contato(nome, numero);
        contatoSet.add(contato);
    }

    public void exibirContatos(){
        for (Contato contato : contatoSet) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> resultado = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                resultado.add(contato);
            }
        }
        return resultado;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                return contato;
            }
        }
        return null;
    }

    public static void main(String[] args) {


        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("John Doe", 123456789);
        agenda.adicionarContato("John Doe", 987654329);
        agenda.adicionarContato("Jane Doe", 987654321);

        agenda.exibirContatos();

        Set<Contato> contatosEncontrados = agenda.pesquisarPorNome("John");
        System.out.println(contatosEncontrados);

        Contato contatoAtualizado = agenda.atualizarNumeroContato("John Doe", 564839102);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        agenda.exibirContatos();

    }

}
