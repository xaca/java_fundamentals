# Grundlagen von Java
In diesem Kurs werden die Grundlagen der weltweiten Nummer 1 Programmiersprache gelehrt. Java wird als Einführungssprache in Informatikkursen rund um die Welt unterrichtet. Du wirst ein Informatikstudent unter den der besten Unitversitäten gehören.

## Themen
1. Einleitung
2. Algorithmen
3. Bedingungen
4. Switch/Case
5. Schleifen
6. Arrays
7. Matrix
8. Strings
10. Funktionen/Methoden
11. Black Box
12. White Box
13. Eingabe/Ausgabe
14. Passing by value
15. Passing by reference
16. Fibonacci-Folge
17. Primzahlen
18. Magic Matrix
19. Mehr über Strings
20. Potenz

[![Programmierkurs Java](https://img.youtube.com/vi/Ztr7_sNmSQI/0.jpg)](https://www.youtube.com/watch?v=Ztr7_sNmSQI&list=PLQ1ShaTNqthL1w5LSw5l7CbjCu5xiKQsA)

## Installation einer Entwicklungsumgebung (IDE)
Zuallererst stellt sich die Frage, was überhaupt eine Entwicklungsumgebung (IDE) ist? Eine IDE (Integrated Development Environment) ist ein Programm, mit dessen Hilfe der Benutzer seinen geschriebenen Quelltext bearbeiten kann. Egal, ob die Projekte, die du bearbeitest sehr klein oder extrem groß sind, eine IDE wirst du benötigen. Welche du letztendlich für dein Projekt benutzen möchtest, ist dir aber selbst überlassen. Für dieses Tutorial werden wir [Eclipse](https://www.eclipse.org) benutzen, aber es gibt noch diverse andere.

### Herunterladen von Eclipse
Besuche die [Eclipse Webseite](https://www.eclipse.org/downloads/) und lade dir die neuste Version von Eclipse herunter. Aktuell ist dies die Oxygen Version.

### Installation von Eclipse
1. Klicke auf "Eclipse IDE for Java Developers". Dadurch wird Eclipse, ein GIT (Versionskontrollsystem) Client und ein paar weitere Editoren für erweiterte Java Entwicklung installiert. 
2. Du kannst den Installationspfad nach Wunsch ändern. Danach klicke 'installieren' und akzeptiere die Geschäftsbedingungen.

### Eclipse starten
1. Klicke auf **Starten,** sobald Eclipse dich nach einem Ort für das Arbeitsverzeichnis fragt.
2. Klicke **Datei** -> **Neu** -> **Java Projekt**. Gebe dann einen Namen für dein Projekt ein und drücke **Fertig**.
3. Rechtsklicke auf dein Projekt, welches im linken Verzeichnisbaum angezeigt wird. Wähle dann **Neu** und drücke **Klasse**.
Nenne die Klasse 'Main'.
4. Klicke nun auf **Fertig.** Jetzt hast du es geschafft! Du kannst jetzt mit allen Beispielen in diesem Repository arbeiten.


### Möglichkeiten auch ohne IDE mit Java zu arbeiten
1. Lade dir die Java JDK herunter und installiere es auf deinem PC. 
2. Lade einen Text Editor herunter (z.b Sublime, Atom, etc) und schreibe deinen Java Quelltext.
3. Öffne nun eine Konsole und navigiere in das Verzeichnis, in dem sich dein Java Code befindet. Benutze das 'javac' Kommando, um die .java Datei zu kompilieren. 
4. Nach erfolgreicher Kompilierung wird eine (Dateiname).class Datei erstellt.
5. Der nächste Schritt ist die .class Datei mit Hilfe der Konsole auszuführen. Das Kommando dafür ist 'java + Dateiname'. 
6. Boom! Nun siehst du die Ausgaben deines Programmes!

## Maven

Maven ist ein Weg um das Erstellen von Java Projekten zu erleichtern.
Während die früheren Projekte nur ein Paar Java Dateien enthalten haben, ist
Maven in der Lage den kompletten Lebenszyklus abzubilden: 

* Downloaden von 3rd Party Software
* Compilieren
* Testing
* Aktualisieren von Dokumentation

Diese Punkte manuell durchzuführen wäre sehr Fehleranfällig.
Dies alles kann von Maven abgearbeitet werden, entweder durch die Verwendung eines Terminals
und den "mvn" Befehlen oder über eine IDE mit Maven Support, mit welcher man diese 
Befehle ebenfalls ausführen kann.
Siehe weiter unten "Mit Maven arbeiten" für einige Beispiele, welche relevant zu diesem
Repository sind. Hinweis: Maven bietet weit mehr Funktionalität als was für dieses Projekt
benötigt wird.

Zum Zeitpunkt des Schreibens ist Maven in Kapitel 16 und 17 integriert. Dies
kann man daran erkennen das sich eine sogenannte "pom.xml" Datei in diesen
Verzeichnissen befindet. Diese wird verwendet um Informationen zwischen mehreren
Projekten zu teilen, während es nur einmal im Root-Verzeichnis definiert werden
muss. 
Kapitel 16 und 17 werden wiederum als Sub-Modul in der "pom.xml" aus dem
Root-Verzeichnis angegeben. Das bedeutet das alle Maven Befehle auch für
die jeweiligen Sub-Module ausgeführt werden (In dem Fall für Kapitel 16 und
17).

Quellen:
* https://maven.apache.org/what-is-maven.html
* https://maven.apache.org/guides/getting-started/

### Mit Maven arbeiten

1. Downloade Maven (3+) von folgender Seite: http://maven.apache.org
2. Entpacke das Archiv und füge das "bin" Verzeichnis zu deiner PATH
   Umgebungsvariable hinzu (http://www.baeldung.com/install-maven-on-windows-linux-mac)
3. Öffne ein Terminal and navigiere in dieses Projekt Verzeichnis
4. Führe den Befehl "mvn test" aus um alle Tests auszuführen und um damit zu Verifizieren das alles
   noch funktioniert

