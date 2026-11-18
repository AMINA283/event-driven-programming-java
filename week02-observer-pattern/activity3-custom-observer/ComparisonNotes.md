
# Comparison: Tightly Coupled vs Observer Pattern

## 1. Adding a new display
- Tightly Coupled: DataModel must be modified.
- Observer Pattern: A new observer can simply be registered.

## 2. Testing DataModel in isolation
- Tightly Coupled: Difficult because DataModel depends on display classes.
- Observer Pattern: Easy because DataModel works independently of display classes.

## 3. Removing a display
- Tightly Coupled: DataModel must be modified.
- Observer Pattern: Simply remove the observer.