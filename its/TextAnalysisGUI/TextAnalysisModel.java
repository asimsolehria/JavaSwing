package its.TextAnalysisGUI;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextAnalysisModel {

  private int totalNumberOfEs;
  private int currentNumberOfEs;
  private int totalNumberOfTexts;
  private String currentText;

  public TextAnalysisModel() {
    totalNumberOfEs = 0;
    totalNumberOfTexts = 0;
    currentText = "";
  }

  public void analyse(String str){
    currentText = str.toUpperCase();
    currentNumberOfEs = 0;
    for (int i = 0; i < currentText.length(); i++) {
      if(currentText.charAt(i) == 'E'){
        currentNumberOfEs++;
      }//if
    }//for i
    totalNumberOfEs += currentNumberOfEs;
    totalNumberOfTexts++;
  }// analyse

  public int getCurrentNumberOfEs(){
    return(currentNumberOfEs);
  }

  public String getCurrentText(){
    return(currentText);
  }

  public int getTotalNumberOfEs(){
    return(totalNumberOfEs);
  }

  public int getTotalNumberOfTexts(){
     return(totalNumberOfTexts);
  }
}