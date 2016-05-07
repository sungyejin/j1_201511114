package com.j1.w9;

public class LightOffCommand implements Command {
  Light light;
 
  public LightOffCommand(Light light) {
    this.light = light;
  }
 
  public void execute() {
    light.off();
  }
}