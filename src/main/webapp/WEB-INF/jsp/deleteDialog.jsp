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
        <h1>Are you sure?</h1>
    </div>

    <div data-role="content">
        <a href="/pitch/delete/${pitchId}/" data-role="button" data-icon="alert" data-theme="e">Delete</a>
        <a href="/pitch/view/${pitchId}/" data-role="button" data-icon="back">Cancel</a>
    </div>

</div>

</body>
</html>