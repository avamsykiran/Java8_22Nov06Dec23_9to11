Java 8
==================================================================================================================
    Objectives
    --------------------------------------------------------------------
        Introduction to Java,
        Classes and Objects,Methods, Encapsulation, 
        Data Manipulation and Inheritance,Encapsulation, Polymorphism, and Abstraction,Interfaces, 
        Lambda Expressions, Collections, and Generics,Inheritance, Interfaces, 
        Exceptions, Date/Time API, 
        I/O and File I/O (NIO.2), and Concurrency,Parallelism, 
        The JDBC API, and Localization,
        String Operations, memory management(HEAP/stack), Serlilazble

    Lab Setup
    --------------------------------------------------------------------

        JDK 1.8
        Eclipse IDE

    Introduction
    --------------------------------------------------------------------

        1. Java is a partially but strictly object oriented high level programming language.
        2. Features
            a. Simple
            b. Robust
            c. Multi Threaded
            d. Distributed
            e. Platform Independent
            f. Archetecture Neutral


            prog.c  -----Compile On Windows -----> prog.exe (binary file that is readable by Windows also)

            prog.java ------ Compile On JVM -----> Prog.class (binary file understood only by JVM)

                Evey OS has its own copy of JVM (Java Virtual Machine).
                This makes the .class file execute on any OS and hence platform independent.


        3. Characteristics

            Java inspires from c and c++ syntactically,

            a. java is case sensitive.
            b. each statement must be end with a line-terminator (;)
            c. each block of statements msut be enclsoed in { }.
            d. a pair of ( ) is used to mark functions

        4. History and Evolution

            Oak ------> Java 1.1
                        Java 1.2        Java2
                        Java 1.4
                        Java 1.5        Java5
                        Java 1.8        Java8
                        Java 11
                        Java 17

                Java is owned and marketted by Oracle Corporation.

                Java    is distributed as   JDK     Java Development Kit        JRE + JavSourceCode + JavaTools + JavaSampleExamples
                                            JRE     Java Runtime Environment    Java Libraries + JVM + GC + JIT

                JavaTools
                    javac           java compiler       used to compile .java into .class file
                    javap           java parser         used to list out the memebers of a .class file
                    javadoc         java documnetator   used to generate documentation for any .java file using its comments.
                    java            execution tool      used to initiate the execution of a .class file

            Java Standard Edition       JSE     (Core-Java) is the basis for other two editions, supports console based stand alone application developmnet
            Java Enterprise Edition     JEE     supports entriprise level distributed applications development (including web-apps, rest-apis ...etc.,)
            Java Micro Edition          JME     supports micro computer level application like (mobile apps, IOTS ..etc.,)

        5. Tokens

            Identifiers
                are names given any program resource like variable, method, class, object ...etc.,

                    a. an identifier can not start with a number but can be alphanumeric
                    b. an identifier can not match completly with any keyword
                    c. an identifier can not contain spaces or any other special symbols except _ (an underscore)

                    Java Coding Standards - Naming Conventions

                    a. Variable and Methods Identifers must start with lower case and contineu 
                        in lower cas but from second word onwards initital-capitals are observed.

                            width
                            boxWidth
                            widthOfBox

                            display()
                            displayData()
                            displayAllData()

                    b. Identifers of classes, interface and any other user defiend types must be always intial-capatilazed.

                            Exception
                            ArithmeticException
                            ArrayIndexOutOfBoundsException

                    c. Identifiers of constant must be all capitals and connected using _ .

                            PI
                            MINIMUM_LIMIT
                            MAXIMUM_LIMIT
                            MIN_BAL

            Keywords
                are the reserved words of a programming language indnteded for a specific task.
                In java all keywords are lower in case.

                https://www.geeksforgeeks.org/list-of-all-java-keywords/

            Operators
                are special symbols or words in a prgramming language to indicate a specific operations.

                Binay Operators
                    Arithmetic      +    -              *           /           %
                                    sum difference      product     quitiont    reminder

                    Assignment      =   +=  -=  *=  /=   %=

                                    a=5                    value of a as 5
                                    a+=5  means a=a+5      value of a as 10

                    Relational      ==                  !=                      <               >               <=      >=
                                    is equals to       is not equals to     is less than    is greater than
                    
                    Logical         &&      ||      !
                                    and     or      not

                Unary Operators

                    unary minus     -

                                    a=5;
                                    b=-a;
                                    c=-b;
                                    a==c;   (returns true)

                    increment       ++

                                    a=5;
                                    ++a;        pre-increment
                                    a++;        post-increment

                                    a=5;
                                    x=++a;          value of a will be 6 and value of x also will be 6
                                    y=a++;          value of y will be 6 and value of a will be 7

                    decriment       --

                Ternary Pair Operator       cond ? true_value : false_value

                        a=5;
                        b=15;

                        greater = a>b ? a : b;      //value of greater is 15
                        lesser = a<b ? a : b;        //value of lesser is 5

                        x=-42;
                        isEven = x%2==0 ? "Even" : "Not Even" ;
                        symbol = x>0 ? "Positive" : "Negative" ;

                Miscllinous Operators

                    ;           line terminator
                    ( )         used to declare a function and its arguments
                    ,           used to seperate function arguments and multiple variable declaration
                    [ ]         used to access elements of an array, array index operator
                    { }         used to define block of statements
                    .           period, memeber access operator
                    new         used to allocate objects.
                    instanceof  used to check if an object is of a particular class type or not.

            Comments

                    //end-of-line-comment

                    /*
                    Block comment
                    */

            Literals            

                    is any hard-coded value.

                    final double PI = 3.14; 

                    final   is a keyword
                    double  is a keyword
                    PI      is a identifier (name of a constant)
                    =       is an operator
                    3.14    is a literal
                    ;       is an operator


                    double c = 2 * PI * r;

                    keywords    double
                    operators   =   *   ;
                    identifier  c   PI  r
                    literals    2

                    Types of literals supported in Java

                        Integer         0,1,2,3,4,5,6,7,8,9

                                        int a = 45;     //int is a keyword, a is a identifier,
                                                        // = and ; are a operator
                                                        // 45 is a integer literal
                                        int b = -45;    //int is a keyword, b is a identifier,
                                                        // = - an ; are a operator
                                                        // 45 is a integer literal

                                        int a = 456789;

                                        int x = 4_56_789;

                        Octal Integer               should start with a zero
                                                    01,02,03,04,05,06,07
                                                    012

                        HexaDecimal Integer         should start with 0x
                                                    0x1,0x2,0x3,0x4,0x5,0x6,0x7,0x8,0x9,0xA,0xB,0xC,0xD,0xE,0xF
                                                    0xAA1

                        Float           3.14    6.78
                        String          "Hello "    "Vamsy Kiran"
                        Character       'a' '$' '8'
                        Boolean         true    false
                        Reference       null


        6. Data Types and their keywords

            Primitive Data Types

                byte
                short
                int
                long

                double
                float

                char
                boolean
                void

            User Defined Data Types

                enum
                class
                interface
                annotation

        7. Control Structures

            is used to change the flow of execuion of a program.

            Decision Making / Branching Control Strucutres

                Simple If

                    if(cond) {
                        //block of statements to execute if the cond is true
                    }

                If..else

                    if(cond) {
                        //block of statements to execute if the cond is true
                    } else {
                        //block of statements to execute if the cond is false
                    }

                If Ladder

                    if(cond1) {
                        //block of statements to execute if the cond1 is true
                    } else if(cond2) {
                        //block of statements to execute if the cond2 is true and the prev cond(s) are false
                    } else if(cond3) {
                        //block of statements to execute if the cond3 is true and the prev cond(s) are false
                    } else {
                        //block of statements to execute if all the above  conds are false
                    }

                Nested If

                    if(cond){
                        if(cond2){
                            .....
                        }
                    }

                Switch

                    switch(var){
                        case val1: 
                            //block-1 statements
                            break;
                        case val2: 
                            //block-2 statements
                            break;
                        case val3: 
                            //block-3 statements
                            break;
                        default:
                            //statements to execute if non of the values match the variable.
                    }

                    switch statment works with int,char and Strings

            Loops / Iterative Control Structures

                While Loop  -   indefinite pre-condition check loop

                    while(cond){
                        //block of statements.
                        //these statements will repeatedly exeucted as long as the cond is true
                    }

                For Loop    -   finite pre-condition check loop

                    for(initialize;cond;inc/dec) {
                        //block of statements.
                        //these statements will repeatedly exeucted as long as the cond is true
                    }


                    Cone cones[] = new Cone[10];

                    for(i=0;i<cones.length;i++){
                        fill(cones[i]);

                        while(cones[i].isNotEmpty()){
                            lickAndSwallow(cones[i]);
                        }
                    }

                For Each Loop / Enhanced For Loop

                    for(loopingVar : collectionOrArray) {
                        //block of statements
                    }

            Non-Conditional Control Structures

                return
                break
                continue

            assignmnet#1:

                accept the electric meter detials like:
                    meter type: ('domestic"/"commercial"/"Industrial")
                    prev month meter reading
                    current month meter reading

                1. compute and display the units consumed
                2. compute the rate per as per the below table
                    if commercial for units ranging
                                                        above 1000  , rate is  4.0 per unit
                                                        500 to 999  , rate is  3.0 per unit
                                                        200 to 499  , rate is  2.0 per unit
                                                        less than 200  , rate is  1.0 per unit
                    if domestic for units ranging
                                                        above 1000  , rate is  2.0 per unit
                                                        500 to 999  , rate is  1.0 per unit
                                                        200 to 499  , rate is  0.50 per unit
                                                        less than 200  , rate is  0.25 per unit
                    if Industrial for units ranging
                                                        above 5000  , rate is  40.0 per unit
                                                        2500 to 4999  , rate is  35.0 per unit
                                                        1500 to 2499  , rate is  25.0 per unit
                                                        less than 1500  , rate is  15.0 per unit            
                3. compute the payable bill.

        8. Arrays

            a. an array is a linear collection of homoginous elements.
            b. each element in an array is refered to by its position called index.
            c. in java index starts from 0.
            d. java arrays are fixed in size and dynamic.
            e. java supports multi-dimensional and jagged arrays.
            f. .length property of an arrays gives the size of the first dimension of an array.

            datatype arrayName[];
            datatype arrayName[][];
            datatype arrayName[][][];

            int nums[];
            nums = new int[5];
            nums[3] = 19;

                        0           1       2      3         4   
                        ( 0 )     ( 0 )    ( 0 )   ( 19 )    ( 0 )

            int size = scan.nextInt();
            int myArray[] = new int[size];

            int arr1[] = new int[] {10,20,30,40,50};

            int arr2[][] = new int[3][5];
            arr2[1][2] = 7;

                        0           1       2      3       4   
                    0   ( 0 )     ( 0 )    ( 0 )   ( 0 )    ( 0 )
                    1   ( 0 )     ( 0 )    ( 7 )   ( 0 )    ( 0 )
                    2   ( 0 )     ( 0 )    ( 0 )   ( 0 )    ( 0 )

            int arr3[][] = new int[3][];
            arr3[0] = new int[3];
            arr3[1] = new int[2];
            arr3[2] = new int[4];

                          0         1       2      3          
                    0   ( 0 )     ( 0 )    ( 0 )   
                    1   ( 0 )     ( 0 )    
                    2   ( 0 )     ( 0 )    ( 0 )   ( 0 )  

    Object Oriented Programming Conepts
    -------------------------------------------------------------------

        Class & Object

            a Class is a user defiend datatype.
            a Class has fields and methods, where fields are variable used to represent properties
            and methods are functions used to represent behaviours.

            class Pen {
                Barrel barrel;
                Refile refile;
                Nib nib;

                void write(String text,Paper paper){
                    //implementation goes here....
                }
            }

            Object are variable of class type. in other words objects are instances of a class.

            Pen p1 = new Pen();

            Pen p2;
            p2 = new Pen();

        Encapsulation

            is also known as data hididng, and the process of encapsulating the fields and
            method in a class increases the data integritiy.

            data hiding referes to protecting th core-fields of the class and providng an
            indirect access.

            In java, we use access specifiers to encapsulate the firles and methods.

                Default     -no keyword-    a default field or method can be accessed
                                            witihin the host class
                                            or whithin any other class belonging to the same package

                Private     private         a private field or method can be accessec
                                            only within the host class

                Public      public          a public field or method can be accessed anywhere.

                Protected   protected       a protected field or method can be accessed 
                                            within the host class
                                            and within any class that inherits from the host class.

            the general standard in java is, all fields are made private and for reading or writing
            into those fields getter and setter public methods are defined and used.

                class BankAccount {

                    private long accountNumber;
                    private String ifscCode;

                    public long getAccountNumber(){
                        return this.accountNumber;
                    }

                    public String getIfscCode(){
                        return this.ifscCode;
                    }

                    public void setAccountNumber(long accountNumber){
                        this.accountNumber=accountNumber;
                    }

                    public void setIfscCode(String ifscCode){
                        this.ifscCode=ifscCode;
                    }
                }

                BankAccount ba1 = new BankAccount();
                BankAccount ba2 = new BankAccount();

                ba1.setIfscCode("ICIC000019");
                ba2.setIfscCode("INDB000012");

                All about Java Classes
                    constructor
                        Constructor is a special method of class that gets invoked as and when an object is allocated.
                        Construcors must have the same anme as that of the hsot class and they do not return anything (even not void)

                        A class can have more than one constructor, but they have to have different
                        parameters.

                            Default Constructor         constructor having no-args.
                            Parametrized Constructors   constructor having atleast one argument.
                            Copy Constructor            constructor having the object of the host class as an arg.

                    the 'this' keywrd

                        'this' is a reference to the current object of a method.
                        'this' keyword can also be used to call a construcotr from another constructor.

                    Methods from java.lang.Object class

                        this Object class is the default super class for all java classes.

                        int hashcode()
                        boolean equals(Object)          obj1.equals(obj2)   ------> true/false
                        String toString()

                    the 'static' keyword

                        static on fields

                            static fields are called class-variables and
                            non static fields are called instance-variables

                            instance variable are allocated one copy for each object of the class
                            where as a class variable is allocated only one copy for all the objects of the class.

                            a public static field can be accessed through class name directly.

                        static on methods

                            a static method if public can be accessed through class name directly and
                            a static method can access only other static resources of the class directly.
                            in other words a static method can not access 'this' keyword.

                            ClassName obj = new ClassName();
                            obj.method1();  //'this' keyword refers to obj1.
                            className.staticMethod(); //'this' keyword has no reference

                        static on classes

                            a class can contain another class.

                            If a class inside a class is not static, it is called InnerClass
                            if a class inside a class is static, it is called NestedClass

                            class MyClass {
                                class InnerClass {

                                }

                                static class NestedClass{

                                }
                            }

                            InnerClass vs NestedClass ??

                        static blocks

                            class MyClass {
                                static {
                                    //static block
                                    //a class cna have any number of static blocks, but all of them
                                    // are treated as one single block together.
                                    //these blocks will be executed before the class is accessed for the first time.

                                    //thee blocks are used to execute critical memeory operations.
                                }
                            }

        Inheretence

            is the process of creating a new UserDefinedDataType from an existing 
            UserDefinedDataType. The newly created type is called SubType and the 
            existing type is called SuperType.

                'extends' is used to derive a class from another class
                'extends' is used to derive an interface from another interface.
                'implements' is used to create a class from an interface.

                class Pen{
                    Barrel barrel;
                    Refill refill;
                    Nib nib;

                    void write(String text, Paper paper){

                    }
                }

                class Marker extends Pen {
                    void write(String text,WhiteBoard whiteBoard){

                    }
                }

            Types Of Inhertence
                Simple              Super <--derives from-- Sub

                Hirarchial                                 |- Sub1 
                                    Super <--derives from--|
                                                           |- Sub2 
                
                Multi-Level         Super <--derives from-- Sub1 <--derives from-- Sub2 <--derives from-- Sub3

                Multiple            Super1 <--derives from--|
                                                            | - Sub
                                    Super2 <--derives from--|

                Hybrid              is a combination any of two of the above

                In Java, classes do not support multiple inheretecne and neither interface.
                But multiple inheentec is possible between interface and classes. That means
                a class can implement multiple interfaces.

            When an object is allocated to a class, its constructor is invoked, and when 
            an object to a sub-class is allocated, its super-class constructor followed by 
            the sub-class constructor are invoked in that order.

            Type Casting

                a super class reference can hold a sub-class object.

                                    Employee empId,fullName,basic
                                        ↑
                                        |
                    ---------------------------------------------
                    ↑                                           ↑
                    |                                           |
                ContractEmployee contractDuration               Manager  allowence
                                                                    ↑
                                                                    |
                                                                Director share

                    Employee e1 = new Employee();
                    Director d1 = new Director();

                    Employee e2 = new ContractEmployee();
                    Employee e3 = new Manager();
                    Employee e4 = new Director();
                    Manager m1 = new Director();

                    Manager mObj1 = (Manager) e3;
                    Manager mObj2 = (Manager) e4;

                    Manager mObj = (Manager) e2;    //not possible and gives ClassCastException
                    Director dObj = (Director) e3;    //not possible and gives ClassCastException

        Polymorphisim        

            is defining two or more methods with the same name.

            Overloading
                if two or more methods of the same class or
                Methods from a super and sub class
                    1. have the smae name
                    2. differ in no.of.args or differ in args data types
                then they are said to be overlaoded.

                class HuamnBeing {    
                    void eat(Apple apple){
                        wash(apple);
                        ApplePiece pieces[] = cut(apple);
                        for(ApplePiece p : pieces){
                            chewAndSwallow(p);
                        }
                    }

                    void eat(IceCream iceCream){
                        while(iceCream.isNotEmpty()){
                            lickAndSwallow(iceCream);
                        }
                    }
                }

            Overriding
                Methods from a super and sub class
                    1. have the same name
                    2. have the same args.
                    3. have the return type.
                then they are said to be overridden.

                class Animal {
                    void eat(Apple apple){
                        while(apple.exists()){
                            byteAndChewAndSwallow(apple);
                        }
                    }
                }
                
                class HumanBeing extends Animal {   
                    void eat(Apple apple){
                        wash(apple);
                        ApplePiece pieces[] = cut(apple);
                        for(ApplePiece p : pieces){
                            chewAndSwallow(p);
                        }
                    }
                }

            'super' keyword is used to call the super class constructor from a sub-class constructor.
            'super' keyword is also used to call a method of super class from its overriden mehtod of sub-class.

            'final' keyword
                1. can be used on any variable, and that variables becomes a constant
                2. can be used on a method, and that method can not be overriden.
                3. can be used on a class, and that class can not be derived from.

            Note:
                in Java, constant are genrally made public static and final.

                class Circle{

                    public static final double PI = 3.14;

                    private double radius;

                    //...other methods
                }

                final keyword makes PI a constant.
                static keyword makes PI allocated only once in the memory for all Circle objects commonly.
                public because, there's is no point in making it private, as it can however can not be modified.


        Abstraction

            is to declare a method and implement later on. such methods are called abstract methods.

                abstract class

                        an abstract class can not have an object allocated.
                        only an abstract class can accomidate an abstract method; it means an absctract class can have fields, methods and abstract methods. 
                        
                        The abstract classes are expected to be inhereted and 
                        the sub-class of the abstract class must implement the abstract methods and if not
                        the sub-class as well must be abstract.

                        abstract class Person
                            id,firstName,lastName,gender,dateOfBirth,address
                        ↑
                        ------------------------------------------
                        ↑               ↑           ↑           ↑
                        Principal       Teacher     Student     Parent

                        abstract class Shape {

                            private int[] sides;
                            private int[] angles;

                            //construcotrs,getters,setter,toString .....

                            public int perimeter(){
                                int p =0;
                                for(int s : this.sides){
                                    p+=s;
                                }
                                return s;
                            }

                            public abstract int area();
                        }

                interface
                    an interface is a user defined data type that can hold
                    final fields, default methods, static methods and abstract methods.

                    by default methods in an interface are public and abstract.

                    interface cna not have fields.

                In Java Geenrally , classes repreet domain-models and interfce represent roles.


                abstract class Animal                            abstract class Bird                            ↑                                                  ↑
                ---------------------------                     ------------------------
                    ↑                       ↑                       ↑                      ↑
                class FemaleAnimal         class MaleAnimal       class FemaleBird        class MaleBird

                interface Mother
                    giveBirth()
                    feed()
                interface Sister

                interface Brother
                interface Father
                    earnFood()
                    protect()

                class FemalAnimal extends Animal implements Mother,Sister{

                }

                class MaleAnimal extends Animal implements Father,Brother {
                    
                }
                
                class FemalBird extends Bird implements Mother,Sister{

                }

                class MaleBird extends Bird implements Father,Brother {
                    
                }

        Package

            in java is a group of classes.
            Each class is one unit of an application.
            Each class has one specific purpose like modeling/computaion/presentation ..etc.,
            Classes that has a common purpose are grouped into one group and such group is
            called a package.

            www.congnizant.com
            www.cts.com

                com.cts         organization level package.

                ecommerce
                            com.cts.ecomerce
                            com.cts.ecomerce.model
                            com.cts.ecomerce.ui

                hospital
                            com.cts.hospital
                            com.cts.hospital.model
                            com.cts.hospital.ui
                            
        