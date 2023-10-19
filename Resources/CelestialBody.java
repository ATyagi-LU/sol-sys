public class CelestialBody {

    protected double diameter; // diameter of the planet (with sun default set to 40)
    protected double velocity; // how much is being added to the angle every update of the screen (with sun
                               // default set to 0)
    protected String col; // Colour (with sun default set to Yellow)
    protected SolarSystem sys; // the solar system in which the body exists
    protected double angle; // the starting angle in the solar system (with sun default set to 0)
    protected double distance; // the distance from the centre (with sun default set to 0)

    // constructor initialising everything
    public CelestialBody(double diameter, double velocity, String col, double angle, SolarSystem sys, double distance) {

        this.diameter = diameter;
        this.velocity = velocity;
        this.col = col;
        this.sys = sys;
        this.angle = angle;
        this.distance = distance;

    }

    // default constructor for sun
    public CelestialBody(SolarSystem sys) {
        this.diameter = 40;
        this.velocity = 0;
        this.col = "YELLOW";
        this.sys = sys;
        this.angle = 0;
        this.distance = 0;
    }

    // draw body method with given parameters or default parameters
    public void drawBody() {
        sys.drawSolarObject(distance, angle, diameter, col);
    }

    // getters for child class information for "drawBodyAbout()" method.
    public double getAngle() {
        return angle;
    }

    public double getDistance() {
        return distance;
    }

}