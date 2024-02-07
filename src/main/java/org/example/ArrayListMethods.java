package org.example;

/**
 * Интерфейс описывает методы динамического массива
 *
 * @author Alexandr Titiov
 * @version 1.0
 */
public interface ArrayListMethods<T> {

    /**
     * Добавляет элемент в конец списка.
     *
     * @param element - элемент для добавления
     */
    void addElement(T element);

    /**
     * Дабавляет элемент в указанный индекс, смещая остальные элементы
     *
     * @param index   - индекс ячейки для добавления
     * @param element - элемент для в ставки в определенный индекс
     */
    void addIndexElement(int index, T element);

    /**
     * Позволяет получить элемент по индексу
     *
     * @param index - индекс выбранной ячейки
     * @return - возвращает выбранный элемент
     */
    T getIndexElement(int index);


    /**
     * Позволяет получить весь массив значений.
     *
     * @return - все элементы списка
     */
    Object[] getAllElements();

    /**
     * Позволяет удалить элемент списка
     *
     * @param element - элемент списка
     */
    boolean deleteElement(T element);

    /**
     * Возвращает размер динамического массива
     *
     * @return - размер динамического масива
     */
    int size();

    /**
     * Позволяет полностью очистить все элементы списка
     */
    void clear();


}
