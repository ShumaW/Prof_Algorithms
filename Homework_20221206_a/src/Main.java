import java.util.Arrays;

public class Main {

    /*
    First level:
    1. Реализовать динамический массив, который при добавлении элементов увеличивает свой
    размера в 2 раза, если места для добавления элемента оказывается недостаточно.

    У динамического массива должны быть следующие методы:

    add(int value): void | Добавляет элемент в конец

    addAt(int index, int value) : void | Добавляет элемент по индексу со сдвигом всех элементов
    начиная с текущего и до последнего на 1

    get(int index): int | Возвращает элемент по индексу

    remove(): void | Удаляет последний элемент

    removeAt(int index): void | Удаляет элемент по индексу

    set(int index, int value): void | Меняет значение элемента по индексу на указанное

    contains(int value): boolean | Проверяет, присутствует ли указанный элемент в списке

    size(): int | Возвращает размер списка

    clear(): void | Удаляет все элементы из списка, размер списка становится изначальным

    shrinkSize(): void | Уменьшает массив до размера, равного количеству элементов в нем
     */
    public static void main(String[] args) {

        NewArray arr = new NewArray();
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(47);
        arr.add(9);
        System.out.println(arr);
        System.out.println("-".repeat(50));
        arr.addAt(1, 12);
        arr.addAt(2, 112);
        arr.addAt(1, 222);
        arr.addAt(1, 300);
        System.out.println(arr);
        System.out.println("-".repeat(50));
        arr.remove();
        System.out.println(arr);
        System.out.println("-".repeat(50));
        arr.removeAt(0);
        System.out.println(arr);
        System.out.println("-".repeat(50));
        System.out.println(arr.get(1));
        System.out.println("-".repeat(50));
        arr.set(2,0);
        System.out.println(arr);
        System.out.println("-".repeat(50));
        System.out.println(arr.contains(232));
        System.out.println("-".repeat(50));
        arr.shrinkSize();
        System.out.println(arr);
        System.out.println("-".repeat(50));
        arr.clear();
        System.out.println(arr);

    }


}