package plan;

import java.util.ArrayList;
import java.util.Collections;

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

public class Scene_One {
	private int numberOfPairs = 32;
	private final double dimension = Math.ceil(Math.sqrt(numberOfPairs * 2));
	private card isChosen = null;
	private int points = 0;
	Pane ley = new Pane();

	public Pane makeParent() {

		ley.setPrefSize(70 * dimension, 70 * dimension);
		ArrayList<card> al = new ArrayList<card>();
		int i;
		for (i = 0; i < numberOfPairs; i++) {
			al.add(new card((char) (i + 65)));
			al.add(new card((char) (i + 65)));

		}

		Collections.shuffle(al);

		double row = 0;
		double kolumn = 0;

		for (int b = 0; b < i * 2; b++) {

			if (kolumn == dimension) {
				kolumn = 0;
				row++;
			}
			al.get(b).miejsce(kolumn, row);
			ley.getChildren().add(al.get(b));
			kolumn++;

		}
		return ley;

	}

	public final class card extends StackPane {

		private Text sign = new Text();
		private Rectangle border = new Rectangle();

		public card(char letter) {
			border = new Rectangle(60, 60);
			border.setFill(Paint.valueOf("#DDDDDD"));
			border.setStroke(Paint.valueOf("#000000"));
			sign.setText(letter + "");
			sign.setTextAlignment(TextAlignment.CENTER);
			sign.setFont(Font.font(30));
			getChildren().addAll(border, sign);
			close();
			setPadding(new Insets(5, 5, 5, 5));
			setOnMouseClicked(event -> {
				if (isChosen == null) {
					isChosen = this;
					Klik();
				}

				else if (isChosen != null) {
					Klik();
					if (check(this, isChosen) == true && this != isChosen) {
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

		public boolean check(card first, card second) {
			if (first.sign.getText().equals(second.sign.getText())) {
				return true;
			} else {
				return false;
			}
		}

		public void miejsce(double kolumn, double row) {
			setTranslateX(70 * kolumn);
			setTranslateY(70 * row);
		}

		public void Klik() {
			FadeTransition fade = new FadeTransition(Duration.seconds(0.5), sign);
			fade.setToValue(1);
			fade.play();

		}

		public void close() {
			FadeTransition ft = new FadeTransition(Duration.seconds(1.0), sign);
			ft.setFromValue(1.0);
			ft.setToValue(0.0);
			ft.play();
		}
	}
}
