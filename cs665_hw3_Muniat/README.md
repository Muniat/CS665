

This Java application is designed to cater to a family of banks, with each bank having their own versions of checking and savings accounts. 
Each bank also offers their own version of user interfaces as well as different types of profile for their customers.
The main purpose of this program is to implement suitable design patterns for each of the use case, it does not fully implement the entire Banking system.

Design Patterns Used

Three design patterns have been used:

Abstract Factory Method: There are two types of account in question, checking account and savings account. But each account type maybe be customized
for each of the bank. Abstract Factory pattern allows for easy addition of new banks and their respective account types in the future by grouping the related
object types in a single Account factory interface.

Builder Pattern: The builder pattern is used to create the user interface for each supported bank. This allows for easy customization of the UI based on 
the specific needs of each bank. The pattern separates the construction of objects from their representation and thus the same UI creation process can be 
applied for each bank.

Factory Pattern: The factory pattern is used to create different types of customer profiles based on their customer status (i.e, standard, preferred or business).
This allows to create different types of profiles through the same 'factory' , depending on the user input or criteria as well as easy addition of new customer 
profiles in the future. Two different type of factory method have been used in this assignment - a simple factory pattern and the traditional one.

Requirements

Java 11 or later


How to Run

Download the project.
Open your preferred IDE.
Choose File > Open Projects from File System then specify the directory of this project.
Compile the Java files.
For part 1, run AccountCreator.java
For part 2, run Testing.java
For part 3, simple factory, run CustomerCreator.java
For part 3, factory, run Test.java
