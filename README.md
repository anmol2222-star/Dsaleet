TOPIC 1 — ARRAYS & HASH MAPS

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
1     Two Sum                                     Easy         HashMap + complement
217   Contains Duplicate                          Easy         HashSet
242   Valid Anagram                               Easy         Frequency counting
349   Intersection of Two Arrays                  Easy         HashSet
1512  Number of Good Pairs                        Easy         Frequency counting
1748  Sum of Unique Elements                      Easy         Frequency map
1207  Unique Number of Occurrences                Easy         Frequency + HashSet
2215  Find Difference of Two Arrays               Easy         Set difference
2089  Find Target Indices After Sorting Array     Easy         Sorting + binary search
645   Set Mismatch                                Easy         Frequency / index marking
268   Missing Number                              Easy         XOR / sum
287   Find the Duplicate Number                  Medium       Floyd's cycle detection
442   Find All Duplicates in an Array             Medium       Index marking
448   Find All Numbers Disappeared in an Array    Easy         Index marking
1464  Maximum Product of Two Elements              Easy         Track two maximums
628   Maximum Product of Three Numbers             Easy         Sort + extremes
2091  Removing Minimum and Maximum                 Medium       Position + greedy
4065  Rearrange Array by Removing Distinct Values Easy         Frequency counting
4083  Minimum Deletions to Make Array Sharp        Easy         Remove adjacent duplicates


TOPIC 2 — TWO POINTERS

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
125   Valid Palindrome                            Easy         Left + right pointers
344   Reverse String                              Easy         Swap from both ends
26    Remove Duplicates from Sorted Array         Easy         Slow + fast pointer
27    Remove Element                              Easy         Two pointers
167   Two Sum II                                  Medium       Sorted array + two pointers
11    Container With Most Water                   Medium       Two pointers + greedy
881   Boats to Save People                        Medium       Sort + two pointers
977   Squares of a Sorted Array                   Easy         Compare both ends
75    Sort Colors                                 Medium       Dutch National Flag
283   Move Zeroes                                 Easy         Slow + fast pointer
189   Rotate Array                               Medium       Reverse + two pointers
345   Reverse Vowels of a String                   Easy         Two pointers


TOPIC 3 — SLIDING WINDOW

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
3     Longest Substring Without Repeating          Medium       Window + HashSet
209   Minimum Size Subarray Sum                    Medium       Variable-size window
219   Contains Duplicate II                       Easy         Window + HashSet
424   Longest Repeating Character Replacement      Medium       Frequency + window
643   Maximum Average Subarray I                   Easy         Fixed-size window
1652  Defuse the Bomb                              Easy         Circular sliding window


TOPIC 4 — BINARY SEARCH

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
704   Binary Search                               Easy         Standard binary search
35    Search Insert Position                      Easy         Lower-bound search
69    Sqrt(x)                                     Easy         Binary search on answer
153   Find Minimum in Rotated Sorted Array        Medium       Rotated binary search
162   Find Peak Element                           Medium       Binary search on slope
852   Peak Index in a Mountain Array               Medium       Binary search on peak


TOPIC 5 — LINKED LIST

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
21    Merge Two Sorted Lists                      Easy         Two pointers
19    Remove Nth Node From End                    Medium       Fast + slow pointer
24    Swap Nodes in Pairs                         Medium       Pointer manipulation
61    Rotate List                                 Medium       Make circular + break
83    Remove Duplicates from Sorted List           Easy         Compare adjacent nodes
86    Partition List                              Medium       Two separate lists
92    Reverse Linked List II                      Medium       Partial reversal
141   Linked List Cycle                           Easy         Floyd's algorithm
143   Reorder List                                Medium       Middle + reverse + merge
203   Remove Linked List Elements                 Easy         Dummy node
206   Reverse Linked List                         Easy         Three-pointer reversal
234   Palindrome Linked List                       Easy         Middle + reverse + compare
237   Delete Node in a Linked List                 Medium       Copy next node
328   Odd Even Linked List                         Medium       Separate odd/even nodes
876   Middle of the Linked List                    Easy         Fast + slow pointer
2095  Delete the Middle Node                       Medium       Fast + slow pointer
2130  Maximum Twin Sum                            Medium       Reverse second half


TOPIC 6 — STACK

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
20    Valid Parentheses                            Easy         Matching brackets
150   Evaluate Reverse Polish Notation              Medium       Stack evaluation
3174  Clear Digits                                 Easy         Stack simulation
946   Validate Stack Sequences                     Medium       Stack simulation
1475  Final Prices With Special Discount           Easy         Monotonic stack
921   Minimum Add to Make Parentheses Valid        Medium       Balance / stack
844   Backspace String Compare                     Easy         Stack simulation


TOPIC 7 — BINARY TREES

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
94    Binary Tree Inorder Traversal                Easy         DFS
144   Binary Tree Preorder Traversal               Easy         DFS
145   Binary Tree Postorder Traversal              Easy         DFS
100   Same Tree                                    Easy         Recursive DFS
101   Symmetric Tree                               Easy         Mirror DFS
104   Maximum Depth of Binary Tree                 Easy         DFS + height
111   Minimum Depth of Binary Tree                 Easy         BFS / level order
112   Path Sum                                     Easy         DFS + target sum
199   Binary Tree Right Side View                  Medium       BFS + last node
226   Invert Binary Tree                           Easy         Recursive DFS
404   Sum of Left Leaves                           Easy         DFS + leaf check
543   Diameter of Binary Tree                      Easy         DFS + height
572   Subtree of Another Tree                      Easy         DFS + same tree
617   Merge Two Binary Trees                       Easy         Recursive DFS
2236  Root Equals Sum of Children                  Easy         Direct condition


TOPIC 8 — DYNAMIC PROGRAMMING

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
53    Maximum Subarray                             Medium       Kadane's algorithm
70    Climbing Stairs                              Easy         1D DP
198   House Robber                                 Medium       Choose / skip DP
877   Stone Game                                   Medium       Game / interval DP
1137  N-th Tribonacci Number                       Easy         1D DP


TOPIC 9 — GREEDY

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
55    Jump Game                                    Medium       Track farthest reach
121   Best Time to Buy and Sell Stock              Easy         Track minimum price
763   Partition Labels                             Medium       Last occurrence + greedy
1909  Remove One Element to Make Array Increasing  Easy         Fix first violation
2144  Minimum Cost of Buying Candies               Easy         Sort + discount
2769  Find Maximum Achievable Number               Easy         Mathematical observation
2996  Smallest Missing Integer                     Easy         Sequential prefix + greedy
3936  Minimum Swaps to Move Zeros to End            Easy         Count misplaced zeros
4000  Largest Integer With Given Digit Sum         Easy         Fill largest digits first


TOPIC 10 — BIT MANIPULATION

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
136   Single Number                                Easy         XOR cancellation
231   Power of Two                                 Easy         n & (n - 1)
338   Counting Bits                                Easy         DP + bit trick
371   Sum of Two Integers                           Medium       XOR + carry
461   Hamming Distance                              Easy         XOR + count set bits


TOPIC 11 — PREFIX SUM

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
1480  Running Sum of 1d Array                      Easy         Prefix accumulation
724   Find Pivot Index                             Easy         Left sum = right sum
1991  Find Middle Index in Array                   Easy         Prefix + total sum
2574  Left and Right Sum Differences                Easy         Prefix + suffix sum
1732  Find the Highest Altitude                     Easy         Running prefix sum


TOPIC 12 — STRINGS

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
14    Longest Common Prefix                        Easy         Character comparison
28    Find Index of First Occurrence               Easy         String matching
38    Count and Say                                Medium       Run-length encoding
43    Multiply Strings                             Medium       Digit multiplication
58    Length of Last Word                          Easy         Traverse from end
168   Excel Sheet Column Title                     Easy         Modified base-26
205   Isomorphic Strings                            Easy         Two-way mapping
242   Valid Anagram                                Easy         Frequency counting
345   Reverse Vowels of a String                    Easy         Two pointers
557   Reverse Words in a String III                 Easy         Reverse each word
844   Backspace String Compare                      Easy         Stack
1108  Defanging an IP Address                       Easy         String replacement
1576  Replace All ?'s                               Easy         Greedy
1662  Check If Two String Arrays Are Equivalent     Easy         String comparison
1910  Remove All Occurrences of a Substring         Medium       Repeated removal
2710  Remove Trailing Zeros From a String           Easy         Remove suffix
2716  Minimize String Length                        Easy         Count distinct chars
3110  Score of a String                             Easy         Adjacent differences
3216  Lexicographically Smallest String             Easy         Local greedy swap
3498  Reverse Degree of a String                    Easy         Character value + position
3992  Rearrange String to Avoid Character Pair      Easy         Character arrangement


TOPIC 13 — MATH / NUMBER THEORY

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
9     Palindrome Number                             Easy         Reverse number
1317  Sum of Two No-Zero Integers                  Easy         Brute force
1523  Count Odd Numbers in an Interval              Easy         Mathematical formula
2413  Smallest Even Multiple                        Easy         LCM / parity
2520  Count Digits That Divide a Number             Easy         Digit extraction
263   Ugly Number                                   Easy         Divide by 2, 3, 5
326   Power of Three                                Easy         Repeated division
3536  Maximum Product of Two Digits                 Easy         Find two largest digits
3658  GCD of Odd and Even Sums                      Easy         Euclidean GCD
1979  Find Greatest Common Divisor of Array         Easy         Repeated GCD
504   Base 7                                       Easy         Base conversion
507   Perfect Number                                Easy         Divisor sum
628   Maximum Product of Three Numbers              Easy         Sort + extreme values
3986  Elapsed Seconds Between Two Times             Easy         Convert to seconds
509   Fibonacci Number                              Easy         Iteration / DP
1137  N-th Tribonacci Number                        Easy         Iteration / DP
1304  N Unique Integers Sum up to Zero              Easy         Positive-negative pairs
2119  Number After a Double Reversal                Easy         Trailing-zero observation
3345  Smallest Divisible Digit Product I            Easy         Brute force
3550  Smallest Index With Digit Sum Equal to Index  Easy         Digit sum
3870  Count Commas in Range                         Easy         Digit-range counting
4070  Minimum Rotations to Dial a Number I          Easy         Circular distance
4078  Three Fibonacci Sum                            Easy         Fibonacci observation


TOPIC 14 — SIMULATION / IMPLEMENTATION

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
1103  Distribute Candies to People                 Easy         Direct simulation
1700  Students Unable to Eat Lunch                 Easy         Queue simulation
2073  Time Needed to Buy Tickets                    Easy         Queue / counting
3014  Minimum Number of Pushes to Type Word I       Easy         Frequency + assignment
3168  Minimum Number of Chairs                      Easy         Track occupancy
3622  Check Divisibility by Digit Sum and Product   Easy         Digit manipulation
4020  Elevator Requests I                           Easy         Direct simulation


TOPIC 15 — SORTING

No.   Problem                                      Difficulty   Pattern / Approach
-----------------------------------------------------------------------------------------
75    Sort Colors                                  Medium       Dutch National Flag
88    Merge Sorted Array                           Easy         Merge from back
912   Sort an Array                                 Medium       Sorting algorithm
1984  Minimum Difference Between Highest/Lowest K   Easy         Sort + sliding window
2089  Find Target Indices After Sorting Array       Easy         Sort + count/range


🔥 Mixed DSA Revision Set
No.   Problem                                      Difficulty   Main Pattern
--------------------------------------------------------------------------------
1     1. Two Sum                                  Easy         HashMap
2     125. Valid Palindrome                       Easy         Two Pointers
3     3. Longest Substring Without Repeating      Medium       Sliding Window
4     704. Binary Search                          Easy         Binary Search
5     206. Reverse Linked List                    Easy         Linked List
6     20. Valid Parentheses                       Easy         Stack
7     104. Maximum Depth of Binary Tree            Easy         DFS
8     53. Maximum Subarray                         Medium       Kadane / DP
9     55. Jump Game                                Medium       Greedy
10    136. Single Number                           Easy         XOR
11    724. Find Pivot Index                        Easy         Prefix Sum
12    11. Container With Most Water                Medium       Two Pointers
13    141. Linked List Cycle                       Easy         Fast & Slow
14    150. Evaluate Reverse Polish Notation        Medium       Stack
15    153. Find Minimum in Rotated Sorted Array    Medium       Binary Search
16    198. House Robber                            Medium       DP
17    242. Valid Anagram                           Easy         HashMap / Frequency
18    543. Diameter of Binary Tree                 Easy         DFS + Height
19    424. Longest Repeating Character Replacement Medium       Sliding Window
20    763. Partition Labels                        Medium       Greedy
21    338. Counting Bits                           Easy         Bit Manipulation
22    977. Squares of a Sorted Array               Easy         Two Pointers
23    19. Remove Nth Node From End                 Medium       Fast & Slow
24    946. Validate Stack Sequences                Medium       Stack Simulation
25    121. Best Time to Buy and Sell Stock         Easy         Greedy
26    70. Climbing Stairs                          Easy         DP
27    1991. Find the Middle Index in Array         Easy         Prefix Sum
28    287. Find the Duplicate Number               Medium       Floyd Cycle
29    199. Binary Tree Right Side View             Medium       BFS
30    461. Hamming Distance                        Easy         XOR + Bits
