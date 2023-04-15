Method Variable Argument

Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter

Method Overloading

Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta jumlah atau tipe data parameternya
Jika ada yang sama, maka program Java kita akan error

Recursive Method

Recursive method adalah kemampuan method memanggil method dirinya sendiri
Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial

Problem Dengan Recursive

Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
Kenapa problem ini  bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow


---

Scope

Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat.
Hal ini disebut scope
Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat didalam block, maka hanya bisa diakses didalam block tersebut