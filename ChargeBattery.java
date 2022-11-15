//Kenny Hedlund
//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

import javax.swing.JOptionPane;

class ChargeBattery {

	int chargeTime;
	int batteryLife = 100;

	public void chargeBat() {
		// prompt user
		String mins = JOptionPane
				.showInputDialog("How long would you like to charge the phone? (1 percent battery life per minute)");
		// convert string to int
		int m = Integer.parseInt(mins);
		// change variable to user input
		chargeTime += m;
		// add number from user to battery life variable
		batteryLife = Math.min(100, batteryLife + m);
		// tell user how much battery is left
		JOptionPane.showMessageDialog(null, "There is " + batteryLife + "% battery life left");
	}

	//deadBat is when ht ebattery hits zero
	public void batteryDrain(int deadBat) {
		// run if battery reaches zero percent
		batteryLife = Math.max(0, batteryLife - deadBat);
		JOptionPane.showMessageDialog(null, "There is " + batteryLife + "% battery life left");
	}

	int getBatteryLife() {
		return batteryLife;
	}

	int getCharge() {
		return chargeTime;
	}
}