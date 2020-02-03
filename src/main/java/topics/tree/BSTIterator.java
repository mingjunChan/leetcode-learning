package topics.tree;

import base.TreeNode;

//TODO
public class BSTIterator {

    TreeNode root = null;

    public BSTIterator(TreeNode root) {
        this.root = root;
    }

    /**
     * @return the next smallest number
     */
    public int next() {


        return 0;
    }

    private TreeNode nextNode(){
return null;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */