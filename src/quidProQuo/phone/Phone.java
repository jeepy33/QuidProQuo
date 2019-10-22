package quidProQuo.phone;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Phone {
    private BufferedImage sprite, selectedSprite;
    private URL spritePath, selectedPath;
    private int pos[];

    public Phone(){
        pos = new int[2];
        pos[0] = 870;
        pos[1] = 450;

        try{
            spritePath = Phone.class.getResource("Phone Sprite.png");
            sprite = ImageIO.read(spritePath);
        }
        catch (Exception e){
            System.out.println("Phone Image not Loaded");
        }

        try{
            selectedPath = Phone.class.getResource("Phone Sprite Selected.png");
            selectedSprite = ImageIO.read(selectedPath);
        }
        catch (Exception e){
            System.out.println("Phone (Selected) Image not Loaded");
        }
    }

    public int getX(){
        return pos[0];
    }

    public int getY(){
        return pos[1];
    }

    public BufferedImage getSprite(){
        return sprite;
    }
    public BufferedImage getSelectedSprite(){
        return selectedSprite;
    }

    public BufferedImage getState(boolean isSelected){
        if (isSelected){
            return selectedSprite;
        }
        else {
            return sprite;
        }
    }




}
