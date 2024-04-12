# 💳 Payment Processing System 🛠️

## 📝 Overview

This Java project implements a payment processing system using the Bridge design pattern. The system allows users to make payments using different payment methods such as cash and credit card.

## 📚 Classes

### 💸 Payment Interface

The `Payment` interface defines a contract for payment methods. It contains a single method `pay(double debt)` that specifies how a payment should be processed.

### 💵 CashPayment Class

The `CashPayment` class implements the `Payment` interface for cash payments. It overrides the `pay` method to display the total debt amount and payment method (cash).

### 💳 CreditCardPayment Class

The `CreditCardPayment` class implements the `Payment` interface for credit card payments. It overrides the `pay` method to display the total debt amount and payment method (credit card).

### 🌉 AbstractPayment Class

The `AbstractPayment` class serves as the abstraction in the Bridge pattern. It contains a reference to a `Payment` object and defines the common interface for sending payments.

### 🚀 RefinedPayment Class

The `RefinedPayment` class extends the `AbstractPayment` class and provides a refined abstraction. It overrides the `sendPayment` method to perform additional actions after sending the payment.

### 🚀 Main Class

The `Main` class contains the entry point of the application. It demonstrates how to use the payment processing system by creating instances of payment methods (cash) and refined abstractions (refined payment) and invoking their methods.

## 🚀 Usage

To use the payment processing system:

1. Create instances of payment methods (`CashPayment`, `CreditCardPayment`).
2. Optionally, create instances of refined abstractions (`RefinedPayment`) to customize payment behavior.
3. Invoke the `pay` method on payment objects to process payments.
4. Invoke the `sendPayment` method on refined abstractions to send payments and perform additional actions if needed.

## ✨ Benefits of Bridge Pattern

- Decouples abstraction from implementation, allowing them to vary independently.
- Promotes flexibility and extensibility, making it easier to add new payment methods or change existing ones.
- Improves code maintainability by separating concerns and reducing code duplication.

