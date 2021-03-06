package org.educama.airline.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.annotation.Id;

/**
 * Model class for airports.
 */
public class Airline {

    @Id
    private String id;
    private String name;
    private String alias;
    private String iataCode;
    private String icaoCode;

    private String callSign;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iata) {
        this.iataCode = iata != null ? iata.toUpperCase() : iata;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode != null ? icaoCode.toUpperCase() : icaoCode;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign != null ? callSign.toUpperCase() : callSign;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Airline withName(String name) {
        this.name = name;
        return this;
    }

    public Airline withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public Airline withIataCode(String iata) {
        this.setIataCode(iata);
        return this;
    }

    public Airline withIcaoCode(String icao) {
        this.setIcaoCode(icao);
        return this;
    }

    public Airline withCallSign(String callSign) {
        this.setCallSign(callSign);
        return this;
    }

    public Airline withCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Airline)) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        return this.id.equals(((Airline) obj).id);
    }

    @Override
    public int hashCode() {
        final int initialOddnumber = 17;
        final int multiplierOddNumber = 1;
        return new HashCodeBuilder(initialOddnumber, multiplierOddNumber).append(id)
                .toHashCode();

    }

    @Override
    public String toString() {
        return String.format("Airline[, name='%s', IATA='%s']", name, iataCode);
    }
}
