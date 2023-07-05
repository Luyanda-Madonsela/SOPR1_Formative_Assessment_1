import java.util.Scanner;

public class Main {

    public static double totPerc = 0;
    public static double average = 0;
    public static int totStudents = 0;

    public static void main(String[] args) {
        String name;
        String address;
        double percentage;
        boolean stop;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter student details (Enter ZZZ to stop):");
        name = scanner1.nextLine();

        if(name.equalsIgnoreCase("ZZZ")){
            displayAverage();
        }
        else {
            System.out.println("Enter address:");
            address = scanner1.nextLine();
            System.out.println("Enter percentage:");
            percentage = scanner1.nextDouble();

            displayRecord(name, address, percentage);
            totPerc += percentage;
            totStudents++;

            stop = false;

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
        
    }

    public static void displayAverage(){
        System.out.println("Average percentage: " + average);
    }

    public static boolean readRecord() {
        String name;
        String address;
        double percentage;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter name (Enter ZZZ to stop):");
        name = scanner2.nextLine();

        if (name.equalsIgnoreCase("ZZZ")) {
            return true;
        } else {
            System.out.println("Enter address:");
            address = scanner2.nextLine();
            System.out.println("Enter percentage:");
            percentage = scanner2.nextDouble();

            displayRecord(name, address, percentage);
            totPerc += percentage;
            return false;
        }
    }

    public static void displayRecord(String name, String address, double percentage) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Percentage: " + percentage);
        System.out.println();
    }
}
