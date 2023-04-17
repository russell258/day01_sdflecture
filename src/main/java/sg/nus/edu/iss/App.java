package sg.nus.edu.iss;

import java.io.Console;

/**
 * Hello world!
 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Console con = System.console();
        String name = con.readLine("What is your name?\n");

        if (name.length()>0){
            System.out.printf("Nice to meet you, %s", name);
        }else{
            System.err.println("You have not told me your name");
        }
        

        Integer age = 80;
        System.out.printf("\n%s is %d years old.", name, age);
        System.out.println("\n"+ name + " is " + age + " years old.");

        String mother_name = "Esther";
        System.out.printf("\nMy mother is %s", mother_name);


        // Slide 17
        String input = con.readLine("\nWhat is your hobby?\n");
        input = input.trim().toLowerCase();

        if (input.equals("swim")) {
            System.out.println("The nearest swimming pool is Clementi");
        }else if (input.equals("jog")){
            System.out.println("The nearest park is West Coast Park");
        }else if (input.equals("cycle")){
            System.out.println("You could cycle along the PCN");
        }else{
            System.out.println("Seems like you're a boring person without a hobby");
        }


    }
}
