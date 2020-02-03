package topics.graph.dfs._133_clone_graph;

import base.Node;

import java.util.*;

/**
 * 29ms
 * 36.5MB
 */
public class Solution {

    Map<Integer, Node> map = new HashMap<Integer, Node>();
    public Node cloneGraph(Node node) {

        if (node == null) return null;//排除示例三
        if (node.neighbors.size() == 0) return new Node(1);//排除示例二
        if (node.val==0) return new Node();
        return dfs(node);

    }

    Node dfs(Node node) {
        if (!map.containsKey(node.val)) {

            ArrayList<Node> newNeiNode = new ArrayList<Node>();
            Node newNode = new Node(node.val, newNeiNode);
            map.put(node.val, newNode);
            for (Node neiNode : node.neighbors) {
                newNeiNode.add(dfs(neiNode));
            }

            return newNode;
        } else {
            return map.get(node.val);
        }
    }
}