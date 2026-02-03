# Username Validator

> A Java console application that validates usernames based on industry-standard security and formatting requirements.

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)

## Table of Contents

- [About](#about)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Validation Rules](#validation-rules)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## About

This project demonstrates practical input validation techniques essential for secure user registration systems. Built as a learning exercise in Java fundamentals, it showcases string manipulation, logical operators, and user-friendly error handling.

**Why this project exists:**  
Input validation is critical for application security and user experience. This simple validator serves as a foundation for understanding how authentication systems prevent common formatting issues and maintain data integrity.

## Features

- ✅ Length validation (4-12 characters)
- ✅ Character restriction (no spaces or underscores)
- ✅ Real-time feedback with specific error messages
- ✅ Clean, readable code structure
- ✅ Proper resource management

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line interface or Java IDE

### Setup

1. Clone the repository:
```bash
git clone https://github.com/yourusername/username-validator.git
cd username-validator
```

2. Compile the program:
```bash
javac Main.java
```

3. Run the application:
```bash
java Main
```

## Usage

Run the program and enter a username when prompted:

```
Enter your username: 
john2024
Hello, john2024
```

### Example Outputs

**Valid username:**
```
Input: john2024
Output: Hello, john2024
```

**Invalid - Too short:**
```
Input: joe
Output: Your username must be between 4-12 characters
```

**Invalid - Contains space:**
```
Input: john doe
Output: Username must not contain spaces or underscores
```

## Validation Rules

| Rule | Requirement | Reason |
|------|-------------|--------|
| **Length** | 4-12 characters | Prevents overly simple or unwieldy usernames |
| **No Spaces** | Must not contain spaces | Avoids parsing issues |
| **No Underscores** | Must not contain `_` | Maintains formatting consistency |

### Code Implementation

```java
// Length validation
if(username.length() < 4 || username.length() > 12){
    System.out.println("Your username must be between 4-12 characters");
}

// Character restriction
else if(username.contains(" ") || username.contains("_")){
    System.out.println("Username must not contain spaces or underscores");
}
```

## Project Status

🟢 **Active** - This is a complete learning project. See [Roadmap](#roadmap) for potential enhancements.

### Roadmap

- [ ] Add regex-based validation for special characters
- [ ] Implement password strength checker
- [ ] Create GUI version with JavaFX
- [ ] Add unit tests
- [ ] Build complete registration system

## Contributing

Contributions are welcome! Whether it's bug fixes, feature additions, or documentation improvements.

### How to Contribute

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.

### Good First Issues

- Add support for checking prohibited words
- Implement regex validation
- Create unit tests with JUnit
- Add username suggestion feature

## Tests

Currently, this project uses manual testing. To test the application:

1. Run the program
2. Test with the following inputs:
   - Valid: `john2024`, `alice`, `bobsmith123`
   - Too short: `joe`, `ab`
   - Too long: `verylongusername123`
   - Invalid characters: `john_doe`, `john doe`

Future plans include adding automated tests with JUnit.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

**Your Name** - [@yourusername](https://github.com/ClydeCenteno1)

Project Link: [https://github.com/ClydeCenteno1/username-validator](https://github.com/ClydeCenteno1/username-validator)

## Acknowledgments

- Inspired by industry-standard authentication systems
- Built as part of my Java fundamentals learning journey
- Validation patterns based on OWASP security guidelines

---

⭐ Found this helpful? Give it a star!
