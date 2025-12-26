# Cricket Match Console Application

A simple **Java console-based application** that simulates different aspects of a cricket match.  
This project demonstrates **core Java concepts** such as loops, conditionals, switch-case, user input handling, and modular programming with multiple methods.

---

## Features
- **Last Over Runs Data**  
  - Input runs ball-by-ball for the last over.  
  - Displays a summary table of runs and whether a wicket fell.

- **Average Runs Calculation**  
  - Enter runs for each ball in the last over.  
  - Calculates and displays the average runs per ball.

- **Player Details**  
  - Input team names and player names.  
  - Displays formatted team rosters.

- **Match Details**  
  - Input match date, time, venue, type, captains, toss winner, weather, and temperature.  
  - Generates a descriptive match introduction.

- **Predict Runs for the Team**  
  - Input results of the last 10 matches (Win = 1, Draw = 0, Lose = -1).  
  - Calculates points and predicts whether the team will win, lose, or depend on toss.

- **Exit Option**  
  - Gracefully terminates the program.

---

## Tech Stack
- **Language**: Java  
- **Concepts Used**: Scanner class, loops (`while`, `for`), switch-case, arithmetic operations, conditional statements, modular methods.

---

## Project Structure
-`last_over_runs()` → Records and displays runs ball-by-ball for the last over.  
- `Average_runs()` → Calculates average runs per ball.  
- `player_details()` → Captures and displays team player details.  
- `match_details()` → Captures match metadata and prints a descriptive introduction.  
- `predict_runs()` → Predicts team performance based on past 10 matches.  
- `main()` → Menu-driven program loop.
