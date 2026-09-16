# UMS - University Management System

A Java-based University Management System developed as an Object-Oriented Programming project.

The main purpose of this project is to understand how OOP concepts can be used to design a real-world system. Instead of keeping all the data and functionality in a single class, the system is divided into different classes that represent people, departments, subjects, exams, contact information, and other university-related entities.

This project helped me practice designing relationships between objects and organizing a larger Java application using OOP principles.

---

## 📌 Project Overview

A university has many different entities such as students, teachers, staff, departments, subjects, exams, and guardians. These entities are connected to each other in different ways.

For example:

- A `Student` belongs to a `Department`.
- A `Student` can have a `Guardian`.
- A `Department` has multiple `Subjects`.
- A `Department` can have multiple `Teachers`.
- A `Teacher` can teach different `Subjects`.
- A `Student` can have multiple `Exams`.
- A `Person` has contact information.
- Contact information can contain an `Address`.

The project models these relationships using Java classes and Object-Oriented Programming concepts.

---

## 🎯 Project Goals

The main goals of this project are:

- Practice Object-Oriented Programming using Java.
- Understand how real-world entities can be represented using classes.
- Implement inheritance between related classes.
- Practice encapsulation using private fields and getters/setters.
- Understand composition, aggregation, and association between objects.
- Work with collections of related objects.
- Use constructors and `super()` to initialize inherited properties.
- Practice method overriding, especially `toString()`.
- Build a project with multiple interconnected classes instead of isolated examples.

---

## 🛠️ Technologies Used

- **Java**
- **Object-Oriented Programming (OOP)**
- **Java Collections**
- **LinkedList**
- **Git / GitHub**

---

## 🏗️ Main Classes

The project is organized around several classes that represent different parts of a university system.

### Person

`Person` is the main base class for people in the system.

Common information such as:

- ID
- Name
- Blood Group
- Contact information

can be shared through this class.

Other classes can inherit these common properties instead of defining them again.

---

### UniPerson

`UniPerson` extends the `Person` class and represents a person who is connected to the university.

It provides a layer between the general `Person` class and more specific university-related roles Such as:

- Department

---

### Student

`Student` extends `UniPerson`.

A student can contain information such as:

- Student ID
- Guardian
- Exams
- Fees

The `Student` class also demonstrates relationships with other objects such as `Guardian` and `Exam`.

---

### Employee

`Employee` extends `UniPerson` and represents university employees.

It provides common employee-related information that can be shared by more specific employee types such as:
- Employee ID
- Salary

---

### Teacher

`Teacher` extends `Employee`.

A teacher can be associated with:

- A department
- One or more subjects
- Employee information
- Salary information

The class demonstrates how inheritance can be used to reuse properties from multiple levels of a class hierarchy.

---

### Staff

`Staff` is another type of `Employee`.

It inherits common employee information while allowing staff-specific information and behavior to be added such as:
- Title

---

### Guardian

The `Guardian` class extends `Person` class. It represents a student's guardian.

A guardian can contain information such as:

- Name
- Profession
- Income
- Contact information

Students can be associated with their guardians through object relationships.

---

### Department

The `Department` class represents an academic department.

A department can contain:

- Department ID
- Department name
- Dean
- Subjects
- Teachers
- Students

Collections are used to maintain multiple related objects.

For example, a department can maintain a list of subjects and teachers.

---

### Subject

The `Subject` class represents an academic subject.

It can contain information such as:

- Subject ID
- Subject name
- Credits

A subject can be connected to both teachers and departments.

---

### Exam

The `Exam` class is used to represent examination-related information.

It can contain information such as:

- Exam ID
- Exam name
- Marks
- Subject

Students can be associated with their examination records.

---

### Contact

The `Contact` class is used to keep contact-related information separate from the main `Person` class.

It can contain:

- Email
- Phone
- Alternative phone
- Address

Separating this information into its own class helps keep the design more organized.

---

### Address

The `Address` class contains detailed location information such as:

- Road
- City
- Region
- Postal Code
- Country

It is connected to the `Contact` class.

---

## 🔗 Class Relationships

One of the main learning objectives of this project is understanding how different classes can be connected.

### Inheritance

The project uses a class hierarchy similar to:

```text
Person
├── UniPerson
│   ├── Student
│   └── Employee
│       ├── Teacher
│       └── Staff
└── Guardian
```

This allows common properties and methods to be reused.

For example:

```text
Person
   ↓
UniPerson
   ↓
Employee
   ↓
Teacher
```

A `Teacher` can therefore use properties inherited from `Employee`, `UniPerson`, and `Person`.

### Composition

Composition represents a stronger relationship where one object is closely connected to another object.

For example, a `Student` can have a `Guardian` object associated with it.

The project uses object references to represent these relationships.

### Aggregation

Aggregation represents a relationship where one class contains or manages objects of another class without necessarily owning their complete lifecycle.

For example:

```text
Department
 ├── Subject
 ├── Teacher
 └── Staff
```

A department can maintain a collection of subjects and teachers.

### Association

Association represents a general relationship between two classes.

Examples in this project include:

```text
Student → Department
Student → Subject
Teacher → Subject
Teacher → Department
Student → Exam
Person → Contact
Contact → Address
```

### 🔐 Encapsulation

Encapsulation is used to protect the internal data of classes.

Most fields are declared as `private` and accessed through getters and setters.

For example:


```java
private String name;
private String email;

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
```

This prevents other classes from directly modifying internal fields and gives the class more control over how its data is accessed.

### 🧬 Inheritance

Inheritance is one of the main concepts demonstrated by this project.

Instead of repeating the same properties in every class, common properties are placed in a parent class.

For example:

```java
public class Teacher extends Employee {
    // Teacher-specific properties and methods
}
```

The `Teacher` class can reuse the properties and methods available from `Employee`.

The project also uses `super()` in constructors to initialize properties inherited from parent classes.

### 🎭 Method Overriding

The project uses method overriding to provide specific implementations in child classes.

One example is overriding the `toString()` method.

This makes it easier to display useful information about objects instead of relying on Java's default object representation.

For example:

```java
@Override
public String toString() {
    return "Name: " + name + "\n";
}
```

### 📦 Working with Collections

Since a university contains multiple students, teachers, and subjects, the project uses Java collections to store related objects.

For example:

```java
List<Teacher> teachers;
List<Subject> subjects;
```
This allows a department to maintain multiple teachers and subjects.

Collections are also useful for adding, retrieving, and managing related objects.


### 🧩 Object-Oriented Design

The project follows a real-world modeling approach.

Instead of treating the university as one large object, different concepts are represented by separate classes.

For example:

```text
University
   |
   +--- Department
   |       |
   |       +--- Subject
   |       +--- Teacher
   |
   +--- Student
   |       |
   |       +--- Guardian
   |       +--- Exam
   |
   +--- Employee
   |
   +--- Contact
           |
           +--- Address
```
This structure makes the project easier to understand and demonstrates how objects can interact with each other.

### 📊 Main Entities

| Class        | Purpose                                | Main Relationships           |
| ------------ | -------------------------------------- | ---------------------------- |
| `Person`     | Represents a general person            | Parent class                 |
| `UniPerson`  | Represents a university-related person | Extends `Person`             |
| `Student`    | Represents a university student        | Department, Guardian, Exam   |
| `Employee`   | Represents a university employee       | Extends `UniPerson`          |
| `Teacher`    | Represents a teacher                   | Department, Subject          |
| `Staff`      | Represents university staff            | Extends `Employee`           |
| `Guardian`   | Represents a student's guardian        | Student                      |
| `Department` | Represents an academic department      | Students, Teachers, Subjects |
| `Subject`    | Represents an academic subject         | Department                   |
| `Exam`       | Represents examination information     | Student, Subject             |
| `Contact`    | Stores contact information             | Person, Address              |
| `Address`    | Stores address information             | Contact                      |


### ✨ Features

The project demonstrates the following features:

- Multiple related Java classes
- Person and employee inheritance hierarchy
- Student and teacher modeling
- Department and subject relationships
- Student and guardian relationships
- Exam information associated with students and subjects
- Contact and address modeling
- Encapsulation using private fields
- Getters and setters
- Constructor inheritance using super()
- Method overriding
- Java collections
- Object relationships using composition, aggregation, and association

### 📁 Project Structure

A simplified representation of the project structure is:

```text
University-Management-System/
│
├── src/
│   └── ...
│
├── README.md
└── ...
```
The `src` directory contains the Java classes used to model the different entities and their relationships.

### ▶️ How to Run
#### 1. Clone the repository
```shell
git clone https://github.com/nesarptr/UMS.git
```
#### 2. Open the project

Open the project in a Java-supported IDE such as:

- IntelliJ IDEA
- Eclipse
- Visual Studio Code
#### 3. Make sure Java is installed

Check your Java installation:

```shell
java -version
```

#### 4. Run the main class

Locate the project's main class and run it from your IDE.

### 📚 What I Learned

Building this project helped me understand how Object-Oriented Programming concepts work together in a larger application.

Some of the main things I practiced were:

- Designing classes based on real-world entities.
- Creating relationships between different objects.
- Reusing code through inheritance.
- Protecting class data through encapsulation.
- Using constructors and super() with inheritance.
- Overriding methods such as toString().
- Managing multiple objects using Java collections.
- Understanding the difference between association, aggregation, and composition.
- Breaking a larger problem into smaller and more manageable classes.

The project also helped me move beyond writing individual Java programs and start thinking about how different classes work together as part of a complete system.

### 👨‍💻 About the Project

This project was created as a university-level Java project to strengthen my understanding of Object-Oriented Programming through practical implementation.

Rather than focusing only on individual OOP examples, I used a university management scenario to understand how concepts such as inheritance, encapsulation, composition, aggregation, association, and collections can work together in one application.

It is a learning project, but it also gave me practical experience in organizing code into multiple classes and designing relationships between different parts of a system.


### 📌 Note

This project is primarily focused on practicing Java and Object-Oriented Programming concepts. It is not intended to represent a production-ready university management system.


### 🙏 Acknowledgement

This project was developed as a learning exercise based on a tutorial that demonstrated a University Management System using Object-Oriented Programming. The original tutorial used JavaScript, while I implemented the project in Java and adapted the concepts and implementation to Java's OOP features.

I also modified and extended parts of the implementation while working through the project to improve my understanding of Java and OOP.