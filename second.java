import java.util.Scanner;
class Student_Grade{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the five subjects marks:");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int n3=input.nextInt();
        int n4=input.nextInt();
        int n5=input.nextInt();
        int total=n1+n2+n3+n4+n5;
        float per=total/5;
        System.out.println("Total Marks:" +total);
        System.out.println("Percentage:" +per);
        if(per>=90){
            System.out.println("Grade A");

        }
        else if(per>=80){
            System.out.println("Grade B");
        }
        else if(per>=70){
            System.out.println("Grade C");
        }
        else if(per>=60){
            System.out.println("Grade D");
        } else if(per>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
        

        
        


    }
}