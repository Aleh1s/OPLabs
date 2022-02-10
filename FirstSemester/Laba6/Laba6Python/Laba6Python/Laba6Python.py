import math

def h1(n):
    return (math.pi - 0) / n

def h2(a, b, n):
    return (b - a) / n

def integralOfFirstFunction(n):
    sumOfFunction = 0
    h = h1(n)
    i = 1
    while i < n + 1:
        xi = 0 + i * h - h / 2
        sumOfFunction = sumOfFunction + math.log(2 + math.sin(xi))
        i = i + 1
    return h * sumOfFunction

def integralOfSecondFunction(a, b, n):
    sumOfFunction = 0
    h = h2(a, b, n)
    i = 1
    while i < n + 1:
        xi = a + i * h - h / 2
        sumOfFunction = sumOfFunction + math.pow(math.atan(xi), 2)
        i = i + 1
    return h * sumOfFunction

a = int(input('a = '))
b = int(input('b = '))
n = int(input('n = '))
isNaturalNumber = a > 0 and b > 0 and n > 0
if isNaturalNumber:
    result = integralOfFirstFunction(n) + integralOfSecondFunction(a, b, n)
    print('a = ',str(a),' b = ',str(b),' n = ',str(n),'Result = ',str(result))
else:
    print('Invalid numbers')