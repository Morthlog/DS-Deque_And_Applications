# Double-Ended Queue & Applications

Simple Java project implementing a double-ended queue (deque) and two applications of it. It was developed for the course of Data Structures at Athens University of Economics and Business (AUEB).


## Tasks
- **Part A: Double-Ended Queue**  
  - Implement a [StringDoubleEndedQueue](StringDoubleEndedQueueImpl.java) using a doubly-linked list.  
  - Ensure [addFirst](StringDoubleEndedQueueImpl.java#L18), [removeFirst](StringDoubleEndedQueueImpl.java#L41), [addLast](StringDoubleEndedQueueImpl.java#L69), [removeLast](StringDoubleEndedQueueImpl.java#L92), [getFirst](StringDoubleEndedQueueImpl.java#L121), [getLast](StringDoubleEndedQueueImpl.java#L136), and [size](StringDoubleEndedQueueImpl.java#L189) all run in O(1).  
  - Throw `NoSuchElementException` on invalid removals or accesses.
  - **Bonus**: Generic implementation of the deque.
  
- **Part B: Prefix to Infix Converter** 
  - Build [PrefixToInfix.java](PrefixToInfix.java) to convert prefix to infix.
  - Read a prefix expression from standard input (single-digit ints, operators `+ - * /`) using `Scanner` or similar.
  - Use [deque of Part A](StringDoubleEndedQueueImpl.java) to parse and build a fully parenthesized infix string.
  - Validate input: only digits/operators allowed, must start with an operator. Print an error on invalid format.

- **Part C: DNA Palindrome Checker**  
  - Create [DNAPalindrome.java](DNAPalindrome.java) to check if a DNA string (A, T, C, G) is a Watson-Crick complemented palindrome.  
  - Read a DNA string from standard input and validate if it is in correct input (letters A, T, C, G; no spaces, uppercase only).
  - Use exactly **one** [deque from Part A](StringDoubleEndedQueueImpl.java) to decide if it’s a Watson-Crick complemented palindrome.  
  - Overall time O(N), with a **single loop** over the deque after input validation.

- **Part D: Project Report**  
  - Write a 2–5 page PDF [project1-report.pdf](docs/report/en-US/Report%20%7BData%20structures%201%7D%20english.pdf) summarizing your design choices and how each part meets the requirements.

## How to run

### Prerequisites
- At least java 8.
  
**Steps**
1. Open Command Prompt or terminal
2. Navigate to the directory containing the .java files
3. Compile the source files using the following commands:
  - `javac PrefixToInfix.java`
  - `javac DNAPalindrome.java`
4. Run the programs using:
  - For PrefixToInfix `java PrefixToInfix`
  - For DNAPalindrome `java DNAPalindrome`

## Contributors
- [Babis Drosatos](https://github.com/BabisDros)
- [Iosif Petroulakis](https://github.com/Morthlog)
