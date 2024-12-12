package Class16;

public class FindIndexOFTargetNum {
    public static void main(String[] args) {

        int marks[] = {91, 92, 100, 95, 96};
        int target = 195;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] == target) {
                System.out.println(i);
            }
        }


    }

}
