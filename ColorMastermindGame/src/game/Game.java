package game;

import model.Code;
import model.Color;
import service.CodeGenerator;
import service.Feedback;
import service.FeedbackCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private final int codeSize;
    private final Code secretCode;

    private final FeedbackCalculator calculator = new FeedbackCalculator();

    public Game(int codeSize) {
        this.codeSize = codeSize;
        this.secretCode = new CodeGenerator(codeSize).generate();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Вітаємо у грі 'Color Mastermind'!");
        System.out.println("Доступні кольори: Ч, С, З, Ж, Б, К");
        System.out.println("Введіть " + codeSize + " кольорів через пробіл.");

        while (true) {
            System.out.print("\nСпроба: ");
            Code guess = readGuess(sc);

            Feedback feedback = calculator.calculate(secretCode, guess);
            System.out.println("Підказка: " + feedback);

            if (feedback.getBulls() == codeSize) {
                System.out.println("\n🎉 Вітаємо! Ви відгадали код!");
                System.out.println("Секретний код: " + secretCode);
                break;
            }
        }
    }

    private Code readGuess(Scanner sc) {
        while (true) {
            try {
                String[] input = sc.nextLine().trim().split("\\s+");

                if (input.length != codeSize) {
                    System.out.println("Потрібно ввести рівно " + codeSize + " кольорів.");
                    continue;
                }

                List<Color> colors = new ArrayList<>();
                for (String s : input) {
                    colors.add(Color.fromString(s));
                }

                return new Code(colors);

            } catch (Exception e) {
                System.out.println("Некоректний ввід. Використовуйте: Ч С З Ж Б К");
            }
        }
    }
}
