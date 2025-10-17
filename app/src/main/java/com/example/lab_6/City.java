package com.example.lab_6;

/**
 * This class defines a City with a name and a province.
 * Implements Comparable to allow alphabetical sorting by city name.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City object.
     * @param city the city's name
     * @param province the province or territory name
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     * @return the city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Returns the province name.
     * @return the province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Sets the city name.
     * @param city the city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the province name.
     * @param province the province name
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compares cities alphabetically by their city name.
     * @param other the other City to compare with
     * @return a negative integer, zero, or a positive integer as this city's
     *         name is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Checks if two City objects are equal based on their city and province names.
     * @param obj the object to compare with
     * @return true if both cities have the same city and province names
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Generates a hash code based on city and province names.
     * @return the hash code for this City
     */
    @Override
    public int hashCode() {
        return city.hashCode() * 31 + province.hashCode();
    }

    /**
     * Returns a string representation of the city.
     * @return a string in the format "City, Province"
     */
    @Override
    public String toString() {
        return city + ", " + province;
    }
}
