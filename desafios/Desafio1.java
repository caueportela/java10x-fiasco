package desafios;

public class Desafio1 {
    public static void main(String[] args) {
// Criar três ninjas com  nome, idade, missão, nivel de dificuldade e status


// Ninja1
        String Ninja1 = "Naruto Uzumaki";
        int idade = 15;
        String Missao1 = "Salvar a aldeia";
        String StatusMissao1 = "Concluido";
        char nivelDificuldade1 = 'A';
        if (idade < 15 && nivelDificuldade1 == 'A' || nivelDificuldade1 == 'B') {
            System.out.printf("Ninja %s não tem nível para fazer essa missão\n", Ninja1);

        }
        else {
            System.out.println(StatusMissao1);
        }

// Ninja2
        String Ninja2 = "Sakura";
        int idade2 = 10;
        String Missao2 = "Salvar a aldeia";
        char nivelDificuldade2 = 'D';
        String StatusMissao2 = "Em andamento";

        if (idade2 < 15 && nivelDificuldade2 == 'A' || nivelDificuldade1 == 'B') {
            System.out.printf("Ninja %s não tem nível para fazer essa missão\n", Ninja2);

        }
        else {
            System.out.println(StatusMissao2);
        }
// Ninja3

        String Ninja3 = "Sasuke";
        int idade3 = 13;
        String Missao3 = "Salvar a aldeia";
        String StatusMissao3 = "Em andamento";
        char nivelDificuldade3 = 'A';

        if (idade3 < 15 && nivelDificuldade3 == 'A' || nivelDificuldade3 == 'B') {
            System.out.printf("Ninja %s não tem nível para fazer essa missão\n", Ninja3);

        }
        else {
            System.out.println(StatusMissao3);
        }




    }
}
