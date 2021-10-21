# NBD_PJATK
NoSQL (MongoDB, Neo4J, Riak) and Scala exercises.

NBD Ćwiczenia 4 – MongoDB agregacje
Skorzystaj z bazy z poprzednich ćwiczeń. Przy pomocy operacji map-reduce i  frameworku do agregacji znajdź następujące informacje: 
1.	Średnią wagę i wzrost osób w bazie z podziałem na płeć (tzn. osobno mężczyzn, osobno kobiet); 
2.	Łączną ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty; 
3.	Listę unikalnych zawodów; 
4.	Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości; 
5.	Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty. ,

Aby skorzystać z frameworku do agregacji w starszych wersjach MongoDB trzeba zrobić konwersje wagi i wzrostu na number, przykłady tu: https://stackoverflow.com/questions/29487351/how-to-convert-string-to-numerical-values-in-mongodb
W nowszych wersjach korzystamy z odpowiednich operatorów frameworku do agregacji (do sprawdzenia w dokumentacji) lub również dokonujemy konwersji.
Rozwiązania przesyłamy w następującej formie: dla każdego zadania 4 pliki - osobny plik tekstowy z treścią zapytania/zapytań (dwie wersje – map reduce i aggregate) i osobne pliki z wynikami (dla map reduce i aggregate). Pliki nazywamy wg schematu: zapytanie_X_MR.js, zapytanie_X_A.js  wyniki_X_MR.json, wyniki_X_A.json – gdzie X zastępujemy numerem zadania. 
Aby sensownie zapisywać wyniki do pliku – opakowujemy zapytanie w printjson i ew. po find dodajemy .toArray() – np. printjson(db.products.find().toArray()). Zapytanie zapisujemy do pliku, potem można uruchomić shell mongo w następujący sposób: mongo baza plikzzapytaniem >> plikzwynikami.

