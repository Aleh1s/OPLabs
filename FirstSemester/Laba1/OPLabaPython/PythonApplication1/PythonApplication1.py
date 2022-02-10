
while True:
    a = float(input('Write the first leg: '))
    b = float(input('Write the second leg: '))
    if a > 0 and b > 0: 
        S = 0.5 * a * b
        print('Area of the triangle: '+str(S))
    else:
        if a <= 0 and b <= 0:
            print('The both legs should be more than zero')
            break
        if a <= 0:
            print('The first leg should be more than zero')
            break
        if b <= 0:
            print('The second leg should be more than zero')
            break


