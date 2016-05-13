# DesignPattern
Practice design patterns and UML

## Factory Method
**使用時機：**<br/>
在無法明確知道要產生的類別會是哪一種物件型態時使用<br/>
讓子類別去決定要產生哪一種物件型態<br/>
有幾種方式可採用：<br/>
*   參數方式
*   指定類別變數
*   多工廠指定不同類別(以下範例)

![Alt text](/FactoryMethod/classDiagram.png)

# Builder
**使用時機：**<br/>
有固定的生產流程或是標準化步驟<br/>
統一由Director執行一系列的流程，指揮Builder進行組裝<br/>
![Alt text](/Builder/classDiagram.png)
