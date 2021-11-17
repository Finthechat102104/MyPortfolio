//here will be the function that runs when the page loads...
//Note that in a web browser you need to hit the F12 key to see the console tab
// and see the printed results below.

function myFirstMethod() {

	let paragraphElement=document.getElementById("paragraph");

	//Three ways to communicate with user in JavaScript
	//two ways to simply send messages only to user
	alert("I'm thinking of a number 1-100.");
	console.log("sends text to browser console");

	//How to get a boolean from USER

	var answer = Math.floor(Math.random()*100)+1

  for(let count =0;number != answer;count+=1) {
		var number = parseFloat(prompt("What number am I thinking of?"));

		if(number == answer)	{
			paragraphElement.innerHTML =("You got it right, and it only took "+count+" tries.");
		}
		if(number > answer)	{
			console.log("Too high.");
			alert("Too high.");
		}

		if(number < answer)	{
			console.log("Too low.");
			alert("Too low.");
		}
	}
}
