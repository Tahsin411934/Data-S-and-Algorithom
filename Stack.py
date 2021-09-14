stack=[]
def push():
    element=input("Insert the element")
    stack.append(element)
    print(stack)
def pop():
    if not stack:
        print("That is empty")
    else:
        e=stack.pop()
        print("Remove element ",e)
        print(stack)
while True:
    print("Insert the option 1.push 2.pop and 3.quit")
    chioce=int(input())
    if chioce==1:

        push()
    elif chioce==2:
        pop()
    elif chioce==3:
        break
    else:
        print("enter the correct option")





