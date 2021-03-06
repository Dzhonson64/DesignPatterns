package com.company;

/* Определяем абстрактную фабрику, которая будет реализовываться субклассами для создания разных продуктов */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
