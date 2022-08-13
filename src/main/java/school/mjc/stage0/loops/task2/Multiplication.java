package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive == 0)
            System.out.print("");
        else {
            int i = 0;
            long res;
            while (i <= Math.abs(multiplyByAndToInclusive)) {
                res = i * multiplyByAndToInclusive;
                System.out.println(res);
                i++;
            }
        }
    }
}
