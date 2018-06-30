A=[1,2,3]
string=""
for i in range(len(A)):
    string=string+str(A[i])
string=str(int(string)+1)
answer=[int(i) for i in string]
print(answer)
