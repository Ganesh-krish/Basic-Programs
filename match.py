# Function to check if a number is prime
def isPrime(num):
    if num < 2:
        return False
    for i in range(2, int(num/2) + 1):
        if num % i == 0:
            return False
    return True

# Function to generate the Fibonacci series
def fiboSeries():
    n = int(input("Enter the number of terms for the Fibonacci series: "))
    n1, n2 = 0, 1
    count = 0
    if n <= 0:
        print("Please enter a positive integer")
    elif n == 1:
        print("Fibonacci series:")
        print(n1)
    else:
        print("Fibonacci series:")
        while count < n:
            print(n1)
            nth = n1 + n2
            n1 = n2
            n2 = nth
            count += 1

# Display the menu
print("========================")
print(" 1. Prime Number")
print(" 2. Fibonacci Series")
print(" 3. Exit")
print("========================")

# Get user choice
choice = int(input("Enter the choice between (1-3): "))

# Process user choice
if choice == 1:
    print("You have selected choice 1: Prime Number")
    num = int(input("Enter the number to check for prime: "))
    if isPrime(num):
        print(num, "is a prime number")
    else:
        print(num, "is not a prime number")
elif choice == 2:
    print("You have selected choice 2: Fibonacci series")
    fiboSeries()
elif choice == 3:
    print("Exited........")
else:
    print("Wrong choice! Please choose between 1 to 3")
