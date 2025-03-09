package objetos.voadores;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int quantidadeVoadores = 10;
        Voador[] voadores = new Voador[quantidadeVoadores];
        Random random = new Random();

        for (int i = 0; i < quantidadeVoadores; i++) {
            int escolhaVoador = random.nextInt(3);

            if (escolhaVoador == 0) {
                voadores[i] = new Patos();
            } else if (escolhaVoador == 1) {
                voadores[i] = new Drone("Modelo Zapzap");
            } else {
                voadores[i] = new GalinhaVoadora();
            }
        }
        for (Voador voador : voadores) {
            voador.voar(); //chamada
            voador.planar(); //chamada
            voador.pousar(); //chamada

            System.out.println("\n");


        }
    }
}
