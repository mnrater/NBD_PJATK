# NBD_PJATK
NoSQL (MongoDB, Neo4J, Riak) and Scala exercises.

NBD Ćwiczenia 5 – Neo4J
Ćwiczenie należy oddać w formie pliku tekstowego zawierającego ponumerowane zapytania (zgodnie z numeracją zapytań w tekście ćwiczenia) oraz zestawu plików z wynikami w postaci graficznej i tekstowej (np. SVG i JSON – niestety dostępne opcje eksportu regularnie ulegają zmianie) o nazwach wynikX.svg i wynikX.json, gdzie X to numer zapytania (pliki graficzny i tekstowy należy wyeksportować z pomocą webowego interfejsu bazy, rozszerzenia zależą od wybranych formatów) 
W wypadku wykonywania zadań na szkolnych maszynach wirtualnych pobierz nową wersję bazy Neo4j Community Edition spod adresu http://neo4j.com/download/ i zastąp nią obecną wersję zainstalowaną na wirtualce (trzeba usunąć folder neo4j z folderu domowego użytkownika labnbd i na to miejsce rozpakować pobrane archiwum). Serwer uruchamiamy przez /neo4j/bin/neo4j start, interfejs webowy dostępny jest pod adresem http://localhost:7474 
Zaimportuj dane uruchamiając zapytania zgodnie z instrukcjami wyświetlanymi po wpisaniu polecenia :play movie-graph. Przeanalizuj i uruchom przykładowe zapytania.
Zbuduj następujące zapytania
 
1.	Wszystkie filmy
2.	Wszystkie filmy, w których grał Hugo Weaving 
3.	Reżyserzy filmów, w których grał Hugo Weaving 
4.	Wszystkie osoby, z którymi Hugo Weaving grał w tych samych filmach 
5.	Wszystkie filmy osób, które grały w Matrix
6.	Listę aktorów (aktor = osoba, która grała przynajmniej w jednym filmie) wraz z ilością filmów, w których grali 
7.	Listę osób, które napisały scenariusz filmu, które wyreżyserowały wraz z tytułami takich filmów (koniunkcja – ten sam autor scenariusza i reżyser) 
8.	Listę filmów, w których grał zarówno Hugo Weaving jak i Keanu Reeves 
9.	(za 0.2pkt) Zestaw zapytań powodujących uzupełnienie bazy danych o film Captain America: The First Avenger wraz z uzupełnieniem informacji o reżyserze, scenarzystach i odtwórcach głównych ról (w oparciu o skrócone informacje z IMDB - http://www.imdb.com/title/tt0458339/) + zapytanie pokazujące dodany do bazy film wraz odtwórcami głównych ról, scenarzystą i reżyserem. Plik SVG ma pokazywać wynik ostatniego zapytania.  
