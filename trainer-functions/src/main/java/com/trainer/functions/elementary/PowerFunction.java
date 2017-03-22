package com.trainer.functions.elementary;

import java.math.BigDecimal;

/**
 * power function
 */
public abstract class PowerFunction implements EFunction {

  @Override
  public BigDecimal func(BigDecimal bigDecimal) {
    BigDecimal exp = this.exponent();
    BigDecimal coe = this.coefficient();
    return null;
  }

  /**
   * exponent
   */
  public abstract BigDecimal exponent();

  /**
   * coefficient
   */
  public abstract BigDecimal coefficient();


}
