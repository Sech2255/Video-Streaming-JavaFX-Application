package javafx.groupassignment.streamingserviceappdemo;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class ServiceStreamController implements Initializable {
    Image logoImg = new Image("HSLogo.png");

    @FXML
    private ImageView logoID = new ImageView(logoImg);

    @FXML
    private Label tagLine;

    @FXML
    private ProgressBar webLoad;

    @FXML
    private Label cat1leftarrow1;

    @FXML
    private ImageView scifiLeftArrow;

    @FXML
    private ImageView ba;

    @FXML
    private WebView webView;

    @FXML
    private VBox scifiVbox1;

    @FXML
    private VBox scifiVbox2;

    @FXML
    private VBox scifiVbox3;

    @FXML
    private VBox scifiVbox4;

    @FXML
    private VBox scifiVbox5;

    @FXML
    private VBox scifiVbox6;

    @FXML
    private VBox scifiVbox7;

    @FXML
    private VBox scifiVbox8;

    @FXML
    private VBox dramaVbox1;

    @FXML
    private VBox dramaVbox2;

    @FXML
    private VBox dramaVbox3;

    @FXML
    private VBox dramaVbox4;

    @FXML
    private VBox dramaVbox5;

    @FXML
    private VBox dramaVbox6;

    @FXML
    private VBox dramaVbox7;

    @FXML
    private VBox dramaVbox8;

    @FXML
    private VBox advVbox1;

    @FXML
    private VBox advVbox2;

    @FXML
    private VBox advVbox3;

    @FXML
    private VBox advVbox4;

    @FXML
    private VBox advVbox5;

    @FXML
    private VBox advVbox6;

    @FXML
    private VBox advVbox7;

    @FXML
    private VBox advVbox8;

    @FXML
    private Label cat3leftarrow;

    @FXML
    private Label cat3rightarrow;

    @FXML
    private Label cat2leftarrow;

    @FXML
    private Label cat2rightarrow;

    @FXML
    private Label cat1leftarrow;

    @FXML
    private Label cat1rightarrow;

    @FXML
    private Rectangle AdventureRect;

    @FXML
    private Rectangle DramaRect;

    @FXML
    private Rectangle SciFiRect;

    @FXML
    private Label appLogo;

    @FXML
    private Rectangle bannerRect;

    @FXML
    private Rectangle bottomRect;

    @FXML
    private HBox genre1ChildContainer;

    @FXML
    private VBox genre1ParentContainer;

    @FXML
    private HBox genre2ChildContainer;

    @FXML
    private VBox genre2ParentContainer;

    @FXML
    private HBox genre3ChildContainer;

    @FXML
    private VBox genre3ParentContainer;

    @FXML
    private ImageView genreBanner;

    @FXML
    private Label genreLabel1;

    @FXML
    private Label genreLabel2;

    @FXML
    private Label genreLabel3;

    @FXML
    private HBox hBoxLeft;

    @FXML
    private HBox hBoxRight;

    @FXML
    private BorderPane root;

    @FXML
    private ScrollPane scrollpaneContainer;

    @FXML
    private VBox vBoxBottom;

    @FXML
    private VBox vBoxCenter;

    @FXML
    private VBox vBoxTop;

    @FXML
    void cat1leftclick(MouseEvent event) {
        double keyX = genre1ChildContainer.getLayoutX();
        keyX +=0;
        genre1ChildContainer.setTranslateX(keyX);
        cat1leftarrow.setVisible(false);
        cat1rightarrow.setVisible(true);

    }

    @FXML
    void cat1rightclick(MouseEvent event) {
        double keyX = genre1ChildContainer.getLayoutX();
        keyX-=1225;
        genre1ChildContainer.setTranslateX(keyX);
        cat1rightarrow.setVisible(false);
        cat1leftarrow.setVisible(true);

    }

    @FXML
    void cat2leftclick(MouseEvent event) {
        int keyX = 0;
        keyX +=0;
        genre2ChildContainer.setTranslateX(keyX);
        cat2leftarrow.setVisible(false);
        cat2rightarrow.setVisible(true);

    }

    @FXML
    void cat2rightclick(MouseEvent event) {
        int keyX = 0;
        keyX -=1225;
        genre2ChildContainer.setTranslateX(keyX);
        cat2rightarrow.setVisible(false);
        cat2leftarrow.setVisible(true);
    }

    @FXML
    void cat3leftclick(MouseEvent event) {
        int keyX = 0;
        keyX +=0;
        genre3ChildContainer.setTranslateX(keyX);
        cat3leftarrow.setVisible(false);
        cat3rightarrow.setVisible(true);
    }

    @FXML
    void cat3rightclick(MouseEvent event) {
        int keyX = 0;
        keyX -=1225;
        genre3ChildContainer.setTranslateX(keyX);
        cat3rightarrow.setVisible(false);
        cat3leftarrow.setVisible(true);

    }

    Image image1 = new Image("whiteArrowsLeft.png");
    Image image2 = new Image("whiteArrowsRight.png");
    Image image3 = new Image("LeftArrow.png");
    Image image4 = new Image("RightArrow.png");
    Image image5 = new Image("blank.png");

    ImageView whiteArrL = new ImageView(image1);
    ImageView whiteArrR = new ImageView(image2);
    ImageView blueArrL = new ImageView(image3);
    ImageView blueArrR = new ImageView(image4);
    ImageView blankArr = new ImageView(image5);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        webView.setVisible(false);
        webLoad.setVisible(false);
        cat1leftarrow.setVisible(false);
        cat2leftarrow.setVisible(false);
        cat3leftarrow.setVisible(false);

        onThumbnailHover();
        arrowsHover();
        onThumbnailClick();

        scrollpaneContainer.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

    }

    public void onThumbnailHover(){
        //Hover effect for each thumbnail

        //Sci-fi
        scifiVbox1.setOnMouseEntered((event)->{
            scifiVbox1.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox1.setOnMouseExited((event)->{
            scifiVbox1.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox2.setOnMouseEntered((event)->{
            scifiVbox2.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox2.setOnMouseExited((event)->{
            scifiVbox2.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox3.setOnMouseEntered((event)->{
            scifiVbox3.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox3.setOnMouseExited((event)->{
            scifiVbox3.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox4.setOnMouseEntered((event)->{
            scifiVbox4.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox4.setOnMouseExited((event)->{
            scifiVbox4.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox5.setOnMouseEntered((event)->{
            scifiVbox5.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox5.setOnMouseExited((event)->{
            scifiVbox5.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox6.setOnMouseEntered((event)->{
            scifiVbox6.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox6.setOnMouseExited((event)->{
            scifiVbox6.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox7.setOnMouseEntered((event)->{
            scifiVbox7.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox7.setOnMouseExited((event)->{
            scifiVbox7.setStyle("-fx-background-color: transparent;");
        });

        scifiVbox8.setOnMouseEntered((event)->{
            scifiVbox8.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox8.setOnMouseExited((event)->{
            scifiVbox8.setStyle("-fx-background-color: transparent;");
        });


        //Drama
        dramaVbox1.setOnMouseEntered((event)->{
            dramaVbox1.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox1.setOnMouseExited((event)->{
            dramaVbox1.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox2.setOnMouseEntered((event)->{
            dramaVbox2.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox2.setOnMouseExited((event)->{
            dramaVbox2.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox3.setOnMouseEntered((event)->{
            dramaVbox3.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox3.setOnMouseExited((event)->{
            dramaVbox3.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox4.setOnMouseEntered((event)->{
            dramaVbox4.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox4.setOnMouseExited((event)->{
            dramaVbox4.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox5.setOnMouseEntered((event)->{
            dramaVbox5.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox5.setOnMouseExited((event)->{
            dramaVbox5.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox6.setOnMouseEntered((event)->{
            dramaVbox6.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox6.setOnMouseExited((event)->{
            dramaVbox6.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox7.setOnMouseEntered((event)->{
            dramaVbox7.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        dramaVbox7.setOnMouseExited((event)->{
            dramaVbox7.setStyle("-fx-background-color: transparent;");
        });

        dramaVbox8.setOnMouseEntered((event)->{
            dramaVbox8.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        scifiVbox8.setOnMouseExited((event)->{
            scifiVbox8.setStyle("-fx-background-color: transparent;");
        });


        //Adventure
        advVbox1.setOnMouseEntered((event)->{
            advVbox1.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox1.setOnMouseExited((event)->{
            advVbox1.setStyle("-fx-background-color: transparent;");
        });

        advVbox2.setOnMouseEntered((event)->{
            advVbox2.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox2.setOnMouseExited((event)->{
            advVbox2.setStyle("-fx-background-color: transparent;");
        });

        advVbox3.setOnMouseEntered((event)->{
            advVbox3.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox3.setOnMouseExited((event)->{
            advVbox3.setStyle("-fx-background-color: transparent;");
        });

        advVbox4.setOnMouseEntered((event)->{
            advVbox4.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox4.setOnMouseExited((event)->{
            advVbox4.setStyle("-fx-background-color: transparent;");
        });

        advVbox5.setOnMouseEntered((event)->{
            advVbox5.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox5.setOnMouseExited((event)->{
            advVbox5.setStyle("-fx-background-color: transparent;");
        });

        advVbox6.setOnMouseEntered((event)->{
            advVbox6.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox6.setOnMouseExited((event)->{
            advVbox6.setStyle("-fx-background-color: transparent;");
        });

        advVbox7.setOnMouseEntered((event)->{
            advVbox7.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox7.setOnMouseExited((event)->{
            advVbox7.setStyle("-fx-background-color: transparent;");
        });

        advVbox8.setOnMouseEntered((event)->{
            advVbox8.setStyle("-fx-background-color: #1A1A1D; -fx-opacity: 0.5; -fx-background-insets: -1, 2.0;");
        });

        advVbox8.setOnMouseExited((event)->{
            advVbox8.setStyle("-fx-background-color: transparent;");
        });
    }

    public void arrowsHover(){

        blueArrL.setFitWidth(20);
        blueArrL.setPreserveRatio(true);

        blueArrR.setFitWidth(20);
        blueArrR.setPreserveRatio(true);

        whiteArrL.setFitWidth(20);
        whiteArrL.setPreserveRatio(true);

        whiteArrR.setFitWidth(20);
        whiteArrR.setPreserveRatio(true);

        blankArr.setFitWidth(20);
        blankArr.setPreserveRatio(true);

        //Sci-fi category arrows

        cat1leftarrow.setOnMouseEntered((event)->{
            cat1leftarrow.setGraphic(blueArrL);
        });

        cat1leftarrow.setOnMouseClicked((event)->{
            cat1leftarrow.setGraphic(whiteArrL);
        });

        cat1leftarrow.setOnMouseExited((event)->{
            cat1leftarrow.setGraphic(blankArr);
        });

        cat1rightarrow.setOnMouseEntered((event)->{
            cat1rightarrow.setGraphic(blueArrR);
        });

        cat1rightarrow.setOnMouseClicked((event)->{
            cat1rightarrow.setGraphic(whiteArrR);
        });

        cat1rightarrow.setOnMouseExited((event)->{
            cat1rightarrow.setGraphic(blankArr);
        });

        //Drama category arrows

        cat2leftarrow.setOnMouseEntered((event)->{
            cat2leftarrow.setGraphic(blueArrL);
        });

        cat2leftarrow.setOnMouseClicked((event)->{
            cat2leftarrow.setGraphic(whiteArrL);
        });

        cat2leftarrow.setOnMouseExited((event)->{
            cat2leftarrow.setGraphic(blankArr);
        });

        cat2rightarrow.setOnMouseEntered((event)->{
            cat2rightarrow.setGraphic(blueArrR);
        });

        cat2rightarrow.setOnMouseClicked((event)->{
            cat2rightarrow.setGraphic(whiteArrR);
        });

        cat2rightarrow.setOnMouseExited((event)->{
            cat2rightarrow.setGraphic(blankArr);
        });

        //Adventure category arrows

        cat3leftarrow.setOnMouseEntered((event)->{
            cat3leftarrow.setGraphic(blueArrL);
        });

        cat3leftarrow.setOnMouseClicked((event)->{
            cat3leftarrow.setGraphic(whiteArrL);
        });

        cat3leftarrow.setOnMouseExited((event)->{
            cat3leftarrow.setGraphic(blankArr);
        });

        cat3rightarrow.setOnMouseEntered((event)->{
            cat3rightarrow.setGraphic(blueArrR);
        });

        cat3rightarrow.setOnMouseClicked((event)->{
            cat3rightarrow.setGraphic(whiteArrR);
        });

        cat3rightarrow.setOnMouseExited((event)->{
            cat3rightarrow.setGraphic(blankArr);
        });
    }

    public void onThumbnailClick(){
        //On Mouse click functions for each thumbnail
        scifiVbox1.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                scrollpaneContainer.setVvalue(1);
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/BwZs3H_UN3k?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });
            }
            else {
                scrollpaneContainer.setVvalue(1);
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/BwZs3H_UN3k?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox2.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/wxN1T1uxQ2g?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });
            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/wxN1T1uxQ2g?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox3.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/X0tOpBuYasI?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });
            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/X0tOpBuYasI?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox4.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/QGwtPfjt9Zc?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });
            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/QGwtPfjt9Zc?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());
                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox5.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/9OTGXVnPp2Y?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });
            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/9OTGXVnPp2Y?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox6.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/fb5ELWi-ekk?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/fb5ELWi-ekk?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox7.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/3Yh_6_zItPU?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/3Yh_6_zItPU?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        scifiVbox8.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/aWzlQ2N6qqg?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/aWzlQ2N6qqg?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox1.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/giXco2jaZ_4?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/giXco2jaZ_4?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox2.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/G5kzUpWAusI?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/G5kzUpWAusI?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox3.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/RqrXhwS33yc?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/RqrXhwS33yc?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox4.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/nfKO9rYDmE8?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/nfKO9rYDmE8?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox5.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/eHp3MbsCbMg?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/eHp3MbsCbMg?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox6.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/Y9dr2zw-TXQ?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/Y9dr2zw-TXQ?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox7.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/EPZu5MA2uqI?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/EPZu5MA2uqI?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        advVbox8.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/CaimKeDcudo?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/CaimKeDcudo?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox1.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/dZRqB0JLizw?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/dZRqB0JLizw?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox2.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/ofnXPwUPENo?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/ofnXPwUPENo?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox3.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/pGi3Bgn7U5U?&autolpay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/pGi3Bgn7U5U?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox4.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/Ja3PPOnJQ2k?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/Ja3PPOnJQ2k?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox5.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/dWn0X8jy9_0?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/dWn0X8jy9_0?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox6.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/-2qpKUExOnE?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/-2qpKUExOnE?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox7.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/K7AL2OARpTo?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });

            }
            else {
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/K7AL2OARpTo?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

        dramaVbox8.setOnMouseClicked((event)->{
            if(webView.isVisible()){
                scrollpaneContainer.setVvalue(1);
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                engine.load("https://www.youtube.com/embed/nchh-qezCOI?&autoplay=1");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            else {
                scrollpaneContainer.setVvalue(1);
                webLoad.setVisible(true);
                final WebEngine engine=webView.getEngine();
                webView.setVisible(true);
                engine.load("https://www.youtube.com/embed/nchh-qezCOI?");
                webLoad.progressProperty().bind(engine.getLoadWorker().progressProperty());

                engine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>() {
                    @Override
                    public void changed(ObservableValue ov, Worker.State oldstate, Worker.State newState) {
                        if (newState== Worker.State.SUCCEEDED){
                            webLoad.setVisible(false);
                        }

                    }
                });


            }
            tagLine.setVisible(false);
            webView.setPrefSize(800,500);
        });

    }

}