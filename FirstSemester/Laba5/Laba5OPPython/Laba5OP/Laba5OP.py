# підключення модуля math
import sys
import math
# введення початкових даних
aInp = float(input('Від ')) 
bInp = float(input('До '))
# перевірка на негативне значення 
if aInp < 1 and bInp < 1:
    print('Некоректні числа')
    sys.exit()
elif aInp < 1:
    aInp = 1
elif bInp < 1:
    bInp = 1
# округлення початкових значень
a = int(math.ceil(aInp))
b = int(math.floor(bInp))
# отримання логічних значень
difference = (aInp - bInp) == 0 
absDifference = abs(a - b) < 0
# перевірки
if difference and a > b:
    print('Некоректні числа')
    sys.exit()
elif absDifference:
    print('Некоректні числа')
    sys.exit()
elif a == b:
    min = a
    max = b
else:
    min = min(a,b)
    max = max(a,b)
# перевірка на коректне ведення початкових данних
while(min <= max):
    sum = 0
    n = 0
    i = 1
    while i <= min:
# перевірка: чи є число 'i' дільником числа 'a' у разі позитивного результату виведення дільника
        if min % i == 0:
            divider = i
            sum += i
            n += 1
            print('Дільник числа '+str(min)+': '+str(divider))
        i += 1
    print('Кількість дільників числа '+str(min)+" - "+str(n))
    print('Сума дільників числа '+str(min)+': '+str(sum))
    min += 1
