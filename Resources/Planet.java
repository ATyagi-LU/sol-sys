public class Planet extends CelestialBody{
    
    private CelestialBody oribtron;

    public Planet(CelestialBody orbitron,double diameter, double velocity, String col, double angle, SolarSystem sys, double distance){
        super(diameter, velocity,col,angle,sys,distance);
        this.oribtron = orbitron;
    }

    public void drawBodyAbout(){
        sys.drawSolarObjectAbout(distance, angle, diameter, col, oribtron.getDistance(), oribtron.getAngle());
        this.angle += this.velocity;
        this.angle = this.angle % 360;
    }
}