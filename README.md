# String Calculator TDD Kata

TDD implementation of String Calculator kata for Incubyte assessment.

## Features

- Parse strings and sum numbers
- Custom delimiters (comma, newline, custom chars)
- Multiple delimiter support
- Negative number validation
- Ignore numbers > 1000
- Track method calls


## TDD Process

- Write failing test
- Implement minimal code
- Refactor
- Repeat

## Technologies

- Java
- Maven
- JUnit 5

## Project Structure

```
src/
├── main/java/com/incubyte/stringcalculator/
│   └── StringCalculator.java
└── test/java/com/incubyte/stringcalculator/
    └── StringCalculatorTest.java
```

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.6 or higher

### Running Tests
```bash
mvn test
```

### Running Specific Test
```bash
mvn test -Dtest=StringCalculatorTest
```

## Commit History

The Git commit history demonstrates the TDD process:
- Each commit represents a single step of  TDD cycle
- Incremental feature development
- All existing functionality preserved throughout development

## Testing Strategy

- **Unit tests** for each requirement
- **Edge case coverage** for all scenarios
- **Exception testing** for negative numbers
- **Integration testing** for complex delimiter scenarios

## Code Quality

- Clean, readable code following Java conventions
- Comprehensive test coverage
- Proper error handling
- Modular design
## Assessment Compliance

This implementation meets all Incubyte assessment requirements:
- ✅ TDD methodology followed
- ✅ Comprehensive unit testing
- ✅ Clean code practices
- ✅ Incremental development
- ✅ All kata requirements implemented

## Author

Ayush Soni - Incubyte Technical Assessment Candidate
