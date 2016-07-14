x = raw_input().strip()
values = [False] * 5

for c in x:
    if c.isalnum():
        values[0] = True

    if c.isalpha():
        values[1] = True
        
    if c.isdigit():
        values[2] = True
        
    if c.islower():
        values[3] = True

    if c.isupper():
        values[4] = True

for y in values:
    print y
