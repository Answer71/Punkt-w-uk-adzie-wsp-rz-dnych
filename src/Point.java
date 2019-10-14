public class Point {

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


}
