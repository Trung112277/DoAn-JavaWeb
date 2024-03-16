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
                    <div class="col-md-7">
                        <div class="billing">
                            <div class="customer">
                                Returning customer? <a href=""> Click here to login</a>
                            </div>
                            <div class="billing-details">
                                <h2>Billing Details</h2>
                                <div class="details">
                                    <div id="name" class="form">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <a href="">First Name *</a>
                                            </div>
                                            <div class="col-md-6">
                                                <a href="">Last name *</a>
                                            </div>
                                        </div>
                                        <div class="row g-3">
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="First name" aria-label="First name">
                                            </div>
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Last name" aria-label="Last name">
                                            </div>
                                        </div>
                                    </div>
                                    <div id="company-name" class="form">
                                        <a href="">Company Name (optional)</a>
                                        <input class="form-control form-control-lg" type="text" placeholder="Conpany Name" aria-label=".form-control-lg example">
                                    </div>
                                    <div id="country" class="form">
                                        <a href="">Country / Region *</a>
                                        <div class="form-floating">
                                            <select class="form-select" id="floatingSelect" aria-label="Floating label select example">
                                                <option selected></option>
                                                <option value="1">Viet Nam</option>
                                                <option value="2">Lao</option>
                                                <option value="3">Campuchia</option>
                                            </select>
                                            <label for="floatingSelect">Choose your country</label>
                                        </div>
                                    </div>
                                    <div id="street" class="form">
                                        <a href="">Street address *</a>
                                        <input class="form-control form-control-lg" type="text" placeholder="House number and street name" aria-label=".form-control-lg example">
                                        <input class="form-control form-control-lg" type="text" placeholder="Apartment, suite, unit, etc,. (optional)" aria-label=".form-control-lg example">
                                    </div>
                                    <div id="postcode" class="form">
                                        <a href="">Postcode / ZIP (optional)</a>
                                        <input class="form-control form-control-lg" type="text" placeholder="" aria-label=".form-control-lg example">
                                    </div>
                                    <div id="town" class="form">
                                        <a href="">Town / City *</a>
                                        <input class="form-control form-control-lg" type="text" placeholder="" aria-label=".form-control-lg example">
                                    </div>
                                    <div id="phone" class="form">
                                        <a href="">Phone *</a>
                                        <input class="form-control form-control-lg" type="text" placeholder="Phone" aria-label=".form-control-lg example">
                                    </div>
                                    <div id="email" class="form">
                                        <a href="">Email Address *</a>
                                        <input class="form-control form-control-lg" type="text" placeholder="Email Address" aria-label=".form-control-lg example">
                                    </div>
                                    <div id="node" class="form">
                                        <div class="form-check">
                                            <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                                            <label class="form-check-label" for="defaultCheck1">
                                                <div class="text"><a href="">Ship to a different address?</a></div>
                                        </div>
                                        <div class="order-notes" class="form">
                                            <a href="">Order Notes (optional)</a>
                                            <input class="form-control form-control-lg" type="text" placeholder="Notes about you order, e.g. special notes for devivery" aria-label=".form-control-lg example">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-5">
                        <div id="order">
                            <h2>Your Order</h2>
                            <p>Product</p>
                            <div class="items-price">
                                <div class="row">
                                    <div class="col-md-10 text-left">
                                        Stella & Chewy's Freeze Dried Raw Chewy's Chicken Meal Mixers Grain Free Dog Food Topper - 250 grams  × 1
                                    </div>
                                    <div class="col-md-2 text-right">
                                        $8.33
                                    </div>
                                </div>
                            </div>
                            <div class="items-price">
                                <div class="row">
                                    <div class="col-md-10 text-left">
                                        Subtotal
                                    </div>
                                    <div class="col-md-2 text-right">
                                        $8.33
                                    </div>
                                </div>
                            </div>
                            <div class="items-price">
                                <div class="row">
                                    <div class="col-md-10 text-left">
                                        Shipping
                                        <p>
                                            Enter your address to view shipping options.
                                        </p>
                                    </div>
                                    <div class="col-md-2 text-right">

                                    </div>
                                </div>
                            </div>
                            <div class="items-price">
                                <div class="row">
                                    <div class="col-md-10 text-left">
                                        VAT
                                    </div>
                                    <div class="col-md-2 text-right">
                                        $0.00
                                    </div>
                                </div>
                            </div>
                            <div class="items-price">
                                <div class="row">
                                    <div class="col-md-10 text-left">
                                        Total
                                    </div>
                                    <div class="col-md-2 text-right">
                                        $8.33
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="code">
                            Have a coupon? <a href="">Click here to enter your coupon code</a>
                        </div>
                        <div id="bank-transfer">
                            <div class="accordion accordion-flush" id="accordionFlushExample">
                                <div class="accordion-item">
                                    <h2 class="accordion-header">
                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                                <label class="form-check-label" for="flexRadioDefault1">
                                                    Direct bank transfer
                                                </label>
                                            </div>
                                        </button>
                                    </h2>
                                    <div id="flush-collapseOne" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                                        <div class="accordion-body">Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order will not be shipped until the funds have cleared in our account.</div>
                                    </div>
                                </div>
                                <div class="accordion-item">
                                    <h2 class="accordion-header">
                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                                <label class="form-check-label" for="flexRadioDefault1">
                                                    Check payments
                                                </label>
                                            </div>
                                        </button>
                                    </h2>
                                    <div id="flush-collapseTwo" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                                        <div class="accordion-body">Please send a check to Store Name, Store Street, Store Town, Store State / County, Store Postcode.</div>
                                    </div>
                                </div>
                                <div class="accordion-item">
                                    <h2 class="accordion-header">
                                        <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
                                            <div class="form-check">
                                                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                                                <label class="form-check-label" for="flexRadioDefault1">
                                                    Cash on delivery
                                                </label>
                                            </div>
                                        </button>
                                    </h2>
                                    <div id="flush-collapseThree" class="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
                                        <div class="accordion-body">Pay with cash upon delivery.</div>
                                    </div>
                                </div>
                            </div>
                            <div class="text">
                                <span>
                                    Your personal data will be used to process your order, support your experience throughout this website, and for other purposes described in our <a href="">privacy policy.</a>
                                </span>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                                <label class="form-check-label" for="flexCheckDefault">
                                    <a href="">I have read and agree to the website terms and conditions *</a>
                                </label>
                            </div>
                            <button class="button">Place order</button>
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