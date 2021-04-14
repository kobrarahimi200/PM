<%@ include file="header.jsp" %>

<div class="container">    
  <div class="row">
  <h3>The item that you selected is added to your cart..</h3>
  <h5>Thank you for your purchase.</h5>
   
   </div><br>
   
   
   <!--Section: Block Content-->
<section>

  <!--Grid row-->
  <div class="row">

    <!--Grid column-->
    <div class="col-lg-8">

      <!-- Card -->
      <div class="mb-3">
        <div class="pt-4 wish-list">


          <h5 class="mb-4">Cart (<span>2</span> items)</h5>
 		<c:forEach items="${cartProducts}" var="samsung">
          <div class="row mb-4">
            <div class="col-md-5 col-lg-3 col-xl-3">
              <div class="view zoom overlay z-depth-1 rounded mb-3 mb-md-0">
                <img class="img-fluid w-30 img-thumbnail"
                  src="${samsung.url}" alt="Sample">
                <a href="#!">
                  <div class="mask">
                   
                    <div class="mask rgba-black-slight"></div>
                  </div>
                </a>
              </div>
            </div>
            <div class="col-md-7 col-lg-9 col-xl-9">
              <div>
                <div class="d-flex justify-content-between">
                  <div>
                    <h5>Name : ${samsung.name}</h5>
                  </div>
                </div>
                <div class="d-flex justify-content-between align-items-center">
                  <div>
                  <form action="/products/deleted/${samsung.productID}" method="post">
                     
                    	<a href="/products/deleted/${samsung.productID}" type="button" class="card-link-secondary small text-uppercase mr-3"><i
                        	class="fas fa-trash-alt mr-1"></i> Remove item </a>
                    </form>
                  </div>
                  <p class="mb-0"><span><strong id="summary">${samsung.price}</strong></span></p class="mb-0">
                </div>
              </div>
            </div>
          </div>
          </c:forEach>
          <p class="text-primary mb-0"><i class="fas fa-info-circle mr-1"></i> Do not delay the purchase, adding
            items to your cart does not mean booking them.</p>
        </div>
        
      </div>
      <!-- Card -->

    </div>
    <!--Grid column-->

    <!--Grid column-->
    <div class="col-lg-4">

      <!-- Card -->
      <div class="mb-3">
        <div class="pt-4">

          
          <ul class="list-group list-group-flush">
           
            <li class="list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3">
              <div>
                <strong>The total amount of</strong>
                <strong>
                  <p class="mb-0">(including VAT)</p>
                </strong>
              </div>
              <span><strong>
              <c:set var="sum" scope="page" value="0.0"/>
              <c:forEach items="${cartProducts}" var="s">
              	<c:set var="sum" scope="page" value="${sum + s.price}" />
              </c:forEach>${sum}</strong></span>
            </li>
          </ul>
          <button type="button" class="btn btn-primary btn-block">go to checkout</button>
        </div>
      </div>
      <!-- Card -->
      
      <!-- Card -->
      <div class="mb-3">
        <div class="pt-4">
          <div class="collapse" id="collapseExample">
            <div class="mt-3">
              <div class="md-form md-outline mb-0">
                <input type="text" id="discount-code" class="form-control font-weight-light"
                  placeholder="Enter discount code">
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Card -->

    </div>
    <!--Grid column-->

  </div>
  <!-- Grid row -->

</section>
<!--Section: Block Content-->
   

</div><br>
