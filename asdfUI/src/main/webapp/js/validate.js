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