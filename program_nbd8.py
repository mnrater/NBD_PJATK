import os
import riak

databaseConnection = riak.RiakClient(pb_port=8087)
nameOfTheBucket = databaseConnection.bucket("s23096")

movieInput = {"movieName": "Smerfy", "movieReleaseYear": 2011, "movieDirectorSurname": "Gosnell", "movieLanguage": "Polish", "moviePrice": 2.99, "movieAvailability": "True"}

print("Dodanie, pobranie, wypisanie:")
firstKey = nameOfTheBucket.new(movieInput["movieName"], data = movieInput)
firstKey.store()
firstGet = nameOfTheBucket.get(movieInput["movieName"])
print(str(firstGet.data) + "\n")


print("Edycja, pobranie, wypisanie:")
firstGet.data["movieName"] = "RogateRanczo"
firstGet.store()
secondGet =  nameOfTheBucket.get(movieInput["movieName"])
print(str(secondGet.data) + "\n")


print("Usuniecie, proba pobrania:")
secondGet.delete()
try:
    thirdGet = nameOfTheBucket.get(movieInput["movieName"])
    print(str(thirdGet.data))
except Exception as e:
    print(e)