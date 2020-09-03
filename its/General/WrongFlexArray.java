package its.General;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
/** This class implemants a flexible array of integers
 *  where the user can select the start and end index.
 *
 */
public class WrongFlexArray {
  // Here the variable "data"  is DECLARED
  // NO array is created! Thus data is null
  // at this point. We cannot DEFINE "data"
  // here because we do not know how long the
  // array schuld be.
  // Variable "data" stores the data.
  private int[] data;
  // these variables store the start and end index and the
  // length of the array
  private int startindex, endindex, length;

  public WrongFlexArray(int s, int e) {
   if(s > e){
     System.out.println("ERROR in FlexArray: Start index > end index");
   }
   else
   {
     startindex = s;
     endindex   = e;
     length     = endindex - startindex + 1;
     // In then next command the NEW LOCAL variable "data"
     // is defined. This one is DIFFEREND
     // from the one defined before the constructor!
     // The latter one is still NULL.
     // null but it references an integer array.
     int[] data = new int[length];
    }//if

    // When the constructor is finished the
    // LOCAL variable "data" is destroyed.

  }//constructor

  /** the next method id private because noone outside
   *  the class needs to know the details of the implementation.
   *  It transforms an index c in the range
   *  [startindex,endindex] into one in the
   *  range [0,length-1]. It also checks if c is legal.
   */

   private int indexingFunction(int c){
    int result = -1;
    if((c < startindex) || (c > endindex)){
      System.out.println("ERROR in FlexArray: Illegal index: "+c
                          +" not in ["+startindex+","+endindex+"]");
    }
    else
    {
      result = c - startindex;
    }//if

    return(result);
   }

   /** This method sets array position  c  to val.
    *  The check that  c  is a legal position
    *  is done by method "indexingFunction".
    */

    public void setValue(int c, int val)
    {
      data[indexingFunction(c)] = val;
    }//method

  /** This method returns the value at array
   *  position c.
   *  The check that  c  is a legal position
   *  is done by method "indexingFunction".
   */

    public int getValue(int c)
    {
      return(data[indexingFunction(c)]);
    }//method

   /** This method returnd the size of the
    *  array, i.e. its length.
    */
    public int size(){
      return(length);
    }
}