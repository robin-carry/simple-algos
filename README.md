# Introduction to Algorithms

Attempt to understand the basics of Algorithms after 16yrs when last studied at college. 

Note: There are specific questions folder which are based on one or the other concepts. 

## Special

1. **Finding Pairs**: For a given array with 'n' values, find if a pair exists with exact sum equal to 'x'.

    Input: List of Array `A(n)` & Exact Sum Value `x`

    Output: `true` if pair exists / `false` if pair doesn't exists.

    i. Tag: Sorting
    
    ii. Compelxity: O(nlogn) - if using merge sort. 

2. **Inversion**: For a given array with `A(n)` values, find the total number of pairs where for index `i < j` find values where `A[i] > A[j]`

    Input: List of Array `A(n)`

    Output: Count of number of pairs

    i. Tag: Merge Sort
    
    ii. Complexity: O(nlogn) 

    _Trick: Check each time the `right` is swapped with `left` or the `right` stack is done and `left` stack has values remaining._

3. Multiplying String Numbers: Give two large enough numbers in string representation, give multiplcation output. 

    Input: Two strings with only digits in it. 
    Output: String representation of the multiplication. 

    _Trick: Number of length `m` & `n`, results in number with length `m+n`. Use Array of length `m+n`. O(n^2)` complexity_

## Sorting

1. Insertion Sort: Remember using the cards in hand. 
    
    i. Insertion Sort Descending
    
    ii. Insertion Sort using Merge Sort like principle of recursion or Inserting `A(n)` value can be done by recursively doing it for `A(n-1)`.

2. Selection Sort: Traversing over twice, swapping outer value with least of inner values. 

3. Merge Sort: Using Divide and Conquire where then each element is compared with neighbour. Then merged back in sorted order. 

4. Bubble Sort: Even though it is useless just keeping it around to be aware of it. 

## Searching

1. Binary Search : Same as Merge Sort of Divide and Conqure. 