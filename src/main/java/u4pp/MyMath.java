package u4pp;

public class MyMath {
    // which returns the absolute value of the parameter
    static int abs (int x){
        return x < 0 ? (x * -2)/2 : x;
    }

    //which returns the absolute value of the parameter
    static double abs (double x){
        return x < 0 ? (x * -2)/2 : x;
    }

    //which raises the base to the power of the exponent. You can assume that the exponent is greater than or equal to 0.
    static double pow(double base, int exponent){
        int num = 0;
        double num2 = base;
        double num3 = base;
        if ( exponent == 0){
            num = 1;
            return num;
        } else{
            for (int i = 1; i < exponent; i++){
                num2 = num2 * num3;
            }
            return num2;
        }
        
    }

    //which returns the square root of x if there is a whole number that is a square root. It returns -1 otherwise.
    static int perfectSqrt(int x){
        int num = x;
        int ploopy = 1;
        int count = 0;
        while (num != 0){
            num = num - ploopy;
            ploopy += 2;
            count += 1;
            if (num <0){
                count = -1;
                return count;
            }
        }
        return count;
    }
}

