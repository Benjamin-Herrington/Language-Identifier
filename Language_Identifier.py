

# checks first unicode character in string to identify what category it belongs too.
def unicode(sentence):
    value = ord(sentence[0])
    if value >= 0 and value <= 563: #This is an example
        #romance(sentence)
    elif value >= 880 and value <= 1023:
        #greek(sentence)
    elif value >= 1024 and value <= 1279:
        #cyrillic(sentence)
    elif value >= 44032 and value <= 55171:
        return "Korean"
    elif value >= 12352 and value <= 12543:
        return "Japanese"
    elif




#i = ord('ఓ')
#print(i)


#def romance():


#def slavic()
#def cyrillic()
#def greek()



"""Languages that use latin characters: English, Spanish, Portugese, French, Romanian """
"Cyrillic: Belarusian, Bulgarian, Kazakh, Kyrgyz, Macedonian, Montenegrin, Russian, Serbian, Tajik (a dialect of Persian), Turkmen, Ukrainian, and Uzbek."


# Latin, Greek, cyrillic, Arabic, Armenian, Hebrew, Korean? , Chinese?, Japanese?