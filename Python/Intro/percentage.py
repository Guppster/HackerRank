numStudents = int(raw_input());

math = {}
physics = {}
chemistry = {}

for i in range(0, numStudents):
    temp = raw_input();
    math[temp.split(" ")[0]] = temp.split(" ")[1]
    physics[temp.split(" ")[0]] = temp.split(" ")[2]
    chemistry[temp.split(" ")[0]] = temp.split(" ")[3]
    
request = raw_input()

print "%.2f" % ((float(math[request]) + float(physics[request]) + float(chemistry[request])) / 3)
