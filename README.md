Что нужно сделать

Напишите программу уменьшения изображений на основе проекта ImageResizer. Она должна запускать число потоков, равное количеству ядер процессора вашего компьютера.

Дополнительное задание*

Цель задания

Используя библиотеку Imgscalr, уменьшать изображение без потери качества. 

Что нужно сделать

Включите поддержку сборщика maven в свой проект
Внедрить библиотеку Imgscalr в проект.
Использовать метод для уменьшения изображения.
public static BufferedImage resize(BufferedImage src, int targetWidth, 
            int targetHeight, BufferedImageOp... ops)