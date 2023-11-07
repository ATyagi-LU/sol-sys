public class SolarSystemRun {
    public static void main(String[] args) {
        SolarSystem sys = new SolarSystem(1000, 1000); // Initialising Solar System object
        CelestialBody sun = new CelestialBody(sys); // CelestialBody default constructor (Sun)
        Planet mercury = new Planet(sun, 14, 1, "WHITE", 1, sys, 60); // Planet object (Mercury)
        Planet pluto = new Planet(sun, 10, 5, "GRAY", 30, sys, 175); // Planet object (Pluto)
        Planet earth = new Planet(sun, 20, 2, "BLUE", 40, sys, 100);// Planet object (Earth)
        Moon moon = new Moon(earth, 5, 10, "WHITE", 50, sys, 30);// Moon object (Earth's Moon)
        
        //main loop for updating and redrawing objects
        while (true) {
            sun.drawAll();
            sys.finishedDrawing();
        }
    }
}
