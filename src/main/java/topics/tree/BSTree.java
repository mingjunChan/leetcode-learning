package topics.tree;

import annotation.topics.Recursion;
import base.TreeNode;


public class BSTree {

    //是否有效二叉搜索/排序树
    @Recursion
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        //传入初始值会导致等于初始值判断错误、根节点和左右子树相等判断错误的问题
        //return isVaildBSTreeNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return isVaildBSTreeNode(root, null, null);
    }

    private boolean isVaildBSTreeNode(TreeNode root, Integer minValue, Integer maxValue) {
        if (root == null) {
            return true;
        }
        if (minValue!=null&&root.val<=minValue) return false;
        if (maxValue!=null&&root.val>=maxValue) return false;

        return isVaildBSTreeNode(root.left, minValue, root.val) && isVaildBSTreeNode(root.right, root.val, maxValue);
    }

    //插入BSTree节点
    private TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    //创建BSTree
    public TreeNode createBSTree(Integer[] treeValue) {

        BSTree bsTree = new BSTree();
        TreeNode root = null;
        for (int i = 0; i < treeValue.length; i++) {
            if (treeValue[i] == null) continue;
            root = bsTree.insertIntoBST(root, treeValue[i]);
        }
        return root;
    }
}