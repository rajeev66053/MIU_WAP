$(document).ready(function() {	
	$("#submit").click(function(e){		
    	e.preventDefault();
		$("#result").html("");
		var word = $("#term").val();
		
		$.ajax({
			"url": "DictServlet",
			"type": "GET",
			"data": { "word": word},
			"success": myAjaxSuccessFunction,
			"error": ajaxFailure
		});
		function myAjaxSuccessFunction(responseData) {
			// do something with the data
			var $ul = $("<ul>").appendTo($("#result"));
	        $.each(responseData, function(index, item) {
	            $("<li>").text((index+1)+"("+item.wordtype+") :: "+item.definition).appendTo($ul);
	        });
		}
		function ajaxFailure(xhr, status, exception) {
			console.log(xhr, status, exception);
		}
		});
});