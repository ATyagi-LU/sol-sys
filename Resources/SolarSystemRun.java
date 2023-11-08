public class SolarSystemRun {
    public static void main(String[] args) {
        SolarSystem sys = new SolarSystem(1200, 1200); // Initialising Solar System object
        CelestialBody sun = new CelestialBody(sys); // CelestialBody default constructor (Sun)
        Planet mercury = new Planet(sun, 6, 6.750, "WHITE", 0, sys, 52); // Planet object (Mercury)
        Planet venus = new Planet(sun, 13, 1.626, "GREEN", 0, sys, 64); // Planet object (Pluto)
        Planet earth = new Planet(sun, 14, 1, "BLUE", 0, sys, 73);// Planet object (Earth)
        Planet mars = new Planet(sun, 8, 0.531, "RED", 0, sys, 90);
        Planet jupiter = new Planet(sun, 26, 0.084, "YELLOW", 0, sys, 213);
        Planet saturn = new Planet(sun, 22, 0.033, "ORANGE", 0, sys, 357);
        Planet uranus = new Planet(sun, 17.5, 0.012, "CYAN", 0, sys, 430);
        Planet neptune = new Planet(sun, 15, 0.006, "BLUE", 0, sys, 450);
        //main loop for updating and redrawing objects
        while (true) {
            sun.drawAll();
            sys.finishedDrawing();
        }
    }
}
