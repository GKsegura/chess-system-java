# ♟️ Chess System Java

Terminal-based chess game developed in Java with full OOP implementation, covering all official chess rules and special moves.

> Part of the **Java COMPLETO** course by [Prof. Nelio Alves](https://github.com/acenelio).

---

## 📋 About the Project

Chess System is a fully functional chess game that runs in the terminal. The project was built to consolidate object-oriented programming concepts through a complex, rule-driven domain model. It covers piece movement logic, turn management, check/checkmate detection, and all three special moves of chess.

---

## ✅ Features

- ♟️ Full chess game logic in the terminal
- 🎨 Colored piece display (requires Git Bash on Windows or a compatible terminal)
- 🔄 Turn-based system with player switching
- ✅ Check and Checkmate detection
- 🏰 Special move: **Castling**
- 👣 Special move: **En Passant**
- 👑 Special move: **Promotion**
- 📋 Display of captured pieces per player
- 🗺️ Possible moves highlighted on board

---

## 🧱 OOP Concepts Applied

- Encapsulation & Access Modifiers
- Inheritance & Polymorphism
- Abstract classes and methods
- Exception handling (custom exceptions: `BoardException`, `ChessException`)
- Static members
- Enumerations (`Color`)
- Layered architecture (Chess layer / Board layer / UI layer)
- Overriding & Overloading
- Downcasting

---

## 🗂️ Project Structure

```
src/
├── application/
│   ├── Program.java          # Entry point
│   └── UI.java               # Terminal interface & board rendering
├── boardgame/
│   ├── Board.java
│   ├── BoardException.java
│   ├── Piece.java
│   └── Position.java
└── chess/
    ├── pieces/
    │   ├── Bishop.java
    │   ├── King.java
    │   ├── Knight.java
    │   ├── Pawn.java
    │   ├── Queen.java
    │   └── Rook.java
    ├── ChessException.java
    ├── ChessMatch.java
    ├── ChessPiece.java
    ├── ChessPosition.java
    └── Color.java
```

---

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Paradigm:** Object-Oriented Programming
- **Interface:** Terminal / Console
- **Build:** No external dependencies

---

## ▶️ How to Run

### Prerequisites

- Java JDK 17 or higher installed
- Git Bash (Windows) or any Unix-compatible terminal for colored output

### Steps

```bash
# Clone the repository
git clone https://github.com/GKsegura/chess-system-java.git

# Navigate to the project folder
cd chess-system-java

# Compile the source files
javac -sourcepath src -d bin src/application/Program.java

# Run the application
java -cp bin application.Program
```

> ⚠️ On Windows, use **Git Bash** to see colored piece display correctly.

---

## 🎮 How to Play

1. The board is displayed in the terminal with rows `1–8` and columns `a–h`.
2. Enter the **source position** of the piece you want to move (e.g., `e2`).
3. Possible moves are highlighted with `X` on the board.
4. Enter the **target position** to complete the move.
5. The game alternates between **WHITE** and **BLACK** players.
6. The match ends when **Checkmate** is detected.

---

## 🖼️ Board Preview

```
8 R N B Q K B N R
7 P P P P P P P P
6 - - - - - - - -
5 - - - - - - - -
4 - - - - - - - -
3 - - - - - - - -
2 P P P P P P P P
1 R N B Q K B N R
  a b c d e f g h
```

---

## 📚 Course Reference

- 👨‍🏫 **Instructor:** Prof. Dr. Nelio Alves
- 📖 **Course:** Java COMPLETO — Programação Orientada a Objetos + Projetos
- 🔗 **System Design:** [chess-system-design](https://github.com/acenelio/chess-system-design)

---

## 👨‍💻 Author

**José Segura**
🔗 [GitHub](https://github.com/GKsegura)

---

## 📄 License

This project was developed for educational purposes as part of a Java OOP course.
