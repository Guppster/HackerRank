mainstring = raw_input().strip()
substring = raw_input().strip()

x = 0

for i in range(0, len(mainstring)):
    if(i+3 <= len(mainstring)):
        if(mainstring.find(substring, i, i+3) != -1):
            x = x + 1
print x
