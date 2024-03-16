<!DOCTYPE html>
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
                    <div class="col-md-6 offset-md-3">
                        <div id="login">
                            <h2>
                                Login
                            </h2>
                            <form action="LoginServlet" method="post">
                                <div class="mb-3">
                                    <label for="exampleInputEmail1" class="form-label">Username or email address *</label>
                                    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                </div>
                                <div class="mb-3">
                                    <label  for="exampleInputPassword1" class="form-label">Password *</label>
                                    <input name="password" type="password" class="form-control" id="exampleInputPassword1">
                                </div>
                                <div class="mb-3 form-check">
                                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Remenber me</label>
                                </div>
                                <button type="submit" class="btn btn-primary">Log in</button>
                                <a class="register" href="RegisterServlet">Register</a>
                            </form>
                            <a href="">Lost your password?</a>
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