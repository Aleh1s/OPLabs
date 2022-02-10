while True:
    print('Write three coordinates of first vector')
    a1 = float(input('First: '))
    a2 = float(input('Second: '))
    a3 = float(input('Third: '))
    print('Write three coordinates of second vector')
    b1 = float(input('First: '))
    b2 = float(input('Second: '))
    b3 = float(input('Third: '))
    firstDivision = a1/b1
    secondDivision = a2/b2
    thirdDivision = a3/b3
    if firstDivision == secondDivision and firstDivision == thirdDivision:
        result = True
    else:
        result = False
    print(result)

        
