package br.com.design.pattern.bridge;

public class Color {
    private final String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
