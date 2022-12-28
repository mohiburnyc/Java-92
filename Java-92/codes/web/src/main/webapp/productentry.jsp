 <jsp:useBean id="prod" class="co.edureka.web.models.Product"></jsp:useBean>

 <jsp:setProperty property="*" name="prod"></jsp:setProperty>
   
 <h2>
  Product ID = <jsp:getProperty name="prod" property="productId"/> <br>
  Product Name = <jsp:getProperty name="prod" property="productName"/> <br>
  Product Price = <jsp:getProperty name="prod" property="productPrice"/> <br>
  
  <hr>
  ${prod.productName}
</h2>