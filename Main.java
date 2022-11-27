import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner calculatorMode = new Scanner(System.in);
    System.out.println("What mode do you want?");
    String mode = calculatorMode.nextLine();
    mode = mode.toLowerCase();

    while (!mode.equals("conversions") && !mode.equals("linear") &&
        !mode.equals("scientific") && !mode.equals("statistics")) {
      System.out.println("Not available, try again");
      mode = calculatorMode.nextLine();
      mode = mode.toLowerCase();
    }

    switch (mode) {
      case "conversions":
        if(true){
          
        }
        break;
      case "scientific":
        break;
      case "statistics":
        if(true){
        int entered = 0;
        boolean yes = true;
        Scanner input = new Scanner(System.in);
        System.out.println("How many data points do you have?");
        int amount = input.nextInt();
        double[] data = new double[amount];
        for(int i = 0; i < amount; i++){
          double entry = input.nextDouble();
          data[i] = entry;
          entered++;
        }
        System.out.println("Data collected.");
        Statistics.sort(data, amount);
        System.out.println("Data sorted.");
        while (yes) {
          double answer = 0.0;
          Scanner statMode = new Scanner(System.in);
          System.out.println("\nWhat action would you like to take");
          System.out.println("Your options are:\nmax, min, average");
          System.out.println("sum, count, range");
          System.out.println("median, mode(will return 0 if no single number found), \nstandard deviation(enter 'dev' for this)");
          System.out.println("clear, quit, print");
          System.out.println();
          String calc = statMode.nextLine();
          calc = calc.toLowerCase();

          while (!calc.equals("max") && !calc.equals("min") && !calc.equals("average") && !calc.equals("sum") && !calc.equals("count") && !calc.equals("range") && !calc.equals("median") && !calc.equals("mode") && !calc.equals("dev") && !calc.equals("clear") && !calc.equals("enter") && !calc.equals("quit") && !calc.equals("print")) {
            System.out.println("Not available, try again");
            calc = statMode.nextLine();
            calc = calc.toLowerCase();
          }
          switch (calc) {
            case "max":
              answer = Statistics.max(data);
              System.out.println("The maximum value is: " + answer);
              break;
            case "min":
              answer = Statistics.min(data);
              System.out.println("The minimum value is: " + answer);
              break;
            case "average":
              answer = Statistics.average(data);
              System.out.println("The average value is: " + answer);
              break;
            case "range":
              answer = Statistics.range(data);
              System.out.println("The range of the set is: " + answer);
              break;
            case "median":
              answer = Statistics.median(data);
              System.out.println("The median value is: " + answer);
              break;
            case "count":
              answer = Statistics.count(data);
              System.out.println("The amount of values is: " + entered);
              break;
            case "sum":
              answer = Statistics.sum(data);
              System.out.println("The sum of all values is: " + answer);
              break;
            case "mode":
              answer = Statistics.mode(data);
              System.out.println("The most common value is: " + answer);
              break;
            case "dev":
              answer = Statistics.standardDev(data);
              System.out.println("The maximum value is: " + answer);
              break;
            case "clear":
              data = new double[amount];
              break;
            case "print":
              for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
              }
              System.out.println("\n");
              break;
            case "quit":
              yes = false;
              break;
          }
        }
        }
        break;
    }

  }
}