package br.com.design.pattern.bridge;

public class ColorfulGeometricShape {
    private final GeometricForm geometricForm;
    private final Color color;

    public ColorfulGeometricShape(GeometricForm geometricForm, Color color) {
        this.geometricForm = geometricForm;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorfulGeometricShape{" +
                "geometricForm=" + geometricForm +
                ", color=" + color +
                '}';
    }
}
