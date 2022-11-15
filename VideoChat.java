//Kenny Hedlund

//COP2552.0M1

//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

import javax.swing.JOptionPane;

//class to hold functions for video chat
class VideoChat {

	// calling variable from ChargeBattery
	ChargeBattery chargeBat;
	// putting timeSpent variable in scope of VideoChat
	int totalTimeSpent;

	public VideoChat(ChargeBattery chargeBat) {
		this.chargeBat = chargeBat;
	}

	public void spendTime() {
		// prompt user
		String mins = JOptionPane.showInputDialog("How long will your Video call be? (in minutes)");
		// convert string to int
		int m = Integer.parseInt(mins);
		// change variable to user input
		totalTimeSpent += m;
		// add number from user to battery life variable
		chargeBat.batteryDrain(m);
	}

	 int getLength() {
		return totalTimeSpent;
	}
}
