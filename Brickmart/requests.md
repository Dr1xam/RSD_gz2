# Приклади запитів

```bash
# перелік цеглин
curl http://localhost:8080/api/bricks

# одна цеглина з деталями
curl http://localhost:8080/api/bricks/1

# неіснуюча цеглина → 404
curl -i http://localhost:8080/api/bricks/999
```
