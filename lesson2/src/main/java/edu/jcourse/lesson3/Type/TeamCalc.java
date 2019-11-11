package edu.jcourse.lesson3.Type;

public class TeamCalc {

    public static void main(String[] args) {
        // 0 1 2
        // 1+ 20
        // != ne ravno 0
        // esli znachenie ne ravno nulju ,to vipolnjaetsja sout r+ v1 + operator + v2
        if (args.length != 0) {
            double value1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double result;
            double value2 = Double.parseDouble(args[2]);
            switch (operator) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                case "/":
                    result = value1 / value2;
                    break;
                default:
                    System.out.println("No included");
            }
            ;
            {
                int i = 0;
                int a = 0;
                int b = 20;





            }

            }
        }
    }

