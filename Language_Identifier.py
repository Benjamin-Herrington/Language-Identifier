
# checks first unicode character in string to identify what category it belongs too.
def unicode(sentence):
    value = ord(sentence[0])
    print(value)
    if value >= 0 and value <= 563: #This is an example
        romance(sentence)
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



def


sen = input("Type: ")
print(unicode(sen))
#i = ord('ఓ')
#print(i)


#def romance():


#def slavic()
#def cyrillic()
#def greek()
#def devanagari()
#def gurmukhi()



"""Languages that use latin characters: English, Spanish, Portugese, French, Romanian """
"Cyrillic: Belarusian, Bulgarian, Kazakh, Kyrgyz, Macedonian, Montenegrin, Russian, Serbian, Tajik (a dialect of Persian), Turkmen, Ukrainian, and Uzbek."


# Latin, Greek, cyrillic, Arabic, Armenian, Hebrew, Korean? , Chinese?, Japanese?