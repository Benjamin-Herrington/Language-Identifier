

def main():
sentence = input("Please input a sentence of any language: ")
print("We believe that the language of your sentence is " + (unicode(sentence) + "."))


# checks first unicode character in string to identify what category it belongs too.
def unicode(sentence):
    value = ord(sentence[0])
    if value >= 0 and value <= 563: #This is an example
        latin(sentence)
        return
    elif value >= 880 and value <= 1023:
        greek(sentence)
    elif value >= 1024 and value <= 1279:
        cyrillic(sentence)
    elif value >= 44032 and value <= 55171:
        return "Korean"
    elif (value >= 19968 and value <= 40895) or (value >= 3040 and value <= 309f) or (value >= 12448 and value <= 12543):
        return "Japanese"
    elif value >= 1536 and value <= 1791:
        arabic(sentence)
    elif value >= 2994 and value <= 3071:
        return "Tamil"
    elif value >= 3072 and value <= 3199:
        return "Telugu"
    elif value >= 2304 and value <= 2431:
        devanagari(sentence) # Hindi, Marathi
    elif value >= 2560 and value <= 2687:
        gurmukhi(sentence) #Punjabi, Landha
    elif value >= 2432 and value <= 2559:

def romance(sentence):