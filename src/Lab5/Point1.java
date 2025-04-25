package Lab5;

public class Point1 {
    private double x1;
    private double y1;

    // Конструктор по умолчанию
    public Point1() {
        this(0.0, 0.0);
    }

    // Конструктор с параметрами
    public Point1(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    // Сеттеры
    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    // Геттеры
    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    // Метод: вычисление расстояния до начала координат
    public double distanceToOrigin() {
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point1)) return false;
        Point1 other = (Point1) obj;
        return Double.compare(x1, other.x1) == 0 && Double.compare(y1, other.y1) == 0;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "(" + getX1() + ", " + getY1() + ")";
    }
}