window.onload = function() {
  let canvas = document.getElementById("myCanvas");
  let ctx = canvas.getContext("2d");
  //grab image element from html
  let img = document.getElementById("cat");
  //draw image on canvas
  ctx.drawImage(img,0,0);
};

//Put global variables here
var clicked = false;
function onMouseDown(e){
  //grab the canvas element from HTML
  let canvas = document.getElementById("myCanvas");
  //create the drawing context from the canvas
  let ctx = canvas.getContext("2d");
  //get a color from an input element's value
  let color = document.getElementById("color");
  //set the color of your drawing to your context
  ctx.strokeStyle = color.value;
  //if you want to keep colors separate between stroke
  //   you'll need to reset the stroke path
  ctx.beginPath();
  //move the pen to where the mouse is (llok at updateCoords for help)
  ctx.moveTo(e.offsetX, e.offsetY);
  //keep track that we have started drawing
  clicked = true;
  //update coordinates to page to show mouse events are working
  updateCoords(e);
}

function onMouseMove(e){
  //OnMouseMove happens everytime the mouse moves whether or
  //    not the mouse is clicked
  //We need to decide if we are drawing
if(clicked)  {
    //grab canvas
    let canvas = document.getElementById("myCanvas");
    //grab context
    let ctx = canvas.getContext("2d");
    //move the context on a line
    ctx.lineTo(e.offsetX, e.offsetY);
    //stroke out the line movement
    ctx.stroke();
  }
  //update coordinates to page to show mouse events are working
  updateCoords(e);
}

function onMouseUp(e){
  //keep track that we have STOPPED drawing
  clicked = false;
  //update coordinates to page to show mouse events are working
  updateCoords(e);
}

//Function to update coordinates to webpage
function updateCoords(e){
  //let's define the x and y coordinates from the event object
  let x = e.offsetX;
  let y = e.offsetY;
  //fetch the output paragraph
  let coords = document.getElementById("coords");
  //update the contents of the coords paragraph.
  coords.innerHTML = " x: "+x+" y: "+y;
}
