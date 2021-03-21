import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    //load image
//    Image image_1 = new Image(getClass().getResource("Titan Ares Attack 2 F01.png").toString());
//    Image image_2 = new Image(getClass().getResource("Titan Ares Attack 2 F02.png").toString());
//    Image image_3 = new Image(getClass().getResource("Titan Ares Attack 2 F03.png").toString());

//    private Group titan;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

//        System.out.println(image_1 + ", " + image_2 + ", " + image_3);
//
//        ImageView titanF1 = new ImageView(image_1);
//        ImageView titanF2 = new ImageView(image_2);
//        ImageView titanF3 = new ImageView(image_3);

        // ---------------------------------------------------------------

        Image img_Bitcoin = new Image("scBitcoin.png");

        ImageView ivBitcoin1 = new ImageView(img_Bitcoin);
        ivBitcoin1.setFitWidth(400);
        ivBitcoin1.setPreserveRatio(true);

        ImageView ivBitcoin2 = new ImageView();
        ivBitcoin2.setImage(img_Bitcoin);
        ivBitcoin2.setFitWidth(200);
        ivBitcoin2.setPreserveRatio(true);
        ivBitcoin2.setSmooth(true);
        ivBitcoin2.setCache(true);

        ImageView ivBitcoin3 = new ImageView();
        ivBitcoin3.setImage(img_Bitcoin);
        Rectangle2D vpRect = new Rectangle2D(50, 50, 110, 110);
        ivBitcoin3.setViewport(vpRect);
        ivBitcoin3.setRotate(45);

        Group root = new Group();

        HBox hbox = new HBox();
        hbox.getChildren().add(ivBitcoin1);
        hbox.getChildren().add(ivBitcoin2);
        hbox.getChildren().add(ivBitcoin3);

        root.getChildren().add(hbox);

        // ---------------------------------------------------------------

//        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
//        scene.getStylesheets().add("style.css");
        scene.setFill(Color.DIMGRAY);

        primaryStage.setTitle("Image View Example");
        primaryStage.setScene(scene);
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
