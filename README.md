## Remote Control Project

### Week 1 Homework For Skill Distillery

#### Overview

This is remote control simulation.

#### Concepts
loops

#### Technologies Used

* java
* while loops

#### Lessons Learned

Breaking out of do-while loops using boolean values, and getting comfortable with swith and while loops.

#### How I built this application

* I began prompting the user to turn and using a Scanner to obtain the user's input.
* I used a while loop to say if the user does not type something specific, continue to prompt the user.
* I created three methods pressButton, turnON, turnOff; to be called on depending on what the user inputed. This helped me get comfortable calling on methods and giving me the method to be called on multiple times.
* I created a do-while loop because once the remote is on, they need to have the ability to select a button or turn off the remote at least once, like a real remote.
* I then used a switch statement for the user's input because I wanted specific values. I didn't use an IF statement because I know specific values wanted, and code readability.
* Depending on what the user typed, I then called the 3 methods I created earlier. Only depending if the user typed OFF, will break the do-while loop by turning a boolean to false ending the do-while loop.

