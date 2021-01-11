## Sujet
Créer un projet Spring-Boot (seul ou à deux)

**=== Vente de voiture ===**

#### Règles de gestion :

`-> Marque (1 - n) Voiture`

`-> Client (1 - n) Voiture`

`-> Concessionnaire ( n - n) Marque`

`-> Concessionnaire (1 - n) Adresse`

#### Créer un jeu de donnée : data.sql
- 5 marques
- 5 concessionnaires
- 5 adresses
- une dizaine de clients`
- une dizaine de voitures

## Consigne
Réaliser une api Rest avec SpringBoot.
Les divers attributs sont libres ainsi que les fonctionnalités possibles.

## Comment tester l'API ?
- `https://github.com/J-Dudek/tp1-programmation-par-composant.git`
- `gh repo clone J-Dudek/tp1-programmation-par-composant`
#### OU
- `docker run -it -p 8282:8282  julienm1/tp1:latest`
#### Ensuite ?
Après avoir lancé l'application :
- Se rendre sur http://localhost:8282/swagger-ui.html , vous aurez alors accès aux différentes fonctionnalités de l'API.

![alt Swagger](https://github.com/J-Dudek/tp1-programmation-par-composant/blob/main/src/main/resources/Swagger-ui.png "Swagger")
------------

Code réalisé avec IntelliJ en utilisant [Sonarlint](https://www.sonarlint.org/ "Sonarlint") pour la qualité du code..

CI avec  [circleci](https://circleci.com/ "circleci").
