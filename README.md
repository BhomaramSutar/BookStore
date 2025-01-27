# Bookstore Application

This project is a simple bookstore management application built using React.js for the frontend and Spring Boot for the backend. It includes basic CRUD operations for managing books in a database.

---

## Features

- Display a list of books stored in the database.
- Add new books with details such as title, author, and price.
- Edit existing books.
- Delete books from the database.
- Simple and responsive user interface.

---

## Technologies Used

### Frontend:
- React.js
- Axios (for API calls)
- Bootstrap (for styling)

### Backend:
- Spring Boot
- JPA/Hibernate
- MySQL Database

---

## Prerequisites

1. **Node.js** and **npm** installed on your machine.
2. **Java 11 or above** installed.
3. **MySQL Database** set up locally or on a server.
4. IDE for Java development (e.g., IntelliJ IDEA or Eclipse).

---

## Setup Instructions

### 1. Backend Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd backend
   ```

2. Configure the database:
   - Open `application.properties` (in `src/main/resources`).
   - Update the database configurations:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
     spring.datasource.username=<your-username>
     spring.datasource.password=<your-password>
     spring.jpa.hibernate.ddl-auto=update
     ```

3. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

   The backend server will start at `http://localhost:8080`.

4. Verify API endpoints using Postman or browser (e.g., `http://localhost:8080/api/books`).

---

### 2. Frontend Setup

1. Navigate to the `frontend` folder:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm start
   ```

   The frontend server will start at `http://localhost:3000`.

4. Open the application in your browser: `http://localhost:3000`.

---

## File Structure

### Backend:
```
backend
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.book.bookstore
│   │   │       ├── BookController.java
│   │   │       ├── BookService.java
│   │   │       ├── BookRepository.java
│   │   │       └── Book.java
│   │   └── resources
│   │       └── application.properties
│   └── test
├── pom.xml
└── mvnw
```

### Frontend:
```
frontend
├── src
│   ├── components
│   │   ├── BookList.js
│   │   ├── AddBook.js
│   │   ├── EditBook.js
│   │   └── style.css
│   ├── App.js
│   ├── index.js
│   └── index.css
├── package.json
└── public
```

---

## API Endpoints

### GET /api/books
- Fetch all books from the database.

### GET /api/books/{id}
- Fetch a single book by its ID.

### POST /api/books
- Add a new book.
- Request body:
  ```json
  {
    "title": "Book Title",
    "author": "Book Author",
    "price": 100.0
  }
  ```

### PUT /api/books/{id}
- Update an existing book.
- Request body (same as POST).

### DELETE /api/books/{id}
- Delete a book by its ID.

---

## Styling

The application uses Bootstrap for styling along with some custom CSS in the `style.css` file. The layout is responsive and user-friendly.

---

## Troubleshooting

1. **CORS Issues:**
   - Ensure `@CrossOrigin(origins = "http://localhost:3000")` is present in the `BookController`.

2. **Database Connectivity Errors:**
   - Verify the database credentials in `application.properties`.
   - Check if the MySQL server is running.

3. **Frontend Not Loading:**
   - Ensure the backend is running at `http://localhost:8080`.
   - Check for any errors in the browser console.

---

## Future Enhancements

- Add user authentication and role-based access.
- Implement search and filter functionality for books.
- Add pagination for large datasets.

---

## Authors
- **BHOMARAM SUTAR**

Feel free to contribute to this project and make it better!

