Here’s a polished and professional README for your **Premier League Spring Boot Application** GitHub repo, complete with formatting, emojis, badges, and your uploaded logo:

---

````markdown
<div align="center">
  <img src="https://github.com/khan-sk-dev/Premier-League/assets/your-github-username/2f3aaf46-4ef6-47f4-af89-455bdfe21dd5.png" alt="Premier League Logo" width="200"/>
  <h1>⚽ Premier League - Spring Boot API</h1>
  <p>RESTful API to manage Premier League players built with Java, Spring Boot, and PostgreSQL</p>
</div>

---

![Java](https://img.shields.io/badge/Java-11+-red?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

---

## 🚀 Features

- 🔍 **Get Players** by team, name, position, or nation
- ➕ **Add Player** to the database
- ♻️ **Update Player** information
- ❌ **Delete Player** from the database

---

## 🛠️ Technologies Used

- ☕ Java 11+
- 🌱 Spring Boot
- 📦 Spring Data JPA
- 🐘 PostgreSQL
- 🧪 Maven

---

## 📦 Getting Started

### ✅ Prerequisites

- Java 11 or higher
- Maven
- PostgreSQL

---

### 🔃 Clone the Repository

```bash
git clone https://github.com/khan-sk-dev/Premier-League.git
cd Premier-League
````

---

### ⚙️ Configure the Database

Edit the `src/main/resources/application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/pl_data
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

### 🔨 Build the Project

```bash
mvn clean install
```

---

### ▶️ Run the Application

```bash
mvn spring-boot:run
```

---

## 🌐 API Endpoints

### 📥 Add Player

```http
POST /api/v1/player
```

**Request Body (JSON):**

```json
{
  "name": "Player Name",
  "team": "Team Name",
  "position": "Position",
  "nation": "Nation"
}
```

---

### 📤 Get Players

```http
GET /api/v1/player?team={team}&name={name}&position={position}&nation={nation}
```

---

### ✏️ Update Player

```http
PUT /api/v1/player
```

**Request Body (JSON):**

```json
{
  "name": "Player Name",
  "team": "Team Name",
  "position": "Position",
  "nation": "Nation"
}
```

---

### ❌ Delete Player

```http
DELETE /api/v1/player/{playerName}
```

---

## 🤝 Contributing

Contributions are welcome!
Please fork the repository and create a pull request with your changes.

---

## 📜 License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.

---

<div align="center">
  Made with ❤️ by <a href="https://github.com/khan-sk-dev">khan-sk-dev</a>
</div>
```

---

### 📌 Final Step:

Upload the logo you shared (`2f3aaf46-4ef6-47f4-af89-455bdfe21dd5.png`) to your GitHub repo in the **"assets"** or root folder. Then **replace this part** in the README:

```markdown
<img src="https://github.com/khan-sk-dev/Premier-League/assets/your-github-username/2f3aaf46-4ef6-47f4-af89-455bdfe21dd5.png"
```

with the correct **GitHub-hosted image URL**. If you need help uploading it properly, let me know and I’ll guide you step-by-step.

Want a version in plain `README.md` file format? I can generate that too.
