import java.util.ArrayList;

/**
 * This class is the planet object for the solar system
 * 
 * @author Aditya Tyagi
 */

public class Planet extends CelestialBody {

    private CelestialBody oribtron; // The CelestialBody that the planet rotates around
    private ArrayList<Moon> moonArrayList = new ArrayList<Moon>();

    // constructor using super and adding orbitron.
    /**
     * Constructor for Planet using super and adding Celestial Body orbitron.
     * Adds the object to the orbitron's array.
     * 
     * @param orbitron What the planet is oribiting. Takes the distance and angle
     *                 from the oribiting planet from here.
     * @param diameter Diameter of the planet being rendered.
     * @param velocity Rate at which planet moves.
     * @param col      Color of planet.
     * @param angle    Starting angle of planet.
     * @param sys      The solar system in which the planet resides.
     * @param distance Distance from oribiter.
     */
    public Planet(CelestialBody orbitron, double diameter, double velocity, String col, double angle, SolarSystem sys,
            double distance) {
        super(diameter, velocity, col, angle, sys, distance);
        this.oribtron = orbitron;
        orbitron.addOrbiter(this);
    }

    /**
     * Adds an orbiter of type Moon to the orbiterArrayList.
     * 
     * @param moon
     */
    public void addOrbiter(Moon moon){
        moonArrayList.add(moon);
    }

    /** 
     * Draws all of the moons.
    */
    public void drawOrbiters(){
        for(Moon moon : moonArrayList) 
            moon.drawBodyAbout();
    }
    /**
     * drawBodyAbout method utilises CelestialBody orbitron features and invokes SolarSystem drawSolarObjectAbout() function.
     * Calls drawOrbiters to make sure that it is consistent when being used in CelestialBody.
     */
    public void drawBodyAbout() {
        sys.drawSolarObjectAbout(distance, angle, diameter, col, oribtron.getDistance(), oribtron.getAngle());
        drawOrbiters();
        this.angle += this.velocity; // the velocity of the planet is how quickly it increases its angle
        this.angle = this.angle % 360; // makes sure the value does not overflow.
    }
}