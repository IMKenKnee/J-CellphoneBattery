//Kenny Hedlund

//COP2552.0M1

//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

import javax.swing.JOptionPane;

class ExitProgram {

	// calling classes
	ChargeBattery chargeBat;
	VideoChat chat;
	WatchVideo video;
	PlayGame playGame;

	public ExitProgram(ChargeBattery chargeBat, VideoChat chat, WatchVideo video, PlayGame playGame) {
		this.chargeBat = chargeBat;
		this.chat = chat;
		this.video = video;
		this.playGame = playGame;
	}

	// a run-down of all battery usage as the program ends (by reaching 0 battery or
	// inputing 5)
	public void exit() {

		JOptionPane.showMessageDialog(null,
				"the total amount of time the battery charged " + (chargeBat.getCharge() * 1) + "%"
						+ "\nthe total amount of battery life used on video chat " + (chat.getLength() * 1) + "%"
						+ "\nthe total amount of battery life used watching videos " + (video.getLength() * 5) + "%"
						+ "\nthe total amount of battery life used playing games " + (playGame.getLength() * 10) + "%"
						+ "\nthe total amount of battery life left on the device, if any. "
						+ chargeBat.getBatteryLife() + "%");

	}
}