import java.sql.SQLOutput;

public class Rectangle {

    private Double width = 1.0;
    private Double high = 1.0;

    public Rectangle(Double width, Double high) {
        this.width = width;
        this.high = high;
    }

    public Rectangle() {

    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public double calculateArea() {
        double area = 2 * width + 2 * high;

        return area;
    }

    public double calculatePerimetre() {
        double length = width * high;

        return length;
    }
}
