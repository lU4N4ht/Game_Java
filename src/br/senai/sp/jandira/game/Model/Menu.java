package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Menu {
    public void Menu(){

        Scanner teclado = new Scanner(System.in);

        Register register = new Register();

        Battle battle = new Battle();

        //boolean menuloop = true;
        boolean exit = false;

        while (!exit){
            System.out.println("+______________________________________________________+");
            System.out.println("|             E T E R N A L   K O M B A T              |");
            System.out.println("+______________________________________________________+");
            System.out.println("|         W E L C O M E  T O  T H E  G A M E !         |");
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Regiter..........................................|");
            System.out.println("| 2 - Battle...........................................|");
            System.out.println("| 3 - Exit.............................................|");
            System.out.println("+______________________________________________________+");
            int menuChoice = teclado.nextInt();

         switch (menuChoice){
             case 1:
                 register.choices();
                 break;

             case 2:
                 battle.ChoiceScenario();
                 battle.Battle();
                 break;

             case 3:
                 exit = true;
                 //menuloop = false;
                 break;
         }
     }

    }
}
