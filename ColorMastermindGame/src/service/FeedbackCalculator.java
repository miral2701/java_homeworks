package service;

import model.Code;
import model.Color;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

public class FeedbackCalculator {
    private int foxes;
    private final Random random = new Random();


    public Feedback calculate(Code secret, Code guess) {

        List<Color> secretList = new ArrayList<>(secret.getColors());
        List<Color> guessList = new ArrayList<>(guess.getColors());

        int bulls = 0;
        int cows = 0;

        if(Fool()==1){
            System.out.println("Брехня");

            bulls= random.nextInt(0, secretList.size());
            cows= random.nextInt(0, secretList.size());
        }else {


            // 1. Бики
            for (int i = 0; i < guessList.size(); i++) {
                if (guessList.get(i) == secretList.get(i)) {
                    bulls++;
                    secretList.set(i, null);
                    guessList.set(i, null);
                }
            }

            // 2. Корови
            for (int i = 0; i < guessList.size(); i++) {
                Color g = guessList.get(i);
                if (g != null && secretList.contains(g)) {
                    cows++;
                    secretList.set(secretList.indexOf(g), null);
                }
            }
        }

        return new Feedback(bulls, cows);
    }

    public int Fool() {
        foxes=random.nextInt(0,2);
        System.out.println(foxes);

        return foxes;
    }
}
