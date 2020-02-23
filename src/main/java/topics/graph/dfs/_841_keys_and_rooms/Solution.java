package topics.graph.dfs._841_keys_and_rooms;



import java.util.*;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Stack<Integer> canVisitRoomKeys = new Stack<Integer>();
        Set<Integer> haveVisitRooms = new HashSet<Integer>();

        canVisitRoomKeys.add(0);

        while (!canVisitRoomKeys.isEmpty()) {

            Integer roomKey = canVisitRoomKeys.pop();

            haveVisitRooms.add(roomKey);
            List<Integer> keys = rooms.get(roomKey);
            for (Integer key : keys) {
                if (!haveVisitRooms.contains(key))
                canVisitRoomKeys.add(key);
            }
        }
        for (int i = 0; i < rooms.size(); i++) {
            if (haveVisitRooms.add(i)) return false;
        }
        return true;
    }
}
