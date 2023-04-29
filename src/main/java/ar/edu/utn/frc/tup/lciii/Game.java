package ar.edu.utn.frc.tup.lciii;

import lombok.Data;

@Data
public class Game {
    private int nPartida;
    private Player player;
    private boolean state;
    
    public boolean validarJugador(List<Player> lPlayer, String nombre){
        boolean ok = false;
        for (Player item : lPlayer){
            if (item.getNombre() != nombre){
                System.out.println("Debe crear el jugador");
                pNuevo.setNombre(nombre);
                Player pNuevo = new Player(nombre,"Grey",0);
                ok = true;//el jugador fue creado.
            }else {
                System.out.println("Jugador encontrado");
            }
        }
        return ok;
    }
}
