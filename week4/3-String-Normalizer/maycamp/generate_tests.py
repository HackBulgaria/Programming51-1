from random import choice, randint

def corrupt(word):
    chars = []

    for ch in word:
        if randint(0, 5) < 4:
            ch = ch.upper()

        chars.append(ch)

    word = "".join(chars)

    if randint(0, 1) == 0:
        word = " " * randint(0, 10) + word
    else:
        word = word + " " * randint(0, 10)

    return word

def test_sentence(dictionary, number_of_words=10):
    count = 0
    sentence = set()

    while count < number_of_words:
        next_word = choice(dictionary)
        
        while next_word in sentence:
            next_word = choice(dictionary)
        
        next_word = corrupt(next_word)

        sentence.add(next_word)
        count += 1

    return (" " * randint(1, 10)).join(sentence) + " " * randint(1, 10)


def normalize(sentence):
    return " ".join([word.strip().lower().capitalize() for word in sentence.split(" ") if word.strip() != ""])


dict_path = "/usr/share/dict/american-english"
words = []
base_name = "str"

with open(dict_path, "r") as f:
    words = f.read().split("\n")


for index in range(0, 10):
    current_input = test_sentence(words)
    output = normalize(current_input)

    with open("{}00{}.in".format(base_name, index), "w") as f:
        f.write(current_input)

    with open("{}00{}.ans".format(base_name, index), "w") as f:
        f.write(output)
        f.write("\n")

