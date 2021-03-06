package com.design.patterns.action.strategy;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy1();
        Context context = new Context(strategy);
        context.doAnyThing();
    }
}
