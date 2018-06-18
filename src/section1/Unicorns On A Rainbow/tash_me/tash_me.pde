PImage mustache;
PImage friend;
void setup()
{
size(800,600);
  friend = loadImage("Seinfield.png");
  friend.resize(800,600);
  mustache = loadImage("mousetache.png");
  

}
void draw()
{
  background(friend);
}