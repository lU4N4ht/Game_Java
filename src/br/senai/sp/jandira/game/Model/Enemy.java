package br.senai.sp.jandira.game.Model;

public class Enemy {
    public String name;
    public String skin;

    private int lifeEnemy;

    public  Enemy(){
        lifeEnemy = 100;
    }
    public int getLife(){

        return  lifeEnemy;
    }
    public void lifeAttack(int danoPlayer){
        lifeEnemy -= danoPlayer;

        if (lifeEnemy < 0){
            lifeEnemy = 0;
        }
    }



}
