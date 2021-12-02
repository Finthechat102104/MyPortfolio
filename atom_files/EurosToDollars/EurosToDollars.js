//Example 1: actively asking user for input
//Execute this function when the page loads...
window.onload = function() {
//Prompt user for dollar amount
//Read in dollar amount
let dollars = Number(prompt("How many dollars to convert?"));
//Prompt User for exchange rate
//Read in exchange rate
let rate = Number(prompt("What is the exchange rate?"));
//calculate result
let result = dollars*rate;
//Present result to user
console.log("The result is %f",result);
}



//Example 2: passively asking user to convert Euros
//Execute this function when #convert button is clicked

//Get #convert button element
let convertButton = document.getElementById("convert");
convertButton.onclick = function() {
//Prompt user for dollar amount (the #dollars HTML element does this)
//Read in dollar amount

//Prompt User for exchange rate (the #rate HTML element does this)
//Read in exchange rate

//calculate result

//Present result to user (in HTML paragraph element)

}
