package app.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() { this.eventosMap = new HashMap<>(); }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome,atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(LocalDate data) {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        SortedSet<LocalDate> dates = new TreeSet<>(eventosMap.keySet());
        LocalDate today = LocalDate.now();
        for (LocalDate date : dates) {
            if (!date.isBefore(today)) {
                Evento nextEvent = eventosMap.get(date);
                System.out.println("O próximo evento é : " + nextEvent);
                return;
            }
        }
        System.out.println("Sem eventos futuros.");
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        LocalDate dataEvento = LocalDate.of(2024, 5, 12);
        agenda.adicionarEvento(dataEvento, "Nome do Evento", "Atraca do Evento");

        LocalDate dataEvento2 = LocalDate.of(2024, 6, 20);
        agenda.adicionarEvento(dataEvento2, "Nome do Evento 2", "Atracao do Evento 2");

        LocalDate dataEvento3 = LocalDate.of(2024, 6, 30);
        agenda.adicionarEvento(dataEvento3, "Nome do Evento 3", "Atracao do Evento 3");

        agenda.exibirAgenda(dataEvento);
        agenda.obterProximoEvento();

    }
}
