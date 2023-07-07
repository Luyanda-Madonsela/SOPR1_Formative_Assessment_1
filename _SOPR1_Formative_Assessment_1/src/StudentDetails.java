import java.util.Scanner;

public class StudentDetails {

    public static double totPerc = 0;
    public static double average = 0;
    public static int totStudents = 0;

    public static void main(String[] args) {
        readFirstRecord();
    }
    public static void readFirstRecord(){
        String name;
        String address;
        double percentage;
        boolean stop;
        String input;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter student details (Enter ZZZ to stop):");
        name = scanner1.nextLine();

//        Checking Stop Conditions
        if(name.equalsIgnoreCase("ZZZ")){
            displayAverage();
        }
        else {
            System.out.println("Enter address:");
            address = scanner1.nextLine();
            System.out.print("Enter percentage:\n");
            input = scanner1.nextLine();
            percentage = Double.parseDouble(input);
            totPerc += percentage;
            totStudents++;
            displayRecord(name, address, percentage);

            stop = false;

//            While stop condition is not triggered, keep calling readRecord Method
//            If the readRecord method returns true, the while loop will break.
            while (!stop) {
                stop = readRecord();
                if (stop) {
                    break;
                }
                totStudents++;
            }
            average = totPerc / totStudents;
            displayAverage();
        }
        scanner1.close();
    }
    public static boolean readRecord() {
        boolean result;
        String name;
        String address;
        double percentage;
        String input;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter name (Enter ZZZ to stop):");
        name = scanner2.nextLine();

//        Checking Stop Conditions
        if (name.equalsIgnoreCase("ZZZ")) {
            result = true;
        } else {
            System.out.println("Enter address:");
            address = scanner2.nextLine();
            System.out.println("Enter percentage:");
            input = scanner2.nextLine();
            percentage = Double.parseDouble(input);
            displayRecord(name, address, percentage);
            totPerc += percentage;
            result = false;
        }
        return result;
    }

    public static void displayRecord(String name, String address, double percentage) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Percentage: " + percentage);
        System.out.println();
    }
    public static void displayAverage(){
        System.out.println("Average percentage: " + average);
    }

}
