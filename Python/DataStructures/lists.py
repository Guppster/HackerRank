numCommands = int(raw_input())
arr = []

for i in range(0, numCommands):
    input = raw_input();
    command = input.split(" ")[0]
    
    if command == 'print':
        print arr
    
    if command == 'insert':
        arr.insert(int(input.split(" ")[1]), int(input.split(" ")[2]))
    
    if command == 'remove':
        arr.remove(int(input.split(" ")[1]))
   
    if command == 'append':
        arr.append(int(input.split(" ")[1]))
   
    if command == 'sort':
        arr.sort()
    
    if command == 'pop':
        arr.pop()
  
    if command == 'reverse':
        arr.reverse()
