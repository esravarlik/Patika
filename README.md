# Patika
Kodluyoruz Eğitimi kapsamında açtığım ilk repo

UniversityManagementSystem Diagram

- There are classrooms, study offices and departments belonging to the university.
- There are offices belonging to the departments.
- There are university employees. These employees can be professors or civil servants.
- Every employee works in an office.


![UniversityManagementSystem drawio](https://user-images.githubusercontent.com/40757395/164070199-b8e191d4-c715-451c-b807-7f80a3436d8f.png)

---

You design a system to track information about animals in a zoo.

Animals:
- Horses (horses, zebras, donkeys, etc.),
- Felines (tigers, lions, etc.),
- It is characterized by species in groups such as rodents (rats, beavers, etc.).
- Most of the information stored about animals is the same for all groupings.
- species name, weight, age, etc.
- The system should also be able to get the dosage of specific drugs for each animal -> getDosage()
- System should be able to calculate Feed times -> getFeedSchedule()
- The logic for the system to perform these functions will be different for each grouping. For example, the feeding algorithm will be different for horses and different for tigers.


![ZooManagementSystem drawio](https://user-images.githubusercontent.com/40757395/164084008-635f7c66-9037-450a-a123-2d183e8ed0f1.png)

---

Design a system for the management of flights and pilots.

- Airlines operate the flights. Every airline has an identity.
- The airline has different types of aircraft.
- Aircraft may be operational or in a state of repair.
- Each flight has a unique identity, airport to take off and land at, and departure and landing times.
- Every flight has a pilot and co-pilot, and they operate the plane.
- Airports have unique IDs and names.
- Airlines have pilots, and each pilot has a level of experience.
- An aircraft type may need a certain number of pilots.


![FlightManagementSystem](https://user-images.githubusercontent.com/40757395/164107291-0a25e1d7-6ba6-489e-b1bc-0781895695bd.png)

---

Design the system of the application that sells or rents movies online.

- Movies can be listed and sorted in the app and users can subscribe to the app.
- Users purchase credits through the system for subscription.
- Only subscribed users can rent movies with their credits and the credit amount of the rented movie is deducted from their account.
- Regular users and subscribers can purchase movies.
- If the film is not available, it can be requested.


![OnlineMovieSystem](https://user-images.githubusercontent.com/40757395/164119074-e187069d-4e15-411b-8be6-80a9f0990e5e.png)

---

![ElevatorSimulation](https://user-images.githubusercontent.com/40757395/164325535-83ef8f39-6f01-424a-b20d-4e329341ae50.png)


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
