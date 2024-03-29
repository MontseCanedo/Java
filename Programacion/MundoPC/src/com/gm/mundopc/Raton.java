package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private static int contadorRatones;

    /*public Raton(){
        this.idRaton = ++Raton.contadorRatones;
    }*/
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "idRaton=" + idRaton + " " + super.toString() + '}' + "\n";
    }

}
