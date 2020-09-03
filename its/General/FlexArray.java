package its.General;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
/** This class implements a flexible array of integers
 *  where the user can select the start and end index.
 *
 */
public class FlexArray {
  // Here the variable "data"  is DECLARED
  // NO array is created! Thus data is null
  // at this point. We cannot DEFINE "data"
  // here because we do not know how long the
  // array should be.
  // Variable "data" stores the data.
  private int[] data;
  // these variables store the start and end index and the
  // length of the array
  private int startindex, endindex, length;

  public FlexArray(int s, int e) {
   if(s > e){
     System.out.println("ERROR in FlexArray: Start index > end index");
   }
   else
   {
     startindex = s;
     endindex   = e;
     length     = endindex - startindex + 1;
     // In the next command the variable "data"
     // is defined. We now know how long the
     // array has to be. Then "data" is no longer
     // null but it references an integer array.
     data = new int[length];
    }//if
  }//constructor

  /** the next method is private because none outside
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
      if(indexOK(c)){
        data[indexingFunction(c)] = val;
      }
    }//method

  /** This method returns the value at array
   *  position c.
   *  The check that  c  is a legal position
   *  is done by method "indexingFunction".
   */
    public int getValue(int c) {
      if(indexOK(c)){
       return(data[indexingFunction(c)]);
      }
      else{
        return(0);
      }
    }//method

   /** This method returns the size of the
    *  array, i.e. its length.
    */
    public int size(){
      return(length);
    }
    /** Checks wether an index is legal */
    private boolean indexOK(int i){
      if((i >= startindex) && ( i <= endindex)){
        return(true);
      }
      else{
        System.out.println("ERROR in FlexArray: Index out of bounds.");
        return(false);
      }
    }
}