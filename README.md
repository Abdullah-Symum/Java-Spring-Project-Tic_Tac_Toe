# Microservice Tic Tac Toe Game

## Overview
This microservice project is a simple Tic Tac Toe game implemented as a practice exercise for microservices concepts. While the frontend is under development, players can interact with the game using a browser or Postman to handle requests. The game supports two players taking turns to make moves on the Tic Tac Toe board.

## Features
- **Two-Player Game:**
  Players can take turns making moves on the Tic Tac Toe board.

- **Browser or Postman Interface:**
  Interact with the game through a web browser or make API requests using Postman.

## Prerequisites
Before running the project, ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven

## Setup

1. **Clone the Repository:**
   ```
   git clone https://github.com/your-username/tic-tac-toe-microservice.git
   cd tic-tac-toe-microservice
   ```

2. **Build and Run:**
   - Build the project using Maven:
     ```
     mvn clean install
     ```
   - Run the application:
     ```
     java -jar target/tic-tac-toe-microservice.jar
     ```

3. **Access the Game:**
   - For Browser: Open your web browser and navigate to `http://localhost:8080` to access the Tic Tac Toe game (frontend under development).
   - For Postman: Make API requests to `http://localhost:8080/api/game` for interacting with the game.

## Project Structure

- **src/main/java/com.example.tictactoe:**
  - `TicTacToeMicroserviceApplication.java`: Main application class.
  - `controller/`: Contains controllers for handling HTTP requests.
  - `model/`: Defines the data model for the Tic Tac Toe game.
  - `service/`: Implements business logic and services.

- **src/main/resources:**
  - `application.properties`: Configuration file.

- **src/test/:**
  - Contains unit and integration tests for the application.

## Roadmap
The project is currently under development, with the frontend being a work in progress. Future enhancements include completing the frontend to provide a more user-friendly interface and additional features such as game history, player authentication, etc.

## Feedback and Contributions
Feel free to provide feedback or contribute to the project. If you encounter any issues or have suggestions, please create a GitHub issue.

Thank you for playing the Microservice Tic Tac Toe Game!
