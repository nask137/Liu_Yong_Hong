package project4;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(12, 33);
        Point middle = getMiddle(point2, point1);
        middle.show();
    }
    private static Point getMiddle(Point p1,Point p2) {
      return  new Point((p1.getX()+p2.getX())/2,(p1.getY()+p2.getY())/2);
    }
}
