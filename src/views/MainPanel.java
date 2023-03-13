package views;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
    TitlePanel titlePanel;
    InputPanel radiusPanel;
    InputPanel heightPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;
    public MainPanel() {
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.setMainPanel();
    }
    private void initComponent() {
        this.titlePanel = new TitlePanel();
        this.radiusPanel = new InputPanel();
        this.heightPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel(); 
    }
    private void setComponent() {
        this.titlePanel.setText("Térkúp számítás");
        this.radiusPanel.setText("Sugár");
        this.heightPanel.setText("Magasság");
        this.buttonPanel.setCalcButtonText("Számít");
        this.volumePanel.setText("Térfogat");
    }
    private void addComponent() {
        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.radiusPanel);
        this.getChildren().add(this.heightPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);
    }
    private void setMainPanel() {
        this.setAlignment(Pos.CENTER);
    }
    
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public TitlePanel getTitlePanel() {
        return titlePanel;
    }
    public InputPanel getRadiusPanel() {
        return radiusPanel;
    }
    public InputPanel getHeightPanel() {
        return heightPanel;
    }
    public InputPanel getVolumePanel() {
        return volumePanel;
    }

    

    
    
}
