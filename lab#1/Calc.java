public class Calc {

    public static void main(String[] args) {
        if (args.length == 3) {
            for (String str : args) {
                System.out.println("аргумент = " + str);
            }
            System.out.println("Ответ = " + Calculate(args[0], args[1], args[2]));
        } else
            System.out.println("Должно быть 3 входных параметра!");
    }

    public static double Calculate(String a, String b, String c) {
        double eq = 1e-12;
        double aD = Double.parseDouble(a);
        double cD = Double.parseDouble(c);
        switch (b.charAt(0)) {
            case '+': {
                return aD + cD;
            }
            case '-': {
                return aD - cD;
            }
            case '*': {
                return aD * cD;
            }
            case '/': {
                if (cD < eq)
                    throw new IllegalArgumentException("Делить на 0 нельзя!!");
                return aD / cD;
            }
            default: {
                throw new IllegalArgumentException("Неверный оператор!");
            }
        }
    }
}