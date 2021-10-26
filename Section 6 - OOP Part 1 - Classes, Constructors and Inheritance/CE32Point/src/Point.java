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

    public double distance(){
        return distance(0, 0);
    }

    public double distance(int x, int y){
        double sqDist = (x - getX()) * (x - getX()) + (y - getY()) * (y-getY());
        double dist = Math.sqrt(sqDist);
        return dist;
    }

    public double distance(Point x){
        return distance(x.getX(), x.getY());
    }

}
