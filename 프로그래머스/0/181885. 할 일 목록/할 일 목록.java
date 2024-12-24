import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 아직 완료되지 않은 작업들을 저장할 리스트
        List<String> unfinishedTasks = new ArrayList<>();

        // todo_list와 finished를 순회하며 작업 추가
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) { // 완료되지 않은 경우
                unfinishedTasks.add(todo_list[i]);
            }
        }

        // 리스트를 배열로 변환하여 반환
        return unfinishedTasks.toArray(new String[0]);
    }
}