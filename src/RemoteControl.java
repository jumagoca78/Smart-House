
//
// This is the invoker
//
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
 
	////Constructor de la clase RemoteControl
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
	//Método setCommand para asignar un comando a un botón
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	//Método onButtonWasPushed para ejecutar el comando de encendido
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	//Método offButtonWasPushed para ejecutar el comando de apagado
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
  
	//Método toString para imprimir el contenido del control remoto
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
