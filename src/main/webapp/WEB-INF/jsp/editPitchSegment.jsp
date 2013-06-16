<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SPARC Pitch</title>
    <jsp:include page="common/includes.jsp"/>
</head>
<body>

<form method="post" action="/pitch/view/${fieldName}/${pitch.id}/">
    <div data-role="page" id="editPitchSegmentPage" data-dom-cache="false" data-position="fixed">

        <div data-role="header">
            <h1>Edit ${fieldTitle}</h1>
        </div>

        <div data-role="content">
            <div data-role="fieldcontain">
                <label for="editPitchSegmentFieldValue">${fieldTitle}:</label>
                <textarea name="editPitchSegmentFieldValue" id="editPitchSegmentFieldValue">${fieldValue}</textarea>
                <input type="hidden" name="editPitchSegmentFieldName" id="editPitchSegmentFieldName"
                       value="${fieldName}"/>
                <input type="hidden" name="editPitchSegmentPitchId" id="editPitchSegmentPitchId" value="${pitch.id}"/>
            </div>
        </div>

        <div data-role="footer" data-id="viewPitchFooter" data-position="fixed">
            <a href="/pitch/view/${pitch.id}/" data-icon="back" data-transition="slide"
               data-direction="reverse">Cancel</a>
            <a id="updatePitchButton" class="ui-btn-right" href="#" data-icon="check" data-theme="b">Save</a>
        </div>
    </div>
</form>

</body>
</html>