import java.util.Scanner;     // Needed for Scanner class

/**
   Alex Waters id# 23598844
   1st project CSC 210 - 1701
   Comp. Prog. II 5:20PM - 7:35PM
   Fiterman Hall 906 
   Instructor: Alam Miah
   GeometricShapes Program Chapter 8 #1
   
   GeometricShapes
*/

public class GeometricShapes
{
   static Scanner keyboard = new Scanner(System.in);
   static CalculateArea show = new CalculateArea(0);
   
   /**
      main method
      @param args
   */
   
   public static void main(String[] args)
   {      
      // Welcome user to app.
      welcomeMessage();
      
      // Run loop until user chooses to finish.
      do{
      // Get users shape choice and pass
      // as argument to getUsersMeasurements.
      getUsersMeasurements(getUsersShape());
      
      // Return true or false if user has
      // another shape and wants to continue.
      }while(keepGoing());
      
      // Say goodBye and exit program.
      goodBye();
      System.exit(0);
   } 
    
   /**
      welcomeMessage method
      Displays greeting and instructions.
   */
      
   public static void welcomeMessage()
   {
      System.out.println("\n----------------------------------");
      System.out.println("\n\tArea of Geometric Shapes APP");
      System.out.println("\n----------------------------------");
      System.out.println("\nPick Circle, Rectangle, or");
      System.out.println("\n\t\tCylinder, and Enter\n");
      System.out.println("\tYour Measurements...");
      System.out.println("\n\t\tTo Get the\n\n\t\t <>AREA<>");
      System.out.println("\n\tCalculated for You\n");
   } 
   
   /**
      getUsersShape method
      @return usersShape Shape user chose to
                         give measurements for.
   */
   
   public static String getUsersShape()
   {
      String shape;  // Users shape
      
      // Display geometric shapes for user.
      System.out.println("Circle - Rectangle - Cylinder");
      
      do // loop until user enters correct input
      {
      // Get users shape choice.
      System.out.print("\nEnter Shape: ");
      shape = keyboard.next();
      
      // Check input for circle, rectangle,
      // or cylinder.
      }while(!(inputValidation(shape)));
      
      return shape;  // Return value
   }
   
   /**
      inputValidation method
      @param shape Users geometric shape.
      @return correct True if user enters
                      correct shapes.
   */
   
   public static boolean inputValidation(String shape)
   {
      boolean correct;  // Flag variable
      
      if(shape.equalsIgnoreCase("Circle"))
         correct = true;   // True if circle
      else
      if(shape.equalsIgnoreCase("Rectangle"))
         correct = true;   // True if Rectangle
      else
      if(shape.equalsIgnoreCase("Cylinder"))
         correct = true;   // True if Cylinder
      else
      {
         System.out.println("\n\t\tINVALID ENTRY:");
         System.out.println("\t\t\tEnter\nCircle, Rectangle, or Cylinder");
         correct = false;  // Invalid Entry if false
      }
      return correct;
   }
    
   /**
      getUsersMeasurements method gets users
      measurements and displays results.
      @param shape Shape user picked for measurements.
   */
      
   public static void getUsersMeasurements(String shape)
   {
      // Holds user measurements
      double length, width, height, area;         
      float radius;
      
      // Get users shape measurements
      if(shape.equalsIgnoreCase("Circle"))
      {
         // Get Radius of Circle.
         System.out.println("\n\t\t<>Circle<>\n");
         System.out.print("Enter Radius of Circle: ");
         radius = keyboard.nextFloat();
         
         // Display Area of Circle using percision.
         System.out.printf("\n\tArea: %,.2f inches", 
                            show.getArea(radius));
      }
      else
      if(shape.equalsIgnoreCase("Rectangle"))
      {
         // Get Length and Width of Rectangle.
         System.out.println("\n\t\t<>Rectangle<>");
         System.out.print("\nEnter Length of Rectangle: ");
         length = keyboard.nextDouble();
         System.out.print("\nEnter Width of Rectangle: ");
         width = keyboard.nextDouble();
         
         // Display Area of Rectangle using percision.
         System.out.printf("\n\tArea: %,.2f inches", 
                            show.getArea(length, width));
      }
      else
      if(shape.equalsIgnoreCase("Cylinder"))
      {
         // Get Radius and Height of Cylinder.
         System.out.println("\n\t\t<>Cylinder<>\n");
         System.out.print("Enter Radius of Cylinder: ");
         radius = keyboard.nextFloat();
         System.out.print("Enter Height of Cylinder: ");
         height = keyboard.nextDouble();
         
         // Display Area of Cylinder using percision.
         System.out.printf("\n\tArea: %,.2f inches", 
                            show.getArea(radius, height));
      }
      else
         System.out.println("Sorry Wrong Entry");
   } 
   
   /**
      goodBye method display thanks and
      bye message.
   */
   
   public static void goodBye()
   {
      System.out.println("\n\t\tLook forward to");
      System.out.println("\n\tSeeing you Again!!!");
      System.out.println("\n\n\t  <><>GoodBye<><>");
   }
   
   /**
      keepGoing method is for user input
      to keep entering in Geometric shapes.
      @return True if user wants to continue.
   */
   
   public static boolean keepGoing()
   {
      char anotherShape;   // Holds Choice to continue
      String input;        // Users input
      boolean go; // Flag variable
      
      // Ask user if he/she wishes to continue
      // and store results in anotherShape.
      System.out.println("\n\nDo You Have Another Shape That\n"); 
      System.out.print("You'd Like Calcuated (Y/N)? ");
      input = keyboard.next();
      anotherShape = input.charAt(0);
      System.out.println();

      // If anotherShape is equal to y
      // then user can continue in loop
      // from main.
      if(anotherShape == 'Y' ||
         anotherShape == 'y')
         go = true;  // True if letter is Y
      else
         go = false; // False if letter is N
      
      return go;
   }
} 