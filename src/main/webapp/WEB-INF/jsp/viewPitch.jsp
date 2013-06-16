<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SPARC Pitch</title>
    <jsp:include page="common/includes.jsp"/>
</head>
<body>
<div data-role="page" id="viewPitchPage" data-dom-cache="false">

    <div data-role="header" data-position="fixed">
        <a href="/pitch/delete/dialog/${pitch.id}/" data-icon="delete" data-rel="dialog" data-theme="e">Delete</a>

        <h1>${pitch.productName}</h1>
        <a href="/pitch/edit/dialog/${pitch.id}/" data-icon="arrow-r" data-rel="dialog">Edit</a>
    </div>

    <div data-role="content">
        <ul data-role="listview">
            <li>
                <a href="/pitch/view/mission/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Mission</h3>
                </a>
            </li>
            <li>
                <a href="/pitch/view/pitch/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Pitch</h3>
                </a>
            </li>
            <li>
                <a href="/pitch/view/benefits/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Benefits</h3>
                </a>
            </li>
            <li>
                <a href="/pitch/view/cost/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Cost</h3>
                </a>
            </li>
            <li>
                <a href="/pitch/view/stats/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Stats</h3>
                </a>
            </li>
            <li>
                <a href="/pitch/view/actionStatement/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Action Statement</h3>
                </a>
            </li>
            <li>
                <a href="/pitch/view/objections/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                    <img src="/resources/images/solutions-small-toa.png">

                    <h3>The Objections</h3>
                </a>
            </li>
        </ul>
    </div>

    <div data-role="footer" data-id="viewPitchFooter" data-position="fixed">
        <a href="/index/" data-icon="back" data-transition="slide" data-direction="reverse">Back</a>
    </div>
</div>
</body>
</html>