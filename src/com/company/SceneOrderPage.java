package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneOrderPage extends Application
{

    Stage window;
    Scene scene;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Sets an initial window titled "Andy's Plaice
        window = primaryStage;
        window.setTitle("Andy's Plaice");

        button1 = new Button();
        button1.setText("Customer name - Date - Time");
        button2 = new Button();
        button2.setText("Total Price : £.....");
        button3 = new Button();
        button3.setText("Void all - Void item - Order");
        button4 = new Button();
        button4.setText("Reg chips \n half chips");
        button5 = new Button();
        button5.setText("Lrg chips \n Chip butty");
        button6 = new Button();
        button6.setText("FoodItem \n FoodItem \n FoodItem \n FoodItem");
        button7 = new Button();
        button7.setText("FoodItem \n FoodItem \n FoodItem \n FoodItem");
        button8 = new Button();
        button8.setText("FoodItem \n FoodItem \n FoodItem \n FoodItem");
        button9 = new Button();
        button9.setText("FoodItem \n FoodItem \n FoodItem \n FoodItem");
        button10 = new Button();
        button10.setText("Category 1 -- Category 2 -- Category 3 -- Category 4 -- Category 5 -- Category 6");



        //Sets up a Tree item list
        TreeItem<String> bobsOrder,drinks, food, burger1, burger2, fish, chips;

        //Root
        bobsOrder = new TreeItem<>();
        bobsOrder.setExpanded(true);

        //Drinks
        drinks = makeBranch("Drinks", bobsOrder);
        makeBranch("Can", drinks);
        makeBranch("500ml Bottle", drinks);
        makeBranch("Can", drinks);
        makeBranch("2ltr Bottle", drinks);

        //Food
        food = makeBranch("Food",bobsOrder);

        //burger1
        burger1 = makeBranch("1/4 lb CheeseBurger", food);
        makeBranch("Tomato", burger1);
        makeBranch("Cucumber", burger1);
        makeBranch("BBQ Sauce", burger1);

        //burger2
        burger2 = makeBranch("Chicken Burger", food);
        makeBranch("Lettuce", burger2);
        makeBranch("Mayo", burger2);

        //Fish
        fish = makeBranch("Fish", food);
        makeBranch("Cod",fish);
        makeBranch("Scampi",fish);
        makeBranch("Cod",fish);
        makeBranch("Haddock",fish);

        //Chips
        chips = makeBranch("Chips", food);
        makeBranch("Reg Chips",chips);
        makeBranch("Lrg Chips", chips);
        makeBranch("1/2 Chips", chips);

        //Create the tree and hide the main Root
        TreeView<String> order = new TreeView<>(bobsOrder);
        order.setPrefSize(480,470);
        order.setShowRoot(false);



        //Horizontal scene Customer Info Box -- maybe add the scenes into one thingy
        HBox layoutInfoBox = new HBox();
        layoutInfoBox.setPrefSize(480,50);
        layoutInfoBox.setPadding(new Insets(10, 10, 10, 10));
        layoutInfoBox.setBackground(new Background(new BackgroundFill(Color.LIGHTSLATEGREY, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutInfoBox.setAlignment(Pos.CENTER);
        layoutInfoBox.getChildren().addAll(button1);

        //Horizontal scene Tree Table -- maybe add the scenes into one thingy
        HBox layoutTreeTable = new HBox();
        layoutTreeTable.setPrefSize(480,470);
        layoutTreeTable.setPadding(new Insets(10, 10, 10, 10));
        layoutTreeTable.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutTreeTable.setAlignment(Pos.CENTER);
        layoutTreeTable.getChildren().addAll(order);

        //Horizontal scene Pricing -- maybe add the scenes into one thingy
        HBox layoutPricing = new HBox();
        layoutPricing.setPrefSize(480,50);
        layoutPricing.setPadding(new Insets(10, 10, 10, 10));
        layoutPricing.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutPricing.setAlignment(Pos.CENTER);
        layoutPricing.getChildren().addAll(button2);

        //Horizontal scene Button box Order + Void -- maybe add the scenes into one thingy
        HBox layoutOrderNVoid = new HBox();
        layoutOrderNVoid.setPrefSize(480,50);
        layoutOrderNVoid.setPadding(new Insets(10, 10, 10, 10));
        layoutOrderNVoid.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutOrderNVoid.setAlignment(Pos.CENTER);
        layoutOrderNVoid.getChildren().addAll(button3);

        //Vertical scene Button 1+3 -- maybe add the scenes into one thingy
        VBox layoutButtonOneThree = new VBox();
        layoutButtonOneThree.setPrefSize(240,50);
        layoutButtonOneThree.setPadding(new Insets(10, 10, 10, 10));
        layoutButtonOneThree.setBackground(new Background(new BackgroundFill(Color.LIGHTPINK, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutButtonOneThree.setAlignment(Pos.CENTER);
        layoutButtonOneThree.getChildren().addAll(button4);

        //Vertical scene Button 2+4 -- maybe add the scenes into one thingy
        VBox layoutButtonTwoFour = new VBox();
        layoutButtonTwoFour.setPrefSize(240,50);
        layoutButtonTwoFour.setPadding(new Insets(10, 10, 10, 10));
        layoutButtonTwoFour.setBackground(new Background(new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutButtonTwoFour.setAlignment(Pos.CENTER);
        layoutButtonTwoFour.getChildren().addAll(button5);

        //Horizontal scene Button section Chips and butty -- maybe add the scenes into one thingy
        HBox layoutChipsNButty = new HBox();
        layoutChipsNButty.setPrefSize(480,100);
        layoutChipsNButty.setPadding(new Insets(10, 10, 10, 10));
        layoutChipsNButty.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutChipsNButty.setAlignment(Pos.CENTER);
        layoutChipsNButty.getChildren().addAll(layoutButtonOneThree, layoutButtonTwoFour);

        //Vertical scene Button column 1 -- maybe add the scenes into one thingy
        VBox layoutColumnOne = new VBox();
        layoutColumnOne.setPrefSize(200,500);
        layoutColumnOne.setPadding(new Insets(10, 10, 10, 10));
        layoutColumnOne.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutColumnOne.setAlignment(Pos.CENTER);
        layoutColumnOne.getChildren().addAll(button6);

        //Vertical scene Button column 2 -- maybe add the scenes into one thingy
        VBox layoutColumnTwo = new VBox();
        layoutColumnTwo.setPrefSize(200,500);
        layoutColumnTwo.setPadding(new Insets(10, 10, 10, 10));
        layoutColumnTwo.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutColumnTwo.setAlignment(Pos.CENTER);
        layoutColumnTwo.getChildren().addAll(button7);

        //Vertical scene Button column 3 -- maybe add the scenes into one thingy
        VBox layoutColumnThree = new VBox();
        layoutColumnThree.setPrefSize(200,500);
        layoutColumnThree.setPadding(new Insets(10, 10, 10, 10));
        layoutColumnThree.setBackground(new Background(new BackgroundFill(Color.LIGHTYELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutColumnThree.setAlignment(Pos.CENTER);
        layoutColumnThree.getChildren().addAll(button8);

        //Vertical scene Button column 4 -- maybe add the scenes into one thingy
        VBox layoutColumnFour = new VBox();
        layoutColumnFour.setPrefSize(200,500);
        layoutColumnFour.setPadding(new Insets(10, 10, 10, 10));
        layoutColumnFour.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutColumnFour.setAlignment(Pos.CENTER);
        layoutColumnFour.getChildren().addAll(button9);

        //Horizontal scene Button Box Category -- maybe add the scenes into one thingy
        HBox layoutCategoryBox = new HBox();
        layoutCategoryBox.setPrefSize(800,220);
        layoutCategoryBox.setPadding(new Insets(10, 10, 10, 10));
        layoutCategoryBox.setBackground(new Background(new BackgroundFill(Color.DARKORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutCategoryBox.setAlignment(Pos.CENTER);
        layoutCategoryBox.getChildren().addAll(button10);

        //Horizontal scene Button Box Items -- maybe add the scenes into one thingy
        HBox layoutItemsBox = new HBox();
        layoutItemsBox.setPrefSize(800,500);
        layoutItemsBox.setPadding(new Insets(10, 10, 10, 10));
        layoutItemsBox.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutItemsBox.setAlignment(Pos.CENTER);
        layoutItemsBox.getChildren().addAll(layoutColumnOne, layoutColumnTwo, layoutColumnThree, layoutColumnFour);

        //Vertical scene Button side (right) -- maybe add the scenes into one thingy
        VBox layoutButtonRight = new VBox();
        layoutButtonRight.setPrefSize(800,720);
        layoutButtonRight.setPadding(new Insets(10, 10, 10, 10));
        layoutButtonRight.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutButtonRight.setAlignment(Pos.CENTER);
        layoutButtonRight.getChildren().addAll(layoutItemsBox, layoutCategoryBox);

        //Vertical scene Order side (left) -- maybe add the scenes into one thingy
        VBox layoutButtonLeft = new VBox();
        layoutButtonLeft.setPrefSize(480,720);
        layoutButtonLeft.setPadding(new Insets(10, 10, 10, 10));
        layoutButtonLeft.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutButtonLeft.setAlignment(Pos.CENTER);
        layoutButtonLeft.getChildren().addAll(layoutInfoBox, layoutTreeTable, layoutPricing,layoutChipsNButty, layoutOrderNVoid);

        //Horizontal scene Background -- maybe add the scenes into one thingy
        HBox layoutBackground = new HBox();
        //layoutBackground.setPrefSize(windowWidth,windowHeight);
        layoutBackground.setPadding(new Insets(10, 10, 10, 10));
        layoutBackground.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));
        layoutBackground.setAlignment(Pos.CENTER);
        layoutBackground.getChildren().addAll(layoutButtonLeft, layoutButtonRight);


        scene = new Scene(layoutBackground, 1280, 720);
        window.setScene(scene);
        window.show();
    }

    //Create branches
    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


}
