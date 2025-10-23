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
Make an integer variable called guess and set it to 50
Make an integer that will change guess and set it to 25, named changeGuess
Make a boolean keepGoing to contorl the while loop
Make an integer to keep track of the number of turns, named turns
while(keepGoing)
  print turn + ") I guess" + guess
  print "Too (H)igh, too (L)ow, or (C)orrect?"
  Use system.in to take in a user input, named status
  if status == H
    guess=guess-changeGuess
  else if status == L
    guess=guess+changeGuess
  else
    Make keepGoing false to end the loop
  while changeGuess >= 1
    Use math.floor to always round down changeGuess=changeGuess*0.5
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
