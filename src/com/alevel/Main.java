package com.alevel;

public class Main {

    public static void main(String[] args) {

        Report report = Report.builder().header("Header").body("Body").build();
        Report report1 = report.toBuilder().footer("Footer").build();
        System.out.println(report);
        System.out.println(report1);

        Pow mathPower = (number, powerValue) -> {
            int result = 1;
            while (powerValue > 0) {
                result *= number;
                powerValue--;
            }
            return result;
        };
        System.out.println("Math power 4 of number 5 is " + mathPower.calculateMathPower(5, 4));

        for (PlanetEnum p : PlanetEnum.values()) {
            System.out.println("Planet " + p.name() + " has " + p.getSatelliteCount() + " natural satellites");
        }

    }
}
