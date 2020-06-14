package InheritancePolymorphism.src;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return false;
        }
        if (!(obj instanceof Point)){
            return false;
        }
        Point other = (Point) obj;
        return other.x == this.x && other.y == this.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}