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
                    <div class="col-md-6">
                        <div class="images">
                            <img src="${product.image}" width="515" height="515" alt="">
                        </div>
                    </div>
                    <div class="col-md-6">
                        <form class="content" action="OrderServlet" method="post">
                            <input type="hidden" name="productId" value="${product.id}"/>
                            <input type="hidden" name="price" value="${product.price}"/>
                            <input type="hidden" name="action" value="create"/>
                            <div class="name">
                                <h1>${product.name}</h1>
                                <p>by <a href="">NexGard</a></p>
                                <p>SKU: 0984504</p>
                            </div>
                            <div class="price">
                                <a href="">Weight</a>
                                <select class="form-select" aria-label="Default select example">
                                    <option selected>Choose an option</option>
                                    <option value="1">250 grams</option>
                                    <option value="2">500 grams</option>
                                    <option value="3">750 grams</option>
                                </select>
                                <h2>${product.price}</h2>
                                <div class="add-to-cart">
                                    <div class="quantity">
                                        <input name="quantity" type="number" id="quantity_652079c21f649" class="input-text qty text" name="quantity" value="1" aria-label="Product quantity" size="4" min="1" max="" step="1" placeholder="" inputmode="numeric" autocomplete="off">
                                    </div>
                                    <button>Add to cart</button>
                                    <a href=""><i class="fa-regular fa-heart"></i></a>
                                </div>
                            </div>
                            <div class="information">
                                <div class="accordion" id="accordionPanelsStayOpenExample">
                                    <div class="accordion-item">
                                        <h2 class="accordion-header">
                                            <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseOne" aria-expanded="true" aria-controls="panelsStayOpen-collapseOne">
                                                Details
                                            </button>
                                        </h2>
                                        <div id="panelsStayOpen-collapseOne" class="accordion-collapse collapse show">
                                            <div class="accordion-body">
                                                Perfectly sized training bites to reward all those sitting pups, those instagram posing mutts, and the slightly naughtier puppies who need a little daily bribing. Buy this product on petsonbroadwaynyc.com
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion-item">
                                        <h2 class="accordion-header">
                                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseTwo" aria-expanded="false" aria-controls="panelsStayOpen-collapseTwo">
                                                Ingredients & Analysis
                                            </button>
                                        </h2>
                                        <div id="panelsStayOpen-collapseTwo" class="accordion-collapse collapse">
                                            <div class="accordion-body">
                                                <strong>Ingredients:</strong> Rabbit with Ground Bone, Olive Oil, Pumpkin Seed, Potassium Chloride, Organic Cranberries, Organic Spinach, Organic Broccoli, Organic Beets, Sodium Phosphate Monobasic, Organic Carrots, Organic Squash, Organic Apples, Organic Blueberries, Choline Chloride, Dried Pediococcus Acidilactici Fermentation Product, Dried Lactobacillus Acidophilus Fermentation Product, Dried Bifidobacterium Longum Fermentation Product, Dried Enterococcus Faecium Fermentation Product, Taurine, Tocopherols (Preservative), Calcium Carbonate, Zinc Proteinate, Zinc Sulfate, Iron Sulfate, Iron Proteinate, Vitamin E Supplement, Niacin, Copper Sulfate, Copper Proteinate, Manganese Sulfate, Sodium Selenite, Manganese Proteinate, Thiamine Mononitrate, Pyridoxine Hydrochloride, Vitamin D3 Supplement, Calcium Iodate Guaranteed Analysis Crude protein (min) 30%, Crude fat (min) 15%, Crude fiber (max) 3.5%, Moisture (max) 11%.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion-item">
                                        <h2 class="accordion-header">
                                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseThree" aria-expanded="false" aria-controls="panelsStayOpen-collapseThree">
                                                Shipping & Returns
                                            </button>
                                        </h2>
                                        <div id="panelsStayOpen-collapseThree" class="accordion-collapse collapse">
                                            <div class="accordion-body">
                                                Free Standard Shipping with any online purchase of $50 (merchandise subtotal excludes store pick up items; merchandise subtotal is calculated before sales tax, before gift wrap charges, and after any discounts or coupons). Truck delivery and shipping surcharges on over-sized or extremely heavy items will still apply (these charges are indicated on the appropriate product information pages and will be displayed in the shipping subtotal of your order). Orders typically arrive within 3-6 business days. Items shipped directly from the vendor or to Alaska and Hawaii have longer delivery lead times. This offer does not apply to Alaska, Hawaii, Puerto Rico or Business Direct orders.
                                                <br>
                                                <a href="">Read more about Return & Cancellations</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="related">
                        <h2>Related products</h2>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="content">
                                    <a href=""><img src="public/images/ignore-export10-426x426.webp"  width="220"  height="220" alt=""></a>
                                    <a href="">Applaws Natural Wet Cat Food Chicken Breast in Broth</a>
                                    <p>15$</p>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="content">
                                    <a href=""><img src="public/images/ignore-export5-426x426.webp"  width="220"  height="220" alt=""></a>
                                    <a href="">Stella & Chewy Wild weenies grain free chicken recipe freeze dried raw dog treats</a>
                                    <p>20$</p>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="content">
                                    <a href=""><img src="public/images/Product-7-426x426.webp"  width="220"  height="220" alt=""></a>
                                    <a href="">BIXBI Hip & Joint Beef Liver Jerky Recipe Dog Treats</a>
                                    <p>15$</p>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="content">
                                    <a href=""><img src="public/images/ignore-export9-426x426.webp"  width="220"  height="220" alt=""></a>
                                    <a href="">Applaws Natural Wet Cat Food Chicken Breast with Pumpkin in Broth</a>
                                    <p>10$</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="icon">
                        <div class="row">
                            <div class="col-md-3">
                                <i class="fa-solid fa-truck"></i>
                                <p>Same day delivery <br>for order beore 11:00h!</p>
                            </div>
                            <div class="col-md-3">
                                <i class="fa-solid fa-house"></i>
                                <p>Free pick up from <br>1000S 8th Avenue, NY!</p>
                            </div>
                            <div class="col-md-3">
                                <i class="fa-solid fa-star"></i>
                                <p>Rating 4.8/5! <br>from verified users</p>
                            </div>
                            <div class="col-md-3">
                                <i class="fa-solid fa-phone"></i>
                                <p>Call us in 09:00-16:00h <br>1-800-356-8933</p>
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