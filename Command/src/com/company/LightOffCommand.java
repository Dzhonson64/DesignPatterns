package com.company;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
        System.out.println("Light is off");
    }

    @Override
    public void undo() {
        light.on();
        System.out.println("Light is on");
    }
}
