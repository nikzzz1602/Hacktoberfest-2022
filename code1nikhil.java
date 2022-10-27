import java.util.Scanner;

public class Calculator { int a, b, c, ch; Scanner sc = new Scanner(System.in);
void set() {
    System.out.print("Enter the value of a , b");
    a = sc.nextInt();
    b = sc.nextInt();
}

void cal() {
    System.out.println("press 1 for add");
    System.out.println("press 2 for sub ");
    System.out.println("press 3 for multiply");
    System.out.println("Press 4 for divide");
    ch = sc.nextInt();

    switch (ch) {
        case 1:
            c = a + b;
            System.out.println("Value of add = " + a + b);
            break;
        case 2:
            c = a - b;
            System.out.println("Value of sub = " + c);
        case 3:
            // c = a*b ;
            System.out.println("value of multiply = " + a * b);

            break;
        case 4:
            c = a / b;
            System.out.println("Value of divide =  " + c);
            break;
        default:
            System.out.println("Output is wrong");
            break;
    }
}

public static void main(String[] arg) {
    Calculator ob = new Calculator();
    ob.set();
    ob.cal();
}
}

//OUTPUT
//Enter the value of a,b 2,4

//press 1 for add

//press 2 for sub

//press 3 for multiply Press 4 for divide

//1

//Value of add = 24

