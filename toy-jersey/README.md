# Run the demo

Open a terminal, change to the toy-jersey directory, then type:

```
mvn clean test
```

to run the unit test.

Then run the demo using:

```
mvn exec: java
```

or use your favourite IDE.

# Check if works

use `curl`:

```
curl http://localhost:8080/myapp/myresource
```

The output should be 'Got it!'