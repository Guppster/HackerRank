raw_input()
a = set(map(int, raw_input().split(' ')))
raw_input()
b = set(map(int, raw_input().split(' ')))
for element in sorted(a.union(b).difference(a.intersection(b))):
    print element
