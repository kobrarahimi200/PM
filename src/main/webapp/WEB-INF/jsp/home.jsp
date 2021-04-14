
<%@ include file="header.jsp" %>

<div class="container">    
<div class ="row">
 <div class="col-lg-3">
        <h1 class="my-4">PM Online Shop</h1>
        <div class="list-group">
          <a href='/products/mobiles' class="list-group-item">Mobile</a>
          <a href='/products/books' class="list-group-item">Book</a>
        </div>
  </div>
  <div class = "col-lg-6 mt-6">
  	<h4 style = "margin-top: 82px;">Please at first click on the Products tab in the menu bar</h4>
</div>
</div>
<div class="row">
<div class="col-lg-9">  
  <c:forEach items="${mobiles}" var="samsung">
     <div class="col-sm-4">
            <div class="card panel panel-primary">
              <a href="#"><img class="card-img-top img-thumbnail" src=" ${samsung.url}" alt=""></a>
              <div class="panel-body">
                <h4 class="card-title">
                  <a href="#">${samsung.name}</a>
                </h4>
                <h5> ${samsung.price} Euro</h5>
                <p class="card-text">capacity :  ${samsung.capacity}</p>

                <a class="btn btn-primary"
          		 href="/products/${samsung.productID} ' ">Buy</a>
          		 
          		 <button type="button" class="btn btn-primary"
          		 onClick="location.href='/products/${samsung.productID} ' ">Add To Cart</button>
              </div>
            </div>
          </div>
    </c:forEach>
  </div> 
  </div> 
   <div class="row">
  <div class="col-lg-9">  
  <c:forEach items="${books}" var="Book">
     <div class="col-sm-4">
            <div class="card panel panel-primary">
              <a href="#"><img class="card-img-top img-thumbnail" src=" ${Book.url}" alt=""></a>
              <div class="panel-body">
                <h4 class="card-title">
                  <a href="#">${Book.name}</a>
                </h4>
                <h5>  ${Book.price} Euro</h5>
                <p class="card-text">Author : ${Book.author}</p>
				<p class="card-text">pages :  ${Book.pages} </p>
              
                <a class="btn btn-primary"
          		 href="/products/${Book.productID} ' ">Buy</a>
          		 
          		 <button type="button" class="btn btn-primary"
          		 onClick="location.href='/products/${Book.productID} ' ">Add To Cart</button>
              </div>
            </div>
          </div>
          
    </c:forEach>
  </div>
 </div>
</div>

      
</body>
</html>
