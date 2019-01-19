
#### Factory Pattern

we create object without exposing the creation logic to client and the client use the same common interface to create new type of object.




#### Advantages

#### 1. Decoupling (Or Loose Coupling)

Each time a new change is made at the library side, Client would need to make some corresponding changes at its end and recompile the code. 

Hence,the idea is to use a static member-function (static factory method) in the library which creates & returns instances, hiding the details of class modules from client.

This totally decoupled the selection of type for object creation from Client. The library is now responsible to decide which object type to create based on an input. Client just needs to make call to library’s factory Create method and pass the type it wants without worrying about the actual implementation of creation of objects. Hence we no need to recompile the client side.


#### Disadvantages

#### 1. Additional code
#### 2. Difficulty in understanding the general flow 

#### Example: 

![alt text](https://github.com/Lakshmiaddepalli/DesignPatterns/blob/master/CreationalPatterns/FactoryPattern/Factory_Pattern.png) 


#### References: 

1. https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/
2. https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

