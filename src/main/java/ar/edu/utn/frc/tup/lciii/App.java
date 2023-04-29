package ar.edu.utn.frc.tup.lciii;

import java.math.BigDecimal;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Player p1 = new Player("Agustin","White",2533);
        Player p2 = new Player("Viki","Green",848484);
        Player p3 = new Player("Eve","Red",544454);
        List<Player> lPlayers = new ArrayList<>();
        lPlayers.add(p1);
        lPlayers.add(p2);
        lPlayers.add(p3);
        Object[][] mGame = new Object[3][3];
        mGame[0][0] = 0;
        mGame[0][1] = lPlayers.get(0);
        mGame[0][2] = 1;// 1-ganada - 0-perdida
        mGame[1][0] = 0;
        mGame[1][1] = lPlayers.get(1);
        mGame[1][2] = 1;
        mGame[2][0] = 0;
        mGame[2][1] = lPlayers.get(2);
        mGame[2][2] = 1;


        /*for (int i = 0; i < lGame.size(); i++){
            System.out.println(lGame.get(i).toString());
        }*/
        /*for(int i = 0; i < mGame.length; i++){
            for (int j = 0; j < mGame[i].length;j++){
                System.out.println(mGame[i][j]);
            }
            System.out.println();
        }*/


        boolean bandera = false;
        while (bandera == false) {
            int op = menu.menuPrincipal();
            if (op >= 1 || op <= 4) {
                switch (op) {
                    case 1:
                        menu.subMenuGame();
                        break;
                    case 2:
                        menu.subMenuPlayers();
                        break;
                    case 3:
                        menu.subMenuHelp();
                        break;
                    case 4:
                        menu.exit();
                        bandera = true;
                        break;
                }
            }
        }
    }
}

