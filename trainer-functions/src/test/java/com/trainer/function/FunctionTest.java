package com.trainer.function;

import com.trainer.functions.elementary.PolynomialFunction;
import com.trainer.functions.elementary.PowerFunction;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

  @Test
  public void testPowFunction() {
    PowerFunction f = new PowerFunction() {
      @Override
      protected Integer exponent() {
        return 10;
      }

      @Override
      protected BigDecimal coefficient() {
        return BigDecimal.valueOf(2);
      }
    };

    Assert.assertEquals(f.calc(BigDecimal.valueOf(2)).longValue(), 2048);
  }

  @Test
  public void testPolynomialFunction() {
    PolynomialFunction function = new PolynomialFunction() {
      @Override
      protected int[] exponents() {
        return new int[]{1, 2};
      }

      @Override
      protected BigDecimal[] coefficients() {
        BigDecimal[] coes = new BigDecimal[2];
        coes[0] = BigDecimal.valueOf(1);
        coes[1] = BigDecimal.valueOf(2);
        return coes;
      }
    };
    Assert.assertEquals(function.calc(BigDecimal.TEN).longValue(),210);

  }

}
