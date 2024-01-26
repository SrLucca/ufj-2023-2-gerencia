package exercise.shapes;

public class Sphere implements Shapes3D{
    
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    @Override
    public float calculateVolume() {
        return (float) (4.0/3.0 * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public float calculateArea() {
        return (float) (4 * Math.PI * Math.pow(radius, 2));
    }

}
