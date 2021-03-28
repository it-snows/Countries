package com.company;

public class Main {
    public static void main(String[] args) {
        var db = new DatabaseManager();

//        var result = db.getCountries();
//
//        for (var country : result) {
//            System.out.println(country.getName());
//        }

        var result = db.getAirports();

        for (var airport : result) {
            System.out.println(airport.getAirportName() + ", " + airport.getAirportMunicipality());

        }
    }
}
