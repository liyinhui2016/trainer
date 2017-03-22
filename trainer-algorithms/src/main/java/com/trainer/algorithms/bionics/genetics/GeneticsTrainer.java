package com.trainer.algorithms.bionics.genetics;

import com.trainer.algorithms.Lable;
import com.trainer.algorithms.Model;
import com.trainer.algorithms.Sample;
import com.trainer.algorithms.Trainer;

public class GeneticsTrainer<LABLE extends Lable, SAMPLE extends Sample, MODEL extends Model<LABLE, SAMPLE>> implements
    Trainer<LABLE, SAMPLE, MODEL> {

  public MODEL train(SAMPLE[] samples, LABLE[] lables) {
    return null;
  }
}
