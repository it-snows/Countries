package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ICAO")
    private String icao;

    @Column(name = "IATA")
    private String iata;

    @Column(name = "airport_name")
    private String airportName;

    @Column(name = "airport_municipality")
    private String airportMunicipality;

    @Column(name = "airport_country")
    private String airportCountry;

}
