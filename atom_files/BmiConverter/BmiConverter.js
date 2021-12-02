//Example 1: actively asking user for input
//Execute this function when the page loads...
//window.onload = function() {
//Prompt user for weight
//Read in weight amount
//let weight = Number(prompt("What is your weight in pounds?"));
//Prompt User for height
//Read in height
//let height = Number(prompt("What is your height in inches?"));
//calculate result
//let result = (weight*703)/(height*height);
//Present result to user
//console.log("The result is %f",result);
//}
/**/

//Example 2: passively asking user to convert BMI
//Execute this function when #convert button is clicked

//Get #convert button element
let convertButton = document.getElementById("convert");
convertButton.onclick = function() {
//Prompt user for body weight amount (the #weight HTML element does this)
let weightElement = document.getElementById("weight");
//Read in dollar amount
let weight = weightElement.value;
//Prompt User for exchange rate (the #rate HTML element does this)
let heightElement = document.getElementById("height");
//Read in exchange rate
let height = heightElement.value;
//calculate result
let result = (weight*703)/(height*height);
//Present result to user (in HTML paragraph element)
let resultElement = document.getElementById("result");
resultElement.innerHTML = result;


}
