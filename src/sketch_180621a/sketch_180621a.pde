  int x = 500;
  int y = 500;
  int xs = 5;
  int ys = 5;
  int width = 1920;
  int height = 1200;
  PImage backgroundImage;
void setup(){
  size(1920,1200);
  backgroundImage = loadImage("background2.jpg");
}
void draw(){
  image(backgroundImage, 0, 0);
  rect(mouseX - 8,mouseY - 75,1,600);
  ellipse(x,y,100,100);
  x += xs; 
  y += ys;
  if(x > width - 50){
    xs = -xs;
  }  
  if(x < 50){
    xs = -xs;
  }
   if(y > height - 50){
    ys = -ys;
  }  
  if(y < 50){
    ys = -ys;
  }
   stroke(#C9E3CA);
fill(#FFFFFF);

boolean test = false;
test = intersects(x, y, mouseX, mouseY, 150);
if(test == true)
{
  ys = -ys;
  xs = -xs;
}
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
int paddleLength) 
{
    if (ballY > paddleY && ballX - 15 > paddleX && ballX + 15 < paddleX + paddleLength)
        return true;
    else
        return false;
}
  
 
  