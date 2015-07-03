import itertools
import string
from random import randint, choice, shuffle

alphabet = list(string.ascii_lowercase)

def get_two_permutations(length=20):
    a = [choice(alphabet) for _ in range(0, length)]
    b = a[:]
    shuffle(b)

    return (a, b)


def corrupt(chars):
    return [chr(ord(x) + 1) for x in chars]


def to_s(chars):
    return "".join(chars)


NUMBER_OF_TESTS = 9

for index in range(0, NUMBER_OF_TESTS):
    a, b = get_two_permutations()
    answer ="ANAGRAMS"
    file_name = "anagram00{}".format(index)

    if randint(0, 1) == 1:
        b = corrupt(b)
        answer = "NOT ANAGRAMS"
    
    with open(file_name + ".in", "w") as f:
        f.write(to_s(a) + " " + to_s(b))

    with open(file_name + ".ans", "w") as f:
        f.write(answer)
        f.write("\n")

