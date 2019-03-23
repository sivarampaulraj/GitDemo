a = [1,2,3]             # first we give some names to some stuff, 
b = [4,5,6]             #     thus making it accessible in this scope and enclosing scopes
c = [8,9,10]

def do_things(d):
    a = "new a"
    
    d.append(7)
    b.append(8)
    c = "new c"
    print(a)
    print(b)
    print(c)
    return d

d = do_things(b)            #nothing surprising in the output...

print(a)                # [1,2,3]
print(b)                # [4, 5, 6, 7]
print(c)
print(d)

import sys
print(sys.path)
