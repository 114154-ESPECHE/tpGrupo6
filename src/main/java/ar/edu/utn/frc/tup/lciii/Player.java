package ar.edu.utn.frc.tup.lciii;
import lombok.Data;
@Data
public class Player {
    private String nombre;
    private String color;
    private int puntaje;

    public Player(String nombre, String color, int puntaje){
        this.nombre = nombre;
        this.color = color;
        this.puntaje = puntaje;
    }
}
