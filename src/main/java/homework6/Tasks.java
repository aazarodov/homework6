package homework6;

public class Tasks {
    public Integer[] task1 (Integer[] array) throws RuntimeException {
        Integer[] result = null;
        int maxIndex = -1;
        if (array != null && array.length > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i].equals(4)) {
                    maxIndex = i + 1;
                    break;
                }
            }
        }
        if (maxIndex == -1) {
            throw new RuntimeException("Массив пустой или число '4' отсутствует в массиве!");
        } else {
            result = new Integer[array.length - maxIndex];
            System.arraycopy(array, maxIndex, result, 0, result.length);
        }
        return result;
    }

    public boolean task2(Integer[] array) {
        boolean containsFour = false, containsOne = false, containsOther = false;
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(1))
                    containsOne = true;
                else if (array[i].equals(4))
                    containsFour = true;
                else {
                    containsOther = true;
                    break;
                }
            }
        }
        return containsOne && containsFour && !containsOther;
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(new Tasks().task1(new Integer[]{})));
        //System.out.println(new Tasks().task1(new Integer[]{1, 2, 3}));
    }
}
