
# Building and Running the Microservices

## **1️⃣ Building the Project**
Each service must be built separately using **Gradle**.

Go to each service directory and run:
```sh
cd user-service
gradle clean build
```
To refresh dependencies while building, use:
```sh
gradle clean build --refresh-dependencies
```
Repeat this process for **product-service**, **order-service**, and **payment-service**.

This will create the `build` folder containing the `.jar` file for **Docker & Kubernetes**.

---

## **2️⃣ Running with Docker Compose**
Navigate to the root directory where **docker-compose.yml** is located and build the images:
```sh
docker-compose up -d --build
```
This will:
✅ Build all images  
✅ Start the **PostgreSQL database**, **Kafka**, and all **microservices**  

To check running containers:
```sh
docker ps
```

To see logs for a specific service (e.g., `user-service`):
```sh
docker logs user-service --tail 50
```

To stop and remove all services:
```sh
docker-compose down -v
```

---

**You might have to start the postgres main server and the test server for all the build tests to pass succesfully, use the following commands:** 

To start the main Postgre server, run:
```
docker-compose up -d postgres
```
Note: Do setup Postgres and create the tables before running this command

To run a test server during build, run:
```
docker run -d \
  --name test-db \
  -e POSTGRES_USER=testuser \
  -e POSTGRES_PASSWORD=testpass \
  -e POSTGRES_DB=testdb \
  -p 5433:5432 \
  postgres

```
You can view the running DB using:
```
docker ps
```
You can stop the DB from Docker using:
```
docker stop main-db test-db
```