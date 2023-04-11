package ru.netology.service;

public class CashbackHackService {
    private final int sumLimit = 1000;

    public int sumLeft(int totalSum) {
        return sumLimit - totalSum % sumLimit; /** Где хоть одно условие, проверяемое перед вычислениями?
         С другой стороны, нет бранчей - значит, и насчёт покрытия чесаться не надо */
    }
}
