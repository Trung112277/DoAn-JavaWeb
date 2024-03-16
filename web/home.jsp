<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="./public/css/bootstrap.min.css">
        <link rel="stylesheet" href="./public/css/style.css">
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="https://kit.fontawesome.com/7717c3565e.js" crossorigin="anonymous"></script>
        
    </head>
    <body>
        <!-- begin header--->

        <div class="header">
            <%@include file="./inc/header.jsp" %>
            <div id="header-down">
                <div class="container">
                    <div class="row">
                        <div class="col-md-5">
                            <div class="your-pet">
                                <div class="text">
                                    <h2>Your pet,
                                        <br>
                                        our priority</h2>
                                </div>
                                <div class="learn-more">
                                    <span>
                                        <button class="button1">Learn more</button>
                                        <button class="button-2">Make a reservation</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-7">
                            <div class="dog-and-cat">
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="big-dogg">
                                            <img class="big-dog" src="public/images/image-from-rawpixel-id-6204307-original.png" width="600" height="750" alt="">
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <img class="nhan-vien1" src="public/images/illustration-1.svg" width="300" height="300" alt="">
                                    </div>
                                    <div class="col-md-3">
                                        <img class="cute-cat" src="public/images/iStock-1143440918.webp" width="250" height="250" alt="">
                                    </div>
                                    <div class="col-md-3">
                                        <img class="nhan-vien2" src="public/images/illustration-2.svg" alt="">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end header--->
        <div id="dog-walking">
            <div class="container">
                <div class="text">
                    <span>
                        Dog Walking & Pet Sitting Services <br>
                        Throughout
                        <a href="">New York City</a>
                    </span>
                </div>
                <div class="reviews">
                    <a href=""><i class="fa-regular fa-star"></i> 4,9 Yelp reviews</a>
                </div>
            </div>
        </div>
        <div id="main">
            <div id="content1">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 text-center">
                            <div>
                                <img src="public/images/iStock-1266979046-954x1024.webp" width="500" height="600" alt="">
                            </div>
                        </div>
                        <div class="col-md-6 text-center">
                            <div class="happy-dog">
                                <i class="fa-solid fa-dog"></i>
                                <p>Our promise to you</p>
                            </div>
                            <h2>
                                Happy pets, happy humans
                            </h2>
                            <p class="text">
                                Come see how Im styling these final days of summer with bright <br>
                                palettes and pops of color that will dazzle your wardrobe year round! <br>
                                <br>
                                How Im styling these final days of summer with bright palettes and <br>
                                pops of color that will dazzle your wardrobe year round!
                            </p>
                            <a href="">Learn more</a>
                        </div>
                    </div>
                </div>
            </div>
            <div id="content-2">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 offset-md-3 text-center">
                            <h2>We are best in:</h2>
                        </div>
                        <div class="content-2 text-center">
                            <div class="row">
                                <div class="col-md-2">
                                    <div class="best-in">
                                        <a href=""><i class="fa-solid fa-paw"></i></a>
                                    </div>
                                    <a href="">Daycare</a>
                                </div>
                                <div class="col-md-2">
                                    <div class="best-in">
                                        <a href=""><i class="fa-solid fa-paw"></i></a>
                                    </div>
                                    <a href="">Dog Walking</a>
                                </div>
                                <div class="col-md-2">
                                    <div class="best-in">
                                        <a href=""><i class="fa-solid fa-paw"></i></a>
                                    </div>
                                    <a href="">Grooming</a>
                                </div>
                                <div class="col-md-2">
                                    <div class="best-in">
                                        <a href=""><i class="fa-solid fa-paw"></i></a>
                                    </div>
                                    <a href="">Boarding</a>
                                </div>
                                <div class="col-md-2">
                                    <div class="best-in">
                                        <a href=""><i class="fa-solid fa-paw"></i></a>
                                    </div>
                                    <a href="">Training</a>
                                </div>
                                <div class="col-md-2">
                                    <div class="best-in">
                                        <a href=""><i class="fa-solid fa-paw"></i></a>
                                    </div>
                                    <a href="">Veterinary Care</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="content3">
                <div class="container">
                    <div class="roww">
                        <div class="col-md-6 offset-md-3 text-center">
                            <h2>Why rely on us?</h2>
                        </div>
                        <div class="col-md-8 offset-md-2">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="content3">
                                        <span>
                                            <div class="icon">
                                                <i class="fa-solid fa-paw"></i>
                                            </div>
                                            <div class="text">
                                                <h3>We love dogs</h3>
                                                <p>
                                                    We understand that your furry friend is a <br>
                                                    treasured member of your family and deserves <br>
                                                    the best care and attention possible.
                                                </p>
                                            </div>
                                        </span>
                                        <span>
                                            <div class="icon">
                                                <i class="fa-solid fa-paw"></i>
                                            </div>
                                            <div class="text">
                                                <h3>Convenience</h3>
                                                <p>
                                                    In addition to our convenient appointment <br>
                                                    times, we also offer online booking for easy <br>
                                                    scheduling.
                                                </p>
                                            </div>
                                        </span>
                                        <span>
                                            <div class="icon">
                                                <i class="fa-solid fa-paw"></i>
                                            </div>
                                            <div class="text">
                                                <h3>Personalized care</h3>
                                                <p>
                                                    Our team of trained professionals is dedicated<br>
                                                    to providing personalized care for every dog<br>
                                                    that comes through our doors.
                                                </p>
                                            </div>
                                        </span>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="content3">
                                        <span>
                                            <div class="icon">
                                                <i class="fa-solid fa-paw"></i>
                                            </div>
                                            <div class="text">
                                                <h3>Peace of mind</h3>
                                                <p>
                                                    We know that leaving your furry friend can be<br>
                                                    stressful, and you want to ensure that they are<br>
                                                    receiving the best care while you're away.
                                                </p>
                                            </div>
                                        </span>
                                        <span>
                                            <div class="icon">
                                                <i class="fa-solid fa-paw"></i>
                                            </div>
                                            <div class="text">
                                                <h3>Transperency</h3>
                                                <p>
                                                    We want you to feel confident in the care we<br>
                                                    provide and trust that we have your dog's best<br>
                                                    interests at heart.
                                                </p>
                                            </div>
                                        </span>
                                        <span>
                                            <div class="icon">
                                                <i class="fa-solid fa-paw"></i>
                                            </div>
                                            <div class="text">
                                                <h3>Teamwork</h3>
                                                <p>
                                                    Our team of vets, technicians, and other pet<br>
                                                    care professionals work together to ensure that<br>
                                                    your dog receives the best possible care.
                                                </p>
                                            </div>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="content4">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 offset-md-3 text-center">
                            <h2>Clients say:</h2>
                        </div>
                        <div class="slide">
                            <div id="carouselExample" class="carousel slide">
                                <p CLASS="woof">WOOF</p>
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <img src="public/images/image-from-rawpixel-id-6117041-png.png" width="400" height="600" class="d-block w-50" alt="...">
                                        <div class="text">
                                            <h6>Jame, Susan's dog:</h6>
                                            <p>
                                                Kind friendly and professional, and best of all Jame absolutely loved them. I would recommend PetMania to anyone looking for dog care.
                                            </p>
                                        </div>
                                    </div>
                                    <div class="carousel-item">
                                        <img src="public/images/image-from-rawpixel-id-6173570-png.png" width="400" height="600" class="d-block w-50" alt="...">
                                        <div class="text">
                                            <h6>Hurley, Vikki's dog:</h6>
                                            <p>
                                                "Thank you PetMania for doing such a great job caring for our Hurley! Such good care, really put my mind at ease. Thanks!"
                                            </p>
                                        </div>
                                    </div>
                                </div>
                                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
                                    <span class="carousel-control-prev-icon" ></span>
                                    <span class="visually-hidden">Previous</span>
                                </button>
                                <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="visually-hidden">Next</span>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="content5">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="content5-left">
                                <span class="locations">
                                    <h5>Locations</h5>
                                    <i class="fa-solid fa-location-dot"></i>
                                </span>
                                <div class="text">
                                    <div class="text-top">
                                        <h6>Grooming and veterinary:</h6>
                                        <a href="">Manhattan, 954 Madison Ave, New York</a>
                                    </div>
                                    <div class="text-bottom">
                                        <h6>Our walkers and sitters:</h6>
                                        <a href="">East Side 864 Madison Ave, NY <br> West Side 180 Riverside Blvd, NY</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="content5-mid text-center">
                                <div class="B-G">
                                    <div class="images">
                                        <img src="public/images/iStock-1391392455.webp" width="450" height="500" alt="">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="content5-right">
                                <div class="FAQ">
                                    <i class="fa-solid fa-question"></i>
                                    <h5>FAQ's</h5>
                                </div>
                                <div class="questions">
                                    <ul>
                                        <li><a href="">What time can I drop off and pick up my dog?</a></li>
                                    </ul>
                                    <ul>
                                        <li><a href="">What should my dog bring for daycare?</a></li>
                                    </ul>
                                    <ul>
                                        <li><a href="">What does my dog do all day?</a></li>
                                    </ul>
                                    <ul>
                                        <li><a href="">How old does my dog have to be?</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="content6">
                <div class="container">
                    <div class="follow">
                        <span>
                            <i class="fa-brands fa-instagram"></i>
                            <a href="">Follow PetMania</a>
                        </span>
                    </div>
                    <div class="row">
                        <div class="col-md-2">
                            <a href=""><img src="public/images/pet1.jpg" width="187" height="187" alt=""></a>
                        </div>
                        <div class="col-md-2">
                            <a href=""><img src="public/images/pet2.jpg" width="187" height="187" alt=""></a>
                        </div>
                        <div class="col-md-2">
                            <a href=""><img src="public/images/pet3.jpg" width="187" height="187" alt=""></a>
                        </div>
                        <div class="col-md-2">
                            <a href=""><img src="public/images/pet4.jpg" width="187" height="187" alt=""></a>
                        </div>
                        <div class="col-md-2">
                            <a href=""><img src="public/images/pet5.jpg" width="187" height="187" alt=""></a>
                        </div>
                        <div class="col-md-2">
                            <a href=""><img src="public/images/pet6.jpg" width="187" height="187" alt=""></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- begin footer--->
        <%@include file="./inc/footer.jsp" %>
        <!-- end footer--->
    </body>
</html>