package br.com.design.pattern.bridge;

public class Test {
    public static void main(String[] args) {
        ColorfulGeometricShape blueSquare = new ColorfulGeometricShape(new GeometricForm("Quadrado"), new Color("Azul"));
        System.out.println(blueSquare.toString());
        ColorfulGeometricShape greenTriangle = new ColorfulGeometricShape(new GeometricForm("Triangulo"), new Color("Verde"));
        System.out.println(greenTriangle.toString());
        ColorfulGeometricShape yellowSquare = new ColorfulGeometricShape(new GeometricForm("Quadrado"), new Color("Amarelo"));
        System.out.println(yellowSquare.toString());
    }
}
