interface CelestialBody {
    public void updatePosition(double time);

    public double getX();

    public double getY();

    public double getMass();

    public String getName();
}

// hello
interface Orbitable extends CelestialBody {
    public void setOrbitCenter(CelestialBody center);

    public double getOrbitalPeriod();

    public double getOrbitRadius();
}

class Star implements CelestialBody {
    // Attributes
    private String name;
    private double mass;
    private double x;
    private double y;

    // Constructor
    public Star(String name, double mass, double x, double y) {
        setName(name);
        setMass(mass);
        setX(x);
        setY(y);
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Concrete Methods
    @Override
    public void updatePosition(double time) {
        // something dx dy dt.
    }
}

class Planet implements CelestialBody, Orbitable {
    // Attributes
    private String name;
    private double mass;
    private double x;
    private double y;
    private double orbitalPeriod;
    private double orbitRadius;
    private CelestialBody centerBody;

    // Getter Methods
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setOrbitalPeriod() {
        this.orbitalPeriod = orbitalPeriod;
    }

    public void setOrbitRadius() {
        this.orbitRadius = orbitRadius;
    }

    // Concrete Methods
    public void setOrbitCenter() {
        // something;
    }

    @Override
    public void updatePosition(double time) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setOrbitCenter(CelestialBody center) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

public class SolarSystemSimulation {
    public static void main(String[] args) {

    }
}