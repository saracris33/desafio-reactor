package br.com.dio.desafioreactor;

import java.util.List;

import reactor.core.publisher.Mono;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
    	return Mono.justOrEmpty(users.stream()
    		                .filter(userAdmin -> Boolean.TRUE.equals(userAdmin.isAdmin()))
    		                .count());
    }

}
