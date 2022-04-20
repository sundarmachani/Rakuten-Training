x = "global"
def myfunc():
    print("This is "+x)
myfunc()
print("\n")

#type along with print
a="hola"
print(a)
print(type(a))
print("\n")

#type of a
a=30.5
print(type(a))
print("\n")

#casting
a=(int)(15)
#a=int(15) // doesn't change the implementation
print(a)
print("\n")

a="HELLO people \n"
b="""see you again, 
some other day""" #either way it works with ", ' three ",'
print(a,b)
print(a[3]) #print the 3rd value in the a
print("\n")

#slicing
a=" it's sunny "
print(a[:4]) #depending on where the : is it starts slicing if it is in the front then from start, if at the back then start slicing from back
print("\n")

#modifying string
print(a.upper()) #to UPPERCASE
print(a.lower()) #to lowercase
print(a.strip()) #remove white space from beginning or ending
print(a.replace("i","m")) #replace but note that it is case sensitive
print(a.split("'")) #it splits where the character is specified
b="outside"
print(a+b) #mixing two strings
print("\n")

#formating string
temp=45
a="your weight {}"
print(a.format(temp))
print("\n")

#escape character
a="I am \"Immortal\" and strong"
print(a)
print("\n")

#Boolean
print(3==3)
print(5>8)
print(3>=2)
print(bool("Samsung")) # any content is evaluated to true if it has some content
print("\n")

#Operators
a=45
b=20
print(a+b)
print(a-b)
print(a*b)
print(a/b)
print(a%b)
print(a**b) #exponentiation
print(a//b) #floor division
#other type of operators are same as in any other programming language
print("\n")

#Lists
my_list=["mclaren","maserati","koenigsegg","SSC"] #caution for the list we use [ ]
print(my_list) #lists can have deplicate values, they are changeable, ordered.
print(my_list[2]) #to access list, we use [index] if + then from front if - then from back
print(my_list[1:3]) #to access with specified range
my_list[1:3] = ["Rolls Royce", "Bentley"] #change list items
my_list.append("Ferrari") #add new item with append
print(my_list)
my_list.insert(3,"Audi") #insert in the particular index specified
print(my_list)
my_list.remove("SSC") #remove item
print(my_list)
my_list.pop(0) #remove with the index specified
print(my_list)
new_list=[]
for x in my_list: #list comprehension
    if "a" in x:
        new_list.append(x)
print(new_list)
print(type(my_list))
print('\n')

#tuples
my_tuple=("ducati","yamaha","kawasaki") #with ( ) it becomes a tuple
print(my_tuple)
print(type(my_tuple))
print("\n")