import java.lang.Math.*;

class Conversions {
  public static double distance(double len, String unit, String output) {
    double answer = 0;
    switch (unit) {
      case "mi":
        switch (output) {
          case "km":
            answer = len * 1.60934;
            break;
          case "m":
            answer = len * 1609.34;
            break;
          case "ft":
            answer = len * 5280;
            break;
          case "yd":
            answer = len * 1760;
            break;
          case "cm":
            answer = len * 160934;
            break;
          case "mm":
            answer = len * 1609340;
            break;
          case "nau":
            answer = len * 0.868976;
            break;
          case "in":
            answer = len * 63360;
            break;
        }
      case "km":
        switch (output) {
          case "mi":
            answer = len * 0.621371;
            break;
          case "m":
            answer = len * 1000;
            break;
          case "ft":
            answer = len * 3280.84;
            break;
          case "yd":
            answer = len * 1093.61;
            break;
          case "cm":
            answer = len * 100000;
            break;
          case "mm":
            answer = len * 10000000;
            break;
          case "nau":
            answer = len * 0.539957;
            break;
          case "in":
            answer = len * 39370.1;
            break;
        }
      case "m":
        switch (output) {
          case "km":
            answer = len * 0.001;
            break;
          case "mi":
            answer = len * 0.000621371;
            break;
          case "ft":
            answer = len * 3.28084;
            break;
          case "yd":
            answer = len * 1.0936133333333;
            break;
          case "cm":
            answer = len * 100;
            break;
          case "mm":
            answer = len * 1000;
            break;
          case "nau":
            answer = len * 0.000539957;
            break;
          case "in":
            answer = len * 39.3701;
            break;
        }
      case "ft":
        switch (output) {
          case "km":
            answer = len * 0.0003048;
            break;
          case "m":
            answer = len * 0.3048;
            break;
          case "mi":
            answer = len / 5280;
            break;
          case "yd":
            answer = len * (1 / 3);
            break;
          case "cm":
            answer = len * 30.48;
            break;
          case "mm":
            answer = len * 304.8;
            break;
          case "nau":
            answer = len * 0.000164579;
            break;
          case "in":
            answer = len * 12;
            break;
        }
      case "yd":
        switch (output) {
          case "km":
            answer = len * 0.0009144;
            break;
          case "m":
            answer = len * 0.9144;
            break;
          case "ft":
            answer = len * 3;
            break;
          case "mi":
            answer = len / 1760;
            break;
          case "cm":
            answer = len * 91.44;
            break;
          case "mm":
            answer = len * 914.4;
            break;
          case "nau":
            answer = len / 2025;
            break;
          case "in":
            answer = len * 36;
            break;
        }
      case "cm":
        switch (output) {
          case "km":
            answer = len / 100000;
            break;
          case "m":
            answer = len * 0.01;
            break;
          case "ft":
            answer = len * 0.0328084;
            break;
          case "yd":
            answer = len * 0.0109361;
            break;
          case "mi":
            answer = len / 160900;
            break;
          case "mm":
            answer = len * 10;
            break;
          case "nau":
            answer = len / 185200;
            break;
          case "in":
            answer = len * 0.393701;
            break;
        }
      case "mm":
        switch (output) {
          case "km":
            answer = len / 1000000;
            break;
          case "m":
            answer = len * 0.001;
            break;
          case "ft":
            answer = len * 0.00328084;
            break;
          case "yd":
            answer = len * 0.00109361;
            break;
          case "cm":
            answer = len * 0.1;
            break;
          case "mi":
            answer = len / 1.609000;
            break;
          case "nau":
            answer = len / 1.852000;
            break;
          case "in":
            answer = len * 0.0393701;
            break;
        }
      case "nau":
        switch (output) {
          case "km":
            answer = len * 1.852;
            break;
          case "m":
            answer = len * 1852;
            break;
          case "ft":
            answer = len * 6076.12;
            break;
          case "yd":
            answer = len * 2025.37;
            break;
          case "cm":
            answer = len * 185200;
            break;
          case "mm":
            answer = len * 1852000;
            break;
          case "mi":
            answer = len * 1.15078;
            break;
          case "in":
            answer = len * 72913.4;
            break;
        }
      case "in":
        switch (output) {
          case "km":
            answer = len / 39370;
            break;
          case "m":
            answer = len * 0.0254;
            break;
          case "ft":
            answer = len / 12;
            break;
          case "yd":
            answer = len / 36;
            break;
          case "cm":
            answer = len * 2.54;
            break;
          case "mm":
            answer = len * 25.4;
            break;
          case "nau":
            answer = len / 72910;
            break;
          case "mi":
            answer = len / 63360;
            break;
        }
    }
    return answer;
  }

  public static double angle(double angle, String unit) {
    double answer = 0;
    switch (unit) {
      case "radians":
        answer = angle * 180 / Math.PI;
        break;
      case "degrees":
        answer = angle * (Math.PI / 180);
    }
    return answer;
  }

  public static double temp(double input, char start, char end) {
    double answer = 0;
    switch (start) {
      case 'c':
        switch (start) {
          case 'k':
            answer = input + 273.15;
          case 'f':
            answer = (input * 9 / 5) + 32;
        }
      case 'k':
        switch (start) {
          case 'c':
            answer = input - 273.15;
          case 'f':
            answer = (input - 273.15) * 9 / 5 + 32;
        }
      case 'f':
        switch (start) {
          case 'c':
            answer = (input - 32) * 5 / 9;
          case 'k':
            answer = (input - 32) * 5 / 9 + 273.15;
        }
    }
    return answer;
  }

  public static double speed(double input, String unit, String output) {
    double answer = 0;
    switch (unit) {
      case "mph":
        switch (output) {
          case "fps":
            answer = input * 1.46667;
            break;
          case "kph":
            answer = input * 1.60934;
            break;
          case "knots":
            answer = input * 0.868976;
            break;
          case "mps":
            answer = input * 0.44704;
            break;
        }
        break;
      case "kph":
        switch (output) {
          case "mph":
            answer = input * 0.621371;
            break;
          case "fps":
            answer = input * 0.911344;
            break;
          case "knots":
            answer = input * 0.539957;
            break;
          case "mps":
            answer = input * 0.277778;
            break;
        }
        break;
      case "knots":
        switch (output) {
          case "mph":
            answer = input * 1.15078;
            break;
          case "kph":
            answer = input * 1.852;
            break;
          case "fps":
            answer = input * 1.68781;
            break;
          case "mps":
            answer = input * 0.514444;
            break;
        }
        break;
      case "mps":
        switch (output) {
          case "mph":
            answer = input * 2.23694;
            break;
          case "kph":
            answer = input * 3.6;
            break;
          case "knots":
            answer = input * 1.94384;
            break;
          case "fps":
            answer = input * 3.28084;
            break;
        }
        break;
      case "fps":
        switch (output) {
          case "mph":
            answer = input * 0.681818;
            break;
          case "kph":
            answer = input * 1.09728;
            break;
          case "knots":
            answer = input * 0.592484;
            break;
          case "mps":
            answer = input * 0.3048;
            break;
        }
        break;
    }
    return answer;
  }

  public static double time(double input, char unit, char output) {
    double answer = 0;
    switch (unit) {
      case 's':
        switch (output) {
          case 'm':
            answer = input * 0.0166667;
            break;
          case 'h':
            answer = input * 0.000277778;
            break;
          case 'd':
            answer = input / 86400;
            break;
          case 'w':
            answer = input / 604800;
            break;
          case 'o':
            answer = input / 2628000;
            break;
          case 'y':
            answer = input / 31540000;
            break;
        }
        break;
      case 'm':
        switch (output) {
          case 's':
            answer = input * 60;
            break;
          case 'h':
            answer = input / 60;
            break;
          case 'd':
            answer = input / 1440;
            break;
          case 'w':
            answer = input / 10080;
            break;
          case 'o':
            answer = input / 43800;
            break;
          case 'y':
            answer = input / 525600;
            break;
        }
        break;
      case 'h':
        switch (output) {
          case 's':
            answer = input * 3600;
            break;
          case 'm':
            answer = input * 60;
            break;
          case 'd':
            answer = input / 24;
            break;
          case 'w':
            answer = input / 168;
            break;
          case 'o':
            answer = input / 730;
            break;
          case 'y':
            answer = input / 8760;
            break;
        }
        break;
      case 'd':
        switch (output) {
          case 's':
            answer = input * 86400;
            break;
          case 'm':
            answer = input * 1440;
            break;
          case 'h':
            answer = input * 24;
            break;
          case 'w':
            answer = input / 0.142857;
            break;
          case 'o':
            answer = input / 0.0328767;
            break;
          case 'y':
            answer = input / 0.00273973;
            break;
        }
        break;
      case 'w':
        switch (output) {
          case 's':
            answer = input * 604800;
            break;
          case 'm':
            answer = input * 10080;
            break;
          case 'h':
            answer = input * 168;
            break;
          case 'd':
            answer = input * 7;
            break;
          case 'o':
            answer = input * 0.230137;
            break;
          case 'y':
            answer = input * 0.0191781;
            break;
        }
        break;
      case 'o':
        switch (output) {
          case 's':
            answer = input * 2628000;
            break;
          case 'm':
            answer = input * 43800;
            break;
          case 'h':
            answer = input * 730.001;
            break;
          case 'd':
            answer = input * 30.4167;
            break;
          case 'w':
            answer = input * 4.34524;
            break;
          case 'y':
            answer = input * 0.0833334;
            break;
        }
        break;
      case 'y':
        switch (output) {
          case 's':
            answer = input * 31540000;
            break;
          case 'm':
            answer = input * 525600;
            break;
          case 'h':
            answer = input * 8760;
            break;
          case 'd':
            answer = input * 365;
            break;
          case 'w':
            answer = input * 52.143;
            break;
          case 'o':
            answer = input * 12;
            break;
        }
        break;
    }
    return answer;
  }

  public static double volume(double input, char unit, char output) {
    double answer = 0;
    switch(unit){
      case 'g':
        switch(output){
          case 'q':
            answer =  input * 4;
            break;
          case 'p':
            answer = input * 8;
            break;
          case 'c':
            answer = input * 16;
            break;
          case 'o':
            answer = input * 128;
            break;
          case 'm':
            answer = input * 0.00378541;
            break;
          case 'l':
            answer = input * 3.78541;
            break;
          case 'i':
            answer = input * 3785.41;
            break;
          case 'f':
            answer = input * 0.133681;
            break;  
        }
        break;
      case 'q':
        switch(output){
          case 'g':
            answer = input * 0.25;
            break;
          case 'p':
            answer = input * 2;
            break;
          case 'c':
            answer = input * 4;
            break;
          case 'o':
            answer = input * 32;
            break;
          case 'm':
            answer = input * 0.000946353;
            break;
          case 'l':
            answer = input * 0.946353;
            break;
          case 'i':
            answer = input * 946.353;
            break;
          case 'f':
            answer = input * 0.0334201;
            break;  
        }
        break; 
      case 'p':
        switch(output){
          case 'g':
            answer = input * 0.125;
            break;
          case 'q':
            answer = input * 0.5;
            break;
          case 'c':
            answer = input * 2;
            break;
          case 'o':
            answer = input * 16;
            break;
          case 'm':
            answer = input * 0.000473176;
            break;
          case 'l':
            answer = input * 0.473176;
            break;
          case 'i':
            answer = input * 473.176;
            break;
          case 'f':
            answer = input * 0.0167101;
            break;  
        }
        break;
      case 'c':
        switch(output){
          case 'g':
            answer = input / 16;
            break;
          case 'q':
            answer = input / 4;
            break;
          case 'p':
            answer = input / 2;
            break;
          case 'o':
            answer = input * 8;
            break;
          case 'm':
            answer = input / 4227;
            break;
          case 'l':
            answer = input / 4.227;
            break;
          case 'i':
            answer = input * 236.6;
            break;
          case 'f':
            answer = input / 119.7;
            break;  
        }
        break;  
      case 'o':
        switch(output){
          case 'g':
            answer = input / 128;
            break;  
          case 'q':
            answer = input / 32;
            break;
          case 'p':
            answer = input / 16;
            break;
          case 'c':
            answer = input / 8;
            break;
          case 'm':
            answer = input / 33810;
            break;
          case 'l':
            answer = input / 33.814;
            break;
          case 'i':
            answer = input * 29.574;
            break;
          case 'f':
            answer = input / 957.5;
            break;  
        }
        break; 
      case 'm':
        switch(output){
          case 'g':
            answer = input * 264.172;
            break;
          case 'q':
            answer = input * 1056.69;
            break;
          case 'p':
            answer = input * 2113.38;
            break;
          case 'c':
            answer = input * 4226.75;
            break;
          case 'o':
            answer = input * 33814;
            break;
          case 'l':
            answer = input * 1000;
            break;
          case 'i':
            answer = input * 1000000;
            break;
          case 'f':
            answer = input * 35.3147;
            break;  
        }
        break;
      case 'l':
        switch(output){
          case 'g':
            answer = input * 0.264172;
            break;
          case 'q':
            answer = input * 1.05669;
            break;
          case 'p':
            answer = input * 2.11338;
            break;
          case 'c':
            answer = input * 4.22675;
            break;
          case 'o':
            answer = input * 33.814;
            break;
          case 'm':
            answer = input * 0.001;
            break;
          case 'i':
            answer = input * 1000;
            break;
          case 'f':
            answer = input * 0.0353147;
            break;  
        }
        break;
      case 'i':
        switch(output){
          case 'g':
            answer = input / 3785;
            break;
          case 'q':
            answer = input / 946.4;
            break;
          case 'p':
            answer = input / 473.2;
            break;
          case 'c':
            answer = input / 236.6;
            break;
          case 'o':
            answer = input / 29.574;
            break;
          case 'm':
            answer = input / 1000000;
            break;
          case 'l':
            answer = input / 1000;
            break;
          case 'f':
            answer = input / 28320;
            break;  
        }
        break; 
      case 'f':
        switch(output){
          case 'g':
            answer = input * 7.481;
            break;
          case 'q':
            answer = input * 29.922;
            break;
          case 'p':
            answer = input * 59.844;
            break;
          case 'c':
            answer = input * 119.7;
            break;
          case 'o':
            answer = input * 957.506;
            break;
          case 'm':
            answer = input * 0.0283168;
            break;
          case 'l':
            answer = input * 28.3168;
            break;
          case 'i':
            answer = input * 28316.8;
            break;
        }
        break;
    }
    return answer;
  }

  public static double area(double input, String unit, String output) {
    double answer = 0;
    switch (unit) {
      case "k":
        switch (output) {
          case "m":
            answer = input * 1000000;
            break;
          case "i":
            answer = input * 0.386102;
            break;
          case "y":
            answer = input * 1196000;
            break;
          case "f":
            answer = input * 10760000;
            break;
          case "h":
            answer = input * 100;
            break;
          case "a":
            answer = input * 247.1;
            break;
        }
        break;
      case "m":
        switch (output) {
          case "k":
            answer = input / 1000000;
            break;
          case "i":
            answer = input / 2590000;
            break;
          case "y":
            answer = input * 1.196;
            break;
          case "f":
            answer = input * 10.7639;
            break;
          case "h":
            answer = input / 10000;
            break;
          case "a":
            answer = input * 0.000247105;
            break;
        }
        break;
      case "i":
        switch (output) {
          case "k":
            answer = input * 2.58999;
            break;
          case "m":
            answer = input * 2590000;
            break;
          case "y":
            answer = input * 3098000;
            break;
          case "f":
            answer = input * 27880000;
            break;
          case "h":
            answer = input * 258.999;
            break;
          case "a":
            answer = input * 640;
            break;
        }
        break;
      case "y":
        switch (output) {
          case "k":
            answer = input / 1196000;
            break;
          case "m":
            answer = input / 1.196;
            break;
          case "i":
            answer = input / 3098000;
            break;
          case "f":
            answer = input * 9;
            break;
          case "h":
            answer = input / 11960;
            break;
          case "a":
            answer = input / 4840;
            break;
        }
        break;
      case "f":
        switch (output) {
          case "k":
            answer = input / 10760000;
            break;
          case "m":
            answer = input / 10.764;
            break;
          case "i":
            answer = input / 27880000;
            break;
          case "y":
            answer = input / 9;
            break;
          case "h":
            answer = input / 107600;
            break;
          case "a":
            answer = input / 43560;
            break;
        }
        break;
      case "h":
        switch (output) {
          case "k":
            answer = input * 0.01;
            break;
          case "m":
            answer = input * 10000;
            break;
          case "i":
            answer = input * 0.00386102;
            break;
          case "y":
            answer = input * 11959.9;
            break;
          case "f":
            answer = input * 107639;
            break;
          case "a":
            answer = input * 2.47105;
            break;
        }
        break;
      case "a":
        switch (output) {
          case "k":
            answer = input * 0.00404686;
            break;
          case "m":
            answer = input * 4046.86;
            break;
          case "i":
            answer = input * 0.0015625;
            break;
          case "y":
            answer = input * 4840;
            break;
          case "f":
            answer = input * 43560;
            break;
          case "h":
            answer = input * 0.404686;
            break;
        }
        break;
    }
    return answer;
  }

  public static double mass(double input, String unit, String output) {
    double answer = 0;
    switch(unit){
      case "mt":
        switch(output){
          case "kg":
            answer = input * 1000;
            break;
          case "g":
            answer = input * 1000000;
            break;
          case "mg":
            answer = input * 1000000000;
            break;
          case "st":
            answer = input * 1.10231;
            break;
          case "lb":
            answer = input * 2204.62;
            break;
          case "oz":
            answer = input * 35274;
            break;
        }
        break;
      case "kg":
        switch(output){
          case "mt":
            answer = input * 0.001;
            break;
          case "g":
            answer = input * 1000; 
            break;
          case "mg":
            answer = input * 1000000;
            break;
          case "st":
            answer = input * 0.00110231;
            break;
          case "lb":
            answer = input * 2.20462;
            break;
          case "oz":
            answer = input * 35.274;
            break;
        }
        break;
      case "g":
        switch(output){
          case "mt":
            answer = input / 1000000; 
            break; 
          case "kg":
            answer = input / 1000;
            break;
          case "mg":
            answer = input * 1000;
            break;
          case "st":
            answer = input / 907200;
            break;
          case "lb":
            answer = input / 453.6;
            break;
          case "oz":
            answer = input * 0.035274;
            break;
        }
        break;
      case "mg":
        switch(output){
          case "mt":
            answer = input / 1000000000; 
            break;  
          case "kg":
            answer = input / 1000000;
            break;
          case "g":
            answer = input / 1000;
            break;
          case "st":
            answer = input / 907200000;
            break;
          case "lb":
            answer = input / 453600;
            break;
          case "oz":
            answer = input / 28350;
            break;
        }
        break;
      case "st":
        switch(output){
           case "mt":
            answer = input * 0.907185;
            break; 
          case "kg":
            answer = input * 907.185;
            break;
          case "g":
            answer = input * 907185;
            break;
          case "mg":
            answer = input * 907185000;
            break;
          case "lb":
            answer = input * 2000;
            break;
          case "oz":
            answer = input * 32000;
            break;
        }
        break;
      case "lb":
        switch(output){
          case "mt":
            answer = input * 0.000453592;
            break;  
          case "kg":
            answer = input * 0.453592;
            break;
          case "g":
            answer = input * 453.592;
            break;
          case "mg":
            answer = input * 453592;
            break;
          case "st":
            answer = input * 0.0005;
            break;
          case "oz":
            answer = input * 16;
            break;
        }
        break;
      case "oz":
        switch(output){
          case "mt":
            answer = input / 35270;
            break;  
          case "kg":
            answer = input / 35.270;
            break;
          case "g":
            answer = input * 28.3495;
            break;
          case "mg":
            answer = input * 28349.5;
            break;
          case "st":
            answer = input / 32000;
            break;
          case "lb":
            answer = input / 16;
            break;
        }
        break;
    }
    return answer;
  }

}
