package assignment2_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

class SensorPanel extends JPanel {

    private SensorInterface sensor;
    
    public SensorPanel(SensorInterface sensor) {
        this.sensor = sensor;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(colorValue(sensor));
        g.fillRect(10, 10, (int)(sensor.width()), 50);
    }

    public Color colorValue(SensorInterface s) {

        String status = s.status();
        if (status.equals("OK")) {
            Color c = Color.GREEN;
            return c;
        } else if (status.equals("CRITICAL")) {
            Color c = Color.YELLOW;
            return c;
        } else if (status.equals("DANGER")) {
            Color c = Color.RED;
            return c;
        }
        return null;
    }
}

public class SensorApplication extends JFrame {

    public SensorApplication() {

        int scaleWidth = 600;
        SensorInterface temperature = new TemperatureSensorAdapter(scaleWidth);
        SensorInterface pressure = new PressureSensorAdapter(scaleWidth);
        SensorInterface radiation = new RadiationSensorAdapter(scaleWidth);

        setTitle("Sensor Tracker");
        setLayout(new GridLayout(3, 1));

        createPanel(temperature);
        createPanel(pressure);
        createPanel(radiation);

        setPreferredSize(new Dimension((int)(scaleWidth*1.20), 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setResizable(false);
    }

    public void createPanel(SensorInterface s) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel.setBorder(new TitledBorder(s.name()));

        add(panel);
        SensorPanel rectangle = new SensorPanel(s);
        panel.add(rectangle);
        JTextField sT = new JTextField(s.status() + " -->  " + String.format("%f", s.value()));
        sT.setHorizontalAlignment(JTextField.CENTER);
        sT.setBackground(null);
        sT.setBorder(null);
        //    JTextField vT = new JTextField(String.format("%f",s.value()));
        //   panel.add(vT);
        panel.add(sT);
    }

    public static void main(String[] args) {
        SensorApplication app = new SensorApplication();
    }
}
