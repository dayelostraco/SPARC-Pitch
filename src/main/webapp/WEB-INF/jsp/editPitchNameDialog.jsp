<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SPARC Pitch</title>
    <jsp:include page="common/includes.jsp"/>
</head>
<body>
<div data-role="page" id="editProductNameDialog" data-dom-cache="false">

    <div data-role="header" data-position="fixed" style="text-align: center;" data-position="fixed">
        <h1>Change Pitch Name</h1>
    </div>

    <div data-role="content">
        <form method="post" action="/pitch/view/${pitch.id}/">
            <div data-role="fieldcontain">
                <label for="editPitchSegmentFieldValue">Product Name</label>
                <input type="text" name="editPitchSegmentFieldValue" id="editPitchSegmentFieldValue"
                       value="${pitch.productName}"/>
                <input type="hidden" name="editPitchSegmentFieldName" id="editPitchSegmentFieldName"
                       value="productName"/>
                <input type="hidden" name="editPitchSegmentPitchId" id="editPitchSegmentPitchId" value="${pitch.id}"/>
            </div>
            <a href="/pitch/view/${pitch.id}/" id="updatePitchButton" data-role="button" data-theme="b"
               data-icon="check">Save</a>
            <a href="/pitch/view/${pitch.id}/" data-role="button" data-icon="arrow-l">Cancel</a>
        </form>
    </div>

</div>

</body>
</html>