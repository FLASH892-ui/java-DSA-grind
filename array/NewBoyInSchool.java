import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static int[] NewBoyInSchool(int n, int m, int[] chirag, int[] divyanshu) {
        int[] smallArray = (n < m) ? chirag : divyanshu;
        int[] bigArray = (n < m) ? divyanshu : chirag;
        HashSet<Integer> set = new HashSet<>();
        for (int toy : smallArray) {
            set.add(toy);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int toy : bigArray) {
            if (set.contains(toy)) {
                resultList.add(toy);
                set.remove(toy); 
            }
        }
        int[] answer = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++) answer[i] = resultList.get(i);
        Arrays.sort(answer);
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] chirag = new int[n];
        int[] divyanshu = new int[m];
        for (int i = 0; i < n; i++) {
            chirag[i] = scn.nextInt();
        }
        for (int i = 0; i < m; i++) {
            divyanshu[i] = scn.nextInt();
        }
        int[] ans = NewBoyInSchool(n,m,chirag,divyanshu);
        
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
