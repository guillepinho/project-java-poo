import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO");
        curso2.setDescricao("Descrição curso POO");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Ifood Java Developer");
        bootcamp.setDescricao("Bootcamp ma-ra-vi-lho-so de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGui = new Dev();
        devGui.setNome("Guilherme");
        devGui.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gui: " + devGui.getConteudosInscritos());
        devGui.progredir();
        devGui.progredir();
        devGui.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Gui: " + devGui.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Gui: " + devGui.getConteudosConcluidos());
        System.out.println("XP: " + devGui.calcularTotalXp());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Gui: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
