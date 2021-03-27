docker stop postgres
docker rm postgres
docker run -e POSTGRES_PASSWORD=pass -d --name postgres -p 5432:5432 postgres
docker cp ./src/main/resources/setup.sql postgres:/tmp/setup.sql
docker exec -u postgres postgres psql postgres postgres -f tmp/setup.sql