function myFirstMethod() {

var canvas = document.getElementById("myCanvas");
var ctx = canvas.getContext("2d");
var img = document.getElementById("cat");

ctx.fillStyle = "#FF0000";
ctx.fillRect(35,23,160,107);

//top left corner to center
ctx.moveTo(0,0);
ctx.lineTo(95,63.5);
//20,13
//bottom left corner to center
ctx.moveTo(0,153.5);
ctx.lineTo(95,90);

//top right corner to center
ctx.moveTo(230.5,0);
ctx.lineTo(135,63.5);

//bottom right corner to center
ctx.moveTo(230.5,153.5);
ctx.lineTo(135,89.5);

ctx.stroke();
ctx.beginPath();
ctx.arc(115,76,24,0,2*Math.PI);
ctx.stroke();
ctx.strokeRect(0,0,230.5,153.5);
ctx.font = "1em serif";
ctx.fillStyle = "#000000";
ctx.fillText("This is a test",73,40);
ctx.fillText("It's yours to fail",65,125);
ctx.fillText("OR",104,82);
ctx.fillStyle = "#00FF00";
ctx.fillText("GREEN",36,82);
ctx.fillStyle = "#0000FF";
ctx.fillText("BLUE",145,82);
ctx.drawImage(img,500,0);
}
