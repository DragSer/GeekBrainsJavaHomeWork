package geekbrains.java_1.lesson_7;
import javax.swing.*;
import java.awt.*;

class Map extends JPanel{

    static final int GAME_MODE_HUMAN_VS_AI = 0;
    static final int GAME_MODE_HUMAN_VS_HUMAN = 1;

    Map(){
        setBackground(Color.gray);
    }

    void startNewGame(int mode, int field_size_x, int field_size_y, int win_len){
        System.out.println("mode = " + mode + " field_size = " + field_size_x + " win_len = " + win_len);
    }

    // ДЗ
    // **2. Нарисовать несколько цветных кругов на Map
    public void paint(Graphics g) {
        int window_width = 507;                 // ширина и высота поля
        int grid = 3;                           // количество клеток в поле
        int size_grid = window_width / grid;    // шаг сетки
        int size_figure = (int)(size_grid*0.7); // размер "нолика" и "крестика"
        int x;                                  // координаты угла отрисовки фигур
        int y;

        // Рисуем сетку
        g.setColor(Color.BLACK);
        for (x = size_grid; x <= window_width; x += size_grid) {
            for (y = size_grid; y <= window_width; y += size_grid) g.drawRect(0, 0, x, y);
        }

        // Рисуем "нолики"
        g.setColor(Color.RED);
        int x_grid = 1; // ячейка в которую хотим поставить нолик
        int y_grid = 1;
        x = x_grid*size_grid - size_grid/2 - size_figure/2;
        y = y_grid*size_grid - size_grid/2 - size_figure/2;
        g.fillOval(x, y, size_figure, size_figure);

        x_grid = 2;
        y_grid = 2;
        x = x_grid*size_grid - size_grid/2 - size_figure/2;
        y = y_grid*size_grid - size_grid/2 - size_figure/2;
        g.fillOval(x, y, size_figure, size_figure);

        x_grid = 3;
        y_grid = 3;
        x = x_grid*size_grid - size_grid/2 - size_figure/2;
        y = y_grid*size_grid - size_grid/2 - size_figure/2;
        g.fillOval(x, y, size_figure, size_figure);

        // и подрисуем "крестик" )
        g.setColor(Color.BLUE);
        int line_width = 20;    // толщина линии крестика
        x_grid = 2;             // ячейка в которую хотим поставить крестик
        y_grid = 3;
        int x1 = x_grid * size_grid-size_grid/2 - size_figure/2;  // Координаты горизонтальной полоски
        int y1 = y_grid * size_grid-size_grid/2 - line_width/2;
        g.fillRect(x1, y1, size_figure, line_width);
        int x2 = x_grid * size_grid-size_grid/2 - line_width/2;   // Координаты вертикальной полоски
        int y2 = y_grid * size_grid-size_grid/2 - size_figure/2;
        g.fillRect(x2, y2, line_width, size_figure);
    }
}