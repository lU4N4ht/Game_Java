package br.senai.sp.jandira.game.Model;

import java.util.Scanner;
public class Battle {

    //Criando Variáveis
     String scenarioBattle;

    /** Instancia Scanner**/
    Scanner teclado = new Scanner(System.in);

    /** Instancia Scenario**/
    Scenario scenario = new Scenario();

    public void ChoiceScenario(){
        System.out.println("+______________________________________________________+");
        System.out.println("| Choose a scenario....................................|");
        System.out.println("+______________________________________________________+");
        System.out.println("| 1 - Living Forest....................................|");
        System.out.println("| 2 - Evil Tower.......................................|");
        System.out.println("| 3 - Dead Pool........................................|");
        System.out.println("| Default - Portal Wave................................|");
        System.out.println("+______________________________________________________+");
        int choiceScenario = teclado.nextInt();

       scenarioBattle = scenario.Scenario(choiceScenario);

        System.out.println(scenarioBattle);

    }
    public void Battle(Player player , Enemy enemy){

        while (true) {

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifePlayer == 0) {
                System.out.println("PLAYER'S WIN ᕙ(`▿´)ᕗ");
                break;
            } else if (lifeEnemy == 0) {
                System.out.println("ENEMY'S WIN (⌐■_■)");
                break;
            }

            System.out.println("+------------------- B A T T L E ------------------+");
            System.out.println("| Player's attack [ E ]" + player.name + "PLAYER'S LIFE: " + lifePlayer);
            System.out.println("| Enemy's attack [ L ]" + enemy.name + "ENEMY'S LIFE: " + lifeEnemy);
            System.out.println("+--------------------------------------------------+");
            String attack = teclado.next();

            if (attack.equalsIgnoreCase("E")) {
                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaEnemy = (int) (Math.random() * 20) + 1;

                int realDano = danoPlayer - defesaEnemy;

                if (realDano < 0){
                    realDano = 0;
                }
                enemy.lifeAttack(realDano);

                System.out.println(" ");
                System.out.println(" (>‘.’)> ︻┳═ 一  PLAYER'S ATTACK: " + realDano);

            } else if (attack.equalsIgnoreCase("L")) {
                int danoEnemy = (int) (Math.random() * 20) + 1;
                int defesaPlayer = (int) (Math.random() * 20) + 1;

                int realDano = danoEnemy - defesaPlayer;

                if (realDano < 0){
                    realDano = 0;
                }
                player.lifeAttack(realDano);

                System.out.println(" ");
                System.out.println(" (>‘.’)> ︻┳═ 一  ENEMY'S ATTACK: " + realDano);

            } else {
                System.out.println("Non-valid key! testet");
            }
        }
    }
}
