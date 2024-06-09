package SolarSystem;

public class solarSystem {
    public static void main(String[] args) {


        solarSystemBase solar= new solarSystemBase();
        solar.sun="1";
        solar.planet="2";
        solar.star="2";
        System.out.println("Pluto Identifies as a Planet");

        featureSun feature= new featureSun();
        feature.color= "red";
        feature.size= "1000";
        feature.temp="20";

        System.out.println("Martian are going to invade Earth");
    }
}
