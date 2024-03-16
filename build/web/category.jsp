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
                    <div class="col-md-3">
                        <div class="dry-food">
                            <h1>Category: ${category.name}</h1>
                        </div>
                        <div class="content">
                            <div class="accordion" id="accordionPanelsStayOpenExample">
                                <c:forEach items="${categoryList}" var="category">
                                    <div class="accordion-item">
                                        <h2 class="accordion-header">
                                            <a class="accordion-button collapsed" href="CategoryServlet?categoryId=${category.id}">
                                                ${category.name}
                                            </a>
                                        </h2>

                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-9">
                        <div class="top">
                            <div class="row">
                                <div class="col-md-4">
                                    <p>
                                        Showing all 10 results
                                    </p>
                                </div>
                                <div class="col-md-4">

                                </div>
                                <div class="col-md-4">
                                    <select class="form-select" aria-label="Default select example">
                                        <option selected><a href="">Default</a></option>
                                        <option value="1"><a href="">Default sorting</a></option>
                                        <option value="2"><a href="">Sort by popularity</a></option>
                                        <option value="3"><a href="">Sort by average rating</a></option>
                                        <option value="3"><a href="">Sort by latest</a></option>
                                        <option value="3"><a href="">Sort by price: low to hight</a></option>
                                        <option value="3"><a href="">Sort by price: hight to low</a></option>    
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="main-content">
                            <div class="row">
                                <c:forEach items="${productList}" var="product">
                                    <div class="col-md-4">
                                        <div class="content">
                                            <a href="DetailServlet?productId=${product.id}">
                                                <img src="${product.image}"  width="220"  height="220" alt="">
                                                <a href="DetailServlet?productId=${product.id}">${product.name}</a>
                                                <p>${product.price}</p>
                                            </a>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
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