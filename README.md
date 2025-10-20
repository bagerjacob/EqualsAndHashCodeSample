
## Technologies Used

- **Java 21**: Latest LTS version
- **Spring Boot**: Application framework
- **Lombok**: Code generation for boilerplate reduction
- **JUnit 5**: Testing framework
- **DataFaker**: Test data generation
- **Maven**: Build tool

## Key Concepts Demonstrated

### EqualsAndHashCode Implementation Variants

The project includes two model classes that extend a common parent:

1. **EqualsAndHashFalse**: Uses `@EqualsAndHashCode(callSuper = false)`
    - Only considers fields in the current class for equality/hash calculation
    - Ignores parent class fields

2. **EqualsAndHashTrue**: Uses `@EqualsAndHashCode(callSuper = true)`
    - Considers both current class and parent class fields
    - Provides more comprehensive equality checking

### Test Scenarios

The test suite covers:
- Hash code comparison between objects with same name but different versions
- Behavior in HashSet collections
- Impact of inheritance on object equality

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+

### Building the Project

```bash
mvn clean compile
```

### Running Tests

```
mvn test
```


## Test Results Explanation

### Hash Code Behavior
- **EqualsAndHashFalse**: Objects with same name generate identical hash codes (ignoring version from parent)
- **EqualsAndHashTrue**: Objects with same name but different versions generate different hash codes

### HashSet Behavior
- **EqualsAndHashFalse**: HashSet treats objects with same name as duplicates (size = 1)
- **EqualsAndHashTrue**: HashSet treats objects with different versions as distinct (size = 2)

## Best Practices Highlighted

1. **Always override both equals() and hashCode()** when implementing custom equality
2. **Consider inheritance** when using `@EqualsAndHashCode`
3. **Use `callSuper = true`** when extending classes with meaningful fields
4. **Test equality behavior** especially when using objects in collections

## Key Learning Points

- When `callSuper = false`, only the current class fields are considered for equality
- When `callSuper = true`, both current and parent class fields are included
- This difference significantly impacts how objects behave in hash-based collections
- Proper equals/hashCode implementation is crucial for data integrity in collections

## Dependencies

The project uses the following key dependencies:
- Spring Boot Starter
- Lombok for code generation
- JUnit Jupiter for testing
- Bestseller internal test utilities

## License

This project is part of Bestseller's internal development examples and is intended for educational purposes.

## Contributing

This is a demonstration project. For questions or suggestions, please contact the development team.