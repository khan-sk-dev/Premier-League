<div align="center">
  
  <!-- Premier League Logo Banner -->
  <img src="https://raw.githubusercontent.com/khan-sk-dev/Premier-League/main/assets/pl-banner.png" alt="Premier League Banner" width="100%"/>
  
  # ⚽ Premier League API

  <p align="center">
    <b>A powerful RESTful API for managing Premier League players</b>
  </p>
  
  <!-- Animated Typing Effect - Comment: This requires a GitHub workflow to generate the SVG -->
  <a href="#"><img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=600&size=24&pause=1000&color=07C160&center=true&vCenter=true&width=500&lines=Spring+Boot;RESTful+API;PostgreSQL;Player+Management;CRUD+Operations" alt="Typing SVG" /></a>
  
  <!-- Badges -->
  <p align="center">
    <a href="#features">
      <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
    </a>
    <a href="#tech-stack">
      <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot"/>
    </a>
    <a href="#getting-started">
      <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL"/>
    </a>
    <a href="#api-documentation">
      <img src="https://img.shields.io/badge/REST_API-FF5733?style=for-the-badge&logo=fastapi&logoColor=white" alt="REST API"/>
    </a>
    <a href="#license">
      <img src="https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge" alt="License: MIT"/>
    </a>
  </p>
  
  <!-- Stats Cards -->
  <p align="center">
    <img src="https://img.shields.io/github/stars/khan-sk-dev/Premier-League?style=social" alt="Stars"/>
    <img src="https://img.shields.io/github/forks/khan-sk-dev/Premier-League?style=social" alt="Forks"/>
    <img src="https://img.shields.io/github/issues/khan-sk-dev/Premier-League" alt="Issues"/>
    <img src="https://img.shields.io/github/issues-pr/khan-sk-dev/Premier-League" alt="Pull Requests"/>
  </p>
  
  <!-- Separator Line -->
  <img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="line">
</div>

<!-- Installation and Setup with Animated Steps -->
<h2 align="center">🚀 Getting Started</h2>

<div align="center">
  <details>
    <summary><b>📋 Prerequisites</b></summary>
    <p>
      <ul align="left">
        <li>Java JDK 11 or higher</li>
        <li>Maven 3.6+ installed</li>
        <li>PostgreSQL 12+ database server</li>
        <li>Git for version control</li>
        <li>Your favorite IDE (IntelliJ IDEA recommended)</li>
      </ul>
    </p>
  </details>
</div>

<!-- Installation Steps with Beautiful Layout -->
<h3 align="center">⚙️ Installation</h3>

<div align="center">
  <table>
    <tr>
      <th>Step</th>
      <th>Description</th>
      <th>Command</th>
    </tr>
    <tr>
      <td align="center">1️⃣</td>
      <td>Clone the repository</td>
      <td>
        <code>git clone https://github.com/khan-sk-dev/Premier-League.git</code><br>
        <code>cd Premier-League</code>
      </td>
    </tr>
    <tr>
      <td align="center">2️⃣</td>
      <td>Configure database</td>
      <td>
        Edit <code>src/main/resources/application.properties</code>:
        <pre>spring.datasource.url=jdbc:postgresql://localhost:5432/pl_data
spring.datasource.username=your_username
spring.datasource.password=your_password</pre>
      </td>
    </tr>
    <tr>
      <td align="center">3️⃣</td>
      <td>Build the project</td>
      <td><code>mvn clean install</code></td>
    </tr>
    <tr>
      <td align="center">4️⃣</td>
      <td>Run the application</td>
      <td><code>mvn spring-boot:run</code></td>
    </tr>
  </table>
</div>

<!-- Access Information with Highlighted Box -->
<div align="center">
  <table>
    <tr>
      <td>
        <div align="center">
          <h4>🌐 API Access Point</h4>
          <code>http://localhost:8080</code>
        </div>
      </td>
    </tr>
  </table>
</div>

<!-- API Documentation with Beautiful Formatting -->
<h2 align="center">📝 API Documentation</h2>

<!-- API Endpoints with Advanced Formatting -->
<div align="center">
  <table>
    <tr>
      <th colspan="3">Player Management Endpoints</th>
    </tr>
    <tr>
      <th>Operation</th>
      <th>Endpoint</th>
      <th>Description</th>
    </tr>
    <tr>
      <td align="center">📋 GET</td>
      <td><code>/api/v1/player</code></td>
      <td>Retrieve players with optional filtering</td>
    </tr>
    <tr>
      <td align="center">➕ POST</td>
      <td><code>/api/v1/player</code></td>
      <td>Add a new player to the database</td>
    </tr>
    <tr>
      <td align="center">🔄 PUT</td>
      <td><code>/api/v1/player</code></td>
      <td>Update existing player information</td>
    </tr>
    <tr>
      <td align="center">❌ DELETE</td>
      <td><code>/api/v1/player/{playerName}</code></td>
      <td>Remove a player from the database</td>
    </tr>
  </table>
</div>

<!-- Request Examples with Collapsible Sections -->
<h3 align="center">📥 Request Examples</h3>

<details>
  <summary><b>🔍 Get Players (with filters)</b></summary>
  
  ```http
  GET /api/v1/player?team=Arsenal&position=Forward
  ```
  
  <b>Response (200 OK)</b>
  ```json
  [
    {
      "id": 1,
      "name": "Gabriel Jesus",
      "team": "Arsenal",
      "position": "Forward",
      "nation": "Brazil"
    },
    {
      "id": 2,
      "name": "Gabriel Martinelli",
      "team": "Arsenal",
      "position": "Forward",
      "nation": "Brazil"
    }
  ]
  ```
</details>

<details>
  <summary><b>➕ Add Player</b></summary>
  
  ```http
  POST /api/v1/player
  Content-Type: application/json
  ```
  
  <b>Request Body</b>
  ```json
  {
    "name": "Bukayo Saka",
    "team": "Arsenal",
    "position": "Winger",
    "nation": "England"
  }
  ```
  
  <b>Response (201 Created)</b>
  ```json
  {
    "id": 3,
    "name": "Bukayo Saka",
    "team": "Arsenal",
    "position": "Winger",
    "nation": "England"
  }
  ```
</details>

<details>
  <summary><b>🔄 Update Player</b></summary>
  
  ```http
  PUT /api/v1/player
  Content-Type: application/json
  ```
  
  <b>Request Body</b>
  ```json
  {
    "id": 3,
    "name": "Bukayo Saka",
    "team": "Arsenal",
    "position": "Right Winger",
    "nation": "England"
  }
  ```
  
  <b>Response (200 OK)</b>
  ```json
  {
    "id": 3,
    "name": "Bukayo Saka",
    "team": "Arsenal",
    "position": "Right Winger",
    "nation": "England"
  }
  ```
</details>

<details>
  <summary><b>❌ Delete Player</b></summary>
  
  ```http
  DELETE /api/v1/player/Bukayo%20Saka
  ```
  
  <b>Response (204 No Content)</b>
</details>

<!-- Contributing Section with Advanced Formatting -->
<h2 align="center">🤝 Contributing</h2>

<div align="center">
  <table>
    <tr>
      <td>
        <h3>We welcome contributions!</h3>
        <p>Follow these steps to contribute to the Premier League API project:</p>
        
        <ol align="left">
          <li>Fork the repository</li>
          <li>Create a feature branch (<code>git checkout -b feature/amazing-feature</code>)</li>
          <li>Make your changes</li>
          <li>Commit your changes (<code>git commit -m 'Add some amazing feature'</code>)</li>
          <li>Push to the branch (<code>git push origin feature/amazing-feature</code>)</li>
          <li>Open a Pull Request</li>
        </ol>
        
        <p>Please make sure your code follows our coding standards and includes appropriate tests.</p>
      </td>
    </tr>
  </table>
</div>

<!-- Code of Conduct Mention -->
<div align="center">
  <p>Please note that this project follows a <a href="CODE_OF_CONDUCT.md">Code of Conduct</a>. By participating, you are expected to uphold this code.</p>
</div>

<!-- License Section with MIT License Details -->
<h2 align="center">📄 License</h2>

<div align="center">
  <table>
    <tr>
      <td>
        <p>This project is licensed under the <b>MIT License</b> - see the <a href="LICENSE">LICENSE</a> file for details.</p>
        
        <details>
          <summary>MIT License Summary</summary>
          <p>
            Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files, to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software.
          </p>
        </details>
      </td>
    </tr>
  </table>
</div>

<!-- Future Enhancements with Modern Layout -->
<h2 align="center">🔮 Future Enhancements</h2>

<div align="center">
  <table>
    <tr>
      <td align="center">
        <img src="https://img.icons8.com/fluency/48/000000/security-checked.png" width="36" height="36"/>
        <br>
        <b>🔐 Authentication & Authorization</b>
        <br>
        <small>Implement JWT-based auth system</small>
      </td>
      <td align="center">
        <img src="https://img.icons8.com/fluency/48/000000/combo-chart.png" width="36" height="36"/>
        <br>
        <b>📊 Statistical Analysis</b>
        <br>
        <small>Track player performance metrics</small>
      </td>
      <td align="center">
        <img src="https://img.icons8.com/fluency/48/000000/team-building.png" width="36" height="36"/>
        <br>
        <b>🌐 Team Management</b>
        <br>
        <small>Team creation and roster management</small>
      </td>
    </tr>
    <tr>
      <td align="center">
        <img src="https://img.icons8.com/fluency/48/000000/speed.png" width="36" height="36"/>
        <br>
        <b>⚡ Caching Layer</b>
        <br>
        <small>Redis caching for improved performance</small>
      </td>
      <td align="center">
        <img src="https://img.icons8.com/fluency/48/000000/test-tube.png" width="36" height="36"/>
        <br>
        <b>🧪 Test Coverage</b>
        <br>
        <small>Comprehensive unit and integration tests</small>
      </td>
      <td align="center">
        <img src="https://img.icons8.com/fluency/48/000000/microphone.png" width="36" height="36"/>
        <br>
        <b>📢 Notifications</b>
        <br>
        <small>Real-time updates for data changes</small>
      </td>
    </tr>
  </table>
</div>

<!-- Footer with Social Links -->
<div align="center">
  <img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif" alt="line">
  
  <h2>Connect With Me</h2>
  
  <a href="https://github.com/khan-sk-dev">
    <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
  </a>
  <a href="https://www.linkedin.com/in/khan-sk-dev">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
  </a>
  <a href="mailto:contact@khan-sk-dev.com">
    <img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Email"/>
  </a>
  
  <p>Developed with ❤️ by <a href="https://github.com/khan-sk-dev">khan-sk-dev</a></p>
  
  <p>
    <a href="#">
      <img src="https://img.shields.io/badge/⭐%20If%20you%20like%20it,%20please%20star%20it!-yellow?style=for-the-badge" alt="Star Badge"/>
    </a>
  </p>
  
  <!-- Support -->
  <a href="https://www.buymeacoffee.com/khan-sk-dev">
    <img src="https://img.shields.io/badge/Buy%20Me%20a%20Coffee-ffdd00?style=for-the-badge&logo=buy-me-a-coffee&logoColor=black" alt="Buy Me A Coffee"/>
  </a>
</div>

<!-- Back to Top Button -->
<p align="right">
  <a href="#top">
    <img src="https://img.shields.io/static/v1?label&message=Back+to+Top&color=blue&style=for-the-badge&logo=upward" alt="Back to Top" /> 
  </a>
</p>├── 📂 model/
│   │   │           │   └── 📄 Player.java
│   │   │           ├── 📂 repository/
│   │   │           │   └── 📄 PlayerRepository.java
│   │   │           ├── 📂 service/
│   │   │           │   ├── 📄 PlayerService.java
│   │   │           │   └── 📄 PlayerServiceImpl.java
│   │   │           ├── 📂 exception/
│   │   │           │   └── 📄 GlobalExceptionHandler.java
│   │   │           └── 📄 PremierLeagueApplication.java
│   │   └── 📂 resources/
│   │       ├── 📄 application.properties
│   │       └── 📂 static/
│   └── 📂 test/
│       └── 📂 java/
│           └── 📂 com/
│               └── 📂 premierleague/
│                   └── 📂 tests/
├── 📄 .gitignore
├── 📄 mvnw
├── 📄 mvnw.cmd
├── 📄 pom.xml
└── 📄 README.md
  </pre>
</div>

## 🚀 Getting Started

### Prerequisites

- JDK 11 or higher
- Maven 3.6+
- PostgreSQL 12+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/khan-sk-dev/Premier-League.git
   cd Premier-League
   ```

2. **Configure database**
   
   Edit `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/pl_data
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   The API will be accessible at `http://localhost:8080`

## 📝 API Documentation

### Player Endpoints

#### Get Players
```http
GET /api/v1/player
```

Query Parameters:
- `team` - Filter by team name
- `name` - Filter by player name
- `position` - Filter by position
- `nation` - Filter by nation

Example:
```http
GET /api/v1/player?team=Arsenal&position=Striker
```

#### Add Player
```http
POST /api/v1/player
```

Request Body:
```json
{
  "name": "Bukayo Saka",
  "team": "Arsenal",
  "position": "Winger",
  "nation": "England"
}
```

#### Update Player
```http
PUT /api/v1/player
```

Request Body:
```json
{
  "name": "Bukayo Saka",
  "team": "Arsenal",
  "position": "Right Winger",
  "nation": "England"
}
```

#### Delete Player
```http
DELETE /api/v1/player/{playerName}
```

Example:
```http
DELETE /api/v1/player/Bukayo%20Saka
```

## 🔧 Project Structure

```
Premier-League/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── premierleague/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           └── PremierLeagueApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── premierleague/
│                   └── tests/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📊 Future Enhancements

- 🔐 Authentication and authorization
- 📊 Statistical analysis of player performance
- 🌐 Team management functionality
- ⚡ Caching for improved performance
- 🧪 Comprehensive test coverage

---

<div align="center">
  <p>Developed with ❤️ by <a href="https://github.com/khan-sk-dev">khan-sk-dev</a></p>
</div>
