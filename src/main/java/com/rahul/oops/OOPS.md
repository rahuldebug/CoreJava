[Abstraction in Java]

        Abstraction is a way to hide the actual implementation and functionality .
        In java this can be achieved by abstract class and interface .
        
        Abstraction lays down focus on what is being done , rather than how it is done .
        
        Type of methods: Interface can have only abstract methods. Whereas, an abstract class can have abstract method
        and concrete methods.
        From Java 8, it can have default and static methods also. From Java 9, it can have private concrete methods as well.
        
        
        Abstract class can have final, non-final, static and non-static variables.
        The interface has only static and final variables.
        Abstract classes cannot be instantiated . 
        They may or may not have abstract method, they also contain constructo 

[Encapsulation]

        Encapsulation is defined as the wrapping up of data under a single unit.
        It is the mechanism that binds together the code and the data it manipulates.
        Another way to think about encapsulation is that it is a protective shield
        that prevents the data from being accessed by the code outside this shield
        
        Declarative type of programming is also a kind of abstration , instead of directly
        focusing on logic we are using inbuilt methods of stream from java 8 .

[Polymorphism]

        Polymorphism are of two types ,

        compile-time (early binding or static binding) --> Method Overloading in java .

[Rules for Method Overloading ]

        - same name with different number of arguments 
        - same name with different type of arguments
        **  IMPORTANT ** , just changing the return type won't qualify for Overloading , It happens in same class .

[Method Overriding ]

          run-time (dynamic dispatch or late binding) --> Method Overridng , (Parent - child relation)
           -   if the child Object is created using Parent reference , 
               and method in child has been override , 
               then the corresponding object will have parents variable and child's method.

[Rules for Overriding]

        -overriding method can have more relaxed access modifier and not less
        -name and parameter type is same 
        -final methods cannot be overridden
        -static methods cannot be overridden
        -Overriding method should have same type or subtype 
        
        -Exception related rule 
            -if super class has not thrown any exception then child class can only throw unchecked exception
            -If super class throws exception then subclass can only throw same or subclass of the exception


[Association]

        Association in oops is relation between objects ,

        Strong relationship : Composition (is-a relationship) :: class subclasses

        weak relationship  : Aggregation (has-a relationship) :: interface relationship

[Constructor]

        Constructor cannot be static , final , synchronized or abstract

[Immutability in java] 

        once Object is created it cannot be modified .
        
        1> Declaring class final , so it cannot be extended , or inherited
        2> setting values using constructor
        3> no setters method , only getters
        4> private final class members
        5> if class contains other objects , then send only copy of the member variable , instead of sending actual member variable .(will look into cloning more )