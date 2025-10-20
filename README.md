
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
