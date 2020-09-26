import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
public class FX extends Application{
    Stage window;
    StackPane layout;
    Button button;
    MenuBar mbar;
    Menu menu;
    MenuItem itema, itemb, itemc;
    SeparatorMenuItem separator;
    
    public static void main(String[] args){launch(args);}

    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("FirstFX off The Top");
        
        //creating the menubar
        mbar = new MenuBar();
        menu = new Menu("File");
        itema = new MenuItem("Home");
        itemb = new MenuItem("Meow");
        itemc = new MenuItem("Cat Rules");
        separator = new SeparatorMenuItem();
        
        mbar.getMenus().add(menu);
        menu.getItems().addAll(itema,itemb,separator,itemc);
        
        itemc.setOnAction(e->System.out.println(itemc.getText()));
        
        
        button = new Button("Exit");
        button.setOnAction(e->System.exit(0));
      
        layout = new StackPane();
        VBox b = new VBox();
        b.getChildren().add(mbar);
        
        layout.getChildren().addAll(b,button);
        
        Scene scene = new Scene(layout,400,400);
        window.setScene(scene);
        window.show();
    }
}