/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_2;

import sensor.TemperatureSensor;

/**
 *
 * @author jsaunders
 */
public class TemperatureSensorAdapter extends Sensor {
    public TemperatureSensorAdapter(int scaleWidth) {
        TemperatureSensor sensor = new TemperatureSensor();
        double value = sensor.senseTemperature();
        setProperties(value,
                      (int)(MathUtils.percentage(value, 0.0, 300.0)*scaleWidth),
                      sensor.getTempReport(),
                      sensor.getSensorType());
    }
}
