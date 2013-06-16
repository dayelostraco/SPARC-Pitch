<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SPARC Pitch</title>
    <jsp:include page="common/includes.jsp"/>
</head>
<body>

<div data-role="page" id="indexPage" data-dom-cache="false">

    <div data-role="header" data-position="fixed" style="text-align: center;">
        <h1>SPARC Pitch</h1>
        <a href="/pitch/add/" class="ui-btn-right" data-role="button" data-inline="true" data-icon="plus"
           data-transition="slide" data-theme="b">Add Pitch</a>
    </div>

    <div data-role="content">
        <ul data-role="listview">
            <c:forEach items="${pitches}" var="pitch">
                <li>
                    <a href="/pitch/view/${pitch.id}/" data-icon="arrow-r" data-transition="slide">
                        <img src="/resources/images/solutions-small-toa.png">

                        <h3>${pitch.productName}</h3>
                    </a>
                </li>
            </c:forEach>
        </ul>
    </div>

</div>

</body>
</html>