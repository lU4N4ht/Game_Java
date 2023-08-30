package br.senai.sp.jandira.game.Model;

public class Player {
    public String name;
    public String skin;
     private int lifePlayer;
    public  Player(){
        lifePlayer = 100;
    }
    public int getLife(){
        return  lifePlayer;
    }

    public void lifeAttack(int danoEnemy){
        lifePlayer -= danoEnemy;

        if (lifePlayer < 0){
            lifePlayer = 0;
        }
    }
}
