package ar.edu.utn.frc.tup.lciii;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int op = 0;

    public int menuPrincipal() {
        //System.out.println("-".repeat(10) + "Ingrese elnumero de opcion" + "-".repeat(10));
        menuIngreseNumeroOpcion();
        System.out.printf("1-Game\n2-Players\n3-Help\n4-Exit\n");
        int op = sc.nextInt();
        return op;
    }

    public boolean subMenuGame() {
        System.out.println("-".repeat(10) + "Game" + "-".repeat(10));
        boolean exit = false;
        while (!exit) {
            //System.out.println("Ingrese el numero de opcion");
            menuIngreseNumeroOpcion();
            System.out.println("1-Start new Game\n2-Load a started game\n3-Play a finished game\n4-Back to menu\n");
            op = sc.nextInt();
            if (op >= 1 && op <= 4) {
                switch (op) {
                    case 1:
                        System.out.println("-".repeat(10) + "Start new Game" + "-".repeat(10) + "\n");

                        break;
                    case 2:
                        System.out.println("-".repeat(10) + "Load a started game" + "-".repeat(10) + "\n");
                        break;
                    case 3:
                        System.out.printf("-".repeat(10) + "Play a finished game" + "-".repeat(10) + "\n");
                        break;
                    case 4:
                        System.out.println("-".repeat(10) + "Back to menu" + "-".repeat(10) + "\n");
                        exit = true;
                        break;
                }
            }
        }
        return exit;
    }

    public boolean subMenuPlayers() {
        System.out.println("-".repeat(10) + "Players" + "-".repeat(10));
        boolean exit2 = false;
        while (!exit2) {
            menuIngreseNumeroOpcion();
            System.out.println("1-Create a new player\n2-List all player\n3-List players score\n4-Update player\n5-Delete player\n6-Back to menu\n");
            op = sc.nextInt();
            if (op >= 1 && op <= 6) {
                switch (op) {
                    case 1:
                        System.out.println("-".repeat(10) + "Create a new player" + "-".repeat(10) + "\n");

                        break;
                    case 2:
                        System.out.println("-".repeat(10) + "List all players" + "-".repeat(10) + "\n");

                        break;
                    case 3:
                        System.out.println("-".repeat(10) + "list players score" + "-".repeat(10) + "\n");

                        break;
                    case 4:
                        System.out.println("-".repeat(10) + "Update player" + "-".repeat(10) + "\n");

                        break;
                    case 5:
                        System.out.println("-".repeat(10) + "Delete player" + "-".repeat(10) + "\n");

                        break;
                    case 6:
                        System.out.println("-".repeat(10) + "Back to menu" + "-".repeat(10) + "\n");
                        exit2 = true;
                        break;
                    default:
                        System.out.println("Ingreso por default");
                        break;
                }
            }
        }
        return exit2;
    }

    public boolean subMenuHelp() {
        Help help = new Help();
        System.out.println("-".repeat(10) + "Help" + "-".repeat(10) + "\n");
        boolean exit3 = false;
        while (!exit3) {
            menuIngreseNumeroOpcion();
            System.out.println("1-How to play\n2-Game rules\n3-Contact admin\n4-Back to menu\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("-".repeat(10) + "How to play" + "-".repeat(10) + "\n");
                    String ayuda = help.howToPlay();
                    System.out.printf(ayuda);
                    break;
                case 2:
                    System.out.println("-".repeat(10) + "Game rules" + "-".repeat(10) + "\n");
                    String reglas = help.gameRules();
                    System.out.printf(reglas);
                    break;
                case 3:
                    System.out.println("-".repeat(10) + "Contact admin" + "-".repeat(10) + "\n");
                    if (help.contactAdmin()){
                        System.out.println("Mensaje enviado exitosamente");
                    }else
                        System.out.println("Error al enviar mensaje, verifique con admin :P");
                    break;
                case 4:
                    System.out.println("-".repeat(10) + "Back to menu" + "-".repeat(10) + "\n");
                    exit3 = true;
                    break;
                default:
                    System.out.println("-".repeat(10) + "Ingreso por default" + "-".repeat(10));
                    break;
            }
        }
        return exit3;
    }

    public void exit() {
        System.out.println("-".repeat(10) + "Exit" + "-".repeat(10) + "\n");
        System.exit(0);
        //exit1 = true;    este era la bandera del menu padre
    }

    public void menuIngreseNumeroOpcion() {
        System.out.println("Ingrese el numero de opcion\n");
    }
}
