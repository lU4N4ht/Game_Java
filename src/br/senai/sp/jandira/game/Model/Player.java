package br.senai.sp.jandira.game.Model;

public class Player {
    public String name;
    public String skin;
     int lifePlayer;

    public  Player(){
        lifePlayer = 100;
    }
    public int getLife(){
        return  lifePlayer;
    }

}
