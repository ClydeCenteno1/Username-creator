# Username Validator

A robust Java console application that validates usernames based on specific security and formatting requirements, demonstrating input validation and string manipulation techniques.

## 🎯 Overview

This project implements a username validation system with industry-standard rules. It showcases practical application of string methods, logical operators, and input validation—essential skills for building secure registration systems and user authentication flows.

## ✨ Features

- **Length Validation** - Ensures username is between 4-12 characters
- **Character Restriction** - Prevents spaces and underscores in usernames
- **Real-time Feedback** - Provides specific error messages for validation failures
- **Clean Logic Flow** - Uses logical OR operators for efficient validation
- **User-Friendly Interface** - Clear prompts and helpful error messages

## 🔒 Validation Rules

| Rule | Requirement | Reason |
|------|-------------|--------|
| **Minimum Length** | 4 characters | Prevents overly simple usernames |
| **Maximum Length** | 12 characters | Ensures readability and system compatibility |
| **No Spaces** | Must not contain spaces | Prevents parsing issues |
| **No Underscores** | Must not contain `_` | Maintains consistent formatting standards |

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line interface or Java IDE

### Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/username-validator.git
```

2. Navigate to the project directory
```bash
cd username-validator
```

3. Compile the program
```bash
javac Main.java
```

4. Run the program
```bash
java Main
```

## 💻 Usage Examples

### Valid Username
```
Enter your username: 
john2024
Hello, john2024
```

### Too Short
```
Enter your username: 
joe
Your username must be between 4-12 characters
```

### Contains Space
```
Enter your username: 
john doe
Username must not contain spaces or underscores
```

### Contains Underscore
```
Enter your username: 
john_doe
Username must not contain spaces or underscores
```

### Too Long
```
Enter your username: 
verylongusername123
Your username must be between 4-12 characters
```

## 🔍 Technical Implementation

### Length Validation Logic
```java
if(username.length() < 4 || username.length() > 12){
    System.out.println("Your username must be between 4-12 characters");
}
```
Uses the logical OR operator (`||`) to check both minimum and maximum bounds in a single condition.

### Character Restriction Logic
```java
else if(username.contains(" ") || username.contains("_")){
    System.out.println("Username must not contain spaces or underscores");
}
```
Leverages the `contains()` method to search for prohibited characters efficiently.

## 🛠️ Technical Details

- **Language:** Java
- **Input Method:** Scanner class
- **String Methods Used:** `length()`, `contains()`
- **Logical Operators:** OR (`||`)
- **Validation Pattern:** Sequential conditional checking

## 📚 What I Learned

- Implementing multi-criteria input validation
- Using string methods for content analysis
- Combining multiple conditions with logical operators
- Writing user-friendly error messages
- Creating validation rules based on real-world requirements
- Proper use of if-else chains for validation logic
- Resource management with Scanner class

## 💡 Real-World Applications

This validation pattern is used in:

- **User Registration Systems** - Account creation workflows
- **Social Media Platforms** - Username uniqueness and formatting
- **Gaming Applications** - Player ID validation
- **E-commerce Sites** - Customer account setup
- **Enterprise Software** - Employee ID formatting
- **API Authentication** - Username/token validation

## 🔮 Future Enhancements

### Validation Improvements
- [ ] Add email format validation
- [ ] Implement password strength checker
- [ ] Check for profanity or inappropriate words
- [ ] Verify username uniqueness against a database
- [ ] Add support for international characters
- [ ] Implement username availability check

### Feature Additions
- [ ] Allow configurable validation rules (admin settings)
- [ ] Add password confirmation matching
- [ ] Implement "forgot username" functionality
- [ ] Create username suggestion generator
- [ ] Add regex-based validation for complex patterns
- [ ] Build a complete registration form
- [ ] Add unit tests for validation logic

### User Experience
- [ ] Provide real-time validation as user types (GUI)
- [ ] Show password strength indicator
- [ ] Display allowed characters list
- [ ] Add example valid usernames
- [ ] Implement retry limit with cooldown

## 🎓 Concepts Demonstrated

1. **Input Validation** - Essential security practice
2. **String Manipulation** - Using built-in string methods
3. **Logical Operators** - Combining multiple conditions
4. **Error Handling** - Providing meaningful feedback
5. **Control Flow** - If-else conditional chains
6. **Code Readability** - Clear comments and structure
7. **User Experience** - Helpful error messages

## ⚙️ Advanced Validation Patterns

### Regular Expression Alternative
For more complex validation, consider using regex:

```java
String usernamePattern = "^[a-zA-Z0-9]{4,12}$";
if (!username.matches(usernamePattern)) {
    System.out.println("Invalid username format");
}
```

### Separate Validation Methods
For scalability, extract validation into methods:

```java
public static boolean isValidLength(String username) {
    return username.length() >= 4 && username.length() <= 12;
}

public static boolean hasValidCharacters(String username) {
    return !username.contains(" ") && !username.contains("_");
}
```

## 🧪 Testing Scenarios

| Test Case | Input | Expected Output |
|-----------|-------|-----------------|
| Valid username | `john2024` | "Hello, john2024" |
| Too short | `joe` | Length error |
| Too long | `verylongusername` | Length error |
| Contains space | `john doe` | Character error |
| Contains underscore | `john_doe` | Character error |
| Empty string | `` | Length error |
| Exact min length | `john` | "Hello, john" |
| Exact max length | `johnsmith123` | "Hello, johnsmith123" |

## 🔐 Security Considerations

### Current Implementation
✅ Prevents common formatting issues  
✅ Enforces length constraints  
✅ Restricts special characters

### Additional Security Recommendations
- Sanitize input to prevent SQL injection
- Hash usernames if stored in database
- Implement rate limiting for registration attempts
- Add CAPTCHA for automated submission prevention
- Check against common/compromised username lists

## 📖 Learning Resources

- [Java String Methods](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [Input Validation Best Practices](https://owasp.org/www-project-proactive-controls/v3/en/c5-validate-inputs)
- [Regular Expressions in Java](https://docs.oracle.com/javase/tutorial/essential/regex/)

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Your Name**

- GitHub: [@ClydeCenteno1](https://github.com/ClydeCenteno1)
- Email: centenoclydeamiel@gmail.com

## 🤝 Contributing

Contributions are welcome! Here are some ways you can help:

### Good First Issues
- Add more character restrictions (special symbols)
- Implement regex validation
- Create unit tests
- Add input sanitization
- Build a GUI version

### How to Contribute

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AddRegexValidation`)
3. Commit your changes (`git commit -m 'Add regex pattern validation'`)
4. Push to the branch (`git push origin feature/AddRegexValidation`)
5. Open a Pull Request

## 🌟 Acknowledgments

- Validation rules inspired by industry-standard authentication systems
- Built as part of my Java fundamentals learning journey

---

⭐ If this project helped you understand input validation in Java, please give it a star!

**Happy Coding!** 💻
