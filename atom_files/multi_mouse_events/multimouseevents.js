var clickCounter = 0;
var w = 0;
var x = 0;
var y = 0;
var z = 0;

function myFirstMethod() {
// find first dive
let move = document.getElementById("move");
//
move.onmousemove = myMoveFunction;

let enter = document.getElementById("enter");

enter.onmouseenter = myEnterFunction;

let over = document.getElementById("over");

over.onmouseover = myOverFunction;

let click = document.getElementById("click");

click.onclick = myClickFunction;

}

function myMoveFunction(ev) {
  document.getElementById("demo").innerHTML = "x: " + ev.screenX + "  y: " + ev.offsetY;
}

function myEnterFunction(ev) {
  document.getElementById("demo2").innerHTML = "x: " + ev.offsetX;
}

function myOverFunction(ev) {
  document.getElementById("demo3").innerHTML = "x: " + ev.offsetX;
}

function myClickFunction(ev){
	document.getElementById("demo4").innerHTML = "x: " + ev.offsetX + "  y: " + ev.offsetY;
}

function myTicTacToeFunction(ev)	{
	clickCounter++;
	if(clickCounter % 2 == 0)	{
		ev.onclick.innerHTML = "X";
		document.getElementById("demo4").innerHTML = "X"
	}	else {
		ev.onclick.innerHTML = "O";
		document.getElementById("demo4").innerHTML = "O"
	}
}
