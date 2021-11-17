//here will be the function that runs when the page loads...
//Note that in a web browser you need to hit the F12 key to see the console tab
// and see the printed results below.

function myFirstMethod() {

let paragraphElement=document.getElementById("paragraph");
	//Three ways to communicate with user in JavaScript
	//two ways to simply send messages only to user
	alert("You must answer these questions before you continue.");
	console.log("sends text to browser console");


  //use prompt function to get string or number values from user.
  //use parseFloat to get number from a string.
	var myAge = parseFloat(prompt("How old are you?"));
		if(myAge >= 18)	{
			paragraphElement.innerHTML =("Enjoy the movie :)")
		}else{
			var withAdult = prompt("Are you accompanied by an Adult?");
			if(withAdult.toLowerCase() =="y" || withAdult.toLowerCase() == "yes")	{
				paragraphElement.innerHTML =("Enjoy the movie :)");
			}else{
				paragraphElement.innerHTML =("You are too young to watch this movie without being accompanied by an adult. Sorry :(")
			}
	}





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
