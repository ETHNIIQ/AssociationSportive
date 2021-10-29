package core.assoSportive;

import core.assoSportive.api.DAO.GymnaseRepository;
import core.assoSportive.api.model.Gymnase;
import core.assoSportive.api.model.Seance;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
//@EnableMongoRepositories(basePackages = "core.assoSportive.api.DAO")

@SpringBootApplication
public class AssoSportiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssoSportiveApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200")
						.allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS")
						.allowCredentials(true)
						.allowedHeaders("Origin", "Access-Control-Allow-Origin", "Content-Type",
								"Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
								"Access-Control-Request-Headers")
						.exposedHeaders("Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials");
			}
		};
	}


//	In order to test function if it's working, great alternative au front
//	will be launch at the same time than the application
/*	@Bean
	CommandLineRunner runner(GymnaseRepository repository, MongoTemplate mongoTemplate){
		return args -> {

			String ville = "Paris";
			String _id="566eec69662b388eba46429a";

//			--------------USING THIS CONSTUCTOR GENERATE MAPPING EXCEPTION ...--------------
//	because the field name of this constructor doesn't match the java object.... Pb solved in constructor method field name are the same as attibute name
			Seance seance= new Seance(
					5,
					"lundi",
					20,
					2,
					"something"
			);
			List<Seance> lsSeance= new ArrayList<Seance>();
			lsSeance.add(seance);
			Gymnase gymnase= new Gymnase(
					5,
					582,
					"VILLETANEUSE",
					"20 rue de la beaune",
					"ROSIER",
					lsSeance

					);

//			-----------------OPTION 1 (works)-------------------
//			repository.insert(gymnase);

//			-------------------OPTION 2 (errors //update error solved)----------------
			usingMongoTemplatesAndQuery(repository, mongoTemplate, ville, gymnase);
//			------------------OPTION 3 (error name first than to many ..) ----------------------
//			if the parameter value ville is found execute s->{}
//			else execute that ()->{}
//			repository.findGymnasesByVille(ville)
//					.ifPresentOrElse(s->{
//								System.out.println(s+"Il y a plus de 10 gymnases à villetaneuse");
//							},
//							()->{
//								System.out.println("La liste est vide car aucun element correspod au critère de recherche donnée dans ville");
//							});
		};
	}

	private void usingMongoTemplatesAndQuery(GymnaseRepository repository, MongoTemplate mongoTemplate, String ville, Gymnase gymnase) {
		Query query= new Query();
		query.addCriteria(Criteria.where("Ville").is(ville));
////			I have injected mongo template to execute the query upthere and I pass the result of this query to a java object here it's a List
		List<Gymnase> gymnasesAvilletaneuse = mongoTemplate.find(query,Gymnase.class);

		for(int i =0; i< gymnasesAvilletaneuse.size() ;i++){
			System.out.println(gymnasesAvilletaneuse.get(i));
		}
//
		if(gymnasesAvilletaneuse.size()>10){
			System.out.println("Il y a plus de 10 gymnases à villetaneuse");
		}

		if(gymnasesAvilletaneuse.isEmpty()){
			System.out.println("La liste est vide car aucun element correspod au critère de recherche donnée dans ville");
			repository.insert(gymnase);

		}
	}*/

}
