public class SolarSystemRun {
    public static void main(String[] args) {
        SolarSystem sys = new SolarSystem(1200, 1200); // Initialising Solar System object
        CelestialBody sun = new CelestialBody(sys); // CelestialBody default constructor (Sun)
        Planet mercury = new Planet(sun, 6, 6.750, "WHITE", 0, sys, 50); // Planet object (Mercury)
        Planet venus = new Planet(sun, 13, 1.626, "GREEN", 0, sys, 60); // Planet object (Pluto)
        Planet earth = new Planet(sun, 14, 1, "BLUE", 0, sys, 83);// Planet object (Earth)
        Moon moon = new Moon(earth, 5, 365, "WHITE", 0, sys, 16);
        Planet mars = new Planet(sun, 8, 0.531, "RED", 0, sys, 100);
        Moon phobos = new Moon(mars, 3, 5, "WHITE", 0, sys, 10);
        Moon deimos = new Moon(mars, 3, 2.763, "WHITE", 30, sys, 13);
        Planet jupiter = new Planet(sun, 26, 0.084, "YELLOW", 0, sys, 213);
        Moon io = new Moon(jupiter, 8, 5, "GRAY", 0, sys, 30);
        Moon europa = new Moon(jupiter, 7, 2, "ORANGE", 26, sys, 34);
        Moon ganymede = new Moon(jupiter, 10, 10, "GRAY", 48, sys, 40);
        Moon callisto = new Moon(jupiter, 9, 4, "ORANGE", 67, sys, 50);
        Planet saturn = new Planet(sun, 22, 0.033, "ORANGE", 0, sys, 357);
        Moon mimas = new Moon(saturn, 6, 2, "WHITE", 0, sys, 30);
        Moon enceladus = new Moon(saturn, 6, 7, "WHITE", 12, sys, 50);
        Moon tethys = new Moon(saturn, 8, 1, "WHITE", 13, sys, 70);
        Moon dione = new Moon(saturn, 9, 7, "WHITE", 90, sys, 75);
        Moon rhea = new Moon(saturn, 8, 3, "WHITE", 120, sys, 80);
        Moon titan = new Moon(saturn, 12, 2, "YELLOW", 40, sys, 87);
        Moon hyperion = new Moon(saturn, 5, 5, "WHITE", 33, sys, 91);
        Moon lapetus = new Moon(saturn, 9, 4, "WHITE", 10, sys, 97);
        Moon pheobe = new Moon(saturn, 3, 2, "WHITE", 69, sys, 106);
        Planet uranus = new Planet(sun, 17.5, 0.012, "CYAN", 0, sys, 430);
        Moon puck = new Moon(uranus, 2, 1, "WHITE", 13, sys, 20);
        Moon miranda = new Moon(uranus, 6, 1, "WHITE", 19, sys, 23);
        Moon ariel = new Moon(uranus, 8, 1, "WHITE", 39, sys, 29);
        Moon umbriel = new Moon(uranus, 8, 1, "WHITE", 69, sys, 36);
        Moon titania = new Moon(uranus, 8, 1, "WHITE", 71, sys, 46);
        Moon oberon = new Moon(uranus, 8, 1, "WHITE", 22, sys, 55);
        Planet neptune = new Planet(sun, 15, 0.006, "BLUE", 0, sys, 450);
        //main loop for updating and redrawing objects
        while (true) {
            sun.drawAll();
            sys.finishedDrawing();
        }
    }
}
