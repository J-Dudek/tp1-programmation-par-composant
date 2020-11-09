package progcomposant.tp.tp1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final String ADDRESSE="Gestion des Adresses.";
    public static final String CLIENT="Gestion des Clients.";
    public static final String CONCESSIONNAIRE="Gestion des Concessionnaires.";
    public static final String MARQUE="Gestion des Marques.";
    public static final String TRANSACTION="Gestion des Transactions.";
    public static final String VOITURE="Gestion des Voitures.";
    public static final String INFOSBDD="Informations sur la BDD.";
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("progcomposant.tp.tp1.controller"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag(ADDRESSE,"Permet d'effectuer diverses actions sur la table adresse."))
                .tags(new Tag(CLIENT,"Permet d'effectuer diverses actions sur la table Client."))
                .tags(new Tag(CONCESSIONNAIRE,"Permet d'effectuer diverses actions sur la table concessionnaire."))
                .tags(new Tag(MARQUE,"Permet d'effectuer diverses actions sur la table marque."))
                .tags(new Tag(TRANSACTION,"Permet d'effectuer des transactions entre divers entités."))
                .tags(new Tag(VOITURE,"Permet d'effectuer diverses actions sur la table voiture."))
                .tags(new Tag(INFOSBDD,"Permet d'obtenir des infos sur la BDD, très pratique après l'utilisation des autres manager."))
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("TP1").version("0.0.3-SNAPSHOT").build();
    }
}