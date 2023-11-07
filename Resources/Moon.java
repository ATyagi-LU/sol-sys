/**
 * This class is the planet object for the solar system
 * 
 * @author Aditya Tyagi
 */

public class Moon extends CelestialBody {

    private Planet oribtron; //The planet that the planet rotates around

    /**
     * Constructor for Moon using super and adding Planet orbitron.
     * 
     * @param orbitron What the planet is oribiting. Takes the distance and angle from the oribiting planet from here.
     * @param diameter Diameter of the planet being rendered.
     * @param velocity Rate at which planet moves.
     * @param col Color of planet.
     * @param angle Starting angle of planet.
     * @param sys The solar system in which the planet resides.
     * @param distance Distance from oribiter.
     */
    public Moon(Planet orbitron, double diameter, double velocity, String col, double angle, SolarSystem sys,
            double distance) {
        super(diameter, velocity, col, angle, sys, distance);
        this.oribtron = orbitron;
        orbitron.addOrbiter(this);
    }

    /**
     * drawBodyAbout method utilises Planet orbitron features and invokes SolarSystem drawSolarObjectAbout() function.
     */
    public void drawBodyAbout() {
        sys.drawSolarObjectAbout(distance, angle, diameter, col, oribtron.getDistance(), oribtron.getAngle()); //getDistance and get Angle for the orbiting celestial body (the orbitron)
        this.angle += this.velocity; // the velocity of the planet is how quickly it increases its angle
        this.angle = this.angle % 360; // makes sure the value does not overflow.
    }
}