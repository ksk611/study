package kr.or.ddit.study06.sec06;

public class Prod {
   /*
    * 상품 가격, 이름, 내용
    * 
    * getter setter 만들어서 사용해 볼 것
    */
   
   // alt+shift+s => getter, setter
   private int price;
   private String name;
   private String content;
   
   public int getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getContent() {
      return content;
   }
   public void setContent(String content) {
      this.content = content;
   }
   
   
   

}