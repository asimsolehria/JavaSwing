package its.ReferenceDemo;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class References {
  public static void main(String[] args) {

    System.out.println("NON-objects: integers.");
    int a = 3;
    int b = 4;

    System.out.println("Value a = "+ a);
    System.out.println("Value b = "+ b);

    a = b;
    System.out.println("Statement a = b  executed. ");

    System.out.println("Value a = "+ a);
    System.out.println("Value b = "+ b);

    b = 7;
    System.out.println("Statement b = 7  executed (new value for b). ");

    System.out.println("Value a = "+ a);
    System.out.println("Value b = "+ b);


    System.out.println("\n\n Objects: Arrays");

 int[] A = {1,3};
 int[] B = {1,4};

 System.out.println("Value A[1] = "+ A[1]);
 System.out.println("Value B[1] = "+ B[1]);

 A = B;
 System.out.println("Statement A = B  executed. ");

 System.out.println("Value A[1] = "+ A[1]);
 System.out.println("Value B[1] = "+ B[1]);

 B[1] = 7;
 System.out.println("Statement B[1] = 7  executed (new value for B[1]). ");

 System.out.println("Value A[1] = "+ A[1]);
 System.out.println("Value B[1] = "+ B[1]);
  }

  }
