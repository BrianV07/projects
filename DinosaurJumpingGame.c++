#include <SPI.h>
#include <Adafruit_GFX.h>
#include <Adafruit_ILI9341.h>

// TFT = game
Adafruit_ILI9341 tft(10, 9, 8);
bool playing = false;

// Dino physics & cactus variable(s)
int dinoY = 160;
int dinoSpeed = 0;
int cactusX = 320;

void setup() {
  pinMode(6, OUTPUT);
  digitalWrite(6, HIGH);
  // Draws game
  pinMode(2, INPUT_PULLUP);
  tft.begin();
  tft.setRotation(1);
  tft.fillScreen(ILI9341_BLACK);
  tft.drawFastHLine(0, 180, 320, ILI9341_WHITE);

}


void loop() {

  if (playing == false) {
    if (digitalRead(2) == LOW) {
      // New-game reset
      tft.fillScreen(ILI9341_BLACK);
      tft.drawFastHLine(0, 180, 320, ILI9341_WHITE);

      dinoY = 160;
      dinoSpeed = 0;
      cactusX = 320;

      randomSeed(micros());
      playing = true;

    }
  } else { // IF game is playing
    // Dino Physics
    tft.fillRect(30, dinoY, 20, 20, ILI9341_BLACK); // Erase Dino

    if (digitalRead(2) == LOW && dinoY == 160) { // Button input = jump

      dinoSpeed = -12;

    }

    dinoSpeed += 1; // Updates gravity
    dinoY += dinoSpeed; // Updates the jumping movement

    if (dinoY > 160) { // Makes sure our dino buddy isn't clipping below the ground

      dinoY = 160;
      dinoSpeed = 0;

    }

    tft.fillRect(30, dinoY, 20, 20, ILI9341_WHITE); // Updates Dino with new dinoY

    // Cactus Physics
    tft.fillRect(cactusX, 160, 20, 20, ILI9341_BLACK); // Erase Cactus
    cactusX -= 5;

    if (cactusX < -20) { // Check if cactus has went offscreen, creating a new cactus with a new random location between 0-199 pixels

      cactusX = 320 + random(0, 200);

    }

    tft.fillRect(cactusX, 160, 20, 20, ILI9341_RED); // Updates Cactus with new cactusX

    // Crash handler & checks: Must SEE IF CRASHES MEET THE 3 QUESTIONS
    if (cactusX < 50 && cactusX + 20 > 30 && dinoY + 20 > 160) {
      // Dino when crashing turns yellow and the game stops
      tft.fillRect(30, dinoY, 20, 20, ILI9341_YELLOW);
      playing = false;
      delay(1000);

    }

    delay(30); // Game delay to keep stuff from loading too fast

  }