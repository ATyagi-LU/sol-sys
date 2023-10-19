public class CelestialBody implements SolarSystemInterface {

    protected double diameter;
    protected double velocity;
    protected String col;
    protected SolarSystem sys;
    protected double angle;
    protected double distance;

    public CelestialBody(double diameter, double velocity, String col, double angle, SolarSystem sys, double distance) {

        this.diameter = diameter;
        this.velocity = velocity;
        this.col = col;
        this.sys = sys;
        this.angle = angle;
        this.distance = distance;

    }

    public void drawBody() {
        sys.drawSolarObject(distance, angle, diameter, col);
    }

    public double getAngle() {
        return angle;
    }

    public double getDistance() {
        return distance;
    }

}