package sg.nus.edu.iss;

import java.io.Console;

/**
 * Hello world!
 * 
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console con = System.console();
        String name = con.readLine("What is your name?\n");

        if (name.length() > 0) {
            System.out.printf("Nice to meet you, %s", name);
        } else {
            System.err.println("You have not told me your name");
        }

        Integer age = 80;
        System.out.printf("\n%s is %d years old.", name, age);
        System.out.println("\n" + name + " is " + age + " years old.");

        String mother_name = "Esther";
        System.out.printf("\nMy mother is %s", mother_name);

        // Slide 17
        String input = con.readLine("\nWhat is your hobby?\n");
        input = input.trim().toLowerCase();

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is Clementi");
        } else if (input.equals("jog")) {
            System.out.println("The nearest park is West Coast Park");
        } else if (input.equals("cycle")) {
            System.out.println("You could cycle along the PCN");
        } else {
            System.out.println("Seems like you're a boring person without a hobby");
        }

        // Slide 18 Switch Statement

        switch (input) {
            case "swim":
                System.out.println("The nearest swimming pool is Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park");
                break;
            case "cycle":
                System.out.println("You could cycle along the PCN");
                break;
            default:
                System.out.println("Seems like you're a boring person without a hobby");
                break;
        }


        //Slide 19 age 
        
        Integer myAge = 0;
        String inputAge = con.readLine("What is your age?");

        myAge = Integer.parseInt(inputAge);

        if (myAge >=0 && myAge <=2){
            System.out.println("You are a baby.");
        }else if(myAge>2 && myAge <=4){
            System.out.println("You are a toddler.");
        }else if(myAge>4 && myAge <=12){
            System.out.println("You are a child.");
        }else if(myAge >12 && myAge <19){
            System.out.println("You are a teen.");
        }else{
            System.out.println("You are an adult.");
        }



    }
}
