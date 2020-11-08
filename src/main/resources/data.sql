insert into Marque(id,nom) values(1,'Opel');
insert into Marque(id,nom) values(2,'Audi');
insert into Marque(id,nom) values(3,'BMW');
insert into Marque(id,nom) values(4,'KIA');
insert into Marque(id,nom) values(5,'Majorette');

insert into Voiture(id,modele,couleur,option,marque_id) values(1,'Astra','Rouge','radar de recul',1);
insert into Voiture(id,modele,couleur,option,marque_id) values(2,'A6','Rose','de serie',2);
insert into Voiture(id,modele,couleur,option,marque_id) values(3,'Ceed','Gris','tapis en peau de mouton',4);
insert into Voiture(id,modele,couleur,option,marque_id) values(4,'720','Gris','logo tout neuf',3);
insert into Voiture(id,modele,couleur,option,marque_id) values(5,'Incassable','Rouge','system à friction',5);
insert into Voiture(id,modele,couleur,option,marque_id) values(6,'X5','Jaune','Lavage automatique',3);
insert into Voiture(id,modele,couleur,option,marque_id) values(7,'Corsa','Blanche','Roue de secours',1);


insert into Concessionnaire(id,nom) values(1,'Route 62');
insert into Concessionnaire(id,nom) values(2,'Les concessions aux 4 roues de France');
insert into Concessionnaire(id,nom) values(3,'Auto-route express');
insert into Concessionnaire(id,nom) values(4,'Planete Voitures');
insert into Concessionnaire(id,nom) values(5,'La vie en roue');

insert into Voiture(id,modele,couleur,option,marque_id) values(8,'Astra','Rouge','full',1);
insert into Voiture(id,modele,couleur,option,marque_id) values(9,'Q8','Noire','pare buffle en teck',2);
insert into Voiture(id,modele,couleur,option,marque_id) values(10,'Alpine F3','Rouille','griffée de partout',5);

insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(1,'40ter','rue de la pompe','porte bleue',62000,'Lacaune',1);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(2,'22','rue des taxes','pas trop',81230,'Lacaune',2);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(3,'110','rue de Paris','sous terrain',62000,'Lacaune',3);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(4,'26','rue de l ilot','bar',81230,'Lacaune',4);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(5,'15','rue de la panne','d essence evidemment',75000,'Lacaune',5);



insert into client(id,nom,prenom,mail) values(1,'Trompe','Donald','nosheat@usa.grr');
insert into client(id,nom,prenom,mail) values(2,'Verlaine','Paul','verlaine@paul.fr');
insert into client(id,nom,prenom,mail) values(3,'Roole','Pierre','last@home.today');
insert into client(id,nom,prenom,mail) values(4,'Sonne','Jacques','zara@tout.col');
insert into client(id,nom,prenom,mail) values(5,'Nice','Brice','train@lheure.reve');
insert into client(id,nom,prenom,mail) values(6,'De Lille','Celine','cel@lille.groland');
insert into client(id,nom,prenom,mail) values(7,'Atrile','Pauline','paul@pop.top');


insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(6,'12','rue du sillo','farine au sol',81230,'Lacaune',1);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(7,'14','rue nationale','il y en a toujours une',81230,'Lacaune',2);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(8,'66','impasse de la paix','malheuresement',81230,'Lacaune',3);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(9,'165 Bis','rue Pasteur','aucun',81230,'Lacaune',4);
insert into Adresse(id,numero,rue,complement,codePostal,ville,id_concessionnaire) values(10,'37 b','Boulevard P & M Curie','vaccin',81230,'Lacaune',5);

insert into client(id,nom,prenom,mail) values(8,'Batté','Anne','yep@yop.mwouarf');
insert into client(id,nom,prenom,mail) values(9,'Lopa','Mauricette','heure@horloge.com');
insert into client(id,nom,prenom,mail) values(10,'Hants','SIlvie','voituret@essence.verte');

insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(1,1);
insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(1,2);
insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(1,3);
insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(3,3);
insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(4,4);
insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(3,5);
insert into concessionnaire_marques ( concessionnaire_id , marque_id ) values(2,1);