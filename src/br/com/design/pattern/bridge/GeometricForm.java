package br.com.design.pattern.bridge;

public class GeometricForm {
    private final String name;

    public GeometricForm(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GeometricForm{" +
                "name='" + name + '\'' +
                '}';
    }
}
