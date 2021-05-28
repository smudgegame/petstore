# TODO
- [X] add person controller
- [X] add person service
- [X] add person
- [ ] connect to database

Swagger Link
- http://localhost:8080/swagger-ui.html

Card Board for Agile Practice
- https://github.com/ManApart/smudge_practice/projects/1

Docker Startup
```
docker run -e POSTGRES_PASSWORD=pass -d --name postgres -p 5432:5432 postgres
docker cp ./src/main/resources/setup.sql postgres:/tmp/setup.sql
docker exec -u postgres postgres psql postgres postgres -f tmp/setup.sql
docker exec -it postgres psql -U postgres
```

Postgres
```
\dt
```