package lesson3;

//Задача №1
//1. Создать класс User, с двумя атрибутами - int age, String name
//2. Создать экземпляр класса HashSet<User>
//3. Переопределить hashcode и equals у User так, чтобы при записи в HashSet, были только уникальные name юзера

//Задача №2
//1. Создать класс UserBroken, с двумя атрибутами - int age, String name
//2. Создать экземпляр класса HashSet<UserBroken>
//3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
// в hashSet всегда оставался один юзер, который последний был вставлен

//Задача №3
//1. Создать класс CarBroken
//2. Создать экземпляра класса HashMap<CarBroken, Integer>
//3. Переопределить hashcode и equals так, чтобы при вставке любого CarBroken в HashMap,
//всегда CarBroken попадал в один бакет.

//Задача №4
//1. Создать аннотацию GetMetaData, которая может быть над атрибутом, методом, классом
//2. Создать класс UserMeta, с атрибутом String name, int count, методом GetSuperName(String prefix)
//3. Создать обработчик аннотации GetMetaData, так чтобы:
//3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса
//3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля
//3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод.
//4. Создаем класс Runner, запускаем

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class lesson3 {
    public static void main(String[] args) {

        //Задача №1

        User vasilii = new User(20, "Vasilii");
        User pyotr = new User(20, "Pyotr");
        User pyotr2 = new User(26, "Pyotr");

        HashSet<User> users = new HashSet<>() {{
            add(vasilii);
            add(pyotr);
            add(pyotr2);
        }};

        users.stream()
                .map(name-> name.getName())
                .forEach(System.out::println);

        //Задача №2

        UserBroken old = new UserBroken(44, "OLD");
        UserBroken young = new UserBroken(10, "YOUNG");

        HashSet<UserBroken> usersBrokenSet = new HashSet<UserBroken>(){{
            add(old);
            add(young);

        }};

        usersBrokenSet.stream()
                .map(user -> user.getName())
                .forEach(System.out::println);

        //Задача №3

        HashMap<CarBroken, Integer> carBrokenIntegerHashMap = new HashMap<CarBroken, Integer>();
        CarBroken carBroken = new CarBroken();
        CarBroken carBroken2 = new CarBroken();
        CarBroken carBroken3 = new CarBroken();

        carBrokenIntegerHashMap.put(carBroken,14);
        carBrokenIntegerHashMap.put(carBroken2, 13);
        carBrokenIntegerHashMap.put(carBroken3, 10);

        System.out.println(carBrokenIntegerHashMap);



    }
}
