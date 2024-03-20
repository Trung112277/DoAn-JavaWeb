<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="./public/css/bootstrap.min.css">
        <link rel="stylesheet" href="./public/css/style.css">
        <link rel="stylesheet" href="https://getbootstrap.com/docs/5.3/assets/css/docs.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="https://kit.fontawesome.com/7717c3565e.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <!-- begin header--->
        <div class="header">
            <%@include file="./inc/header.jsp" %>
        </div>
        <!-- end header--->
        <div id="main">
            <div class="container">
                <div class="row">
                    <div class="col-md-7">
                        <div class="your-cart">
                            <h2>Your Cart</h2>
                            <div class="cart">
                                <c:forEach items="${cart}" var="orderItem">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="items">
                                                <a href=""><img src="${orderItem.product.image}" width="37" height="37" alt=""></a>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="name">
                                                <a class="text" href="">${orderItem.product.name}</a>
                                            </div>
                                        </div>
                                        <div class="col-md-7">
                                            <div class="price">
                                                <span class="group-price">
                                                    <p class="price1">${orderItem.price}</p>
                                                    <form action="OrderServlet" method="post" class="quantity">
                                                        <input type="hidden" name="productId" value="${orderItem.productId}"/>
                                                        <input type="hidden" name="action" value="update"/>
                                                        <input type="number" id="quantity_652079c21f649" class="input-text qty text" name="quantity" value="${orderItem.quantity}" aria-label="Product quantity" size="4" min="1" max="" step="1" placeholder="" inputmode="numeric" autocomplete="off">
                                                        <input type="submit" value="Apply" />
                                                    </form>
                                                    <form action="OrderServlet" method="POST" class="trash">
                                                        <input type="hidden" name="productId" value="${orderItem.productId}"/>
                                                        <input type="hidden" name="action" value="delete"/>
                                                        <button type="submit" class="trash fa-solid fa-trash"></button>
                                                    </form>
                                                </span>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-5">
                        <div class="cart-totals">
                            <a class="checkout" href="CheckoutServlet">Proceed to Checkout</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- begin header--->
        <%@include file="./inc/footer.jsp" %>
        <!-- end header--->
    </body>
</html>
