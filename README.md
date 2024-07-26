# Rental Application

This project is a simple rental application where users can rent different types of buildings such as apartments, separate houses, and shops. Each building has an address, name, size, and other necessary characteristics. Customers can rent as many buildings as they want. A contract between the customer and the building owner is generated, clarifying the rental period, price, and other important data. Customers can rent by paying either using PayPal, Visa, or MasterCard.

## Features
Rent apartments, houses, and shops
Generate contracts between customers and building owners
Support for multiple payment methods (PayPal, Visa, MasterCard)
Each building has an address, name, size, and additional characteristics

## Classes and Concepts
This project demonstrates the use of various OOP concepts including:

Inheritance: Different types of buildings (Apartment, House, Shop) inherit from a base class Building.
Abstraction: Abstract class Building defines common properties and methods.
Polymorphism: Methods are overridden in the subclasses to provide specific behaviors.
Association: A Customer has a list of Building objects they have rented.
Aggregation: Building has an Address.
Composition: A Contract is composed of a Customer, a Building, an Owner, and payment details.
