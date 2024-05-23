# Programme de gestion d’une pâtisserie

Ce projet est une application Java qui permet de gérer une pâtisserie. Il offre des fonctionnalités pour créer des produits, vérifier leur validité et leur possibilité de consommation, et si les produits sont valides, imprimer une étiquette pour eux.

## Auteur

Evgenii Morgunov

## Version Java

Java 21

## Dépôt GitHub

Le code source du projet est disponible sur GitHub à l'adresse suivante : [Programme de gestion d’une pâtisserie](https://github.com/MorgunovE/Programme-de-gestion-une-patisserie)

## Fonctionnalités

- Création de produits
- Vérification de la validité des produits
- Vérification de la possibilité de consommation des produits
- Impression d'étiquettes pour les produits valides

## Structure du Projet

Le projet est structuré en plusieurs packages et classes. Les classes de produits sont situées dans le package `Components.Produit.Produits` et les interfaces de catégories de produits sont situées dans le package `Components.Produit.Category`. La classe `EntrepriseEtiquetage` qui gère l'étiquetage des produits est située dans le package `Components.Entreprise`.

## Compiler le projet

Pour compiler le projet, ouvrez un terminal à la racine du projet et exécutez la commande suivante :

```bash
javac src/Main.java
```

## Exécuter le projet

Pour exécuter le projet, ouvrez un terminal à la racine du projet et exécutez la commande suivante :

```bash
java src/Main
```

## Simulation de scénarios

Le fichier `Main.java` contient des scénarios de simulation pour tester les fonctionnalités du projet. Ces scénarios incluent la création de produits valides et invalides, la vérification de leur validité et de leur possibilité de consommation, et l'impression d'étiquettes pour les produits valides.

## Vérification

La vérification de la validité et de la possibilité de consommation des produits est effectuée en utilisant les méthodes `estConsommable()` et `verifierEtat()` des interfaces `Perissable` et `Refrigerable`.

## Licence

Ce projet est sous licence MIT.

## Contact

Si vous avez des questions ou des commentaires, n'hésitez pas à me contacter.