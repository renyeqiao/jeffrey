package org.jeffrey.function;

@FunctionalInterface
public interface Invoker<T> {

    T accept(String a, String b, String c);

}
