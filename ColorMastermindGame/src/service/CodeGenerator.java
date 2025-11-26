package service;

import model.Color;
import model.Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeGenerator {

    private final int size;
    private final Random random = new Random();

    public CodeGenerator(int size) {
        this.size = size;
    }

    public Code generate() {
        List<Color> list = new ArrayList<>();
        Color[] values = Color.values();

        for (int i = 0; i < size; i++) {
            list.add(values[random.nextInt(values.length)]);
        }

        return new Code(list);
    }
}
