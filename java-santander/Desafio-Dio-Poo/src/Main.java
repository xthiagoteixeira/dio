import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Curso descrição 1");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Curso descrição 2");
        curso2.setCargaHoraria(10);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("mentoria java");
        m1.setDescricao("descrição mentoria java");
        m1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(m1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp 1");
        bootcamp1.setDescricao("Descricao Bootcamp 1");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(m1);

        Dev devThiago = new Dev();
        devThiago.setNome("Dev Thiago");
        devThiago.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Thiago: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();

        System.out.println("Conteudos Concluidos Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularXp());

        System.out.println("----------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Dev Maria");
        devMaria.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteudos Concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularXp());




    }
}
