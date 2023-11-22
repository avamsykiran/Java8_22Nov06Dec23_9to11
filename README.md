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

            Comments
            Literals            