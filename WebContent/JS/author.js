$(document).ready(function(){

	$("#authorForm").submit(function(event){
		event.preventDefault();
	console.log($("#authorForm").serialize());
	$.ajax({
		url:'AuthorController',
		type:"post",
		data:$('#authorForm').serialize(),
		success:function(data){
			alert(data);
		}
	});
	});

	});