public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String lineInfo() {
        return "The two points are (" + x1 + ", " + y1 + ")" + " and ( " + x2 + ", " + y2 + ")";
    }

    public String coordinateForX() {
        return "hai";
    }
}
