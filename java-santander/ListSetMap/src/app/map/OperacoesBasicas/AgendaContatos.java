package app.map.OperacoesBasicas;

import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = agendaContatoMap;
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if(!agendaContatoMap.isEmpty()){
            return agendaContatoMap.get(nome);
        }
        return 0;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Thiago", 120998);
        agendaContatos.adicionarContato("Joana", 543234);
        agendaContatos.adicionarContato("Ana Karina", 543134);
        agendaContatos.adicionarContato("baba", 5432314);
        agendaContatos.adicionarContato("Bandal", 543211);
        agendaContatos.adicionarContato("Mario", 5466622);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Camila");
        agendaContatos.exibirContatos();


    }

}
