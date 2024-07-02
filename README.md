# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [简介 | Easy-Es](https://www.easy-es.cn/pages/ec7460/)

### Guides

The following guides illustrate how to use some features concretely:

* [MyBatis-Plus同款Elasticsearch ORM框架，用起来够优雅！](https://juejin.cn/post/7155662252584992805)

### Kibana

* 查看索引

```bash
GET _cat/indices
```

* 查看索引映射

```bash
GET document/_mapping
```

* 查看索引设置

```bash
GET document/_settings
```

* 查询所有文档

```bash
GET document/_search
{
  "query": {
    "match_all": {}
  }
}
```

* 按条件查询文档

```bash
GET document/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "term": {
            "title.keyword": {
              "value": "隔壁老王",
              "boost": 1.0
            }
          }
        }
      ],
      "adjust_pure_negative": true,
      "boost": 1.0
    }
  }
}
```

* 删除索引

```bash
DELETE document
```
