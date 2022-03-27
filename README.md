# TruckCGO

**Students**
- Kirsty Borg, 
- Álvaro Navarro Quijada,
- Ashean Denuka Weerakoon Abeysinghe Hettige


## Intruduction
### What's a greedy algorithm
A greedy algorithm is a simple, intuitive algorithm that is used in optimization problems. The algorithm makes the optimal choice at each step as it attempts to find the overall optimal way to solve the entire problem.

### Structure of a Greedy Algorithm
Greedy algorithms take all of the data in a particular problem, and then set a rule for which elements to add to the solution at each step of the algorithm. The solution that the algorithm builds is the sum of all of those choices.

## Description of the problem to solve
A company called GREEDY.CO hires a company to transport its products, which charges €40 per package delivered, regardless of weight and shape. The transport system has a capacity of 10 Tm. As there are goods with very different weights, the driver (and lorry’s owner) ask you to provide a greedy algorithm to choose the goods to be carried so that the money received from GC will be maximum. This algorithm must ask the user for the weights of the goods and after executing should show the weights of the chosen goods and the amount of the bill for the transport service.
The algorithm we devised proceeds by sorting the various parcels by weight, from the smallest to the largest, and then sorting the various parcels in ascending order, so that the greatest number of parcels can be placed with the greatest gain.
Therefore applied to a greedy algorithm, our candidates will be the boxes, which will be sorted using a quick-sort algorithm (explained later) and then iterated until either the maximum capacity or the end of the candidates is .
