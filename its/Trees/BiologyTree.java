package its.Trees;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class BiologyTree extends JTree {

  private DefaultTreeModel biologyTreeModel;

  public BiologyTree(){
     makeModel();
     this.setModel(biologyTreeModel);
     this.putClientProperty("JTree.lineStyle","Angled");
  }

  private void makeModel(){
    DefaultMutableTreeNode root    = new DefaultMutableTreeNode("Trees");
    DefaultMutableTreeNode leaved  = new DefaultMutableTreeNode("Leaved Trees");
    DefaultMutableTreeNode conifer = new DefaultMutableTreeNode("Conifers");
    DefaultMutableTreeNode beech   = new DefaultMutableTreeNode("Beech");
    DefaultMutableTreeNode oak     = new DefaultMutableTreeNode("Oak");
    DefaultMutableTreeNode birch   = new DefaultMutableTreeNode("Birch");
    DefaultMutableTreeNode pine    = new DefaultMutableTreeNode("Pine");
    DefaultMutableTreeNode fir     = new DefaultMutableTreeNode("Fir");
    DefaultMutableTreeNode beechR  = new DefaultMutableTreeNode("Red Leaved");
    DefaultMutableTreeNode beechG  = new DefaultMutableTreeNode("Green Leaved");

    biologyTreeModel = new  DefaultTreeModel(root);
    biologyTreeModel.insertNodeInto(leaved ,root   ,0);
    biologyTreeModel.insertNodeInto(conifer,root   ,1);
    biologyTreeModel.insertNodeInto(beech  ,leaved ,0);
    biologyTreeModel.insertNodeInto(oak    ,leaved ,1);
    biologyTreeModel.insertNodeInto(birch  ,leaved ,1);
    biologyTreeModel.insertNodeInto(pine   ,conifer,0);
    biologyTreeModel.insertNodeInto(fir    ,conifer,1);
    biologyTreeModel.insertNodeInto(beechR ,beech  ,0);
    biologyTreeModel.insertNodeInto(beechG ,beech  ,1);
  }
}