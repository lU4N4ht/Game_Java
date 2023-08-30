package br.senai.sp.jandira.game.Model;

import java.util.Locale;
import java.util.Scanner;

public class Register {
    /**
     * instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);
    /**
     * Instancia Player
     */
    Player player = new Player();
    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    /**
     * Instancia Output
     */
    Output output = new Output();
    public String choice;
    int validPrint = 0;
    public String choiceRegister;


    public void choices() {
        System.out.println("| Choose who you want to register (Player | Enemy | Both)|");
        choice = teclado.nextLine();
        System.out.println(" ");


        switch (choice.toLowerCase()) {
            case "player":
                PlayerRegister();
                break;
            case "enemy":
                EnemyRegister();
                break;
            case "both":
                bothRegister();
                break;
        }
        System.out.println(" ");
        System.out.print("| Do you want to do another register? [1 = yes  2 = no]|");
        int continueRegister = teclado.nextInt();

        if (continueRegister == 1){
            choices();
        }
    }

    public Player PlayerRegister() {
        System.out.println("+---------------- PLAYER'S REGISTER ----------------------+");
        System.out.print("| What's the Player's name: ");
        player.name = teclado.nextLine();
        System.out.print("| Choose one skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("+------------ PLAYER REGISTED WITH SUCCES ----------------+");
        System.out.println(" ");

        /** PRINTA AS INFORMAÇÕES CADASTRADAS*/
        if (validPrint != 1) {
            output.PrintPlayer(player);
        }
         return player;
    }

    public Enemy EnemyRegister() {
        //Coleta de dados do Enemy-1
        System.out.println("+---------------- ENEMY'S REGISTER ----------------------+");
        System.out.print("| What's the Enemy's name: ");
        player.name = teclado.nextLine();
        System.out.print("| Choose one skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("+------------ ENEMY REGISTED WITH SUCCES ----------------+");
        System.out.println(" ");

        if (validPrint != 1) {
            output.PrintEnemy(enemy);
        }
        return enemy;
    }
    public void bothRegister() {
        validPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintEnemy(enemy);
        output.PrintPlayer(player);
    }
}