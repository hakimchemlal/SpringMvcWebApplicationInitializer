```markdown
# Spring MVC WebApplicationInitializer Demo Application
> Simple application Spring MVC avec Java-based configuration using WebApplicationInitializer

## 🚀 Configuration requise

* Java JDK 17+
* Apache Maven 3.9.9
* Apache Tomcat 10.1

## ⚙️ Installation

### Maven
1. Téléchargez Maven depuis [le site officiel](https://maven.apache.org/download.cgi)
2. Ajoutez Maven au PATH système
3. Vérifiez l'installation :
```bash
mvn -version
```

### Tomcat
1. Téléchargez Tomcat depuis [Apache Tomcat](https://tomcat.apache.org/download-80.cgi)
2. Décompressez l'archive dans le dossier de votre choix

## 📦 Déploiement

### Générer le WAR
```bash
mvn clean install
```

### Déployer sur Tomcat
1. Copiez le fichier `target/votre-app.war` dans `tomcat/webapps/`
2. Démarrez Tomcat :
   ```bash
   # Windows
   tomcat/bin/startup.bat
   
   # Linux/Mac
   tomcat/bin/startup.sh
   ```

### Accéder à l'application
Ouvrez votre navigateur et accédez à :
```
http://localhost:8080/nom-de-votre-app
```

## 🔍 Dépannage

### Vérification des logs
- Logs Tomcat : `tomcat/logs/catalina.out`
- Console Eclipse
- Vue "Servers" dans Eclipse

### Problèmes courants
Si l'application ne démarre pas :
- ✔️ Vérifier les logs Tomcat
- ✔️ Vérifier le déploiement du WAR
- ✔️ Vérifier la configuration du contexte

### Redéploiement
1. Arrêtez Tomcat
2. Supprimez :
   - L'ancien WAR de `webapps`
   - Le dossier déployé correspondant
3. Copiez le nouveau WAR
4. Redémarrez Tomcat

## 🛠️ Technologies
- Spring MVC
- Java-based configuration using WebApplicationInitializer
- Maven
- Tomcat

##  Explication

1. DSConfiguration (DispatcherServlet Configuration):
-Cette classe remplace le traditionnel web.xml
WebApplicationInitializer est détecté automatiquement par Spring
onStartup est appelé au démarrage de l'application
-Crée deux contextes Spring :
Root Context : pour les beans globaux (services, repositories)
Dispatcher Context : pour les beans MVC (controllers, viewResolver)
Configure le DispatcherServlet qui gère toutes les requêtes ("/*")

2. AppConfig (Configuration Spring):
@Configuration : Indique une classe de configuration Spring
@ComponentScan : Scanne le package spécifié pour trouver les composants
@EnableWebMvc : Active les fonctionnalités Spring MVC
Les composants configurés :

ViewResolver :

Gère la résolution des vues
Si controller retourne "home", il cherchera "/WEB-INF/views/home.jsp"
ResourceHandler :

Gère les ressources statiques (CSS, JS, images)
URL "/resources/style.css" → fichier physique "/resources/style.css"
Le flux de travail :

Une requête arrive (ex: "/hello")
DispatcherServlet la reçoit
Le controller approprié est trouvé
La méthode du controller s'exécute
ViewResolver trouve et renvoie la vue
Hiérarchie des contextes :

ServletContext (Conteneur Web)
    │
    ├── Root Context (Services, Repositories)
    │      │
    │      └── Beans globaux
    │
    └── Dispatcher Context (Web)
           │
           └── Controllers, ViewResolver



## 📝 License
Ce projet est sous licence [MIT](LICENSE)

## 📫 Contact
Votre CHEMLAL ABDELHAKIM  - hakimchemlal0@gmail.com

Lien du projet : [SpringMvcWebApplicationInitializer](https://github.com/hakimchemlal/SpringMvcWebApplicationInitializer)
```
