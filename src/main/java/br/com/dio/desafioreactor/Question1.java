package br.com.dio.desafioreactor;

import java.util.List;

import reactor.core.publisher.Flux;

public class Question1 {

    /*
    Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados
     */
    public Flux<Long> inc(final List<Long> numbers){
    	return Flux.fromIterable(numbers)
    			.log()
         .map(number -> number + 1);
    }

}
