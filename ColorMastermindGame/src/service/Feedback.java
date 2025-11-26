package service;

public class Feedback {

    private final int bulls;
    private final int cows;

    public Feedback(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    @Override
    public String toString() {
        return String.format("Бики: %d, Корови: %d", bulls, cows);
    }
}
