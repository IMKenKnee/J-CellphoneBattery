//Kenny Hedlund
//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

import javax.swing.JOptionPane;

//class to hold functions for playing video games
class PlayGame {

	ChargeBattery chargeBat;
	int length;

	public PlayGame(ChargeBattery chargeBat) {
		this.chargeBat = chargeBat;
	}

	public void getTime() {
		// prompt user
		String mins = JOptionPane.showInputDialog("How long will your game be? (in minutes)");
		// convert string to int
		int m = Integer.parseInt(mins);
		// change variable to user input
		length += m;
		// add number from user to battery life variable
		chargeBat.batteryDrain(m * 10);
	}

	int getLength() {
		return length;
	}

}