/*
Name          : Gobal Krishnan V
Date of Birth : 18/06/1995
Compilation   : javac CMYKtoRGB.java
Execution     : java CMYKtoRGB 0.0 0.4392156862745098 1.0 0.0

 %java CMYKtoRGB 0.0 1.0 0.0 0.0    // magenta
 %java CMYKtoRGB 0.0 0.4392156862745098 1.0 0.0    // Princeton orange
 */

public class CMYKtoRGB{

    public static void main(String[] args){
        double cyan=Double.parseDouble(args[0]),magenta=Double.parseDouble(args[1]),yellow=Double.parseDouble(args[2]),black=Double.parseDouble(args[3]),
                white = 1 - black,
                red = 255 * white * (1 - cyan),
                green = 255 * white * (1-magenta),
                blue = 255 * white * (1-yellow);

        System.out.println("Red = "+Math.round(red));
        System.out.println("Green = "+Math.round(green));
        System.out.println("Blue = "+Math.round(blue));
    }
}

