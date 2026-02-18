public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3};

        boolean[] visited = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(numbers[i] + " occurs " + count + " times");
        }
    }
}
