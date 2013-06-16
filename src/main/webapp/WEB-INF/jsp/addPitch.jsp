<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>SPARC Pitch</title>
    <jsp:include page="common/includes.jsp"/>
</head>
<body>

<form method="post" action="/pitch/view/${pitch.id}/">
    <div data-role="page" id="addPitchPage" data-dom-cache="false">

        <div data-role="header" data-position="fixed">
            <h1>Add</h1>
        </div>

        <div data-role="content">

            <div data-role="fieldcontain">
                <label for="productName">Product Name:</label>
                <input type="text" name="productName" id="productName" value=""/>
            </div>

            <div data-role="fieldcontain">
                <label for="pitch">The Mission:</label>
                <textarea name="mission" id="mission"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="pitch">The Pitch:</label>
                <textarea name="pitch" id="pitch"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="benefits">The Benfits:</label>
                <textarea name="benefits" id="benefits"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="stats">The Stats:</label>
                <textarea name="stats" id="stats"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="cost">The Cost:</label>
                <textarea name="cost" id="cost"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="actionStatement">The Statement:</label>
                <textarea name="actionStatement" id="actionStatement"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="objections">The Objections:</label>
                <textarea name="objections" id="objections"></textarea>
            </div>

            <div data-role="fieldcontain">
                <label for="creator">Creator:</label>
                <textarea name="creator" id="creator"></textarea>
            </div>

        </div>

        <div data-role="footer" data-id="addPitchFooter" data-position="fixed">
            <a href="/index/" data-icon="back" data-transition="slide" data-direction="reverse">Cancel</a>
            <a id="addPitch" href="#" data-icon="check" class="ui-btn-right" data-theme="b">Add</a>
        </div>

    </div>

</form>
</body>
</html>