package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LoginApp extends Application {
	
//	Image imageAnjingBola;
//	ImageView viewImage;
	
	Label lblTitle, lblEmail, lblPassword, lblForgetPassword, lblSignUp, lblWoofy, lblCaring;
	Button btnLogin;
	
	GridPane gp;
	VBox vbox;
	HBox hbox;
	StackPane stackPane;
	Scene scene;
	BorderPane bp;

   

    public static void main(String[] args) {
        launch(args);
    }

	
	public void init() {
		
	
        Label lblTitle = new Label("LOGIN");
        lblTitle.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        Label lblEmail = new Label("Email:");
        TextField txtEmail = new TextField();
        
        Label lblPassword = new Label("Password:");
        PasswordField txtPassword = new PasswordField();
        
        Button btnLogin = new Button("Login");
        btnLogin.setStyle("-fx-background-color: #800000; -fx-text-fill: white;");

        Label lblForgetPassword = new Label("Forget password?");
        lblForgetPassword.setTextFill(Color.BLUE);

        Label lblSignUp = new Label("Don't have an account? Sign Up");
        lblSignUp.setTextFill(Color.BLUE);
        
        Label lblWoofy = new Label("Woofy");
        lblWoofy.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        
        Label lblCaring = new Label("CARING WITH LOVE");
        lblCaring.setFont(Font.font("Arial", 18));
        
        Image imageAnjingBola = new Image(getClass().getResourceAsStream("/main/imangeAnjingBola.jpg"));
		ImageView viewImage = new ImageView();
		viewImage.setImage(imageAnjingBola);
		viewImage.setFitHeight(220);
		viewImage.setFitWidth(400);
		
		

        // Layout
        GridPane gp = new GridPane();
        BorderPane bp = new BorderPane();
        bp.setTop(viewImage);
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(25, 25, 25, 25));

        gp.add(lblEmail, 0, 1);
        gp.add(txtEmail, 1, 1);
        gp.add(lblPassword, 0, 2);
        gp.add(txtPassword, 1, 2);
        gp.add(btnLogin, 1, 3);
        gp.add(lblForgetPassword, 1, 4);
        gp.add(lblSignUp, 1, 5);
        

        VBox vbox = new VBox(10, lblTitle, gp);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(25, 25, 25, 25));

        HBox hbox = new HBox(10, lblWoofy, lblCaring);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setPadding(new Insets(25, 25, 25, 25));

        StackPane stackPane = new StackPane(vbox, hbox);
        stackPane.setAlignment(Pos.TOP_CENTER);

        bp.setCenter(stackPane);
        bp.setBackground(new Background(new BackgroundFill(Color.DARKRED, null, null)));
        
        scene = new Scene(bp, 400, 700);
        scene.setFill(Color.DARKRED); 

        // Set scene
//        scene = new Scene(stackPane, 400, 700);
//        scene.setFill(Color.DARKRED); 
        

        btnLogin.setOnAction(e -> {
            String email = txtEmail.getText();
            String password = txtPassword.getText();
            if (email.isEmpty() || password.isEmpty()) {
            	
            } else {
            	
            }
        });
	}
	
//	public void layout() {
//		viewImage.setImage(imageAnjingBola);
//		viewImage.setFitHeight(220);
//		viewImage.setFitWidth(400);
//		bp.setTop(viewImage);
////		bp.setBottom(gp);
//		
//	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		init();
//		layout();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
    
	
    
}
