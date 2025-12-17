package core.basesyntax;

public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String getParameters();

    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
        + ", area: " + String.format("%.2f", getArea()) + " sq.units, " + getParameters()
                + ", color: " + color);
    }
}
