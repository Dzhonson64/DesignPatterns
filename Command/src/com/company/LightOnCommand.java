package com.company;


public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        System.out.println("Light is on");
    }

    @Override
    public void undo() {
        light.off();
        System.out.println("Light is off");
    }
}
