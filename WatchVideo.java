//Kenny Hedlund

//COP2552.0M1

//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

import javax.swing.JOptionPane;

//class to hold functions for watching videos
class WatchVideo {

	ChargeBattery chargeBat;
	int totalTimeSpent;

	public WatchVideo(ChargeBattery chargeBat) {
		this.chargeBat = chargeBat;
	}

	public void getTime() {
		// prompt user
		String mins = JOptionPane.showInputDialog("How long will your Video be? (in minutes)");
		// convert string to int
		int m = Integer.parseInt(mins);
		// change variable to user input
		totalTimeSpent += m;
		// add number from user to battery life variable
		chargeBat.batteryDrain(m * 5);
	}

	 int getLength() {
		return totalTimeSpent;
	}
}