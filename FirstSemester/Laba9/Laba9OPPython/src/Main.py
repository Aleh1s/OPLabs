def delete_words(string):
    array = string.split(' ')
    result = []
    for i in range(0, len(array)):
        if i % 2 != 0:
            result.append(array[i])
    return result


def the_longest_word(array):
    max_word = array[0]
    for i in range(1, len(array)):
        if len(max_word) < len(array):
            max_word = array[i]
    return max_word


line = input('Write a line: ')
result_array = delete_words(line)
longest_word = the_longest_word(result_array)
print('Масив зі словами, що стоять на непарних позиціях: ' + str(result_array))
print('Найдовше слово з масиву: ' + str(longest_word))
