package Sets;
import java.util.*;


public class SetsDriver {

public static void main(String[] args) {
				
				
// TODO Auto-generated method stub
				
// Test bubbleSortSet
Set<Integer> set = new HashSet<>();
Random rand = new Random();
for (int i = 0; i < 10; i++) {
set.add(rand.nextInt(20) + 1);
			    }
System.out.println("Original Set: " + set);
Set<Integer> sortedSet = bubbleSortSet(set);
System.out.println("Sorted Set: " + sortedSet);
			    
// Test intersection
Set<Integer> s1 = new HashSet<>();
Set<Integer> s2 = new HashSet<>();
for (int i = 0; i < 15; i++) {
s1.add(rand.nextInt(41) + 20);
s2.add(rand.nextInt(41) + 30);
			    }
System.out.println("s1: " + s1);
System.out.println("s2: " + s2);

Set<Integer> intersection = intersection(s1, s2);
System.out.println("Intersection: " + intersection);
System.out.println("--------------------");

// Test setCompliment
Set<Integer> u = new HashSet<>();
Set<Integer> s = new HashSet<>();
for (int i = 0; i < 20; i++) {
u.add(rand.nextInt(51) + 10);
s.add(rand.nextInt(51) + 10);
			    }
System.out.println("u: " + u);
System.out.println("s: " + s);

Set<Integer> compliment = setCompliment(u, s);
System.out.println("Compliment: " + compliment);
System.out.println("--------------------");

// Test addAll
Set<Integer> ts = new TreeSet<>();
Set<Integer> hs = new HashSet<>();
Set<Integer> ls = new LinkedHashSet<>();
int[] sizes = {15, 10000, 100000, 1000000, 500000000, 1000000000};
for (int size : sizes) {
	addAll(ts, hs, ls, size);
			    }

			}
			
public static Set<Integer> bubbleSortSet(Set<Integer> set) {
// Convert set to array
Integer[] arr = set.toArray(new Integer[0]);
int n = arr.length;
int temp = 0;
// Bubble sort
for (int i = 0; i < n-1; i++) {
	for (int j = 0; j < (n - i-1); j++) {
if (arr[j] >	 arr[j+1]) {
// Swap elements
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
			                }
			            }
			        }
			       
// Convert array back to set
Set<Integer> sortedSet = new LinkedHashSet<>();
for (int i = 0; i < n; i++) {
 sortedSet.add(arr[i]);
			        }
			       
			        
return sortedSet;
			    }
			
			
public static Set<Integer> intersection(Set<Integer> s1, Set<Integer> s2) {
Set<Integer> result = new HashSet<>();
for (int num : s1) {
 if (s2.contains(num)) {
result.add(num);
			        }
			    }
return result;
			}
			
public static Set<Integer> setCompliment(Set<Integer> u, Set<Integer> s) {
Set<Integer> result = new HashSet<>();
for (int num : u) {
if (!s.contains(num)) {
result.add(num);
			        }
			    }
return result;
			}

			
public static void addAll(Set<Integer> ts, Set<Integer> hs, Set<Integer> ls, int size) {
Random rand = new Random();
long start, end;
System.out.println("--------------------");
			    // TreeSet
start = System.nanoTime();
for (int i = 0; i < size; i++) {
ts.add(rand.nextInt(100) + 1);
			    }
end = System.nanoTime();
System.out.println("TreeSet size " + size + " took " + (end-start) + " nanoseconds");
			    
			    // HashSet
start = System.nanoTime();
for (int i = 0; i < size; i++) {
hs.add(rand.nextInt(100) + 1);
			    }
end = System.nanoTime();
 System.out.println("HashSet size " + size + " took " + (end-start) + " nanoseconds");
			    
			    // LinkedHashSet
start = System.nanoTime();
for (int i = 0; i < size; i++) {
ls.add(rand.nextInt(100) + 1);
			    }
end = System.nanoTime();
System.out.println("LinkedHashSet size " + size + " took " + (end-start) + " nanoseconds");
			}
	

	}


