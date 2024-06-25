This project aims to develop a bank account management system that utilizes three design patterns: Decorator, Composite, and Adapter. The system allows customers to perform simple transactions or transactions with logging and security capabilities. Additionally, the system provides statements to customers in the form of monthly, quarterly, half-yearly, full year, or multi-year statements. The system also utilizes an external package for customer verification, which could change in the future. This is just a dummy implementation to portray design patterns, the full banking system has not been developed.

Design Patterns Used:

Decorator Pattern - Used for implementing transactions with logging and security capabilities.
Composite Pattern - Used for generating the quarterly, monthly, yearly statements.
Adapter Pattern - Used for integrating an external package for customer verification that could change in the future.

Classes and Interfaces:

1. Transactions – Decorator pattern

•	Transaction: An interface that defines the basic transaction methods.
•	DepositTransaction: A concrete implementation of the Transaction interface that represents deposit transactions.
•	WithdrawTransaction: A concrete implementation of the Transaction interface that represents withdraw transactions.
•	TransactionDecorator: An abstract class that extends the Transaction interface and implements logging and security capabilities using the Decorator pattern.
•	Logging: A concrete implementation of the TransactionDecorator class that provides logging capabilities.
•	Security: A concrete implementation of the TransactionDecorator class that provides security capabilities.

2. Statements – Composite pattern

•	Statement: An abstract class that defines the basic statement methods.
•	MonthlyStatement: A concrete implementation of the Statement class that represents monthly statements.
•	ComboStatement: A composite implementation of the Statement class that represents higher level statements such as quarterly, half-yearly, full year, or multi-year statements.

3. Customer Verification – Adapter pattern

•	IVerify: An interface that defines the customer verification method.
•	InHouseVerifier: A concrete implementation of the IVerify interface that verifies customers internally.
•	ABCValidator: A class that provides a static method for customer validation.
•	ABCAdapter: A concrete implementation of the IVerify interface that adapts the ABCValidator class.
•	XYZChecker: A class that provides a static method for background customer checks.

Requirements

Java 11 or later

How to Run

Download the project. 
Open your preferred IDE. Choose File > Open Projects from File System then specify the directory of this project. 
Compile the Java files. 
Run the 'Executor' class in each package to get the output.
