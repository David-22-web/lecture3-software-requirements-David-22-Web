

# Lecture 3: Software Requirements Engineering

**Student**: David-22-Web  
**Course**: Software Engineering

## Project Contents
This repository contains all requirements artifacts for Lecture 3:

### Documentation
- `docs/backlog.md` - Product Backlog with MoSCoW Prioritization
- `docs/traceability-matrix.md` - Requirements to Test Cases mapping
- `docs/non-functional-requirements.md` - NFRs: Performance, Security, Usability
- `docs/definition-of-done.md` - Team DoD criteria
- `docs/SRS.md` - Software Requirements Specification

### Source Code
Java implementation of MoSCoW prioritization:
- `src/MoscowPriority.java` - Enum for priorities
- `src/UserStory.java` - UserStory class
- `src/BacklogPolicy.java` - Business logic for backlog
- `src/Demo.java` - Demo with sample data

## How to Run
```bash
javac src/*.java
java -cp src Demo