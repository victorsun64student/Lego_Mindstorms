/**
 * 
 */
package lego_Mindstorms;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;
import lejos.hardware.sensor.EV3UltrasonicSensor;

import org.jfree.util.Rotation;

import lejos.hardware.Button;

public class Lego_Mindstorms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// crack.com
		RegulatedMotor links = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor rechts = new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor gabel = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3UltrasonicSensor sonic = new EV3UltrasonicSensor(SensorPort.S1);
		if (Button.ENTER = true != null) {
			for (int i = 0; i <= 4; i++) {
				while (sonic.getDistanceMode() > 0.05) {
					rechts.forward();
					links.forward();
				}
				Delay.msDelay(5000);
				rechts.rotate(90);
			}
			;
			if (sonic.getDistanceMode() <= 0.05) {
				gabel.forward();
			}
			;
		}
		;
	}

}
