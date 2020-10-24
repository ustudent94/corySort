list = [0, 5, 12 ,24, 16, 22, 48, 96, 212, 213, 214, 217, 267, 297, 512, 716]

searchVal = 267

found = False

while not found:
   middle = int(len(list)/2)
    if(searchVal > list[middle]):
        list =  list[middle +1: len(list)-1]
    elif(searchVal < list[middle]):
        list = list[0:middle-1]
    elif(searchVal == list[middle]):
        found = True

print(middle)