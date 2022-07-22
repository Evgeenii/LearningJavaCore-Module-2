package lesson2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //Задача №1
        //Создать класс пользователей, каждый из которых будет иметь порядковый номер, и список с числами
        //С помощью stream api:

        // 4. У каждого пользователя заполнить список чисел: количество чисел в списке
        // определяется порядковым номером пользователя. Например: для пользователя с порядковым номером 5
        // генерируется пять случайных чисел используя переменную random ( в диапазоне до 10 ).
        // 5. Создать единый стрим со всеми числами из списков пользователей.
        // 6. Умножить числа на 10
        // 7. Посчитать сумму всех чисел с помощью reduce
        // 8. Вывести на экран
        // 9. В случае если integers пустой, то должно выводиться на экран "0"
        // Внимание! Все операции должны выполняться одной цепочкой integers.stream().map() ...
        // никаких переменных не должно появиться
        // Ожидаемый результат вывода на экран:
        // 1120 - из примера, 0 - при пустом листе

        List<Integer> integers = List.of(1,2,3,4,5,5,8,8,9);
        Random random = new Random(1);

        Integer integer = integers.stream()
                .filter(x -> x > 4)
                .distinct()
                .map(x -> new User(x, new ArrayList<>()))
                .peek(e -> e.setIntegerList(random.ints(e.getOrderNumber(), 0, 10)
                        .boxed().collect(Collectors.toList())))
                .flatMap(x -> x.getIntegerList().stream())
                .map(n -> n * 10)
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println("Результат: " + integer);

        //Задача №2
        // 1. Отсортировать список lists так, чтобы сначала были самые большие списки по размеру
        // 2. Вывести на экран все элементы
        // Ожидаемый результат: 3,4,5,1,2

        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of());

        lists.stream()
                .sorted((lis1, list2) -> list2.size() - lis1.size())
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        //Задача №3
        // 1. Узнать, есть ли в lists хотя бы один список, который содержит сумму всех элементов вложенного листа
        // равную 12

        boolean b = lists.stream()
                .anyMatch(x -> x.stream().reduce(Integer::sum).orElse(0) == 12);
        System.out.println("Результат: " + b);


    }
}
