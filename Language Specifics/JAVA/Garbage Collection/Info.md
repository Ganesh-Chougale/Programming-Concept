# Java Garbage Collection  
## Definition:  
Automatic memory management to reclaim unused objects.
## Key Points:  
### Heap Memory:  
Divided into Young Generation, Old Generation, and Permanent Generation.  
### GC Process:  
Identifies unreachable objects and removes them.
### JVM Involvement:  
JVM automatically triggers garbage collection.
## Methods:
`System.gc()` (request, not guaranteed).  
Objects become eligible for GC when no references exist.  