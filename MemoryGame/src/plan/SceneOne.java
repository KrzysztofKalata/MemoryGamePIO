package plan;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

public class SceneOne {
    Pane ley = new Pane();
    public static int numberOfPairs = 3;
    private final double dimension = Math.ceil(Math.sqrt(numberOfPairs * 2));
    private card isChosen = null;
    private int points = 0;
    public int id=0;


    public SceneOne(){};

    public Pane makeParent()
    {
        
        
        ley.setPrefSize(70 * dimension, 70 * dimension);
        ArrayList<card> al = new ArrayList<>();
        int i;
      
       for (i = 0; i < numberOfPairs; i++) {
           int idCard=i;
           
           
            al.add(new card(new Image("img/"+idCard+".jpg"),i));
            
            al.add(new card(new Image("img/"+idCard+".jpg"),i));

        }
      
       
        Collections.shuffle(al);

        double row = 0;
        double column = 0;

        for (int b = 0; b < i * 2; b++) {

            if (column == dimension) {
                column = 0;
                row++;
            }
            al.get(b).location(column, row);
            ley.getChildren().add(al.get(b));
            column++;

        }
        return ley;
    }

   

       
   

    public final class card extends StackPane {

        private Text sign = new Text();
        private Rectangle border = new Rectangle();
        public int id=3;
         ImagePattern image;
       private Rectangle lol = new Rectangle();



        public card(Image image,int id)
        {
            
            
    lol= new Rectangle(60,60);
            border = new Rectangle(50, 50);
            lol.setFill(Paint.valueOf("#DDDDDD"));
            lol.setStroke(Paint.valueOf("#000000"));
            border.setFill(Paint.valueOf("#DDDDDD"));
            border.setFill(new ImagePattern(image, 0, 0, 1, 1, true));
            border.setStroke(Paint.valueOf("#000000"));
            
         sign.setId(id+"");
         
          
            getChildren().addAll(lol,border, sign);
            close();
            setPadding(new Insets(5, 5, 5, 5));
            setOnMouseClicked(event -> {
                if (isChosen == null) {
                    isChosen = this;
                    cardClick();
                } else if (isChosen != null) {
                    cardClick();
                    if (checkPair(this, isChosen) == true && this != isChosen) {
                        ley.getChildren().removeAll(this, isChosen);
                        
                        isChosen = null;
                        points++;
                        if (points == numberOfPairs) {
                            SceneLib.switchtoTwo();
                        }
                    } else {
                        isChosen.close();
                        this.close();
                        isChosen = null;

                    }
                    close();

                }

            });

        }
        

        public boolean checkPair(card first, card second) {
            if (first.sign.getId().equals(second.sign.getId())) {
                return true;
            } else {
                return false;
            }
        }
        

        public void location(double column, double row) {
            setTranslateX(70 * column);
            setTranslateY(70 * row);
        }

       public void cardClick() {
            FadeTransition fade = new FadeTransition(Duration.seconds(0.5), border);
            fade.setToValue(1);
            fade.play();

        }

        public void close() {
            FadeTransition ft = new FadeTransition(Duration.seconds(1.0), border);
            ft.setFromValue(1.0);
            ft.setToValue(0.0);
            ft.play();
        }

        

        
    }
        public int getNumberOfPairs()
        {
            return numberOfPairs;
        }
        public int getPoints()
        {
            return points;
        }
        public int getId()
        {
            return id;
        }
        public void setNumberOfPairs( int numberOfPairs)
        {
            this.numberOfPairs = numberOfPairs;
        }
        public void setPoints( int points)
        {
            this.points = points;
        }
        public void setId( int id)
        {
            this.id = id;
        }

        public int getBetterId(int id)
        {
            return id;
        }

        public double getDimension()
        {
            return dimension;
        }

        public card getIsChosen()
        {
            return isChosen;
        }



}

