package Assignment13_15;

public class rational extends Number implements Comparable<rational> {

    private Long numerator = (long) 0;
    private Long denominator = (long) 1;

    public rational() {
      this(0, 1);
    }

    public rational(long numerator, long denominator) {
      long gcd = gcd(numerator, denominator);
      this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
      this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
      long n1 = Math.abs(n);
      long n2 = Math.abs(d);
      int gcd = 1;

      for (int k = 1; k <= n1 && k <= n2; k++) {
        if (n1 % k == 0 && n2 % k == 0)
          gcd = k;
     }

      return gcd;
    }

    public long getNumerator() {
      return numerator;
    }

    public long getDenominator() {
      return denominator;
    }

    public rational add(rational secondRational) {
      long n = numerator * secondRational.getDenominator() +
        denominator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
       return new rational(n, d);
    }

    public rational subtract(rational secondRational) {
        Long n = numerator.longValue() * secondRational.getDenominator()
                - denominator.longValue() * secondRational.getNumerator();
        Long d = denominator.longValue() * secondRational.getDenominator();
        return new rational(n, d);
    }

    public rational multiply(rational secondRational) {
      long n = numerator * secondRational.getNumerator();
      long d = denominator * secondRational.getDenominator();
      return new rational(n, d);
    }

    public rational divide(rational secondRational) {
      long n = numerator * secondRational.getDenominator();
      long d = denominator * secondRational.numerator;
      return new rational(n, d);
    }

    @Override
    public String toString() {
      if (denominator == 1)
        return numerator + "";
      else
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
      if ((this.subtract((rational)(other))).getNumerator() == 0)
        return true;
      else
        return false;
    }

    @Override
    public int intValue() {
      return (int)doubleValue();
    }

    @Override
    public float floatValue() {
      return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
      return numerator *  1.0 / denominator;
    }

    @Override
    public long longValue() {
      return (long)doubleValue();
    }

    @Override
    public int compareTo(rational o) {
      if (this.subtract(o).getNumerator() > 0)
        return 1;
      else if (this.subtract(o).getNumerator() < 0)
        return -1;
      else
        return 0;
    }
  }