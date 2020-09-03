package its.Dialogs;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DataTransferObject
{
  private String  searchWord;
  private boolean caseSensitive;
  private boolean search;

  public DataTransferObject()
  {
    searchWord = "";
    caseSensitive = true;
    search = true;
  }

  public void setAll(String w, boolean cs, boolean s)
   {
     searchWord = w;
     caseSensitive = cs;
     search = s;
   }

  public String getSerchWord()
  {
   return(searchWord);
  }

  public boolean getCaseSensitive()
  {
    return(caseSensitive);
  }

  public boolean getSearch()
  {
    return(search);
  }
}