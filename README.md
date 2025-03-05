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

## 📝 License
Ce projet est sous licence [MIT](LICENSE)

## 📫 Contact
Votre CHEMLAL ABDELHAKIM - [@votretwitter](https://twitter.com/votretwitter) - hakimchemlal0@gmail.com

Lien du projet : [SpringMvcXml](https://github.com/hakimchemlal/SpringMvcWebApplicationInitializer)
```
