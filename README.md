# rmi
Simple client-server app to learn *Remote Method Invocation*

### Before compiling

- Change in `CollecionImpl.java` the variable `hostName` with the ip address of the RMI register
- Change in `Cliente.java` the variable `hostname` with the ip address of the RMI register

### Compiling

In the server:

```bash
javac Collection.java CollectionImpl.java
```

In the client:

```bash
javac Cliente.java
```

### Starting server and cliente

In the server:

```bash
java CollectionImpl
```

In the cliente:

```bash
java Cliente
```