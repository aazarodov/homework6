package homework6;

public class Tasks {
    /**
     * Написать метод, которому в качестве аргумента передается не пустой одномерный
     * целочисленный массив, метод должен вернуть новый массив, который получен путем
     * вытаскивания элементов из исходного массива, идущих после последней четверки. Входной
     * массив должен содержать хотя бы одну четверку, в противном случае в методе необходимо
     * выбросить RuntimeException.
     * Написать набор тестов для этого метода (варианта 3-4 входных данных)
     * вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]
     * @param array
     * @return
     * @throws RuntimeException
     */
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

    /**
     * Написать метод, который проверяет что массив состоит только из чисел 1 и 4. Если в массиве
     * нет хоть одной 4 или 1, то метод вернет false;
     * Написать набор тестов для этого метода (варианта 3-4 входных данных)
     * @param array
     * @return
     */
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
