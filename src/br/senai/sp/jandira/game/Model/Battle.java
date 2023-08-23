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
        System.out.println("+______________________________________________________+");
        int choiceScenario = teclado.nextInt();

       scenarioBattle = scenario.Scenario(choiceScenario);

        System.out.println(scenarioBattle);

    }
    public void Battle(Player player , Enemy enemy){
        System.out.println(player);
        System.out.println(enemy);
    }

}
