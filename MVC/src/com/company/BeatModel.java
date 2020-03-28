package com.company;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModeInterface, MetaEventListener {
    Sequencer sequencer;
    List<BeatModeInterface> beatObservers = new ArrayList<>();
    List<BeatModeInterface> bmpObservers = new ArrayList<>();
    int bmp = 90;

    public void initialize() {
        /* Методы настройик генератора (midi код)
        setUpMidi();
        buildTrackAndStart();
        */
    }

    public void on() {
        sequencer.start();
        setBPM(90);
    }

    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bmp = bmp;
        sequencer.setTempoInBPM(getBPM());
    }

    @Override
    public int getBPM() {
        return bmp;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bmpObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        bmpObservers.remove(o);
    }

    void beatEvent(){
        notifyBeatObserver();
    }


    @Override
    public void meta(MetaMessage meta) {

    }
}
