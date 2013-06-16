<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SPARC Pitch</title>
    <jsp:include page="common/includes.jsp"/>
</head>
<body>
<div data-role="page" id="viewPitchSegmentPage" data-dom-cache="false">

    <div data-role="header" data-position="fixed">
        <h1>${fieldTitle}</h1>
        <a href="/pitch/edit/${pitch.id}/${fieldName}/" class="ui-btn-right" data-icon="arrow-r" data-transition="slide"
           data-theme="b">Edit</a>
    </div>

    <div data-role="content">
        ${fieldValue}
    </div>

    <div data-role="footer" data-id="viewPitchFooter" data-position="fixed">
        <a href="/pitch/view/${pitch.id}/" data-icon="back" data-transition="slide" data-direction="reverse">Back</a>
    </div>
</div>
</body>
</html>