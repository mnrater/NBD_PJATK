# NBD_PJATK
NoSQL (MongoDB, Neo4J, Riak) and Scala exercises.

NBD Ćwiczenia 9 – Scala typy i funkcje parametryzowane
1.	(0.3 pkt) Zaimplementuj klasę Container parametryzowaną typem A. Konstruktor klasy powinien przyjmować pojedynczą prywatną wartość wskazanego typu. Klasa powinna implementować następujące metody:
a.	getContent zwracającą przechowywaną wartość
b.	applyFunction przyjmującą funkcję typu A=>R i zwracającą wynik działania funkcji na zawartości kontenera
2.	 (0.2 pkt) Zaimplementuj trait Maybe parametryzowany typem A i dwie dziedziczące z niego klasy – klasę No rozszerzającą Maybe[Nothing] i klasę Yes parametryzowaną typem A i przechowującą pojedynczy obiekt wskazanego typu. Stwórz obiekty obu klas. Sprawdź, czy oba są podtypem Maybe[_] (do sprawdzenia tego służy metoda isInstanceOf parametryzowana sprawdzanym typem)
3.	(0.2 pkt) Rozszerz rozwiązanie zadania 3 o funkcję applyFunction typu A=>R i zwracającą:
a.	dla No: No
b.	dla Yes: Yes(f(zawartość yes))
4.	(0.3 pkt) rozszerz rozwiązanie zadania 3 o funkcję getOrElse parametryzowaną typem i zwracającą:
a.	Dla No – parametr getOrElse
b.	Dla Yes – zawartość Yes
