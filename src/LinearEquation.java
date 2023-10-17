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

    public double distance() {
        double subtractX = x1 - x2;
        double subtractY =  y1 - y2;
        double stuffX = Math.pow(subtractX, 2);
        double stuffY = Math.pow(subtractY, 2);
        double done = Math.sqrt((stuffY+stuffY));
        double rounded = Math.round(done * 100) / 100.0;
        return rounded;
    }
    public double yIntercept() {
        double yIntercept = y1 - slope() * x1;
        return yIntercept;
    }

    public double slope(){
        double subtractX = x1 - x2;
        double subtractY =  y1 - y2;
        double real = (subtractY/subtractX);
        return real;
    }

    public String equation() {
        double subtractX = x1 - x2;
        double subtractY = y1 - y2;
        if (subtractX == 0) {
            return "y =" + y1;
        } else {
            String smth = subtractY + "/" + subtractX;
            return "y = " + smth + "x + " + yIntercept();

        }
    }
}
