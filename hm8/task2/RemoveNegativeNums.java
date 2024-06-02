package org.example.lesson8.hm8.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveNegativeNums {
//    Напишите метод, который принимает на вход набор (Set)
//    целых чисел и удаляющий из этого набора все отрицательные числа
//    (порядок не важен).
//Например: {-1, 12,3,4,-8,-2} -> {4, 12, 3, 8}

    public static Set<Integer> removeNegatives(Set<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(
                Arrays.asList(
                        -1, 12, 3, 4,
                        -8, -2
                )
        );

        System.out.println("Original nums: " + nums);

        System.out.println("Without negative nums: " + removeNegatives(nums));

    }

}
