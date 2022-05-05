---
GenericListExample;

A class has been designed using the generic construct in Java.
It must hold a dynamic Array and its data type must be dynamic.


Class features:
- The default size of the array in the class is 10.
- If the number of elements of the array is needed it should increase by 2 times.
- There must be two types of constructor methods;
    - **MyList():** If the empty constructor is used, the initial size of the array should be 10.
    - **MyList(int capacity):** The initial value of the array should be taken from the capacity parameter.
- **size():** Returns the number of elements in the array.
- **getCapacity():** Returns the capacity of the array.
- **add(T data):** Should be used to add elements to the array.
- **get(int index):** Returns the value in the index. Returns null if invalid index is entered.
- **remove(int index):** should delete the data in the given index and shift the data after the deleted index to the left. Returns null if invalid index is entered.
- **set(int index, T data):** It should replace the data in the given index with a new one. Returns null if invalid index is entered.
- **int indexOf(T data):** Returns the index of the value given in the parameter in the list. Returns -1 if the object is not in the list.
- **int lastIndexOf(T data):** Returns the last index of the item specified in the list. Returns -1 if the object is not in the list.
- **boolean isEmpty():** Returns whether the list is empty.
- **T[] toArray():** Converts the items in the list into an array in the same order.
- **clear():** Deletes all items in the list.
- **MyList<T> sublist(int start,int finish):** A list of the index range given in the parameter is returned.
- **boolean contains(T data):** Returns whether the value given in the parameter is in the array.
