package ru.geekbrains.java.HomeWork.JavaHW_two;

public class BackGround {
    package ru.geekbrains.java.hw.a;

import java.awt.*;

    public class BackGround extends Sprite {

        private Color color;
        private float vChenge;

        public BackGround() {
            color = new Color(
                    (int) (Math.random() * 255), // R
                    (int) (Math.random() * 255), // G
                    (int) (Math.random() * 255)  // B
            );
            vChenge = (float) (30f + (Math.random() * 50f));
        }

        void update(GameCanvas canvas) {
            float y = (float) (100f + (Math.random() * 40000f));
            float x = (float) (100f + (Math.random() * 1000f));

            if (x > y) {
                color = new Color(
                        (int) (Math.random() * 255), // R
                        (int) (Math.random() * 255), // G
                        (int) (Math.random() * 255)  // B
                );
            }

        }

        void render(GameCanvas canvas, Graphics g) {
            canvas.setBackground(color);
        }

    }
}
