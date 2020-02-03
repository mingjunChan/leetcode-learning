package topics.graph.dfs;

import base.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestData {
    public static Node createGraph(){

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
