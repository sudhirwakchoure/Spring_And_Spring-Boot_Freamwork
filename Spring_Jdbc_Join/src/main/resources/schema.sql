CREATE TABLE IF NOT EXISTS categories (
      id INT PRIMARY KEY,
      title VARCHAR(100) NOT NULL,
    description VARCHAR(100)
    );

CREATE TABLE IF NOT EXISTS course(
    courseId INT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(100),
    price INT,
    categoriesId INT,
    FOREIGN KEY (categoriesId) REFERENCES categories(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
    );