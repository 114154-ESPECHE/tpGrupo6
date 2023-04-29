package ar.edu.utn.frc.tup.lciii;

import javax.naming.spi.DirObjectFactory;
import java.util.Scanner;

public class Help {
    String resumen = "";
    public String howToPlay(){

        return resumen = "Aca adentro deberiamos pone de que se trata el juego, pasos basicos para entenderlo" +
                "algunas reglas, cantidad de jugadores y objetivo.";
    }
    public String gameRules(){
        return resumen = "Cada jugador tiene un turno para el disparo.\n La suma de puntos se debe a la cantidad" +
                "de aciertos en los disparos, mientras mas al centro del objetivo mas puntos, etc.\n" +
                "No esta perimito el uso de cheats de ningun tipo por ninguna causa, blablabla";
    }
    public boolean contactAdmin(){
        boolean enviado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su correo electronico de usuario:\n");
        String correo = sc.nextLine();
        return enviado;
    }
}
