<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/jquery.mobile-1.1.1.css"/>
<script type="text/javascript" src="/resources/js/jquery-1.6.4.js"></script>
<script type="text/javascript" src="/resources/js/jquery.mobile-1.1.1.js"></script>
<script type="text/javascript" src="/resources/js/sparcPitch.js"></script>
<script type="text/javascript">
    $('#addPitchPage').live('pageshow', function () {
        addPitch();
    });
    $('#editPitchSegmentPage').live('pageshow', function () {
        editPitchSegment();
    });
    $('#editProductNameDialog').live('pageshow', function () {
        editPitchSegment();
    });
</script>
