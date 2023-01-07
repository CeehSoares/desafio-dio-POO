import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

      /* Exemplo de Polimorfismo - Tudo que tem na classe Conteudo tem na classe Curso, mas tudo que tem
         em Curso não tem em Conteudo. A mesma coisa com a classe Mentoria e ArrayList.

        Conteudo conteudo = new Curso();
        Conteudo conteudo = new Mentoria();
        List<String> lista = new ArrayList<>();

        */

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("----------------");

        Dev devCeicao = new Dev();
        devCeicao.setNome("Ceicao");
        devCeicao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ceeh antes de progredir: " + devCeicao.getConteudosInscritos());
        devCeicao.progredir();
        devCeicao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Ceeh: " + devCeicao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ceeh: " + devCeicao.getConteudosConcluidos());
        System.out.println("XP: " + devCeicao.calcularTotalXp());

        System.out.println("----------------");

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo antes de progredir: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

        System.out.println("----------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria antes de progredir: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("----------------");


    }
}