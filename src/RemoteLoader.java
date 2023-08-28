
public class RemoteLoader {
 
	public static void main(String[] args) {
		CommandsStack commandStack = new CommandsStack();
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);

		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);

		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
				  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);

		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
				 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);

		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
				
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		commandStack.push(remoteControl.onCommands[0]);
		System.out.println(commandStack);
		
		remoteControl.offButtonWasPushed(0);
		commandStack.push(remoteControl.offCommands[0]);
		System.out.println(commandStack);
		
		remoteControl.onButtonWasPushed(1);
		commandStack.push(remoteControl.onCommands[1]);
		System.out.println(commandStack);
		
		remoteControl.offButtonWasPushed(1);
		commandStack.push(remoteControl.offCommands[1]);
		System.out.println(commandStack);

		remoteControl.onButtonWasPushed(2);
		commandStack.push(remoteControl.onCommands[2]);
		System.out.println(commandStack);

		remoteControl.offButtonWasPushed(2);
		commandStack.push(remoteControl.offCommands[2]);
		System.out.println(commandStack);

		remoteControl.onButtonWasPushed(3);
		commandStack.push(remoteControl.onCommands[3]);
		System.out.println(commandStack);

		remoteControl.offButtonWasPushed(3);
		commandStack.push(remoteControl.offCommands[3]);
		System.out.println(commandStack);

		remoteControl.onButtonWasPushed(4);
		commandStack.push(remoteControl.onCommands[4]);
		System.out.println(commandStack);

		remoteControl.offButtonWasPushed(4);
		commandStack.push(remoteControl.offCommands[4]);
		System.out.println(commandStack);


		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

		commandStack.pop().undo();
		System.out.println(commandStack);

	}
}
