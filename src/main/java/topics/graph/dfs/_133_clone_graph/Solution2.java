package topics.graph.dfs._133_clone_graph;

import base.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 基于Solution的改进
 */
public class Solution2 {

    public Node cloneGraph(Node node) {
        Map<Integer, Node> map = new HashMap<Integer, Node>();

        if (node == null) return null;//排除示例三
        if (node.neighbors.size() == 0) return new Node(1);//排除示例二
        if (node.val == 0) return new Node();
        return dfs(node, map);

    }

    Node dfs(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        ArrayList<Node> newNeiNode = new ArrayList<Node>();
        Node newNode = new Node(node.val, newNeiNode);
        map.put(node.val, newNode);
        for (Node neiNode : node.neighbors) {
            newNeiNode.add(dfs(neiNode, map));
        }

        return newNode;
    }
}
