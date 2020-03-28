package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

/* Наблюдатель для событий обоих видов ударов */
public class DJView implements ActionListener, BeatObserver, BMPObserver{
    BeatModeInterface model; // ссылка на модель
    ControllerInterface controller; // ссылка на контроллер

    /* Отображение компонентов */
    JFrame viewFrame;
    JPanel viewPanel;
    //BeatBar beatBar;
    JLabel bmpOutputLaber;
    JLabel bmpLabel;
    JTextField bmpTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public DJView (ControllerInterface controller, BeatModeInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }

    public void createView(){
        // create all Swing components here
    }

    public void updateBPM() {
        int bpm = model.getBPM();
        if (bpm == 0) {
            //bpmOutputLabel.setText("offline");
        }else {
            //bpmOutputLabel.setText("Current BPM: " + model.getBPM());
        }
    }

    public void updateBeat() {
        //beatBar.setValue(100);
    }

    public void createControls() {
        // create all Swing components here
    }

    public void enableStopMenuItem(){
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem(){
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem () {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem () {
        startMenuItem.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == setBPMButton){
            int bpm = Integer.parseInt(bmpTextField.getText());
            controller.setBPM(bpm);
        } else if (e.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (e.getSource() == decreaseBPMButton){
            controller.decreaseBPM();
        }
    }
}
