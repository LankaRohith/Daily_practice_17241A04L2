def replaceOddEven(n):
    if n==1:
        return 0  #when you reach bottom of stack trace no need to increase count
    elif n%2==0:
        return 1+replaceOddEven(n/2)
    else:
        return 1+min(replaceOddEven(n-1),replaceOddEven(n+1))

lst_input=[int(i) for i in input().split()] #[5,3,15,4,2]
lst_expected_op=[3,2,5,2,1]
lst_output=list()
for i in lst_input:
    lst_output.append(replaceOddEven(i))
print(lst_output)
errors=0
for i in range(len(lst_output)):
    if lst_expected_op[i]!=lst_output[i]:
        errors+=1
if errors==0:
    print("NO ERRORS")
else:
    print("ERRORS=",errors)
