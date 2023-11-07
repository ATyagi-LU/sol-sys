import java.util.ArrayList;

public class CelestialBody {

    protected double diameter; // diameter of the planet (with sun default set to 40)
    protected double velocity; // how much is being added to the angle every update of the screen (with sun
                               // default set to 0)
    protected String col; // Colour (with sun default set to Yellow)
    protected SolarSystem sys; // the solar system in which the body exists
    protected double angle; // the starting angle in the solar system (with sun default set to 0)
    protected double distance; // the distance from the centre (with sun default set to 0)
    private ArrayList<Planet> orbiterArrayList = new ArrayList<Planet>(); //Array of Planets that orbit the CelestialBody.

    // constructor initialising everything
    /**
     * Constructor for a CelestialBody.
     * 
     * @param diameter Diameter of CelestialBody.
     * @param velocity Velocity of the CelestialBody (mostly used when inheriting).
     * @param col Colour of the CelestialBody.
     * @param angle Angle of the CelestialBody (mostly used when inheriting).
     * @param sys System in which CelestialBody resides.
     * @param distance Distance from the centre of the solar system (mostly used when inheriting).
     */
    public CelestialBody(double diameter, double velocity, String col, double angle, SolarSystem sys, double distance) {

        this.diameter = diameter;
        this.velocity = velocity;
        this.col = col;
        this.sys = sys;
        this.angle = angle;
        this.distance = distance;

    }

    /**
     * Default constructor for Sun.
     * 
     * @param sys System in which CelestialBody resides.
     */
    public CelestialBody(SolarSystem sys) {
        this.diameter = 40;
        this.velocity = 0;
        this.col = "YELLOW";
        this.sys = sys;
        this.angle = 0;
        this.distance = 0;
    }

    /**
     * Calls the drawSolarObject() method from SolarSystem class with the CelestialBody parameters.
     */
    private void drawBody() {
        sys.drawSolarObject(distance, angle, diameter, col);
    }

    /** 
     * Draws all of the planets and their moons.
    */
    public void drawAll(){
        drawBody();
        for(Planet planet : orbiterArrayList) 
            planet.drawBodyAbout();
    }

    /**
     * Adds an orbiter of type Planet to the orbiterArrayList.
     * 
     * @param planet
     */
    public void addOrbiter(Planet planet){
        orbiterArrayList.add(planet);
    }

    /** 
     * Getter for child class angle for drawBodyAbout() method from SolarSystem class.
    */
    public double getAngle() {
        return angle;
    }

    /** 
     * Getter for child class distance for drawBodyAbout() method from SolarSystem class.
    */
    public double getDistance() {
        return distance;
    }

}