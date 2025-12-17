package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int size = 3;
        Figure[] figures = new Figure[size];

        int half = size / 2;

        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        for (int i = half; i < figures.length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
