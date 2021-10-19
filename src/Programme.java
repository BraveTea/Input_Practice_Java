/* I started this file as a way to figure out how Scanner worked and how to get
input from a user.
That "echo" code is down below commented out

After "echo" I thought to make a simple calculator using a switch statement.
I understand that this could be a lot nicer, and normally I would use a while-loop
to keep it going until a stop command is issued in input. But for now I was just
practising with creating methods and seeing how they worked with input and if I could
use methods assigned to a variable. This came about because I wanted to know when
input were being run. I noticed earlier that the code isn't paused for an input.
So all instructions were printed at the same time and then all inputs were asked
(because I wrote the code structurally)
I then proceeded to put the instructions in a method which would be called one at a time
and instructions and input scans were correctly ordered.
 */

import java.util.Scanner;

public class Programme{

    public static void main(String[] args){

        String operator = inputOperator();
        int sum;

        //I had IDEA replace my "normal/old" switch statement with an enhanced switch statement which
        // led to : being replaced with -> and the break; being removed
        //I take it from this that case: is used when I need fall-through (so I need to
        // run all other cases as well, and that case -> is used when I want a break;
        switch (operator) {
            case "+" -> {
                sum = returnInputInt() + returnInputInt();
                System.out.println(sum);
            }
            case "-" -> {
                sum = returnInputInt() - returnInputInt();
                System.out.println(sum);
            }
            case "*" -> {
                sum = returnInputInt() * returnInputInt();
                System.out.println(sum);
            }
            case "/" -> {
                sum = returnInputInt() / returnInputInt();
                System.out.println(sum);
            }
        }
    }

    public static int returnInputInt(){
        System.out.println("Please enter an integer");
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }

    public static String inputOperator(){
        System.out.println("Please enter an operator");
        Scanner operator = new Scanner(System.in);
        return operator.next();
    }
}



/*

import java.util.Scanner;

public class Programme {

    public static void main(String[] args){
        Scanner echo = new Scanner(System.in);

        System.out.println(echo.nextLine());
    }
}
*/