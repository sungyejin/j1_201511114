package com.j1.w11;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp =new Amplifier("My Amplifier");
    Tuner tuner=new Tuner("My AM/FM Tuner",amp);
    DvdPlayer dvd=new DvdPlayer("My DVD Player",amp);
    Projector projector=new Projector("My Projector",dvd);
      
    HTFacade ht=new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("My Movie Watching...");
    ht.endMovie();
  }
}
