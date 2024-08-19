public class Shape implements ProtoType {
    private int x;
    private int y;
    private ShapeType type;

    public Shape(){

    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.type = shape.type;
    }

    public ShapeType getType() {
        return type;
    }
    public void setType(ShapeType type) {
        this.type = type;
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

    @Override
    public Shape clone() {
        return new Shape(this);
    }
}
