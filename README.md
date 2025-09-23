# 📚 La Bibliothèque

**La Bibliothèque** est un projet full-stack réalisé dans le cadre de ma formation.  
L’objectif principal était de **valider les compétences de l’examen** en développant une application complète comprenant :  

- Un **back-end en Java (Spring Boot)** avec une **API RESTful** connectée à une base de données relationnelle (MySQL).  
- Un **front-end en React**, fonctionnel et responsive.  
- Une architecture structurée (contrôleurs, services, dépôts, sécurité JWT).  

Ce projet est avant tout **pédagogique** : il n’est pas destiné à la production, mais il démontre comment connecter un front et un back autour d’une base de données relationnelle.  

---

### 🎯 Objectifs du projet

- Construire une **API RESTful** avec Spring Boot.  
- Connecter l’API à une **base de données relationnelle (MySQL)**.  
- Développer un **front-end responsive** en React.  
- Implémenter une authentification avec **Spring Security + JWT**.  
- Mettre en place un projet full-stack de bout en bout.  

---

### 🛠️ Technologies utilisées

- **Back-end :**  
  - Java  
  - Spring Boot  
  - Spring Data JPA  
  - Spring Security (JWT)  

- **Front-end :**  
  - React.js  
  - HTML / CSS  

- **Base de données :**  
  - MySQL (via Docker Compose)  

- **Outils :**  
  - Docker  
  - Maven  
  - Postman  

---

### 📂 Structure du projet

```plaintext
Labibliotheque/
 ├── src/
 │   ├── main/
 │   │   ├── java/com.labibliotheque.la_bibliotheque
 │   │   │   ├── config/          # Configuration (app & sécurité)
 │   │   │   ├── controllers/     # Contrôleurs REST (API)
 │   │   │   ├── dto/             # Objets de transfert de données
 │   │   │   ├── jwt/             # Gestion JWT
 │   │   │   ├── mappers/         # Mapping Entité <-> DTO
 │   │   │   ├── repositories/    # Accès DB (JPA)
 │   │   │   ├── security/        # Sécurité (Spring Security)
 │   │   │   ├── services/        # Logique métier
 │   │   │   └── LaBibliothequeApplication.java # Point d’entrée
 │   │   └── resources/
 │   │       └── application.properties  # Config DB et serveur
 │   └── test/
 │       └── java/com.labibliotheque.la_bibliotheque
 │           ├── AuthorServiceTest.java
 │           └── LaBibliothequeApplicationTests.java
 ├── docker-mysql.yml   # Base MySQL via Docker
 ├── pom.xml            # Dépendances Maven
 └── README.md
🚀 Installation & Exécution
Cloner le projet

bash
Copier le code
git clone https://github.com/<ton-repo>/la-bibliotheque.git
cd la-bibliotheque
Lancer la base MySQL avec Docker

bash
Copier le code
docker-compose -f docker-mysql.yml up -d
Configurer la connexion à la base dans application.properties

properties
Copier le code
spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=root
spring.datasource.password=tonpassword
spring.jpa.hibernate.ddl-auto=update
Démarrer le back-end (Spring Boot)

bash
Copier le code
./mvnw spring-boot:run
Démarrer le front-end (React)

bash
Copier le code
cd frontend
npm install
npm start
🧠 Compétences acquises
Structuration d’un projet Spring Boot.

Création d’une API RESTful avec une base relationnelle.

Gestion de l’authentification avec JWT.

Développement d’un front-end responsive en React.

Exécution d’une base MySQL avec Docker Compose.

📌 Remarques
Ce projet a été réalisé dans un cadre pédagogique.
Il est volontairement simpliste et non destiné à la production, mais il montre l’ensemble du processus : API, base de données, front-end.
