# 🔌 Spring Dependency Injection Demo

## 📌 Description

Ce projet est une **démonstration simple de l’Injection de Dépendances (DI)** avec le framework Spring.

Il montre comment Spring gère automatiquement les dépendances entre les classes à l’aide des annotations, sans utiliser le mot-clé `new`.

---

## 🎯 Objectif

* Comprendre le fonctionnement de Spring DI
* Utiliser les annotations (`@Component`, `@Autowired`)
* Apprendre à découpler les classes
* Simplifier la gestion des objets

---

## 🛠️ Technologies utilisées

* Java
* Spring Framework (Core / Context)
* Maven

---

## 📁 Structure du projet

```id="ax29qp"
src/
 ├── main/
 │   ├── java/
 │   │   ├── service/
 │   │   ├── repository/
 │   │   ├── config/
 │   │   └── MainApp.java
 │   │
 │   └── resources/
 │
 └── pom.xml
```

---

## ⚙️ Fonctionnement

1. Spring démarre le contexte avec `ApplicationContext`
2. Il détecte les classes annotées avec `@Component`
3. Il crée automatiquement les objets (Beans)
4. Il injecte les dépendances avec `@Autowired`

---

## 💡 Exemple

### Service

```java id="p1x9qk"
@Component
public class MessageService {
    public void sendMessage() {
        System.out.println("Message envoyé !");
    }
}
```

---

### Classe principale

```java id="r3d7hk"
AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

MessageService service = context.getBean(MessageService.class);
service.sendMessage();
```

---

## 🔑 Annotations utilisées

| Annotation       | Description            |
| ---------------- | ---------------------- |
| `@Component`     | Déclare un Bean Spring |
| `@Autowired`     | Injection automatique  |
| `@Configuration` | Classe de config       |
| `@ComponentScan` | Scan des classes       |

---

## ▶️ Exécution

```bash id="z8m2vx"
mvn clean install
mvn exec:java
```

---

## ⚠️ Remarques

* Ne pas utiliser `new` pour les dépendances
* Laisser Spring gérer les objets
* Vérifier le scan des packages

---

## 🔧 Améliorations possibles

* Ajouter interfaces + implémentations
* Utiliser `@Service` et `@Repository`
* Migrer vers Spring Boot

---

## 👨‍💻 Auteur

* Med
