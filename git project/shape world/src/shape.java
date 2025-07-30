
import java.util.Scanner;

public class shape {
    int result;
    float result1;
    double result2;
    

    void rectanglearea(int length, int breadth) {

        result = length * breadth;
        System.out.println("The area of rectangle : " + result);
    }

    void rectangleperimeter(int length, int breadth) {
        result = 2 * (length + breadth);
        System.out.println("The Perimeter of rectangle : " + result);
    }

    void squarearea(int side) {
        result = side * side;
        System.out.println("The Area of square : " + result);
    }

    void squareperimeter(int side) {
        result = 4 * side;
        System.out.println("The Perimeter of square : " + result);
    }

    void trianglearea(float base, float height) {
        result1 = 1 / 2 * base * height;
        System.out.println("The Area of triangle : " + result);
    }

    void triangleperimeter(float a, float b, float c) {
        result1 = a + b + c;
        System.out.println("The Perimeter of triangle : " + result1);
    }

    void circlearea(double radius) {
        result2 = 3.14 * (radius * radius);
        System.out.println("The Area of circle : " + result2);

    }
    void circleperimeter(double radius){
        result2 = 2 * 3.14 *radius ;
        System.out.printf("The Circumference of circle : %.2f",result2);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Welcome to the shape World ");

        
        
        while (true){
            System.out.println("\nChoose from the following option :");
            System.out.println("1.Square");
            System.out.println("2.Rectangle");
            System.out.println("3.Triangle");
            System.out.println("4.Circle");
            System.out.println("5.Exit\n");
            
            System.out.println("Enter any option (1 to 5)");
            int choice = input.nextInt();
            shape obj = new shape();
            System.out.println("\n");

         if (choice == 5){
            System.out.println("Exited Succesfully :");
            break;
        }
        System.out.println("Enter option");
                System.out.println("1.Area");
                System.out.println("2.Perimeter \n");
                int choose = input.nextInt();
        switch (choice){
            case 1:
                
                System.out.println("Enter Side value");
                int side = input.nextInt();

                if (choose == 1){
                    
                    obj.squarearea(side);
                    break;
                }
                
                if (choose == 2){
                    obj.squareperimeter(side);
                    break;
                }
                else {
                    System.out.println("Invalid option");
                    break;
                }

            case 2:
            System.out.println("Enter length : ");
            int length = input.nextInt();
            System.out.println("Now , Enter breadth : ");
            int breadth = input.nextInt();
                   if (choose == 1){

                    obj.rectanglearea(length, breadth);
                    break;
                   }
                   if (choose == 2){
                    obj.rectangleperimeter(length,breadth);
                    break;

                   }
                   else {
                    System.out.println("Invalid Option ");
                   }

                break;

            case 3:

                   if (choose == 1){

                      System.out.println("Enter base :");
                      float base = input.nextFloat();
                      System.out.println("Now , Enter height :");
                      float height = input.nextFloat();

                      obj.trianglearea(base, height);
                      break;
                    
                    }

                    if (choose == 2 ){
                        
                      System.out.println("Enter base :");
                      float base = input.nextFloat();
                      System.out.println("Now , Enter height :");
                      float height = input.nextFloat();
                      System.out.println("Now , Enter hypotenuse : ");
                      float hypotenuse = input.nextFloat();

                      obj.triangleperimeter(base, height, hypotenuse);
                      break;
                    }
                    else {
                        System.out.println("Invalid Option ");
                        break;
                    }

            case 4:
                
               
                 System.out.println("Enter Radius : ");
                 double radius = input.nextDouble();

                 if (choose == 1){
                    obj.circlearea(radius);
                    break;
                 }
                 if (choose == 2){
                    obj.circleperimeter(radius);
                    break;
                 }

                 else{
                    System.out.println("Invalid Option");
                 break;
                 }
             
                
            default:
                System.out.println("Invalid option -----");
                break;
        }
        
    }
}
}