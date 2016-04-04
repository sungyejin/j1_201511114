/*
 * @author syj
 * @since 160404
 * demo how to use file decorator
 * 
 */

package com.j1.w5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;


public class FileDemoMain {
  public static void main (String[] args) throws Exception {
    File readme=null;
    InputStream isReadme=null;
    int i;
    char c;
    
    try {
      File myhome=new File(System.getProperty("user.home"));
      System.out.println("my home is "+myhome);
      
      String cwd = new File( "." ).getCanonicalPath();
      System.out.println("cwd is "+cwd);
      
      readme = new File(cwd, "README.md");
      System.out.println("readme is "+readme);
      
      isReadme = new FileInputStream(readme);
      while((i=isReadme.read())!=-1) {
        c=(char)i;
        System.out.print(c);
      }
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      if(isReadme != null)
        isReadme.close();
    }
  }
}