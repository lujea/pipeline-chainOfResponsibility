# pipeline-chainOfResponsibility
Implementation of a pipeline using Java and Spring framework

This project contains a simple implementation of the Chain of responsibility pattern to build a pipeline of execution. The code is inpired by this blog: https://doanduyhai.wordpress.com/2012/07/08/design-pattern-the-pipeline/

This implementation relies on the Spring framework (4.2.3) to handle the pipeline configuration.

The goal of the pipeline is to execute tasks in a sequence: Task1 -> Task2 -> ... -> TaskN. Pipelines are also very useful when different parts of the code have to be reused. Typically creating a new pipeline avoids duplication classes that execute the same logic.

To compile the code, execute:
mvn clean install

Take a look at README.txt for more details.