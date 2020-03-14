package com.company;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    Dvdplayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLight lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, Dvdplayer dvd, CdPlayer cd, Projector projector, TheaterLight lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    // Выполняет всю аппаратуру за нас. И снова каждая операция делегируется соотвественно слудующесму компоненту подсистемы
    public void watchMovie (String movie){
        System.out.println("Get ready to watch a movie ...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    // Выключает за нас всю аппаратуру за нас. И снова каждая операция делегируется соотвествующему компоненту подсистемы
    public void endMovie(){
        System.out.println("Shutting movie theater down ...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.eject();
        dvd.off();
    }
}
