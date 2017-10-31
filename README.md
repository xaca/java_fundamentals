# Fundamentals of Java
In this course, you will learn the basics of the #1 language in the world. *Java* is taught as an introductory language in CS courses all over the world. You will be among CS students from the best universities.

## Sections
1. Introduction
2. Algorithms
3. Conditional Statements
4. Switch/Case
5. Loops
6. Arrays
7. Matrix
8. Strings
10. Functions/Methods
11. Black Box
12. White Box
13. Input/Output
14. Passing by value
15. Passing by reference
16. Fibonacci's Sequence
17. Prime Numbers
18. Magic Matrix
19. More about Strings
20. Pow

[![Curso de programación básica en JAVA](https://img.youtube.com/vi/Ztr7_sNmSQI/0.jpg)](https://www.youtube.com/watch?v=Ztr7_sNmSQI&list=PLQ1ShaTNqthL1w5LSw5l7CbjCu5xiKQsA)

## How to install an IDE
First off, what is an IDE? An IDE (Integrated Development Environment) is a place for coders to change the code of the program they're working on. From the tiniest of projects to the largest you will need an IDE, which one you choose is up to you. For this tutorial we will be using [Eclipse](https://www.eclipse.org), but there are plenty of other choices.

### Download the IDE
Go to the [Eclipse website](https://www.eclipse.org/downloads/) and download the latest version of Eclipse. Currently, it is Eclipse Oxygen.

### Run through the setup
1. Click "Eclipse IDE for Java Developers". This will install the IDE, a git (version control) client, and a couple of other editors for advanced Java development.
2. Change the install path (if you want to), click install, then accept the terms and conditions.

### Open Eclipse
1. Launch Eclipse. Click 'Launch' when the program asks about a directory for the workspace.
2. Click 'File' -> 'New' -> 'Java Project'. Enter a name for your project, and click 'Finish'.
3. Right click on your project in the left pane, choose 'New', and select 'Class'. Name it 'Main'.
4. Click 'Finish' and you're done! You can now do all of the examples in this repository!

### Other way to work with java without using IDE
1. Download java jdk from the website install it in the host machine and install the path.
2. Download a text editor (Sublime, Atom, etc) and start writing the code.
3. Open terminal go to the folder where your java code is saved and compile the file using the command javac classname.java.
4. After successfully compiling the code java will create a class file with name classname.class.
5. Next step is to execute the file in the terminal,command for executing is java classname.
6. Boom!! there is your output "Hello world!".

## Maven
Maven is a way to simplify the way projects are build. Where the earlier projects only contain a few Java files, Maven is capable of handling the full lifecycle (downloading third party software, compilation, testing, updating documentation), which would be a real error-prone chore to do by hand (can you imagine running thousands of tests by hand using main() methods?). This can be done inside an IDE or through a terminal using 'mvn <cmd>'. See 'Working with Maven' below for a few examples relevant to this repository. But note that Mavens capabilities go way beyond what is required in this repository.

At the time of writing, chapter 16 and 17 has Maven incorporated, which can be recognized by the 'pom.xml' in these projects. They both refer to the 'pom.xml' in the root of this repository as their parent. This is used to share information between multiple projects, while only defining it once (in the parent). The other way around, the parent refers to the chapter 16 and 17 projects as submodules. This means that whatever task Maven is given, it will also execute it on all its submodules.

Sources:
* https://maven.apache.org/what-is-maven.html
* https://maven.apache.org/guides/getting-started/

### Working with Maven
1. Download Maven (3+) from http://maven.apache.org
2. Unpack the folder and add the /bin directory to your PATH variable (http://www.baeldung.com/install-maven-on-windows-linux-mac)
3. Open the terminal and go to the project folder
4. Run 'mvn test' to run all the tests and verify everything is still working.

