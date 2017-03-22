package com.trainer.functions.elementary;

import com.trainer.check.Predictor;
import java.math.BigDecimal;

/**
 * Polynomial Function
 */
public abstract class PolynomialFunction implements EFunction {

  @Override
  public BigDecimal calc(BigDecimal bigDecimal) {
    Predictor.predict(exponents() != null, "exponents should not be null");
    Predictor.predict(coefficients() != null, "coefficients should not be null");
    Predictor.predict(exponents().length == exponents().length,
        "exponents'length should equals coefficients'length ");
    if (exponents().length == 0) {
      return BigDecimal.ZERO;
    }
    BigDecimal result = BigDecimal.ZERO;
    for (int i = 0; i < exponents().length; i++) {
      final int finalI = i;
      result = result.add(new PowerFunction() {
        @Override
        protected Integer exponent() {
          return exponents()[finalI];
        }

        @Override
        protected BigDecimal coefficient() {
          return coefficients()[finalI];
        }
      }.calc(bigDecimal));
    }

    return result;
  }

  /**
   * exponents
   */
  protected abstract int[] exponents();

  /**
   * coefficient
   */
  protected abstract BigDecimal[] coefficients();


}
