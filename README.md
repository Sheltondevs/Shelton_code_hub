# Shelton_code_hub
This Java program is designed to accept and validate student assessment marks, compute the final score, and assign a corresponding grade.
The program first prompts the user to input CAT (Continuous Assessment Test) marks, which must be within the range of 0 to 30. It then checks whether the entered value is valid. If the CAT marks fall outside this range, the program immediately stops and displays an error message, ensuring no invalid data is processed.
Next, the program requests exam marks, which must be within the range of 0 to 70. Similar validation is performed, and if the input is invalid, the system denies further execution.
If both inputs are valid, the program calculates the total marks by adding CAT marks and exam marks. Based on this total score, the program assigns a grade using a predefined grading scale:
A for 70 and above
B for 60–69
C for 50–59
D for 40–49
E for below 40
Finally, the program displays the CAT marks, exam marks, total score, and the computed grade as the output.
Overall, the program demonstrates input validation, conditional logic, and basic grading computation in Java.