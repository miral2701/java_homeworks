package model;

public enum Color {
    Ч, С, З, Ж, Б, К;

    public static Color fromString(String s) {
        return Color.valueOf(s.toUpperCase());
    }
}
