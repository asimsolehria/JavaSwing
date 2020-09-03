package its.Trees;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.File;

public class DirectoryTree extends JTree {

   private DefaultTreeModel directoryTreeModel;
   //The following path might have to be changed.
   private  String startDir = "./its";
   private File startFile;

  public DirectoryTree() {
    startFile = new File(startDir);
    recursion(startFile);
    this.setModel(directoryTreeModel);
  }

  public DefaultMutableTreeNode recursion(File currentFile)
   {
    DefaultMutableTreeNode curNode =
         new DefaultMutableTreeNode(currentFile.getName());
    if(currentFile == startFile)
    {
      directoryTreeModel = new DefaultTreeModel(curNode);
     }
    if(currentFile.isDirectory())
     {
      File[] files = currentFile.listFiles();
       for (int i = 0; i < files.length; i++) {
          directoryTreeModel.insertNodeInto(recursion(files[i]),curNode,0);

       }//for i
      }
      return(curNode);
     }
}