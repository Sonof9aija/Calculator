import java.util.*;
import java.util.HashMap;
import java.lang.Math.*;
class Statistics{

  public static double average(double[] lst){
    double answer = 0;
    double sum = 0;
    for (int i = 0; i < lst.length; i++) {
        sum += lst[i];
    }
    answer = sum/lst.length;
    return answer;
  }

  public static double range(double[] lst){
    double answer = 0;
    answer = lst[lst.length-1] - lst[0];
    return answer;
  }

  public static double median(double[] lst){
    double answer = 0;
    int oe = lst.length % 2;
    switch(oe){
      case 1:
        answer = lst[lst.length/2];
        break;
      case 0:
        int middle = lst.length/2;
        answer = (lst[middle] + lst[middle - 1]) / 2;
        break;
    }
    return answer;
  }

  public static double max(double[] lst){
    return lst[lst.length-1];
  }

  public static double min(double[] lst){
    return lst[0];
  }

  public static double count(double[] lst){
    return lst.length;
  }

  public static double sum(double[] lst){
    double answer = 0;
    for (int i = 0; i < lst.length; i++) {
        answer += lst[i];
    }
    return answer;
  }

  public static double mode(double[] lst){
    HashMap<Double,Integer> hm = new HashMap<Double,Integer>();
    double max  = 1;
    double temp = 0;

    for(int i = 0; i < lst.length; i++) {

        if (hm.get(lst[i]) != null) {

            int count = hm.get(lst[i]);
            count++;
            hm.put(lst[i], count);
            if(count > max) {
                max  = count;
                temp = lst[i];
            }
        }

        else 
            hm.put(lst[i],1);
    }
    return temp;
  }

  public static double standardDev(double[] lst){
    double sum = 0.0, standardDeviation = 0.0;
        int length = lst.length;

        for(double num : lst) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: lst) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
  }

  public static void sort(double arr[], int n)
    {                                       
        if (n == 1)                     //passes are done
        {
            return;
        }

        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
        {
            if (arr[i] > arr[i+1])      //check if the elements are in order
            {                           //if not, swap them
                double temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
            
        sort(arr, n-1);           //one pass done, proceed to the next
    }
}