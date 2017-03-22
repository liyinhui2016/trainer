package com.trainer.algorithms;

/**
 * one trainer interface
 */
public interface Trainer<LABLE extends Lable, SAMPLE extends Sample, MODEL extends Model<LABLE, SAMPLE>> {

  /**
   * train one model
   */
  MODEL train(SAMPLE[] samples, LABLE[] lables);

}
