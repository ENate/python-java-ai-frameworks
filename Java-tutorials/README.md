## Java Algorithms

### Quick Sort algorithm

1. Quicksort algorithm is suitable for sorting large lists/arrays. It relies on a divide and conquer algorithm, where the original array is divided into two arrays, each of them is sorted individually. Then, the sorted output is merged to produce the result. It has a complexity of about O(n log n), making it suitable for sorting big data volumes. In principle, the quicksort algorithm repeatedly divides an un-sorted section into a lower order sub-section and a higher order sub-section by comparing to a pivot element. This proceeds in a recursive manner. At the end of the recursion, we get sorted array. Also, the implementation of the quicksort is done “in-place” - meaning that sorting takes place in the array and no additional array needs to be created.

2). Merge Sort

In computer science, merge sort (also commonly spelled merge sort) is an O(n log n) comparison-based sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the input order of equal elements in the sorted output. Merge sort is a divide and conquer algorithm. Divide and conquer algorithms divide the original data into smaller sets of data to solve the problem. During the Merge sort process the object in the collection are divided into two collections. To split a collection, Merge-sort will take the middle of the collection and split the collection into its left and its right part. The resulting collections are again recursively splitted via the Merge sort algorithm until they are broke to single element in each collection. After splitting each collection, merge-sort algorithm start combining all collections obtained via above procedure. To combine both collections Merge sort start at each collection at the beginning. It pick the object which is smaller and inserts this object into the new collection. For this collection it now selects the next elements and selects the smaller element from both collection by comparing one element from each collection at a time. This process create a collection of sorted elements (subset of all elements which needs to be sorted). This process is recursively done for all available collections obtained in first step i.e. splitting the collections. Once all elements from both collections have been inserted in the new collection, Mergesort has successfully sorted the collection. To avoid the creation of too many collections, typically only one new collection is created and the new one and existing one are treated as different collections.

Conceptually, merge sort works as follows in recursive fashion:

- Divide the unsorted list into two sub-lists of about half the size
- Sort each of the two sub-lists
- Merge the two sorted sub-lists back into one sorted list

When to use Merge Sort:

- Not suitable in situations where the data structure doesn’t support random access, because it works with pure sequential access (forward iterators, rather than random access iterators). Also widely used for external sorting: where random access can be very expensive compared to sequential access. For example, When sorting a file which doesn’t fit into memory can be broken into chunks and sorted independently, writing each out to a file, then merge sort the generated files.

- Merge sort is used when you need a stable sort. It’s very important feature of merge sort.
- It is quicker when dealing with linked lists because pointers can easily be changed when merging lists. It only requires one pass (O(n)) through the list.
- If there is a lot of parallelization occurs then parallelizing Mergesort is simpler than other sort algorithms.

  3). Bubble Sort

  Bubble Sort is a simple and slow sorting algorithm that repeatedly steps through the collection, compares each pair of adjacent elements and swaps them if they are in the wrong order. In the sorting algorithm, if you watch the move of the elements with higher orders (i.e. larger values), they are like bubbles in the water, floating slowly from the bottom to the top (from one side/middle of wrray to other side of array). You can imagine that on every step big bubbles float to the surface and stay there. At the step, when no bubble moves, sorting stops.
  Bubble Sort Algorithm The basic idea of Bubble Sort algorithm can be described as these steps:

Data elements are grouped into two sections: a sorted section and an un-sorted section.
Go through every element in the un-sorted section and re-arrange its position with its neighbor to put the element with higher order on the higher position. At the end, the element with the highest order will be on top of the un-sorted section, and moved to the bottom of the sorted section.
Repeat step 2 until no more elements left in the un-sorted section.

-Bubble Sort Performance and Complexity
-Bubble sort belongs to O(n2) sorting algorithms, which makes it quite inefficient for sorting large data volumes.
-Bubble sort is both stable and adaptive.
-In the case of nearly sorted data, bubble sort takes O(n) time, but requires at least 2 passes through the data.
-It can be practical if the input is usually in sort order but may occasionally have some out-of-order elements nearly in position.
-Bubble sort should be avoided in the case of large collections.
-It will not be efficient in the case of a reverse-ordered collection.
