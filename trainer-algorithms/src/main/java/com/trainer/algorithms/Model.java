package com.trainer.algorithms;

import java.io.Serializable;

public interface Model<LABLE extends Lable, SAMPLE extends Sample> extends Serializable {

  /**
   * predict a result
   */
  LABLE predict(SAMPLE sample);

}
