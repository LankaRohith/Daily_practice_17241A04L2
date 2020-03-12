def nonRepeat(lst):
    d={}
    for i in lst:
        if i in d.keys():
            d[i]+=1 
        else:
            d[i]=1 
    for k,v in d.items():
        if v<3:
            print(k)
            return k
            
lst=[int(i) for i in input().split()] #[2,2,3,2,4,4,1,1,1,4]
k=nonRepeat(lst)
expected_output=3
if k==expected_output:
    print("NO ERRORS")
else:
    print("ERROR")
