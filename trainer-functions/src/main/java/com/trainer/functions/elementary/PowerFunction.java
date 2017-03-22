package com.trainer.functions.elementary;

import com.trainer.check.Predictor;
import java.math.BigDecimal;

/**
 * power function
 */
public abstract class PowerFunction implements EFunction {

  @Override
  public BigDecimal calc(BigDecimal value) {
    Integer exp = this.exponent();
    BigDecimal coe = this.coefficient();
    Predictor.predict(exp != null, "exponent should not be null");
    Predictor.predict(coe != null, "coefficient should not be null");
    return value.pow(exp).multiply(coefficient());
  }

  /**
   * exponent
   */
  protected abstract Integer exponent();

  /**
   * coefficient
   */
  protected abstract BigDecimal coefficient();


}
