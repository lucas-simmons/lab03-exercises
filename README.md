# LAB 3 HEADER

# Find All Duplicates
Write a function or(or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

# Describe Different Approaches to Solving This Problem
The nested loop solution involves creating a new list, and manually adding each element from the original list, but checking if that element is contained in the list greater than once. If the check is true, then the element is added to the new list, if not, then it's ignored.
The map/dictionary solution involves creating a new list and a set as well. Inside of a for loop iterating to the size of the original list, an if statement tries to add an element to the set, and if it returns as false, then the loop continues onto another if statement, checking if the element is already in the new list. If the element is already in the new list, then it's ignored, if not, then it's added.

The nested loop implementation. involves some more coding and leaves space for mistakes to be made with edge cases, while the set implementation is much simpler, and because of that it's safer.