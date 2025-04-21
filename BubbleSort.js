/*
Manual Run Through: What Happened?
We must understand what happened in this first run through to fully understand the algorithm, so that we can implement the algorithm in a programming language.

Can you see what happened to the highest value 12? It has bubbled up to the end of the array, where it belongs. But the rest of the array remains unsorted.

So the Bubble Sort algorithm must run through the array again, and again, and again, each time the next highest value bubbles up to its correct position. The sorting continues until the lowest value 3 is left at the start of the array. This means that we need to run through the array 4 times, to sort the array of 5 values.

And each time the algorithm runs through the array, the remaining unsorted part of the array becomes shorter.

*/

/*
For a general explanation of what time complexity is, visit this page.

For a more thorough and detailed explanation of Bubble Sort time complexity, visit this page.

The Bubble Sort algorithm loops through every value in the array, comparing it to the value next to it. So for an array of 
n
 values, there must be 
n
 such comparisons in one loop.

And after one loop, the array is looped through again and again 
n
 times.

This means there are 
n
⋅
n
 comparisons done in total, so the time complexity for Bubble Sort is On2

 */


const ada = [10,9,4,6,7,3]

for(j=0;j<ada.length-1;j++){
    if(ada[j]>ada[j+1]){
        let temp = ada[j]
        ada[j] = ada[j+1]
        ada[j+1] = temp
        
    }
}
for(j=0;j<ada.length-2;j++){
    if(ada[j]>ada[j+1]){
        let temp = ada[j]
        ada[j] = ada[j+1]
        ada[j+1] = temp
        
    }
}
console.log(ada)