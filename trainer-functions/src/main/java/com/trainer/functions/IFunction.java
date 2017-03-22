package com.trainer.functions;

/**
 * abstract function interface
 * @param <T> input
 * @param <R> output
 */
public interface IFunction<T, R> {

  R func(T t);

}
