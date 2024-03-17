package org.pr2.interfaces;

import org.pr2.dominio.*;

public class Interfaz {
    public static void iniciar(String args[]){
        Libreta libreta = new Libreta();
        if (args[0].equals("add")){
            libreta.annadirContacto(args[1], args[2]);
        } else if (args[0].equals("rm")){
            libreta.borrarContacto(args[1]);
        } else if (args[0].equals("show")) {
            System.out.println(libreta);
        } else if (args[0].equals("hoja")){
            libreta.generarHojaDeCalculo();
            System.out.println("Hoja de cálculo generada en output/contactos.ods");
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}