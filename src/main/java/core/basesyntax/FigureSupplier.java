package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Figure getRandomFigure() {
        String color = ColorSupplier.getRandomColor();
        int type = RANDOM.nextInt(4);

        return switch (type) {
            case 0 -> new IsoscelesTrapezoid(color, random(3, 10), random(3, 10), random(2, 6));
            case 1 -> new RightTriangle(color, random(2, 8), random(2, 8));
            case 2 -> new Rectangle(color, random(2, 10), random(2, 10));
            case 3 -> new Square(color, random(2, 10));
            default -> getRandomFigure();
        };
    }

    public static Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

    private static double random(double min, double max) {
        return min + RANDOM.nextDouble() * (max - min);
    }
}
