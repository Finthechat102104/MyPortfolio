//here will be the function that runs when the page loads...
//Note that in a web browser you need to hit the F12 key to see the console tab
// and see the printed results below.

function myFirstMethod() {

	//Three ways to communicate with user in JavaScript
	//two ways to simply send messages only to user
	alert("You find yourself in a colosseum, and you have to choose who to fight");
	console.log("sends text to browser console");

	//How to get a boolean from USER

  //use parseFloat to get number from a string.
	var battle = (prompt("Who would you like to fight cat, doge, squirrel."));
if (battle== "cat"){
	alert("You won")
	let imageElement = document.getElementById("pic");
	imageElement.src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/444060c3-a57f-4fd0-87a9-c7f0a0e13471/d16pt4b-61a0b704-08e6-45a8-88a7-3a02c8e9b173.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzQ0NDA2MGMzLWE1N2YtNGZkMC04N2E5LWM3ZjBhMGUxMzQ3MVwvZDE2cHQ0Yi02MWEwYjcwNC0wOGU2LTQ1YTgtODhhNy0zYTAyYzhlOWIxNzMuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.ctTViO3H83kIap-a6yTkLoKcrvbUB5taWxAnV9gLpqA"
}
if (battle== "doge"){
	alert("You lose")
	let imageElement = document.getElementById("pic")
	imageElement.src="https://i.imgflip.com/5ac9es.jpg"
}
if (battle== "squirrel"){
	alert("You lose")
	let imageElement = document.getElementById("pic")
	imageElement.src="https://pbs.twimg.com/media/EBOh3yUXkAAwvWB.jpg"
}
myFirstMethod()
	//make decisions here on whether or not they can get into the movie.
	//if (age > 18) {  tell them they are in }
	// else {
	// ask if they have an adult with them
  // if they do
  //     tell them they cna go in with parents permission
  // else {
  // 		 tell them they can't get in.
  //}
}
