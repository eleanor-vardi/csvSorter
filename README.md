
# CSV Sorter Project

This project sorts a CSV file based on a specified key field while adhering to memory constraints. 
The program processes the input in chunks, sorts each chunk, and merges the results into a final sorted file.

---


## **Task Description**

Your task is to complete the implementation of the program. Specifically:

1.**Process the Input File:**
   - Read the CSV file in chunks, respecting the memory limit (`max.records.in.memory`).
   - Sort each chunk in memory.
   - Write sorted chunks to temporary files.

2. **Merge the Temporary Files:**
   - Merge all sorted chunks into a single, fully sorted file.

3. **Output the Result:**
   - Write the sorted data to the file path specified in `config.properties` (`output.file.path`).

---

## **Configuration File**

The configuration file `src/main/resources/config.properties` contains the following keys:

```properties
# Input and output file paths
input.file.path=input/input.csv
output.file.path=output/sorted_output.csv

# Memory constraints
max.records.in.memory=1000

# Key field index (0-based)
key.field.index=0
```

---

## **Expected Behavior**

Given the following input CSV file (`input/input.csv`):

```csv
id,name,value
3,apple,10
1,banana,30
2,carrot,20
5,grape,15
4,peach,25
```

The program should produce the following output in `output/sorted_output.csv`:

```csv
id,name,value
1,banana,30
2,carrot,20
3,apple,10
4,peach,25
5,grape,15
```

---



## **Additional Notes**

1. Temporary files are written to the system's default temporary directory unless specified otherwise.
2. Ensure the final sorted file matches the expected order based on the key field.

---
