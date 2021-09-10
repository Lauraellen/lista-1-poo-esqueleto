package br.inatel.cdg.algebra.scene;

import br.inatel.cdg.algebra.reta.Ponto;
import br.inatel.cdg.algebra.reta.Reta;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScenePrincipal {

    private Button btnAngular, btnLinear, btnCalcCoefLinear; //Button representa botoes
    private Label p1X, p1Y, p2X, p2Y; //Label representam rótulos
    private TextField textField1, textField2, textField3, textField4, textField5, textField6; //TextField Representam áreas de texto


    public void criaScenePrincipal(Stage stage){

        //Criando os labels para os pontos e os campos de texto para os dados
        p1X = new Label("P1.x"); //rótulos
        textField1 = new TextField(); //área de texto onde vc digitara alguma coisa

        p1Y = new Label("P1.y");
        textField2 = new TextField();

        p2X = new Label("P2.x");
        textField3 = new TextField();

        p2Y = new Label("P2.y");
        textField4 = new TextField();

        //HBox é usado para agrupar elementos horizontalmente
        HBox grupoHorizontal1 = new HBox(p1X, textField1); //Passamos no construtor todos os elementos. Você poderá criar vários grupos horizontais
        HBox grupoHorizontal2 = new HBox(p1Y, textField2);
        HBox grupoHorizontal3 = new HBox(p2X, textField3);
        HBox grupoHorizontal4 = new HBox(p2Y, textField4);



        //Criamos o botão
        btnAngular = new Button("C. Angular");
        //Criamos a ação que o botão responderá as ser pressionado
        btnAngular.setOnAction(evento -> {
          //  reta.angular(reta.p1, reta.p2, result);
            //Aqui dentro é a ação que será executado ao pressionar o botão
            textField5.setText(textField1.getText());//Acessamos o componente textField1, pegamos o texto e colocaos em textField2
        });

        btnLinear = new Button("C. Linear");
        //Criamos a ação que o botão responderá as ser pressionado
        btnLinear.setOnAction(evento -> {
            //Aqui dentro é a ação que será executado ao pressionar o botão
            textField3.setText(textField1.getText());//Acessamos o componente textField1, pegamos o texto e colocaos em textField2
        });

        //Agora vamos criar a area que mostrará o que foi digitado
        textField5 = new TextField();
        textField5.setEditable(false);//vamos deixar false para apenas mostrar texto
        textField5.setText("C. Angular");

        //Agora vamos criar a area que mostrará o que foi digitado
        textField6 = new TextField();
        textField6.setEditable(false);//vamos deixar false para apenas mostrar texto
        textField6.setText("C. Linear");

        //VBox é usada para agrupar elementos verticalmente
        //No construtor passamos todos os elementos que serão agrupados, que podem ser outros grupos
        VBox layoutFinal = new VBox(grupoHorizontal1, grupoHorizontal2, grupoHorizontal3, grupoHorizontal4,btnAngular, textField5, btnLinear, textField6);//Aqui vamos agrupar verticalmente o grupo (Label + Texto) o Botao e A area que aparecer o texto digitado
        //Criamos a Scene
        Scene scene = new Scene(layoutFinal, 300 , 200);

        stage.setTitle("Software Para Calculos de Álgebra Linear");
        stage.setScene(scene);
        stage.show();
    }

}
