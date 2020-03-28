package com.company;

public class Main {

    public static void main(String[] args) {
        BeatModeInterface model = new BeatModel();
        HeartModel model2 = new HeartModel();
        ControllerInterface controller = new BeatController(model);
        ControllerInterface model3 = new HeartController(model2);
    }
}
