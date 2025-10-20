import random

print("hi these is the game number guessing ")
print("\n please enter your guessing")
print("\n ok let's start")
num =random.randint(1,100)
guess = int(input("enter the guessing number" ))
count = 1
while guess != num:
    if guess < num:
        print("Higher")
    elif guess > num:
     print("Lower")
    guess = int(input("enter the guessing number"))
    count += 1
    if count == 5:
          break

if guess == num:
        print("hurray you have won by guessing the correct number")
else:
        print("sorry you have lost but you can another chance")

input("\n press enter to exit")