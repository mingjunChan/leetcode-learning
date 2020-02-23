package topics.graph.dfs;

import base.Node;
import base.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestData {

    public static TreeNode creatTreeNode() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;

        return treeNode1;

    }

    public static int[] creatArray() {
        return new int[]{1, 1, 1, 1, 1};

    }

    public static Node createGraph() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        ArrayList<Node> nodes1 = new ArrayList<Node>();
        nodes1.add(node2);
        node1.neighbors = nodes1;
        ArrayList<Node> nodes2 = new ArrayList<Node>();
        nodes2.add(node1);
        node2.neighbors = nodes2;

        return node1;

    }

    public static Node createGraph(Integer[][] arrays) {

        if (arrays == null) {
            arrays = new Integer[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}};
        }
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        ArrayList<Node> nodes1 = new ArrayList<Node>();
        nodes1.add(node2);
        nodes1.add(node4);
        node1.neighbors = nodes1;
        ArrayList<Node> nodes2 = new ArrayList<Node>();
        nodes2.add(node1);
        node2.neighbors = nodes2;
        nodes2.add(node3);
        ArrayList<Node> nodes3 = new ArrayList<Node>();
        nodes3.add(node2);
        nodes3.add(node4);
        node3.neighbors = nodes3;
        ArrayList<Node> nodes4 = new ArrayList<Node>();
        nodes4.add(node1);
        nodes4.add(node3);
        node4.neighbors = nodes4;
        return node1;
    }

}
