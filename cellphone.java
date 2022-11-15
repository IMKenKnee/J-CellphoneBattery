//Kenny Hedlund
//Create an app that simulates a phone battery and its usage

package CellphoneBattery;

public class cellphone {
	
	AppHub a = new AppHub();
	ChargeBattery c = new ChargeBattery();
	VideoChat v = new VideoChat(c);
	WatchVideo w = new WatchVideo(c);
	PlayGame p = new PlayGame(c);
	ExitProgram x = new ExitProgram(null, null, null, null);

//main
	public static void main(String[] args) {
		// start the program
		AppHub.start();

	}
}
