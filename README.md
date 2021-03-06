# Java-Design-Patterns

## What is Design-Patterns ?
Design patterns are the best solutions to general problems that software developers faced during software development. According to Gang Of Four these are 23.

## Types of design patterns ?
1. Creational patterns - Best way to create object at a perticular moment.
Example: The Factory pattern is used in Wrapper classes ----- Integer intVal = Integer.valueOf(doubleValue);

2. Structural patterns - How classes and objects can be composed, to form larger structures.
Example: The Adapter pattern in Java ---- List<String> list = Arrays.asList(arrayObj);

3. Behavioral patterns - The interaction and responsibility of objects.
Example: The strategy pattern in Java is the Collections.sort(List<T>, Comparator<? super T>) method. The Comparator in this method is the strategy used to solve how the List objects will be sorted. Internally the List objects are interacting with each other to sort.


## Creatioinal design patterns

### FAB SP(5)
1. Factory – Creates object without showing logic.
Example: The Wrapper classes use factory pattern like -- Integer intVal = Integer.valueOf(doubleValue);
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm   -----  Shape 

2. Abstract Factory – It is also called a factory of factories.
Example: Factories creation to access data from different data sources. Assume your application supports different data stores. (e.g. a SQL Database and an XML file, Text file).https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm  ----- 

3. Builder – Construct a complex object from simple objects using step-by-step approach. 
Example: When object can't be created in single step like  Locale locale = new Builder().setLanguage("sr").setScript("Latn").setRegion("RS").build(); 

4. Singleton – Ensures that at most only one instance of an object exists throughout application.
Example: Saves memory because object is not created at each request. Only single instance is reused again and again.It used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc. It is used by Calendar classes (Runtime).

5. Prototype Pattern - Cloning of an existing object Example: Cloning object that reduces memory consume because more objects refrence point to the same object.
https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm  ---------  Shape clone ShapeCache

## Structural design patterns

### FAB FDCP(7)

1. Facade - Provides an interface hiding complexity of classes, library or framework. Example: Every Abstract Factory is a type of Facade.
https://www.tutorialspoint.com/design_pattern/facade_pattern.htm  ------ Abstract Factory

2. Adapter - Bring existing objects to form another structures which provide new functionality. Example: List<String> list = Arrays.asList(arrayObj);---https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm   -------  AdvancedMediaPlayer MediaPlayer MediaAdapter

3. Bridge - Decouple an abstraction from it's implimentation then they can vary independently. Example: See : https://www.youtube.com/watch?v=GPNVN4TnvMU
Code: https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm  ------- DrawAPI   Shape

4. Flyweight - Reuse existing similar kind of objects and create new object when no matching object is found. Example: Like factory pattern but here if object is null then create new. https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm  ----- One shape one circle

5. Decorator - To add new functionality to an existing object without altering it's structure. Example: BufferedReader and BufferedWriter are some excellent examples of decorator pattern in Java. https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm  ----- RedShapDecorator

6. Composite - To use a group of objects as a single object.https://www.tutorialspoint.com/design_pattern/composite_pattern.htm  ---- CEO

7. Proxy - provides the control for accessing the original object.
Example - Credit/Master card.https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm  ---------  RealImage ProxyImage

## Behavioral design patterns

### CCTV SSIIMMO(11)

1. Chain of Responsibility - Allows to pass request to the chain of handlers until one of them handles request and decouple if sender and receiver based request. Exmaple: Exception handling.https://www.youtube.com/watch?v=Izh9x_VoNUg

2. Command - An object used to encapsulate all information needed to perform an action or trigger an event at a later time.
Example : See https://www.tutorialspoint.com/design_pattern/command_pattern.htm   ------  Stock  BuyStock  SellStock

3. Template - A secuence of steps of an algorithm.The subclasses are allowed to override the steps but not allowed to change the steps.
Example : https://www.tutorialspoint.com/design_pattern/template_pattern.htm  ----------  Game initialize(); startPlay(); endPlay();
Benefit : To reuse the codes.

4. Visitor - Defines a new operation without introducing the modifications to an existing object structure.

5. State - A class behavior changes based on its state.
Example : https://www.tutorialspoint.com/design_pattern/state_pattern.htm   ---------  Start Stop state

6. Strategy - A class behavior or its algorithm can be changed at run time.
Example: The strategy pattern in Java is the Collections.sort(List<T>, Comparator<? super T>) method. The Comparator in this method is the strategy used to solve how the list will be sorted. Internally the list objects are communicating which is hidden.
https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm  ------- Add Subtract Multiply

7. Interpreter - Provides a way to evaluate language grammer or expression.
Example: MM/DD/yyyy
https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm

8. Iterator - Provides a way to access the elements of a collection without knowing it's underlying representation.
Example: Iterator

9. Mediator - Reduces communication complexity between multiple objects or classes.
https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm ------ User Chat Room

10. Memento - To restore the state of an object to its previous state.
Example: ctrl+z

11. Observer - In one-to-one dependency when one object changes state, all its dependents are notified and updated automatically.
Example: One-to-one, one-to-many etc, Event handling frameworks like swing, awt.




## Is it possible to create a clone of a singleton object?
Yes, it is possible to create a clone of a singleton object.



## What are Some Design Patterns which are used in the JDK library?
1. The decorator pattern is used by Wrapper classes.
2. Singleton pattern is used by Calendar classes (Runtime).
3. The Wrapper classes use factory pattern like Integer.valueOf().
4. Event handling frameworks use observer pattern like swing, awt.






