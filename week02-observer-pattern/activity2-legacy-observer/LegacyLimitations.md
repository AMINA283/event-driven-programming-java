
# Limitations of Java's Legacy Observer Pattern

1. **Deprecated:** Observable and Observer are deprecated in modern Java.

2. **Class inheritance:** Observable is a class, so a class extending it cannot extend another class.

3. **Limited flexibility:** The built-in Observer interface provides only one update method.

4. **No type safety:** The update method uses Object, which requires type checking and casting.

5. **Poor encapsulation:** Observers can access the subject object and retrieve its data directly.
