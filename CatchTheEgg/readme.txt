There are 4 classes:
- Animal : Containing an array with the number of each sort of animal currently in the game, it is a thread whose run function adds animals when the user presses the good button
- Display : this class contains the principal function printing messages, like when the game is over for example
- Game : contains the current status of the game : level of difficulty, number of eggs produced and number of eggs collected, the Animal object currently in the game
Its main function calculate tnhe number of eggs lost and shits collected to stoop the game when the user looses
It also contains the class Position which represent the current position of the basket, between -5 and 5 and its run function would allow the user to change this position by using the arrows
The play function would activate animals and position while the game is not over and adapt the level of difficulty when it must be modified

The conditions between " " would have to be implemented with php using get method for example : 
	if ($_GET['todo']="addHen"){
	animals.add(0);
	}