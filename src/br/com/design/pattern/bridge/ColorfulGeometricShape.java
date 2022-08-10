package br.com.design.pattern.bridge;

public class ColorfulGeometricShape {
    private GeometricForm geometricForm;
    private Color color;

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
