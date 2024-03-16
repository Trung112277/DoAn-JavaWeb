<%-- 
    Document   : header
    Created on : Jan 22, 2024, 6:01:37 PM
    Author     : ĐMX
--%>
<style> .dashboard .fa-list-check{
        margin-right: 10px;
        background: black;
        color: white;
        padding: 5px 5px;
        border-radius: 50px;
        border: 5px solid #000000;
    }

</style>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="header">
    <div id="header-top">
        <div class="container">
            <div class="row">
                <div class="col-md-5 text-left">
                    <nav class="navbar navbar-expand-lg">
                        <div class="container-fluid">   
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                    <li class="nav-item dropdown" href="">
                                        <a class="nav-link dropdown-toggle" href="HomeServlet" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                            Home
                                        </a>
                                    </li>
                                    <li class="nav-item dropdown" href="">
                                        <a class="nav-link dropdown-toggle" href="ShopServlet" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                            Shop
                                        </a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                            About
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a class="dropdown-item" href="#">Our Story</a></li>
                                            <li><a class="dropdown-item" href="#">Pet Tips</a></li>
                                            <li><a class="dropdown-item" href="#">FAQ</a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                            Contact
                                        </a>
                                        <ul class="dropdown-menu">
                                            <li><a class="dropdown-item" href="#">Contacts</a></li>
                                            <li><a class="dropdown-item" href="#">Locations</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="col-md-2 text-center">
                    <div class="logo-home">
                        <div class="logo">
                            <a href="HomeServlet"><img src="public/images/logo-2.svg" alt=""></a>
                        </div>
                        <div class="petmania">
                            <a href="HomeServlet">PetMania</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-5">   
                    <div class="contact">
                        <span class="">
                            <a class="dashboard" href="DashboardServlet"><i class="fa-solid fa-list-check"></i></a>
                            <a class="phone" href="">+1-800-356-8933</a>
                            <a class="heart" href="CartServlet"><i class="fa-solid fa-cart-shopping"></i></a>
                                <c:if test="${sessionScope.user == null}">
                                <a class="login" href="LoginServlet">Login</a>/
                                <a class="register" href="RegisterServlet">Register</a>
                            </c:if>
                            <c:if test="${sessionScope.user != null}">
                                <a class="login" href="">${sessionScope.name}</a>
                                <a class="register" href="LogoutServlet">Logout</a>
                            </c:if>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>