import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImgToAsciiArt {


    private BufferedImage bufferedImage;
    private double pixval;
    private PrintWriter printWriter;
    private FileWriter fileWriter;

    public ImgToAsciiArt() {
        try {
            printWriter = new PrintWriter(fileWriter = new FileWriter("c:\\Users\\Pawel\\Desktop\\file.txt", true));
        } catch (IOException e){
        }
    }


    public void convertToAscii(String imgname) {
        try {
            bufferedImage = ImageIO.read(new File(imgname));
            } catch (IOException e) {
        }

        for (int i = 0; i < bufferedImage.getHeight(); i++) {
            for (int j = 0; j < bufferedImage.getWidth(); j++) {
                Color pixcol = new Color(bufferedImage.getRGB(j, i));
                pixval = (((pixcol.getRed() * 0.30) + (pixcol.getBlue() * 0.59) + (pixcol
                        .getGreen() * 0.11)));
                print(strChar(pixval));
            }
            try {
                printWriter.println("");
                printWriter.flush();
                fileWriter.flush();
            } catch (Exception ex) {
            }
        }
    }


    public String strChar(double g) {
        String str = " ";
        if (g >= 240) {
            str = " ";
        } else if (g >= 210) {
            str = ".";
        } else if (g >= 190) {
            str = "*";
        } else if (g >= 170) {
            str = "+";
        } else if (g >= 120) {
            str = "^";
        } else if (g >= 110) {
            str = "&";
        } else if (g >= 80) {
            str = "8";
        } else if (g >= 60) {
            str = "#";
        } else {
            str = "@";
        }
        return str;
    }

    public void print(String str) {
        try {
            printWriter.print(str);
            printWriter.flush();
            fileWriter.flush();
        } catch (Exception ex) {
        }
    }


    public static void main(String[] args) {

        ImgToAsciiArt obj = new ImgToAsciiArt();
        obj.convertToAscii("c:\\Users\\Pawel\\Desktop\\picture.jpg");

    }
}
