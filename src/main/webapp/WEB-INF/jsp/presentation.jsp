<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>SPARC Pitch Presentation</title>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="/resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.parallax-1.1.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.scrollTo-1.4.2-min.js"></script>
    <script src="/resources/js/jquery.easing.1.3.js"></script>
    <script src="/resources/js/jquery.scrollorama.js"></script>
    <script src="/resources/js/jquery.scrolldeck.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {

            RepositionNav();

            $(window).resize(function () {
                RepositionNav();
            });

            //.parallax(xPosition, adjuster, inertia, outerHeight) options:
            //xPosition - Horizontal position of the element
            //adjuster - y position to start from
            //inertia - speed to move relative to vertical scroll. Example: 0.1 is one tenth the speed of scrolling, 2 is twice the speed of scrolling
            //outerHeight (true/false) - Whether or not jQuery should use it's outerHeight option to determine when a section is in the viewport
            $('#pitch').parallax("50%", 400, 0.2, true);
            $('#benefits').parallax("50%", 1500, 0.2, true);
            $('#stats').parallax("50%", 2050, 0.2, true);
            $('#cost').parallax("50%", 3050, 0.2, true);
            $('#actionStatement').parallax("50%", 3900, 0.2, true);
            $('#objections').parallax("50%", 5000, 0.2, true);

            //Without Paralax Effects
//            $('#pitch').parallax("50%", 0, 0.0, true);
//            $('#benefits').parallax("50%", 0, 0.0, true);
//            $('#stats').parallax("50%", 0, 0.0, true);
//            $('#cost').parallax("50%", 0, 0.0, true);
//            $('#actionStatement').parallax("50%", 0, 0.0, true);
//            $('#objections').parallax("50%", 0, 0.0, true);

            var deck = new $.scrolldeck({
                slides:'.slide',
                buttons:'#nav li a',
                easing:'easeInOutExpo'
            });

        })
    </script>
</head>

<body>

<ul id="nav">
    <li><a href="#pitch" title="Pitch"></a></li>
    <li><a href="#benefits" title="Beneftis"></a></li>
    <li><a href="#stats" title="Stats"></a></li>
    <li><a href="#cost" title="Cost and Modules"></a></li>
    <li><a href="#actionStatement" title="Action Statement"></a></li>
    <li><a href="#objections" title="Objections"></a></li>
</ul>

<div id="pitch" class="slide">
    <div class="story">
        <div class="float-left">
            <h1>The Pitch</h1>

            <p>${pitch.pitch}</p>
        </div>
    </div>
</div>

<div id="benefits" class="slide">
    <div class="story">
        <%--<div class="bg" style="background-position: 50% -24px;"></div>--%>
        <div class="float-right">
            <h1>The Benefits</h1>

            <p>${pitch.benefits}</p>
        </div>
    </div>
</div>

<div id="stats" class="slide">
    <div class="story">
        <div class="float-left">
            <h1>The Stats</h1>

            <p>${pitch.stats}</p>
        </div>
    </div>
</div>

<div id="cost" class="slide">
    <div class="story">
        <div class="float-left">
            <h1>The Cost</h1>

            <p>${pitch.cost}</p>
        </div>
    </div>
</div>

<div id="actionStatement" class="slide">
    <div class="story">
        <div class="float-left">
            <h1>The Action Statement</h1>

            <p>${pitch.actionStatement}</p>
        </div>
    </div>
</div>

<div id="objections" class="slide">
    <div class="story">
        <div class="float-left">
            <h1>The Objections</h1>

            <p>${pitch.objections}</p>
            <span id="pixels">0</span>
        </div>
    </div>
</div>

</body>
</html>