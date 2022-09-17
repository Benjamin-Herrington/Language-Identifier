import csv

my_file = open("spanishWords.txt", "r")
for line in my_file:
    newlist = line.split()
my_file.close()
new_csv = open('spanish.csv', 'w')
write = csv.writer(new_csv)
write.writerow(newlist)
new_csv.close()






