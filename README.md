# CS121_project_8

## menu
string menu()
```
print 0) Exit
print 1) Human Guesser
print 2) Computer Guesser
```

## human guessing
void humanGuesser()
```
Use Math.random() to generate a number 1-100, named correct
Make a boolean keepGoing to control the while loop
Make an integer to keep track of the number of turns, named turns
while(keepGoing)
  print turns + ") Please enter a number (1-100):"
  Use system.in to take in the user guess as an integer guess
  if guess > correct
    print "Too high..."
  else if guess < correct
    print "Too low..."
  else
    print "Got it!"
    Make keepGoing false to end the loop
```

## computer guessing
void computerGuesser()
```
Make an integer called upper and set it to 100
Make an integer called lower and set it to 1
Make an integer variable called guess and set it mean(lower, upper)
Make a boolean keepGoing to control the while loop
Make an integer to keep track of the number of turns, named turns
Make an empty string to contain the user status
while(keepGoing)
  turns++
  print turn + ") I guess" + guess
  print "Too (H)igh, too (L)ow, or (C)orrect?"
  Use system.in to take in a user input, named status
  if status == H
    upper=guess
    guess=guess-changeGuess
  else if status == L
    lower = guess
    guess= getMean(lower, upper)
  else
    Make keepGoing false to end the loop
```
## mean
int getMean(int lower, int upper)
```
Use lower and up to cast the mean as an integer
return the mean
```

## main
static main()
```
Make a boolean keepGoing to control the while loop
Make an empty string called response
while(keepGoing)
  call menu() put result in response
  if response is equal to zero
    Make keepGoing false to end the loop
  else if response is equal to one
    call humanGuesser()
  else if response is equal to two
    call computerGuesser()
  else
    print "Type 0, 1, 2"
```
