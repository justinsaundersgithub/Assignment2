/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_2;

import sensor.PressureSensor;

/**
 *
 * @author jsaunders
 */
public class PressureSensorAdapter extends Sensor {
    public PressureSensorAdapter(int scaleWidth) {
        PressureSensor sensor = new PressureSensor();
        double value = sensor.readValue();
        setProperties(value,
                      (int)(MathUtils.percentage(value, 0.0, 6.58)*scaleWidth),
                      sensor.getReport(),
                      sensor.getSensorName());
    }
}
