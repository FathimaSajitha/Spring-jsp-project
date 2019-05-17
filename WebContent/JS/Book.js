$(document).ready(function(){

	$("#BookForm").submit(function(event){
		event.preventDefault();
	console.log($("#BookForm").serialize());
	$.ajax({
		url:'AuthorController',
		type:"post",
		data:$('#BookForm').serialize(),
		success:function(data){
			alert(data);
		}
	});
	});

	});