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

    
