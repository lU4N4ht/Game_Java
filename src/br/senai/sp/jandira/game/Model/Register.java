package br.senai.sp.jandira.game.Model;

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

    public String choice;

    public void choices(){
        System.out.println("Welcome to the game!");
        System.out.print("Escolha quem quer cadastrar (Player | Enemy | Both): ");
        choice = teclado.nextLine();

        switch (choice){
            case "Player":
                PlayerRegister();
                break;
            case "Enemy":
                EnemyRegister();
                break;
            case "Both":
                bothRegister();
                break;

            default:
                System.out.println("Choose one option!");

        }

    }
    public void PlayerRegister() {
        System.out.println("-------------------- Cadastro Player ---------------------");
        System.out.print("Informe o seu nome:");
        player.name = teclado.nextLine();
        System.out.print("Escolha sua skin (red - blue - purple) : ");
        player.skin = teclado.nextLine();
        System.out.println("--------------- Player Cadastrado com Sucesso ------------");
    }

    public void EnemyRegister() {
        //Coleta de dados do Enemy-1
        System.out.println("-------------------- Cadastro Enemy ---------------------");
        System.out.print("Informe o seu nome:");
        enemy.name = teclado.nextLine();
        System.out.print("Escolha sua skin (red - blue - purple) : ");
        enemy.skin = teclado.nextLine();
        System.out.println("--------------- Enemy Cadastrado com Sucesso ------------");
    }
    public void bothRegister() {
        PlayerRegister();
        EnemyRegister();
    }

}