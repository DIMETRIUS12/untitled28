package ru.netology.untitled28.services;

public class CountService {
    public long calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { //отдыхаем.
                count++; // увеличиваем счётчик месяцев отдыха.
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }

        return count;

    }
}
