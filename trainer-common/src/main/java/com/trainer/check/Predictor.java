package com.trainer.check;

public class Predictor {

  public static void predict(boolean condition, String msg) {
    if(!condition){
      throw new RuntimeException(msg);
    }
  }

}
