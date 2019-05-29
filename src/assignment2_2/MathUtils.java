/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_2;

/**
 *
 * @author jsaunders
 */
public class MathUtils {
    public static double clamp(double val, double min, double max) {
        return Math.max(min, Math.min(max, val));
    }
    
    public static double percentage(double val, double min, double max) {
        double clampedValue = MathUtils.clamp(val, min, max);
        return (clampedValue - min) / (max - min);
    }
}
