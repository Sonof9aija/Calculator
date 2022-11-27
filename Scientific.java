import java.lang.Math.*;
class Scientific{
  public static long fac(long starter){
    long answer = 1;
    for (int i = 2; i <= starter; i++) {
        answer = answer * i;
    }
    return answer;
  }

  public static double inv(double inve){
    return 1/inve;
  }

  public static double exp(double base, double expo){
    return Math.pow(base,expo);
  }

  public static double sqr(double base){
    return Math.pow(base, 0.5);
  }

  public static double log(double base){
    return Math.log10(base);
  }

  public static double ln(double base){
    return Math.log(base);
  }
}
