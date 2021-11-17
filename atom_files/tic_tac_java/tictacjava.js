var clickCounter = 0;

function myFirstMethod() {

	let box1 = document.getElementById("box1");

	box1.onclick = myTicTacToeFunction;

	let box2 = document.getElementById("box2");

	box2.onclick = myTicTacToeFunction;

	let box3 = document.getElementById("box3");

	box3.onclick = myTicTacToeFunction;

	let box4 = document.getElementById("box4");

	box4.onclick = myTicTacToeFunction;

	let box5 = document.getElementById("box5");

	box5.onclick = myTicTacToeFunction;

	let box6 = document.getElementById("box6");

	box6.onclick = myTicTacToeFunction;

	let box7 = document.getElementById("box7");

	box7.onclick = myTicTacToeFunction;

	let box8 = document.getElementById("box8");

	box8.onclick = myTicTacToeFunction;

	let box9 = document.getElementById("box9");

	box9.onclick = myTicTacToeFunction;

}

function myTicTacToeFunction(ev)	{
if(clickCounter < 10 && !ev.currentTarget.isClicked)	{
  let player;
	if(clickCounter % 2 == 0)	{
		player = "X";
	}	else {
		player = "O";
	}
	ev.currentTarget.innerHTML = "<p>" + player + "</p>";
	ev.currentTarget.isClicked = true;
	clickCounter++;
}
}
