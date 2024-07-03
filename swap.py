def swap(n1,n2):
    return n2,n1
a = int(input("Enter the first number"))
b = int(input("Enter the second number"))
result = swap(a,b)
print("BEFORE SWAPPING")
print("a=",a,"b=",b)
print("AFTER SWAPPING")
print("a=",result[0],"b=",result[1])
