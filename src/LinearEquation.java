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
        if (x1 != x2) {
            return "The two points are (" + x1 + ", " + y1 + ")" + " and (" + x2 + ", " + y2 + ")" + "\nThe equation of the line between these points is: " + equation() + "\nThe slope of this line is: " + slope() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between these points is " + distance();
        } else {
            return "\nThe equation of the line between these points is: " + equation();
        }
    }


    public double distance() {
        double subtractX = x1 - x2;
        double subtractY =  y1 - y2;
        double stuffX = Math.pow(subtractX, 2);
        double stuffY = Math.pow(subtractY, 2);
        double done = Math.sqrt((stuffX+stuffY));
        done = roundedToHundredth(done);
        return done;
    }
    public double yIntercept() {
        double yIntercept = y1 - slope() * x1;
        yIntercept = roundedToHundredth(yIntercept);
        return yIntercept;
    }

    public double slope(){
        double subtractX = x1 - x2;
        double subtractY =  y1 - y2;
        double stuff = roundedToHundredth((subtractY/subtractX));
        return stuff;
    }

    public String equation() {
        int subtractX = (int) x2 - x1;
        int subtractY = (int) y2 - y1;
        if (yIntercept() == 0) {
            if (slope() == 0 ) {
                return "y = 0";
            }
            if (subtractY ==0) {
                return "y = " + y1;
            } else {
                if (subtractX == 0) {
                    return "y = _";
                }
                if ((subtractX < 0) && (subtractY < 0)) {
                    subtractX *= -1;
                    subtractY *= -1;
                }
                if ((subtractX < 0) && (subtractY > 0)) {
                    subtractX *= -1;
                    subtractY *= -1;
                }
                if (subtractY%subtractX == 0) {
                    int x = subtractY/subtractX;
                    if (x == 1) {
                        if (yIntercept() > 0) {
                            return "y = x " ;
                        } else {
                            return "y = x " ;
                        }
                    }
                    if (x == -1) {
                        if (yIntercept() > 0) {
                            return "y = -x" ;
                        } else {
                            return "y = -x " ;
                        }
                    } if (yIntercept() > 0) {
                        return "y = " + x + "x " ;
                    } else {
                        return "y = " + x + "x" ;
                    }
                }
                String smth = subtractY + "/" + subtractX;
                if (yIntercept() < 0) {
                    return "y = " + smth + "x " ;
                }
                return "y = " + smth + "x" ;

            }
        }
        if (subtractY ==0) {
            return "y = " + y1;
        } else {
            if (subtractX == 0) {
                return "y = _";
            }
            if ((subtractX < 0) && (subtractY < 0)) {
                subtractX *= -1;
                subtractY *= -1;
            }
            if ((subtractX < 0) && (subtractY > 0)) {
                subtractX *= -1;
                subtractY *= -1;
            }
            if (subtractY%subtractX == 0) {
                int x = subtractY/subtractX;
                if (x == 1) {
                    if (yIntercept() > 0) {
                        return "y = x + " + yIntercept();
                    } else {
                        return "y = x " + yIntercept();
                    }
                }
                if (x == -1) {
                    if (yIntercept() > 0) {
                        return "y = -x + " + yIntercept();
                    } else {
                        return "y = -x " + yIntercept();
                    }
                } if (yIntercept() > 0) {
                    return "y = " + x + "x + " + yIntercept();
                } else {
                    return "y = " + x + "x" + yIntercept();
                }
            }
            String smth = subtractY + "/" + subtractX;
            if (yIntercept() < 0) {
                return "y = " + smth + "x " + yIntercept();
            }
            return "y = " + smth + "x + " + yIntercept();
        }
    }

    public String coordinateForX(double x) {
        double value = (slope()*x) + yIntercept();
        value = roundedToHundredth(value);
        return "(" + x + ", " + value + ")";
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}
