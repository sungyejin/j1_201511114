package com.j1.w9;

import java.util.*;

public class SimpleRemoteControl {
  Command slot;
  
  public SimpleRemoteControl() {}
  
  public void setCommand(Command command) {
    slot=command;
  }
  
  public void buttonWasPressed() {
    slot.execute();
  }
}

