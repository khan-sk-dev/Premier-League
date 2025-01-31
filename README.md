# Premier-League
Premier League Spring Boot Application
This is a Spring Boot application for managing Premier League players. It provides a RESTful API to perform CRUD operations on player data.

Features
Get Players: Retrieve players by team, name, position, or nation.
Add Player: Add a new player to the database.
Update Player: Update existing player information.
Delete Player: Remove a player from the database.
Technologies Used
Java
Spring Boot
Spring Data JPA
PostgreSQL
Getting Started
Prerequisites
Java 11 or higher
Maven
PostgreSQL
Installation

Clone the Repository:

BASH

git clone https://github.com/khan7071/Premier-League.git
cd Premier-League
Configure the Database:

Update src/main/resources/application.properties with your PostgreSQL database details:

PROPERTIES

spring.datasource.url=jdbc:postgresql://localhost:5432/pl_data
spring.datasource.username=your_username
spring.datasource.password=your_password
Build the Project:

BASH

mvn clean install
Run the Application:

BASH

mvn spring-boot:run
API Endpoints
Get Players:


GET /api/v1/player?team={team}&name={name}&position={position}&nation={nation}
Add Player:


POST /api/v1/player
JSON

{
  "name": "Player Name",
  "team": "Team Name",
  "position": "Position",
  "nation": "Nation"
}
Update Player:


PUT /api/v1/player
JSON

{
  "name": "Player Name",
  "team": "Team Name",
  "position": "Position",
  "nation": "Nation"
}
Delete Player:


DELETE /api/v1/player/{playerName}
Contributing
Contributions are welcome! Please fork the repository and submit a pull request.
