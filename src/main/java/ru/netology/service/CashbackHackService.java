package ru.netology.service;

public class CashbackHackService {
    private final int sumLimit = 1000;

    public int sumLeft(int totalSum) {
        return sumLimit - totalSum % sumLimit; // зачем нам остаток от деления и почему мы его вычитаем?
    }
}
