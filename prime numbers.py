def pnum(low,up):

    for num in range (low,up+1):
        if num>1:
            for i in range (2,num):
                if (num%i)==0:
                    break 
            else:
                 print (num) 
print(pnum(0,100))