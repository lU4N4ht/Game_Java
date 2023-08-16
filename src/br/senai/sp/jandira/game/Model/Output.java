package br.senai.sp.jandira.game.Model;

import java.io.ObjectOutput;

public class Output {
    public void PrintPlayer(Player player){

        int getLifePlayer = player.getLife();


        /** Printando informações */

        System.out.println("+--------------- P L A Y E R ----------------+");
        System.out.println("| Player's name is: " + player.name );
        System.out.println("| Your player's skin is: " + player.skin);
        System.out.println("| Player's life is: " + getLifePlayer);
        System.out.println("+--------------------------------------------+");


    }

    public void PrintEnemy(Enemy enemy){

        int getLifeEnemy = enemy.getLife();

        /** Printando informações */

        System.out.println("================ E N E M Y ================");
        System.out.println("Enemy's name is:" + enemy.name);
        System.out.println("Your enemy's skin is: " + enemy.skin);
        System.out.println("| Player's life is: " + getLifeEnemy);


        System.out.println("--------------------------------------------------");


    }
    public void PrintBoth(Player player, Enemy enemy){

        /** Printando informações */

        System.out.println("================ P L A Y E R ================");
        System.out.println("Player's name is:" + player.name);
        System.out.println("Your player's skin is: " + player.skin);
        System.out.println("=============================================");

        System.out.println("================ E N E M Y ================");
        System.out.println("Enemy's name is:" + enemy.name);
        System.out.println("Your enemy's skin is: " + enemy.skin);
        System.out.println("=============================================");


    }
}
