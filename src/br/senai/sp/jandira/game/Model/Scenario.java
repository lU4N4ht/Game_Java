package br.senai.sp.jandira.game.Model;

public class Scenario {

        public String Scenario(int optionScenario){

            String scenario = "Portal Wave";

            switch (optionScenario){
                case 1:
                    scenario = "Living Forest";
                    break;
                case 2:
                    scenario = "Evil Tower";
                    break;

                case 3:
                    scenario = "Dead Pool";
                    break;
            }
            return scenario;
        }
    }

