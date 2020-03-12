lst=[0]
def onesCount(s):
    global lst
    lst.append(s.count('1'))
def convertBin(n):
    s=""
    while n>1:
        rem=n%2
        s=str(rem)+""+str(s)
        n/=2
    s="1"+s
    return s 
n=int(input())
for i in range(1,n+1):
    s=convertBin(i)
    onesCount(s)
print(lst)  
expected_output=[0,1,1]
if lst==expected_output:
    print("NO ERRORS")
else:
    print("ERROR")
