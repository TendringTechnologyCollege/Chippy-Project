package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SceneWelcomePage extends Application
{

    Stage windowWelcome;
    Scene sceneWelcome;

    Button buttonStaff;
    Button buttonOrder;

    Text welcomeText;
    Text informationText;
    Text openTimesText;

    Text monday;
    Text tuesday;
    Text wednesday;
    Text thursday;
    Text friday;
    Text saturday;
    Text sunday;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Sets an initial window titled "Andy's Plaice
        windowWelcome = primaryStage;
        windowWelcome.setTitle("Andy's Plaice");

        buttonStaff = new Button();
        buttonStaff.setText("Staff");
        buttonOrder = new Button();
        buttonOrder.setText("Order");

        welcomeText.setText("Welcome to Andy's Plaice");
        welcomeText.setScaleX(300);
        welcomeText.setScaleY(720);
        informationText.setText("Information :");
        openTimesText.setText("Open Times :");

        monday.setText("Monday : 11:30 - 14:00 / 16:00 - 20:00");
        tuesday.setText("Tuesday : 11:30 - 14:00 / 16:00 - 20:00");
        wednesday.setText("Wednesday : 11:30 - 14:00 / 16:00 - 20:00");
        thursday.setText("Thursday : 11:30 - 14:00 / 16:00 - 20:30");
        friday.setText("Friday : 11:30 - 14:00 / 16:00 - 20:30");
        saturday.setText("Saturday : 11:30 - 14:30 / 16:00 - 20:30");
        sunday.setText("Sunday : Closed");



        //Vertical scene Open Times -- maybe add the scenes into one thingy
        VBox layoutOpenTimes = new VBox();
        layoutOpenTimes.setPrefSize(500,500);
        layoutOpenTimes.setPadding(new Insets(10, 10, 10, 10));
        layoutOpenTimes.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutOpenTimes.setAlignment(Pos.CENTER);
        layoutOpenTimes.getChildren().addAll(openTimesText,monday,tuesday,wednesday,thursday,friday,saturday,sunday);

        //Vertical scene Information -- maybe add the scenes into one thingy
        VBox layoutInformation = new VBox();
        layoutInformation.setPrefSize(780,500);
        layoutInformation.setPadding(new Insets(10, 10, 10, 10));
        layoutInformation.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutInformation.setAlignment(Pos.CENTER);
        layoutInformation.getChildren().addAll(informationText);

        //Horizontal scene information and open times -- maybe add the scenes into one thingy
        HBox layoutInfoNTimes = new HBox();
        layoutInfoNTimes.setPrefSize(1280,500);
        layoutInfoNTimes.setPadding(new Insets(10, 10, 10, 10));
        layoutInfoNTimes.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutInfoNTimes.setAlignment(Pos.CENTER);
        layoutInfoNTimes.getChildren().addAll(layoutOpenTimes, layoutInformation);

        //Horizontal scene Welcome -- maybe add the scenes into one thingy
        HBox layoutWelcome = new HBox();
        layoutWelcome.setPrefSize(1280,120);
        layoutWelcome.setPadding(new Insets(10, 10, 10, 10));
        layoutWelcome.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutWelcome.setAlignment(Pos.CENTER);
        layoutWelcome.getChildren().addAll(welcomeText);

        //Horizontal scene Buttons -- maybe add the scenes into one thingy
        HBox layoutButtons = new HBox();
        layoutButtons.setPrefSize(1280,100);
        layoutButtons.setPadding(new Insets(10, 10, 10, 10));
        layoutButtons.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutButtons.setAlignment(Pos.CENTER);
        layoutButtons.getChildren().addAll(buttonStaff, buttonOrder);

        //Vertical scene Background -- maybe add the scenes into one thingy
        VBox layoutBackground = new VBox();
        layoutBackground.setPrefSize(1280,720);
        layoutBackground.setPadding(new Insets(10, 10, 10, 10));
        layoutBackground.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutBackground.setAlignment(Pos.CENTER);
        layoutBackground.getChildren().addAll(layoutWelcome, layoutInfoNTimes, layoutButtons);



        sceneWelcome = new Scene(layoutBackground, 1280, 720);
        windowWelcome.setScene(sceneWelcome);
        windowWelcome.show();
    }


}

