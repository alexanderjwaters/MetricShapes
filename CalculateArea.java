/**
   Alex Waters id# 23598844
   1st project CSC 210 - 1701
   Comp. Prog. II 5:20PM - 7:35PM
   Fiterman Hall 906 
   Instructor: Alam Miah
   CalculateArea Program Chapter 8 #1
   
   CalculateArea
*/

public class CalculateArea
{
   // Fields.
   private double length, width, height, area;
   
   private float radius; 
  
   /**
      Constructor
      @param radius For Circle.
   */
   
   public CalculateArea(float radius)
   {
      this.radius = radius;
   }
   
   /**
      Constructor
      @param length For Rectangle.
      @param width For Rectangle.
   */
   
   public CalculateArea(double length, double width)
   {
      this.length = length;
      this.width = width;
   }
   
   /**
      Constructor
      @param radius For Cylinder.
      @param height For Cylinder.
   */
   
   public CalculateArea(float radius, double height)
   {
      this.radius = radius;
      this.height = height;
   }
   
   /**
      Constructor
      @param object2 Makes copy of itself.
   */
   
   public CalculateArea(CalculateArea object2)
   {
      this.radius = object2.radius;
      this.length = object2.length;
      this.width = object2.width;
      this.height = object2.height;
   }
   
   /**
      setArea method
      @param radius For Circle.
   */
   
   public void setArea(float radius)
   {
      area = Math.PI * Math.pow(radius, 2);
   }
   
   /**
      setArea method
      @param length For Rectangle.
      @param width For Rectangle.
   */
   
   public void setArea(double length, double width)
   {
      area = width * length;
   }
   
   /**
      setArea method
      @param radius For Cylinder.
      @param height For Cylinder.
   */
   
   public void setArea(float radius, double height)
   {
      area = Math.PI * Math.pow(radius, 2) * height;
   }
   
   /**
      getArea method
      @return Area of Circle.
   */
   
   public double getArea()
   {
      return area;
   }
   
   /**
      getArea method
      @param radius For Circle.
      @return The sum of pi times radius to
              the second power.
   */
   
   public static double getArea(float radius)
   {
      return Math.PI * Math.pow(radius, 2);
   }
   
   /**
      getArea method
      @param length For Rectangle.
      @param width For Rectangle.
      @return The sum of length times width.
   */
   
   public static double getArea(double length, double width)
   {
      return length * width;
   }
   
   /**
      getArea method
      @param radius For Cylinder.
      @param height For Cylinder.
      @return The sum pi times radius to the 
              second power times height.
   */
   
   public static double getArea(float radius, double height)
   {
      return Math.PI * Math.pow(radius, 2) * height;
   }
   
   /**
      equals method compares object2 with
      itself to make sure they equal.
      @param object2 Copy of itself.
      @return status true if object equals.
   */
   
   public boolean equals(CalculateArea object2)
   {
      boolean status;
      
      // Determine whether the objects fields
      // are equal to object2's.
      if(area == object2.area)
         status = true;    // Yes, the objects equal.
      else
         status = false;   // No, the objects are not equal.
      
      return status;
   }
   
   /**
      toString method
      @return str An instance of fields are
                  displayed.
   */
   
   public String toString()
   {
      // str holds Area of shape.
      String str = "\n\nLength: " + length +
                   "\nWidth: " + width +
                   "\nRadius: " + radius +
                   "\nHeight: " + height +
                   "\nArea: " + area;
      
      return str; 
   }
}