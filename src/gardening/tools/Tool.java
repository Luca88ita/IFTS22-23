package gardening.tools;

import java.util.Date;
import java.util.Objects;

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

  public String getToolName(){ return toolName; }

  public void setToolName(String toolName) throws IllegalAccessException {
    if (toolName.equals("")){
      throw new IllegalAccessException("Il nome deve contenere un valore");
    }
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

  public Tool set(String toolName, double toolPrice, String toolDescription, String toolPurchaseDate) throws IllegalAccessException {
    if (toolName.equals("")){
      throw new IllegalAccessException("Il nome deve contenere un valore");
    }
    this.toolName = toolName;
    this.toolPrice = toolPrice;
    this.toolDescription = toolDescription;
    this.toolPurchaseDate = toolPurchaseDate;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tool tool = (Tool) o;
    return Double.compare(tool.toolPrice, toolPrice) == 0 && Objects.equals(toolName, tool.toolName) && Objects.equals(toolDescription, tool.toolDescription) && Objects.equals(toolPurchaseDate, tool.toolPurchaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolName, toolPrice, toolDescription, toolPurchaseDate);
  }

  public String toString() {
    if (toolName.equals("")){
      return "ERROR!! Tool without name";
    }
    return String.format("[%nTool's name: %s;%nPrice: %.2f HUF;%nTool's description: %s;%nPurchase date: %s%n]", toolName, toolPrice, toolDescription, toolPurchaseDate);
  }


}
