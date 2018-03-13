PImage Mustachio;
PImage Grumpycat;
void setup() {
  Mustachio = loadImage("Mustachio.png");
Grumpycat = loadImage("Grumpy-cat.jpg");
size(800, 600);
Grumpycat.resize(100, 400);
Mustachio.resize(400, 300);
}
void draw() {
  image(Mustachio, 400, 300);
  background(Grumpycat);

}