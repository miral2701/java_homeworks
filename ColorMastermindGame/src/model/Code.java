package model;

import java.util.List;

public class Code {

    private final List<Color> colors;

    public Code(List<Color> colors) {
        this.colors = colors;
    }

    public List<Color> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return colors.toString();
    }
}
