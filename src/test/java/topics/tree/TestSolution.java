package topics.tree;

import apple.laf.JRSUIUtils;
import base.TreeNode;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;

public class TestSolution {

    @Test
    public void isVaildBSTreeNode() {

        Integer[] a = new Integer[]{1, 1};//fasle
        BSTree bsTree = new BSTree();
        TreeNode root = bsTree.createBSTree(a);
        System.out.println(bsTree.isValidBST(root));

    }

    @Test
    public void testCreateBSTree() {
        Integer[] a = new Integer[]{10, 5, 15, 3, 7, null, 18};
        BSTree bsTree = new BSTree();
        bsTree.createBSTree(a);

    }

}
