$(document).ready(function() {
	$("#ejemplo").validate({
	    rules : {
	    	"input1" : {
	            required : true,
	            
	        },
	    },
	    submitHandler: function(form) {	 
			var params = {
					form: form,
					callback: function (response) { 					
						
					}
				};			
			$('#main-container').AjaxFormSubmit(params);
		}
	});
});