function myFirstMethod() {
let isUp = false;
let isDressed = false;
let isFed = false;
let isWorking = false;
let isEscorted = false;


	let paragraphElement=document.getElementById("paragraph");

	alert("You wake up in your bed.")

	var whatToDo = (prompt("Do you want to get up or go back to sleep?"));

	if(whatToDo == "go back to sleep")	{
		isUp = false;
		alert("You decide to go back to sleep.");
		alert("Tomorrow is another day.");
		myFirstMethod();
	}

  if(whatToDo == "get up") {
		isUp = true;
		alert("You get up out of bed");
		console.log("You get up out of bed");
		whatToDo = (prompt("Do you want to get dressed, eat, or go to work?"));
	}

	if(whatToDo == "get dressed" && isUp == true && isFed == true && isEscorted == false)	{
		isDressed = true;
		alert("You get dressed for the day.");
		console.log("You get dressed for the day.");
		whatToDo = (prompt("Do you want to eat or go to work?"));
	}

	if(whatToDo == "get dressed" && isUp == true && isEscorted == true)	{
		isDressed = true;
		alert("After being escorted off of the property owned by your work, you decide to get dressed.");
		console.log("After being escorted off of the property owned by your work, you decide to get dressed.");
		whatToDo = (prompt("Do you want to go back to bed or restart the day?"));
	}


	if(whatToDo == "eat" && isUp == true && isDressed == false)	{
		isFed = true;
		alert("You eat breakfast.");
		console.log("You eat breakfast.");
		whatToDo = (prompt("Do you want to get dressed or go to work?"));
	}

	if(whatToDo == "eat" && isUp == true && isDressed == true)	{
		isFed = true;
		alert("You eat breakfast.");
		console.log("You eat breakfast.");
		whatToDo = (prompt("Do you want to go to work?"));
	}

	if(whatToDo == "yes" && isUp == true && isDressed == true && isFed == true)	{
		isWorking = true;
		alert("You go to work and earn the money to pay your bills.");
		console.log("You go to work and earn the money to pay your bills.");
		whatToDo = (prompt("Do you want to restart the day?"));
	}

	if(whatToDo == "no" && isUp == true && isDressed == true && isFed == true)	{
		isWorking = false;
		alert("You decide not to go to work today.");
		console.log("You decide not to go to work today.");
		whatToDo = (prompt("Do you want to go back to sleep?"));
	}


	if(whatToDo == "go to work" && isUp == true && isDressed == false && isFed == true)	{
		isWorking = true;
		isEscorted = true;
		alert("You go to work, but when you get there you are immediately escorted off the property because of going to work nude.");
		console.log("You go to work, but when you get there you are immediately escorted off the property because of going to work nude.");
		whatToDo = (prompt("Do you want to get dressed or restart the day?"));
	}
	if(whatToDo == "go to work" && isUp == true && isDressed == true && isFed == false)	{
		isWorking = true;
		alert("You go to work and start working. But after an hour, you pass out on the ground because you didn't eat anything for breakfast.");
		console.log("You go to work and start working. But after an hour, you pass out on the ground because you didn't eat anything for breakfast.");
		whatToDo = (prompt("Do you want to restart the day?"));
	}

	if(whatToDo == "go to work" && isUp == true && isDressed == false && isFed == false)	{
		isWorking = true;
		alert("You go to work, but when you get there you are immediately escorted off the property because of going to work nude. But then you realize along with forgetting to get dressed, you also forgot to eat breakfast.");
		console.log("You go to work, but when you get there you are immediately escorted off the property because of going to work nude But then you realize along with forgetting to get dressed, you also forgot to eat breakfast..");
		whatToDo = (prompt("Do you want to eat breakfast or restart the day?"));
	}

	if(whatToDo == "eat" && isUp == true && isDressed == false && isFed == false && 	isWorking == true)	{
		isWorking = false
		isFed = true
		alert("After being escorted off the property of your work for being nude, you decide to eat breakfast because you forgot to do that before you left.");
		console.log("After being escorted off the property of your work for being nude, you decide to eat breakfast because you forgot to do that before you left.");
		whatToDo = (prompt("Do you want to restart the day?"));
	}

	if(whatToDo == "restart")	{
		alert("Tomorrow is another day.")
		myFirstMethod();
	}

}
