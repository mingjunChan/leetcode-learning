package topics.graph.bfs._752_open_the_lock;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.util.*;

public class Solution {

    public int openLock(String[] deadends, String target) {
        int result = 0;//存放返回的最终结果
        int step = -1;//计算用的存放步长
        Queue<String> queue = new LinkedList<String>();//辅助用的队列
        Set<String> isVisited = new HashSet<String>();//存放已读的数字
        Set<String> dead = new HashSet<String>(Arrays.asList(deadends));//死亡数组转换成队列方便使用
        isVisited.addAll(dead);
        if (dead.contains("0000") || dead.contains(target)) return -1;
        //if ("0000".equals(target)) return 0;
        queue.add("0000");
        isVisited.add("0000");
        while (!queue.isEmpty()) {
            step++;
        int size = queue.size();
            for (int j = 0; j < size; j++) {
                String font = queue.remove();
                if (font.equals(target)){
                    return step;
                }

                for (int i = 0; i < 4; i++) {
                    StringBuilder fontBuilder = new StringBuilder(font);
                    char temp = fontBuilder.charAt(i);
                    fontBuilder.setCharAt(i, (char) (temp == '9' ? '0' : temp + 1));
                    if (isVisited.add(fontBuilder.toString())) {
                        queue.add(fontBuilder.toString());
                    }
                    fontBuilder.setCharAt(i, (char) (temp == '0' ? '9' : temp - 1));
                    if (isVisited.add(fontBuilder.toString())) {
                        queue.add(fontBuilder.toString());
                    }
                }
            }

        }


        return -1;

    }

}
