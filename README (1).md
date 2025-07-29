# 🚀 stream_api_java

Dive deep into Java Streams, demonstrating a wide range of operations with clear and structured examples.

---

## 💡 What is Java Stream?

A **Stream** in Java represents a **pipeline** through which **data flows**. Streams allow you to perform complex data processing operations in a clean, readable, and functional way.

It helps in transforming data from one format to another using a sequence of **intermediate** and **terminal** operations.

---

## 🔧 Stream Operations Overview

Java Stream operations are classified into two types:

---

### 🌀 Intermediate Operations

🧱 These operations **do not return the final result**.  
They return another Stream and are used for transformation or filtering.

- 🔍 `filter()` – Selects elements based on a condition  
- 🔄 `map()` – Transforms each element  
- 🔗 `flatMap()` – Flattens nested structures  
- 👀 `peek()` – For debugging or observing data flow  
- ♻️ `distinct()` – Removes duplicates  
- 📊 `sorted()` – Sorts elements  
- ⏩ `skip(n)` – Skips first `n` elements  
- ⛔ `limit(n)` – Limits to first `n` elements  

---

### 🎯 Terminal Operations

✅ These operations produce the final result of the Stream pipeline.

- 📥 `collect()` – Converts stream to collection  
   - 📂 `groupingBy()`  
   - 🔀 `partitioningBy()`  
- 📉 `min()` / 📈 `max()` – Finds smallest/largest value  
- 🔍 `findFirst()` – Gets the first element  
- ❓ `anyMatch()` – Checks if any match a condition  
- 🔢 `count()` – Counts elements  
- ➕ `sum()` – Calculates the sum  

---
