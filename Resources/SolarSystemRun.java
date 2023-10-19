public class SolarSystemRun {
    public static void main(String[] args) {
        SolarSystem sys = new SolarSystem(700, 700);
        CelestialBody sun = new CelestialBody(40, 0, "YELLOW", 0, sys, 0);
        Planet mercury = new Planet(sun, 14, 1, "WHITE", 1, sys, 60);
        Planet pluto = new Planet(sun, 10, 5, "GRAY", 30, sys, 175);
        Planet earth = new Planet(sun, 20, 2, "BLUE", 40, sys, 100);
        Moon moon = new Moon(earth, 5, 10, "WHITE",50, sys, 30);

        while (true) {
            sun.drawBody();
            mercury.drawBodyAbout();
            pluto.drawBodyAbout();
            earth.drawBodyAbout();
            moon.drawBodyAbout();
            sys.finishedDrawing();
        }
    }
}
