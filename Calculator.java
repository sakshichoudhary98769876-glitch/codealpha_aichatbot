public class Calculator {

    public static String calculate(String input) {

        input = input.replace("calculate", "")
                     .replace("what is", "")
                     .replace("=", "")
                     .trim();

        try {

            if(input.contains("+")){

                String[] p = input.split("\\+");
                double a = Double.parseDouble(p[0].trim());
                double b = Double.parseDouble(p[1].trim());

                return "Answer = " + (a+b);
            }

            if(input.contains("-")){

                String[] p = input.split("-");
                double a = Double.parseDouble(p[0].trim());
                double b = Double.parseDouble(p[1].trim());

                return "Answer = " + (a-b);
            }

            if(input.contains("*")){

                String[] p = input.split("\\*");
                double a = Double.parseDouble(p[0].trim());
                double b = Double.parseDouble(p[1].trim());

                return "Answer = " + (a*b);
            }

            if(input.contains("/")){

                String[] p = input.split("/");
                double a = Double.parseDouble(p[0].trim());
                double b = Double.parseDouble(p[1].trim());

                if(b==0)
                    return "Division by zero not allowed.";

                return "Answer = " + (a/b);
            }

        } catch(NumberFormatException e){

            return "Invalid calculation.";

        }

        return null;
    }
}