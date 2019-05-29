/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_2;

import sensor.RadiationSensor;

/**
 *
 * @author jsaunders
 */
public class RadiationSensorAdapter extends Sensor {
    public RadiationSensorAdapter(int scaleWidth) {
        RadiationSensor sensor = new RadiationSensor();
        double value = sensor.getRadiationValue();
        setProperties(value,
                      (int)(MathUtils.percentage(value, 0.0, 4.0)*scaleWidth),
                      sensor.getStatusInfo(),
                      sensor.getName());
    }
}
