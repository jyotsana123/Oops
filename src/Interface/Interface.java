package Interface;
import java.io.Serializable;

public class Interface {

}

//https://www.youtube.com/watch?v=qZWhPSz3u6M&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=37
//Interface allows to contain only abstract methods
//interface is 100% pure abstract class
//For the interfaces object creation is not allowed
//It's represent the functionality of the application and letter we implement the functionalities
//Interface methods are by default public and abstract.
//In interface it's possible to apply the inheritance concept with extends keyword
//One interface is able to extends multiple interfaces at a time.
//Interface are be default abstract
//Interface methods are by default public and abstract
//Interface variables are by default public static and final
/*  
   class extends class
   interface extends interface
   class implements interface

class A extends B             ---> Valid
class A extends B, C          ---> Invalid
class A implements It1        ---> Valid
class A implements It1, It2   ---> Valid
class A extends A             ---> Invalid

interface It1 extends It2      ---> Valid
interface It1 extends It2, It3 ---> Valid
interface It1 extends A        ---> Invalid
interface It1 extends It1      ---> Invalid

(extends keyword must be first keyword)
class A extends B implements It1, It2 ---> Valid
class A implements It1, It2 extends B ---> InValid
*/

/* Nested inheritance is possible - declaring one interface inside other interface
 * it is possible to declare interface inside the class also.
 * inside the interface possible to declare the variables - variables are by default public static final
 * if in two interfaces variable name is same and when you try to implement and print those variables the it gives ambiguity problem that both interfaces has same name
 * to overcome the ambiguity problem you can call the variables by interface name
 * suppose you want to use only 2 methods of interface out of 10 methods then you need to use the adapter class concept.
 * Adapter class contains empty implementation of interface methods, then you need to extends adapter class in other class and use 2 required methods.
 * Adapter Class is a simple java class that implements an interface with only an empty implementation.
 */

/* Marker interface
 * Interface without methods is called marker interface - like Serializable, RandomAccess, Cloneable interface
 * Interface which doesn't contain any methods but whenever any class is implementing that interface your class must acquire some capability to perform some operations. is called marker interface
 * java.io.Serializable, java.util.RandomAccess, java.lang.Cloneable
 */

/* the process of creating exactly duplicate object is called cloning process, the main object of cloning is to maintain backup.
 */
