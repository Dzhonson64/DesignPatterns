package com.company;

/* Методы контроллера, которые могут вызываться представлением */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
