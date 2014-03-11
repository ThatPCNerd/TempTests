
package temptests;

import java.util.Scanner;
public class TempTests {
    public String current = "";
    public static double x = 1;
    public static double y = 1;
    public static double a = 2;
    public static void main(String[] args) {
        boolean go = true;
        while(go == true){
        String in = "";
        Scanner key = new Scanner(System.in);
        System.out.println("What do you want to do? Calc, Die, Game");
        in = key.next();
        if(in.equals("Calculate")|| in.equals("calc")){
            calculate(key);
        }
        if(in.equals("die"))
        {
                System.out.println("oh, the agony! *Splat*");
                break;
        }
                if(in.equals("game"))
           Game.game();
           
        }
        
    }
    public static void calculate(Scanner key){
        boolean go = true;
        while(go = true){
        String in = "";
        
        System.out.println("add, subtract, multiply, or divide?");
        in = key.next();
        if (in.equals("add")){
            chosen("addition");
            getx(key);
            gety(key);
            a = (x + y);
            System.out.println(x + " + " + y + " = " + a); 
        }
        else if(in.equals("subtract")){
        chosen("subtraction");
        getx(key);
        gety(key);
        a = (x - y);
        System.out.println(x + " - " + y + " = " + a); 
        }
        else if(in.equals("multiply")){
        chosen("multiplication");
        getx(key);
        gety(key);
        a = (x * y);
        System.out.println(x + " * " + y + " = " + a); 
        }
        else if(in.equals("divide")){
        chosen("division");
        getx(key);
        gety(key);
        a = (x / y);
            System.out.println(x + " / " + y + " = " + a); 
        }
        else if(in.equals("back"))
            break;
        else{error();}
        }           
    }
    public static void error(){
        System.out.println("That is an incorrect entry, please try again.");
        
    }
    public static void getx(Scanner key){
        System.out.println("Please enter first variable");
        x = key.nextInt();
    }
    public static void gety(Scanner key){
        System.out.println("Please enter second variable");
        y = key.nextInt();
    }
    public static void chosen(String choice){
        System.out.println("You have chosen " + choice + ".");
    }
}
