`cd  build/classes/java/main`

b)
---
`java -Xlog:gc ...`

c)
---
`java -Xlog:gc* ...`

d)
---
`java -Xlog:gc*,thread* ...`

e)
---
`java -Xlog:thread*=debug ...`

f)
---
`java -Xlog:gc*=debug:file=gc.log:tags,pid,uptime,utctime ...`
