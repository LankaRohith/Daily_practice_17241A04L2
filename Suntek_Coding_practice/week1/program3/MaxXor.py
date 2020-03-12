def maxXor(lst):
    m=lst[0]^lst[1]
    for i in range(len(lst)):
        for j in range(i+1,len(lst)):
            if lst[i]^lst[j]>m:
                m=lst[i]^lst[j]
    return m
lst=[int(i) for i in input().split()]  #[3,10,5,25,2,8]
expected_output=28
if len(lst)==1:
    max_xor=lst[0]
    print(lst[0])
else:
    max_xor=maxXor(lst)
    print(max_xor)
if(max_xor==expected_output):
    print("NO ERRORS")
else:
    print("ERROR")
