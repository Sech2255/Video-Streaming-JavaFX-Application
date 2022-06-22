package javafx.groupassignment.streamingserviceappdemo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class ServiceStream extends Application {
    Dimension screenSizes = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

    int widthOfScreen = 1366;
    Double screenWidth = screenSizes.getWidth()/1.1;
    //1241.82

    int heightOfScreen = 768;
    Double screenHeight = screenSizes.getHeight()/1.1;
    //698.18

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(ServiceStream.class.getResource("ServiceStream.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), screenWidth, screenHeight);
        scene.getStylesheets().add("defaultStyleSheet.css");

        /*scene.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });*/


        stage.setTitle("High-Streamer App");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[] args) {
        launch();
    }
}