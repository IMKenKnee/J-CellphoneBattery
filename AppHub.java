//Kenny Hedlund
//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

import javax.swing.JOptionPane;

class AppHub {

	public static void start() {

		ChargeBattery chargeBat = new ChargeBattery();
		VideoChat chat = new VideoChat(chargeBat);
		PlayGame playGame = new PlayGame(chargeBat);
		WatchVideo video = new WatchVideo(chargeBat);
		ExitProgram exitProgram = new ExitProgram(chargeBat, chat, video, playGame);

		while (true) {

			// String input from user using JOptionPane
			String choice = JOptionPane.showInputDialog("Press 1 to charge the battery\n" + "Press 2 to video chat\n"
					+ "Press 3 to watch a video\n" + "Press 4 to play a game\n" + "Press 5 to exit");
			
			//if field is empty -> fixed a loop bug
			if (choice == null)
			{
				break;
			}
			
			// user input validation -> check if number
			try {
				Integer.parseInt(choice);
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Please enter a number 1-5");
				continue;
			}

			// converting string to integer c = choice
			int c = Integer.parseInt(choice);

			// input validation -> check if number is 1-5
			if (c < 1 || c > 5) {
				JOptionPane.showMessageDialog(null, "Enter a number between 1 and 5 please.");
			}

			// switch case based on user input c = choice of user in start(); function
			switch (c) {
			case 1:
				chargeBat.chargeBat();
				break;
			case 2:
				chat.spendTime();
				if (chargeBat.getBatteryLife() <= 0) {
					exitProgram.exit();
					return;
				}
				break;
			case 3:
				video.getTime();
				if (chargeBat.getBatteryLife() <= 0) {
					exitProgram.exit();
					return;
				}
				break;
			case 4:
				playGame.getTime();
				if (chargeBat.getBatteryLife() <= 0) {
					exitProgram.exit();
					return;
				}
				break;
			case 5:
				exitProgram.exit();
				return;
			}

		}

	}
}
