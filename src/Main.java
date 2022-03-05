import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descriçao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descriçao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp java developer descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("------------------");

        Dev devCleber = new Dev();
        devCleber.setNome("Cleber");
        devCleber.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Cleber: " + devCleber.getConteudosInscritos());
        devCleber.progredir();
        devCleber.progredir();
        devCleber.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos Cleber: " + devCleber.getConteudosInscritos());
        System.out.println("conteudos concluidos Cleber: " + devCleber.getConteudosConcluidos());
        System.out.println("XP: " + devCleber.calcularTotalXp());
    }
}
