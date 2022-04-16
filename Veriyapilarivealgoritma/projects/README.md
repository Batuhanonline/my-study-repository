# Proje 1
[22,27,16,2,18,6] -> Insertion Sort

* Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

[2,27,16,22,18,6]

[2,6,16,22,18,27]

[2,6,16,18,22,27]

* Big-O gösterimini yazınız.

n + (n-1) + (n-2)....... + 1

(n * (n + 1))/2

O(n^2)

* Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
* Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

Average case: Aradığımız sayının ortada olması


[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

[2,3,5,8,7,9,4,15,6]

[2,3,4,8,7,9,5,15,6]

[2,3,4,5,7,9,8,15,6]

[2,3,4,5,6,9,8,15,7]

[2,3,4,5,6,7,8,15,9]

[2,3,4,5,6,7,8,9,15]


# Proje 2
[16,21,11,8,12,22] -> Merge Sort

* Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

[16,21,11]-[8,12,22]

[16]-[21,11]-[8]-[12,22]

[16]-[21]-[11]-[8]-[12]-[22]

[16]-[11,21]-[8]-[12,22]

[11,16,21]-[8,12,22]

[8,11,12,21,22]

* Big-O gösterimini yazınız.

O(nlogn)

# Proje 3
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

                6
            5       7
        1               8
    0       3               9
        2       4