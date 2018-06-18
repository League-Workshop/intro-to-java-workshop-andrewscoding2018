PImage rainbow;
PImage unicorn;
PImage unicorny;
void setup()
{
  size(1200,1200);
  rainbow = loadImage("Rainbow.png");
  rainbow.resize(1200,1200);
  background(rainbow);
  unicorn = loadImage("Unicorn.png");
  unicorn.resize(600,600);
  unicorny = loadImage("frapp.jpg");
  unicorny.resize(400,400);
 
}
void draw()
{
  background(rainbow);
  if(mousePressed)
  {
    image(unicorny, mouseX, mouseY);
    image(unicorn, mouseX, mouseY);
  }
}