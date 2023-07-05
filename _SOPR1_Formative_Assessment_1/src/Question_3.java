import java.util.Scanner;
public class Question_3 {

    public static void main(String[] args) {
        int totLuxury = 0;
        int totCommercial=0;
        int totSedan =0;
        int type;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car types (1: Luxury, 2: Commercial, 3: Sedan, 0:Exit):");
        type=scanner.nextInt();

        while(type!=0){

            if(type==1){
                totLuxury++;
            } else if (type==2) {
                totCommercial++;
            } else if (type==3) {
                totSedan++;
            }
            type=scanner.nextInt();
        }
        System.out.println("Total luxury: "+totLuxury);
        System.out.println("Total commercial: "+totCommercial);
        System.out.println("Total sedan: "+totSedan);

    }
}
