5.1 project-spring-ioc-SetterInjection-Concept-2-Solution - add @Autowired on setLoan

Setter Injection Types
11 project-spring-ioc-SetterInjection-Concept-9-Setter-Injection-By-Name
12 11 project-spring-ioc-SetterInjection-Concept-9-Setter-Injection-By-Type (Default)


Spring Core Container - AppConfig File

1. Who is creating the Objects for out Spring Beans ?
Ans . Spring Core Container

2. Define Dependency Injection.
Ans. While creating the Spring Bean objects inside this Spring Core Container, Spring Core Container will also see the object dependencies (@Autowired) (like loanAccount Object, because Customer is having dependency on loanAccount), then Spring Core Container will create the dependency objects first, then it will push to Customer/Called/Required/Dependent Object (By Name or By Type both) is called Dependency Injection.

3. how the container will know Caller / Customer Object has LoanAccount dependency,
Ans. Customer has @Autowired on LoanAccount

4. 