package com.company;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand; // Объкт для хранения выполненной команды

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new noCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    // Созранения команд для последующего использования
    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    // При нажатии на кнопку "вкл" или "выкл" вызывается соответсвующий метод
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("\n------Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuild.append("[slot " + i + "] " + onCommands[i].getClass().getName()
            + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuild.toString();
    }
}
