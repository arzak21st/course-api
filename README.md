# Course API ☕

A **Spring Boot** REST API that provides a basic way to create, retrieve, delete, and update online courses data. </br>

## Live Demo 💻

- ### Requirements

  - [Java 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) or higher.
  - [Postman](https://www.postman.com/downloads/).
    > You can use any other REST Client, just make sure you set the header **Content-Type** with the value **application/json**. </br>

- ### Steps

  - Download [this JAR file](https://github.com/arzak21st/course-api/releases/download/v0.0.1-SNAPSHOT/course-api-0.0.1-SNAPSHOT.jar).
  - Open your command-line and navigate to where your downloaded JAR file is located.
  - Run the JAR file with the following command:
      ```
      java -jar course-api-0.0.1-SNAPSHOT.jar
      ```
  - Open Postman and make HTTP requests to the following URL:
      ```
      http://localhost:1412
      ```
      > See [API Endpoints](#api-endpoints). </br>

## Installation 🔌

- ### Requirements

  - [Java 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) or higher.
  - [Maven](https://maven.apache.org/download.cgi).
  - [Git](https://git-scm.com/downloads).
  - [NetBeans 19](https://netbeans.apache.org/front/main/download/nb19/).
    > You can use any other Java IDE, just make sure it uses the mentioned **Java 11**, and **Maven**. </br>

- ### Steps

  - Press the **Fork** button (top right the page) to make a copy of this project on your own GitHub account.
  - Open **Git Bash** and navigate to where you want your forked project to be cloned.
  - Clone the project with the following command:
      ```
      git clone https://github.com/your-username/your-forked-project-name.git
      ```
      > Replace `your-username` with the actual username of your GitHub account, and `your-forked-project-name` with the actual name of your forked project. </br>
  - Open **NetBeans** (or any other Java IDE) and try to import your cloned project.

## API Endpoints

- ### GET `/course-api/topics`

  - **Description**: Retrieves all topics.
  - **URL**: `http://localhost:1412/course-api/topics`
  - **Request Body**: None.
  - **Response Body**:
      ```
      [
          {
              "topicId": 1,
              "name": "Programming",
              "courses": [
                  {
                      "courseId": 1,
                      "name": "Java Programming"
                  },
                  {
                      "courseId": 2,
                      "name": "C++ Programming"
                  }
              ]
          }
      ]
      ```

- ### GET `/course-api/topics/{topicId}`

  - **Description**: Retrieves the topic with the specified ID.
  - **URL**: `http://localhost:1412/course-api/topics/1`
  - **Request Body**: None.
  - **Response Body**:
      ```
      {
          "topicId": 1,
          "name": "Programming",
          "courses": [
              {
                  "courseId": 1,
                  "name": "Java Programming"
              },
              {
                  "courseId": 2,
                  "name": "C++ Programming"
              }
          ]
      }
      ```

- ### POST `/course-api/topics`

  - **Description**: Creates a new topic.
  - **URL**: `http://localhost:1412/course-api/topics`
  - **Request Body**:
      ```
      {
          "name": "topic-name"
      }
      ```
      > `topic-name` must be unique.
  - **Response Body**: None.

- ### PUT `/course-api/topics`

  - **Description**: Updates an existing topic.
  - **URL**: `http://localhost:1412/course-api/topics`
  - **Request Body**:
      ```
      {
          "topicId": 1,
          "name": "new-topic-name"
      }
      ```
      > `new-topic-name` must be unique.
  - **Response Body**: None.

- ### DELETE `/course-api/topics/{topicId}`

  - **Description**: Deletes the topic with the specified ID.
  - **URL**: `http://localhost:1412/course-api/topics/1`
  - **Request Body**: None.
  - **Response Body**: None.

- ### GET `/course-api/topics/{topicId}/courses`

  - **Description**: Retrieves all courses that belong to the topic with the specified ID.
  - **URL**: `http://localhost:1412/course-api/topics/1/courses`
  - **Request Body**: None.
  - **Response Body**:
      ```
      [
          {
              "courseId": 1,
              "name": "Java Programming"
          },
          {
              "courseId": 2,
              "name": "C++ Programming"
          }
      ]
      ```

- ### GET `/course-api/courses/{courseId}`

  - **Description**: Retrieves the course with the specified ID.
  - **URL**: `http://localhost:1412/course-api/courses/1`
  - **Request Body**: None.
  - **Response Body**:
      ```
      {
          "courseId": 1,
          "name": "Java Programming"
      }
      ```

- ### POST `/course-api/topics/{topicId}/courses`

  - **Description**: Creates a new course associated with the topic with the specified ID.
  - **URL**: `http://localhost:1412/course-api/topics/1/courses`
  - **Request Body**:
      ```
      {
          "name": "course-name"
      }
      ```
      > `course-name` must be unique.
  - **Response Body**: None.

- ### PUT `/course-api/topics/{topicId}/courses`

  - **Description**: Updates an existing course that belongs to the topic with the specified ID.
  - **URL**: `http://localhost:1412/course-api/topics/1/courses`
  - **Request Body**:
      ```
      {
          "courseId": 1,
          "name": "new-course-name"
      }
      ```
      > `new-course-name` must be unique.
  - **Response Body**: None.

- ### DELETE `/course-api/courses/{courseId}`

  - **Description**: Deletes the course with the specified ID.
  - **URL**: `http://localhost:1412/course-api/courses/1`
  - **Request Body**: None.
  - **Response Body**: None.

## Additional Information 🔥

While it might be a bit weird to have courses without an actual content, 
but the purpose is to have a valid REST API that can be consumed. </br>

Checkout 
[Course API Consumer](https://github.com/arzak21st/course-api-consumer) 
that you can use to consume this REST API. </br>
