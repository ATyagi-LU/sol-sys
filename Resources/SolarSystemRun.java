public class SolarSystemRun {
    public static void main(String[] args){
        SolarSystem sys = new SolarSystem(500, 500);
        sys.drawSolarObject(0, 0, 60, "YELLOW");//sun
        sys.drawSolarObjectAbout(50, 40, 10, "WHITE", 0, 0);
        sys.finishedDrawing();
    }
}
