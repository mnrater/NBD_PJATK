# NBD_PJATK
NoSQL (MongoDB, Neo4J, Riak) and Scala exercises.

NBD Ćwiczenia 6 – Neo4J ciąg dalszy
Ćwiczenie należy oddać w formie pliku tekstowego zawierającego ponumerowane zapytania (zgodnie z numeracją zapytań w tekście ćwiczenia) oraz zestawu plików z wynikami w postaci graficznej i tekstowej (np. SVG i JSON – niestety dostępne opcje eksportu regularnie ulegają zmianie) o nazwach wynikX.svg i wynikX.json, gdzie X to numer zapytania (pliki graficzny i tekstowy należy wyeksportować z pomocą webowego interfejsu bazy, rozszerzenia zależą od wybranych formatów) 
Część 1 – Wycieczki górskie
Zaimportuj dane uruchamiając skrypt task2.cypher. Napisz następujące zapytania:  
1.	Znajdź trasy którymi można dostać się z Darjeeling na Sandakphu, mające najmniejszą ilość etapów 
2.	Znajdź mające najmniej etapów trasy którymi można dostać się z Darjeeling na Sandakphu i które mogą być wykorzystywane zimą 
3.	Uszereguj trasy którymi można dostać się z Darjeeling na Sandakphu według dystansu Znajdź wszystkie miejsca do których można dotrzeć przy pomocy roweru (twowheeler) z Darjeeling latem
Część 2 – Połączenia lotnicze
Zaimportuj dane uruchamiając skrypt task3.cypher. Napisz następujące zapytania:
4.	Uszereguj porty lotnicze według ilości rozpoczynających się w nich lotów
5.	Znajdź wszystkie porty lotnicze, do których da się dolecieć (bezpośrednio lub z przesiadkami) z Los Angeles (LAX) wydając mniej niż 3000 
6.	Uszereguj połączenia, którymi można dotrzeć z Los Angeles (LAX) do Dayton (DAY) według ceny biletów 
7.	Znajdź najtańsze połączenie z Los Angeles (LAX) do Dayton (DAY) 
8.	Znajdź najtańsze połączenie z Los Angeles (LAX) do Dayton (DAY) w klasie biznes 
9.	Uszereguj linie lotnicze według ilości miast, pomiędzy którymi oferują połączenia (unikalnych miast biorących udział w relacjach :ORIGIN i :DESTINATION węzłów typu Flight obsługiwanych przez daną linię) 
10.	Znajdź najtańszą trasę łączącą 3 różne porty lotnicze
