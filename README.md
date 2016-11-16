# Finding-the-minimum-coverage--Greedy-
Greedy method for finding the minimum subset of intervals whose reunion covers an interval  

*Author: Ioana-Sofia Pascu*  
*Created: 10/11/2016*
Solved problem for my Advanced Programming Techniques laboratory, written in Java language and using Greedy method.

##Task##
Suppose we have an interval [a,b] and a set of other intervals [ai, bi], 1<=i<=n. Write a program that determines and prints a minimal-cardinality subset of the given set, whose reunion covers interval [a,b], or -1 if that is impossible.

###Sample input
10 20  
5  
9 15  
4 16  
5 12  
14 21  
11 18  

###Sample output
9 15  
14 21  

##Implemented solution##
We will sort the intervals by their right margin.  
We will use **t** as the left margin that we need to cover and then try to go as far right as we can.  
First, **t** will be **a** (left margin of the initial interval). We search between our sorted intervals until we find the one that contains t and has the maximum possible right margin. Let's name it [c,d]. Once we find it, our **t** will become **d**, and we are going to try to find the next interval in the solution.  
Once **t** reaches **b**, we have covered our whole interval, so we have a solution.
If at some point, we can't find the desired [c,d] interval, it means we don't have any solution.   

###Example
-In our sample input we have **a=10**, **b=20**  
-The sorted intervals are:  
 [5, 12]  
 [9, 15]  
 [4, 16]  
 [11, 18]  
 [14, 21]  
-**t** will be **a** at first, so **t=10**  
-We find the interval that contains **t** and has the maximum possible right margin, which is **[4, 16]**  
-Next, **t** becomes **t=16**  
-We continue the same principle until **t>=b**  

##Use of variables/structures/functions##
**-Interval** -> self-written class that holds the margins of intervals and makes possible comparing them only by their right margin  
**-a, b** -> margins of the given interval  
**-n** -> number of intervals in the set  
**-arr** -> array of intervals in the set  
**-sol** -> array of intervals that will be in the solution  
**-read()** -> function that reads the data and adds the intervals in the array *arr*  
**-print()** -> sorts the array *arr* by the right margin (b), then finds and prints the solution, if it exists  
**-max_fin(int t)** -> returns the interval that contains t and goes as further right as possible  
