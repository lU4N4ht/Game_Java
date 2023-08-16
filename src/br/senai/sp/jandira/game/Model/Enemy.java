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
}
