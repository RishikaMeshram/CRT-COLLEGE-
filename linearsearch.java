public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {25, 234, 56, 45, 41, 23, 44}; // use {} instead of []
        int target = 45;
        boolean flag = false; // use 'boolean' instead of 'bool'

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }

        if (flag) { // no need to write '== true'
            System.out.println("Target present");
        } else {
            System.out.println("Target absent");
        }
    }
}

