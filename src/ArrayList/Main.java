package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String args []){
        ArrayList< Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            displayMenu();
            int choice = input.nextInt();
            if(choice == 1){
                System.out.print("Enter integer");
                integers.add(input.nextInt());
                System.out.println("Added");

            }else if(choice == 2){
                System.out.print("Enter number to remove: ");
                int removeNum = input.nextInt();
                if(integers.contains(removeNum)){
                    integers.remove(Integer.valueOf(removeNum));
                    System.out.println("Removed");
                }else
                    System.out.println("Integer not found");

            }else if(choice == 3){
                System.out.println(" Your list:" + integers);

            }else if(choice == 4){
                System.out.println("Good Bye");
                break;
            }
        }
        }
    public static void displayMenu(){
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Enter your choice");

    }
}
