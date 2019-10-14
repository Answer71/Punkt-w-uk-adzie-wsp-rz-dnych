public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    String quarter (int x, int y) {
        if (x > 0 && y > 0 )
            return "I ";
        else if (x > 0 && y <0)
            return "IV ";
        else if (x < 0 && y > 0)
            return "II ";
        else if ( x < 0 && y < 0);
            return "III ";

    }
    String result () {
        return "Punkt"  + "(" + x + "," + y + ")" + " leży w " + quarter(x, y) + "ćwiartce układu współrzędnych.";
    }


}
