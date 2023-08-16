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
        System.out.println("+______________________________________________________+");
        System.out.println("|             E T E R N A L   K O M B A T              |");
        System.out.println("+______________________________________________________+");
        System.out.println("|         W E L C O M E  T O  T H E  G A M E !         |");
        System.out.println("+______________________________________________________+");
        System.out.println(" ");

        System.out.print("| Choose who you want to register (Player | Enemy | Both)|");
        System.out.println(" ");
        choice = teclado.nextLine();

        switch (choice.toLowerCase()) {
            case "Player":
                PlayerRegister();
                break;
            case "Enemy":
                EnemyRegister();
                break;
            case "Both":
                bothRegister();
                break;
        }
    }

    public void PlayerRegister() {
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
    }

    public void EnemyRegister() {
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
    }
    public void bothRegister() {
        validPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintBoth(player, enemy);
    }
}