package org.opendevup;

import java.util.stream.Stream;

import org.opendevup.dao.SocieteRepository;
import org.opendevup.entities.Societe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BoursSocieteServiceApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BoursSocieteServiceApplication.class);
        SocieteRepository scRepo = ctx.getBean(SocieteRepository.class);
        
        Stream.of("A,B,C").forEach(s -> scRepo.save(new Societe(s)));
        //test
        System.out.println("trace");
        scRepo.findAll().forEach(s -> System.out.println( s.getNomSociete()));
        
	}
}
