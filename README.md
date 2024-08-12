# **Online Shopping Service**
  
In this project, I have developed a microservices-based test-driven online shopping platform to order a product using Spring Boot. 

## **Product Service**

Used to create a new product and fetch them to place order.

Database: PostGreSQL

## **Inventory Service**

Checks whether the product to place order is in stock based on the sku code value of the product. I have used **WebClient** to establish communication with the Order Service.

Database: MySQL

## **Order Service**

Places order and fetches the order details. To place order, I have created DTO object of Line Items and created a One-to-Many relationship with Line Items table.

Database: MySQL

Additionally, I am working on adding a notification service to send e-mail communication to the user when the order is placed.
