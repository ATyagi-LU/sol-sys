public class SolarSystemRun {
    public static void main(String[] args){
        SolarSystem sys = new SolarSystem(500, 500);
        CelestialBody sun = new CelestialBody(60, 0, "YELLOW", 0, sys,0);
        Planet mercury = new Planet(sun, 10 , 1, "WHITE", 1, sys, 50);  
        while (true){
            sun.drawBody();
            mercury.drawBodyAbout();
            sys.finishedDrawing();
        }   
    }
}
