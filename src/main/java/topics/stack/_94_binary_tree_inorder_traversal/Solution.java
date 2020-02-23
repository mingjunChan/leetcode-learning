package topics.stack._94_binary_tree_inorder_traversal;

import base.TreeNode;

import java.util.*;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
     //   Set<TreeNode> isVisited = new HashSet<TreeNode>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            results.add(node.val);
            node = node.right;
        }

        return results;
    }
}