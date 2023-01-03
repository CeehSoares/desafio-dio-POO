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

      /* Exemplo de Polimofismo - Tudo que tem em conteudo tem em curso, mas tudo que tem
         em curso não tem em conteudo.


        Conteudo conteudo = new Curso();
        Conteudo conteudo = new Mentoria();

        List<String> palavras = new ArrayList<>();*/

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("----------");
        Dev devCeicao = new Dev();
        devCeicao.setNome("Ceicao");
        devCeicao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ceeh: " + devCeicao.getConteudosInscritos());
        devCeicao.progredir();
        devCeicao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ceeh: " + devCeicao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ceeh: " + devCeicao.getConteudosConcluidos());
        System.out.println("XP: " + devCeicao.calcularTotalXp());


        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}