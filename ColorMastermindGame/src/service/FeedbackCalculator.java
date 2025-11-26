package service;

import model.Code;
import model.Color;

import java.util.ArrayList;
import java.util.List;

public class FeedbackCalculator {

    public Feedback calculate(Code secret, Code guess) {

        List<Color> secretList = new ArrayList<>(secret.getColors());
        List<Color> guessList = new ArrayList<>(guess.getColors());

        int bulls = 0;
        int cows = 0;

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

        return new Feedback(bulls, cows);
    }
}
