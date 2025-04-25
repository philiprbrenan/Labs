package Lab5;

public class Numbers {
    private int a;
    private int b;
    private int c;
    private int d;

    //Конструктор по умолчанию
    public Numbers() {
        this(0, 0, 0, 0);
    }

    //Конструктор по параметрам
    public Numbers(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    //Сеттеры
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    //Геттеры
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    //Метод: среднее арифметическое
    public double average() {
        return (a + b + c + d) / 4.0;
    }

    //Метод: нахождение максимального числа
    public double max() {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    //Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Numbers)) return false;
        Numbers other = (Numbers) obj;
        return a == other.a && b == other.b && c == other.c && d == other.d;
    }

    //Переопределение toString
    @Override
    public String toString() {
        return " { a = "+a+", b = "+b+", c = "+c+", d = "+d+"}";
    }
}
