SELECT * FROM goods
WHERE id IN
    (SELECT goods_id
     FROM tags_goods
     GROUP BY goods_id
     HAVING Count(tag_id) = (SELECT count(id) FROM tags))
