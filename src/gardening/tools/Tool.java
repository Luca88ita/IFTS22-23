package gardening.tools;

import java.util.Date;

public class Tool {
  String toolName;
  double toolPrice;
  String toolDescription;
  String toolPurchaseDate;

  public Tool() {
    this.toolName = "";
    this.toolPrice = 0;
    this.toolDescription = "";
    this.toolPurchaseDate = "";
  }
  public Tool(String toolName, double toolPrice, String toolDescription, String toolPurchaseDate) {
    this.toolName = toolName;
    this.toolPrice = toolPrice;
    this.toolDescription = toolDescription;
    this.toolPurchaseDate = toolPurchaseDate;
  }

  public String getToolName() {
    return toolName;
  }
  public void setToolName(String toolName) {
    this.toolName = toolName;
  }
  public double getToolPrice() {
    return toolPrice;
  }
  public void setToolPrice(double toolPrice) {
    this.toolPrice = toolPrice;
  }
  public String getToolDescription() {
    return toolDescription;
  }
  public void setToolDescription(String toolDescription) {
    this.toolDescription = toolDescription;
  }
  public String getToolPurchaseDate() {
    return toolPurchaseDate;
  }
  public void setToolPurchaseDate(String toolPurchaseDate) {
    this.toolPurchaseDate = toolPurchaseDate;
  }

  public Tool set(String toolName, double toolPrice, String toolDescription, String toolPurchaseDate){
    this.toolName = toolName;
    this.toolPrice = toolPrice;
    this.toolDescription = toolDescription;
    this.toolPurchaseDate = toolPurchaseDate;
    return this;
  }

  public String toString(){
    return String.format("[%nTool's name: %s;%nPrice: %.2f HUF;%nTool's description: %s;%nPurchase date: %s%n]",toolName,toolPrice,toolDescription,toolPurchaseDate);
  }


}
