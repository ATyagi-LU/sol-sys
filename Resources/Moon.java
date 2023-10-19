public class Moon extends CelestialBody {

    private CelestialBody oribtron; //The planet that the planet rotates around

    //constructor using super and adding orbitron.
    public Moon(Planet orbitron, double diameter, double velocity, String col, double angle, SolarSystem sys,
            double distance) {
        super(diameter, velocity, col, angle, sys, distance);
        this.oribtron = orbitron;
    }

    //drawBodyAbout method utilises orbitron.
    public void drawBodyAbout() {
        sys.drawSolarObjectAbout(distance, angle, diameter, col, oribtron.getDistance(), oribtron.getAngle()); //getDistance and get Angle for the orbiting celestial body (the orbitron)
        this.angle += this.velocity; // the velocity of the planet is how quickly it increases its angle
        this.angle = this.angle % 360; // makes sure the value does not overflow.
    }
}