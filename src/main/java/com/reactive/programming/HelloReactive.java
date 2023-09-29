package com.reactive.programming;

import reactor.core.publisher.Mono;

public class HelloReactive {
        public static void main(String[] args) {
            Mono<String> mono = Mono.just("Hello Reactive World!");
            mono.subscribe(System.out::println);
        }
}
