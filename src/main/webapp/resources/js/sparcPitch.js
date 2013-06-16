function addPitch() {

    $("#addPitch").click(function () {

        var productName = $("#productName").val();
        var mission = $("#mission").val();
        var pitch = $("#pitch").val();
        var benefits = $("#benefits").val();
        var stats = $("#stats").val();
        var cost = $("#cost").val();
        var actionStatement = $("#actionStatement").val();
        var objections = $("#objections").val();
        var createdBy = $("#creator").val();

        var pitchData = '{"id":"","productName":"' + productName + '","mission":"' + mission + '","pitch":"' + pitch + '","benefits":"' + benefits + '","cost":"' + cost + '","actionStatement":"' + actionStatement + '","stats":"' + stats + '","objections":"' + objections + '","createdBy":"' + createdBy + '"}';

        $.ajax({
            headers:{
                'Accept':'application/json',
                'Content-Type':'application/json'
            },
            type:"POST",
            url:"/pitch/add",
            data:(pitchData),
            cache:false,
            dataType:"json",
            success:onSuccess,
            error:onError
        });
    });

    function onSuccess(data) {
        window.location.replace("/index/");
    }

    function onError(data) {
        alert("Crap!")
    }
}

function editPitchSegment() {

    $("#updatePitchButton").click(function () {

        var pitchId = $("#editPitchSegmentPitchId").val();
        var fieldName = $("#editPitchSegmentFieldName").val();
        var fieldValue = $("#editPitchSegmentFieldValue").val();

        var pitchSegmentData = '{"pitchId":"' + pitchId + '","fieldName":"' + fieldName + '","fieldValue":"' + fieldValue + '"}';

        $.ajax({
            headers:{
                'Accept':'application/json',
                'Content-Type':'application/json'
            },
            type:"POST",
            url:"/pitch/edit/segment",
            data:(pitchSegmentData),
            cache:false,
            dataType:"json",
            success:onSuccess,
            error:onError
        });
    });

    function onSuccess(data) {
        var fieldName = $("#editPitchSegmentFieldName").val();
        if (fieldName == 'productName') {
            window.location.replace("/pitch/view/" + $("#editPitchSegmentPitchId").val() + "/");
        } else {
            window.location.replace("/pitch/view/" + $("#editPitchSegmentFieldName").val() + "/" + $("#editPitchSegmentPitchId").val() + "/");
        }
    }

    function onError(data) {
        alert("Crap!")
    }
}