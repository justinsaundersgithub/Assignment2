/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_2;

/**
 * This intermediate class was created to request all the values of the sensor.
 * I discovered that if the specific adapters turn around and call the sensor
 * class value() method multiple times the value returned is different. This
 * created an order dependence with the corresponding status() result which
 * depended on the previous call to value().
 * @author jsaunders
 */
public class Sensor implements SensorInterface {

    private double value;
    private int width;
    private String status;
    private String name;
    
    public Sensor() {
    }
    
    public void setProperties(double value, int width, String status, String name) {
        this.value = value;
        this.width = width;
        this.status = status;
        this.name = name;
    }
    @Override
    public double value() {
        return this.value;
    }

    @Override
    public int width() {
        return this.width;
    }

    @Override
    public String status() {
        return this.status;
    }

    @Override
    public String name() {
        return this.name;
    }
    
}
