CREATE TABLE IF NOT EXISTS Courses (
    courseId INT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    price INT NOT NULL,
    category_Id INT,
    FOREIGN KEY (category_Id) REFERENCES categories(id)
    );