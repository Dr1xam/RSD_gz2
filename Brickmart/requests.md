# Приклади запитів

```bash
# перелік цеглин
curl http://localhost:8080/api/bricks

# фільтр за типом
curl "http://localhost:8080/api/bricks?brickType=Керамічна"

# одна цеглина з деталями
curl http://localhost:8080/api/bricks/1

# неіснуюча цеглина → 404
curl -i http://localhost:8080/api/bricks/999

# створити (201)
curl -i -X POST http://localhost:8080/api/bricks \
  -H "Content-Type: application/json" \
  -d '{"name":"Нова цеглина","manufacturer":"Виробник","price":12.00,"weight":3000,"brickType":"Керамічна","photoUrl":"/photos/x.jpg","description":"Опис"}'

# оновити (200 / 404)
curl -i -X PUT http://localhost:8080/api/bricks/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Оновлена","manufacturer":"Виробник","price":15.00,"weight":3000,"brickType":"Керамічна","photoUrl":"/photos/x.jpg","description":"Опис"}'

# видалити (204 / 404)
curl -i -X DELETE http://localhost:8080/api/bricks/2
```
