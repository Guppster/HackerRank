n = int(raw_input())
max = -999999
max2 = -999999
temp = map(int, raw_input().split(" "))

for item in temp:
    if item > max:
        max2 = max
        max = item
    elif item < max:
        if item > max2:
            max2 = item
            
print max2
       
