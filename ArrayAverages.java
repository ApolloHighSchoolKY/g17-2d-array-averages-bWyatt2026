import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray)
  {
    ray = rayray;
  }

  public void rowAverages()
  {
    int rowAverages = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        rowAverages += ray[row][col];
      }
      rowAverages /= ray[row].length;
      System.out.println("The Average for row " + row + " is: " + rowAverages);
      rowAverages = 0;
    }
  }

  public void columnAverages()
  {
    //Column major order
    // take each column and go through all of the rows
    // top down and left to right

    int colAverages = 0;
    for(int col = 0; col<ray.length; col++)
    {
      for(int row = 0; row<ray[col].length; row++)
      {
        colAverages += ray[row][col];
      }
      colAverages /= ray[col].length;
      System.out.println("The Average for col " + col + " is: " + colAverages);
      colAverages = 0;
    }
  }

  public void arrayAverage()
  { 
    int rayAverage = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        rayAverage += ray[row][col];
      }
      
    }
    rayAverage /= ray.length;
    System.out.println("The Average for the array is: " + rayAverage);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    
    return "";

  }
}
