$.fn.PreloadFlow = function () { 
var mainContainerPreload = $("#main-container"); 
var url = mainContainerPreload.attr('data-flow-preload'); 
if (typeof url !== typeof undefined && url !== false && url != '') {
	$.get(url).done(function (response) {
		mainContainerPreload.attr('data-flow-preload',''); 
		mainContainerPreload.html(response); 
	}).error(function(jqXHR, textStatus, errorThrown) {
		if(jqXHR.status === 400 || jqXHR.status === 500){
			mainContainerPreload.html(jqXHR.responseText); 
		} else { 
			var $el = mainContainerPreload.html(jqXHR.responseText); 
		} 
	}); 
}};

$.fn.AjaxFormSubmit = function (params, renderer) {
    var $self = this;
    var settings = {
        type: 'get'
    };
    $.extend(settings, params);
    
    var $form = $(params.form);
    var $button= $(params.button);
    
    if ($form.length) {
        settings.type = $form.attr('method') || 'get';
        settings.data = $form.serialize();
        settings.url = $form.attr('action') || '';
        
        var csrfToken = $form.find('input[name="X-Csrf-Token"]').val();
        $.ajaxSetup({headers:{"X-Csrf-Token":csrfToken}});
    }

    settings.callback = undefined;
    settings.success = (settings.success)?settings.success:function (response) {
    	if(response.indexOf('class="error-code"') >= 0){
	    	var $responseHtml = $(response),
				$errorCode = $responseHtml.filter('p.error-code');
		
	    		
			if("error: "+$errorCode){
				if($errorCode.text() == '-2'){
					$('#main-container').append(response);
				} else{
					$('#main-container').html(response);
				}
			}else{
				$("html, body").animate({scrollTop: $("div#main-container").offset().top}, 500);
	            var $el = renderer ? renderer(response) : $self.html(response);
			} 
    	} else{
    		$("html, body").animate({scrollTop: $("div#main-container").offset().top}, 500);
            var $el = renderer ? renderer(response) : $self.html(response);
        }
        
        params.callback && params.callback(response);
    };
    settings.error = function(jqXHR, textStatus, errorThrown) {
    	if(jqXHR.statusText === "timeout") {
    		$.get("error")
    	    .success(function (response) {
    	    	$("#main-container").html(response);
    	    });
    	} else if(jqXHR.status === 400|| jqXHR.status === 500){
        	$self.html(jqXHR.responseText);
        } else {
        	var $el = renderer ? renderer(jqXHR.responseText) : $self.html(jqXHR.responseText);
        }
    };
    settings.timeout = 59000;
    
    $.ajax(settings);
};