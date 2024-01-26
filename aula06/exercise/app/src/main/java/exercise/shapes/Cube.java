package exercise.shapes;

public class Cube implements Shapes3D{

    private float side;

    public Cube(float side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public float calculateVolume() {
        return side * side * side;
    }

    @Override
    public float calculateArea() {
        return 6 * side * side;
    }
    
}
