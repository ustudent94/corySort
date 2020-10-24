def currentValue(r):
    # return 40*(1-(1/(1
    currentVal =  850 + (10*r)
    return currentVal

left = 6
right = 12
searchVal = 911.37

found = False

while not found:
    middle = ((right-left) /2) + left
    curVal = round(currentValue(middle),2)
    if(searchVal == curVal):
        found = True
    elif(searchVal > curVal):
        left = middle
    elif(searchVal < curVal):
        right = middle


annYieldPercent = middle;
print(annYieldPercent)
print(currentValue(middle))

