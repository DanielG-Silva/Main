package objetos.voadores;

import java.sql.SQLOutput;

public class Patos implements Voador {


    public boolean cor() {
        System.out.println("Patinho colorido");
        return true;
    }

    public boolean patinhos() {
        System.out.println("Tem patinhos");
        return true;
    }

    @Override
    public double voar() {
        System.out.println("Voa patolino");
        return 0;
    }

    @Override
    public void planar() {
    System.out.println("Plane patolino");
    }

    @Override
    public boolean pousar() {
        System.out.println("Pouse patolino");
        return true;
    }
}

