# queue-data-structure

**Abstract Data Type**

Queue is a data structure with a restriction that insertion and deletion happens at two different ends. Insertion happens at rear end and deletion happens at front end.

**Operations**
enQueue(int data): Insert element at the rear.
deQueue(int data): Delete element from the front and returns the deleted element.
isEmpty(): checks if queue is empty.
head(): returns the element at the head.

Time Complexity for all these operations should be O(n).

**Note**

In array implementation of stack push has worst case scenario of O(n) when stack is full.

**Testing**

Spock framework with Groovy is used for unit testing.