/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Moon
 */
public class TemperatureSensor implements Sensor {

    private boolean on;
    //private int temp;

    public TemperatureSensor() {
        this.on = false;
       

    }

    @Override
    public boolean isOn() {
        return this.on;

    }

    @Override
    public void setOn() {
        this.on = true;
        

    }

    @Override
    public void setOff() {
        this.on = false;

    }

    @Override
    public int read() {
        int temp ;
        if (isOn()) {
            Random random = new Random();
            temp = random.nextInt(30 - (-30)) + (-30);
        } else {

            throw new IllegalStateException("error");
        }
       
        return temp;
    }

  

}
