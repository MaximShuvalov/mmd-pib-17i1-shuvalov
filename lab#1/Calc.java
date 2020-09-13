public class Calc {

    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }

        System.out.println("Ответ = " + Calculate(args[0], args[1], args[2]));
    }

    public static double Calculate(String a, String b, String c) {
        double aD = Double.parseDouble(a);
        double cD = Double.parseDouble(c);
        switch (b) {
            case "+": {
                return aD + cD;
            }
            case "-": {
                return aD - cD;
            }
            case "*": {
                return aD * cD;
            }
            case "/": {
                if(aD == 0 || cD == 0)
                    throw new IllegalArgumentException("Делить на 0 нельзя!!");
                return aD / cD;
            }
            default: {
                throw new IllegalArgumentException("Неверный оператор!");
            }
        }
    }
}