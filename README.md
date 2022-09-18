# Traversal Of Array Solution

## Method 1 : Iterating Clockwise

In this approach, I have divided the matrix into loops and iterated it over the boundaries.

Firstly the elements of outer loop are printed in clockwise manner and then I print the elements of inner loop.

Hence, printing the elements of a given outer/inner loop can
be solved using 4 "for" loops that print all the elements where every "for" loop defines a particluar direction.

1st For Loop : Left to Right

2nd For Loop : Top to Bottom

3rd For Loop : Right to Left

4th For Loop : Bottom to Up.

### Time Complexity : O(N)
N is the number of elements in the matrix

### Space Complexity : O(N)
Auxillary extra space of size N is required to store the list


## Method 2 : Recursive Approach

The traversal pattern can also be achieved by printing the boundary of matrix recursively.
In each recursive call, we decrease the dimension of the matrix.
Remaining logic remains the same.

### Time Complexity : O(N)

### Space Complexity : O(N)
Space required for recursive call stack.
