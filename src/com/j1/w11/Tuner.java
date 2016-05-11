package com.j1.w11;

public class Tuner {
  String description;
  Amplifier amplifier;
  double frequency;
  
  public Tuner(String description, Amplifier amplifier) {
    this.description=description;
  }
  public void on() {
    System.out.println(description+" on");
  }
  public void off() {
    System.out.println(description+" off");
  }
}
