$(document).ready(function(){
	fetchClassification();
	$("#classificationform").submit(function(event){
		event.preventDefault();
	console.log($("#classificationform").serialize());
	$.ajax({
		url:'ClassificationController',
		type:"post",
		data:{classificationId:$('#classification_id').val(),classificationName:$('#classification_name').val(),action:'save'},
		success:function(data){
			
			//fetchClassification();
		}
	});
	
	
	});

$(document).on("click",".deleteaction", function(){
	var id=$(this).attr("data-id");

	$.ajax({
		url: 'ClassificationController',
		type: 'post',
		data: {action:'delete',id:id},
		success: function(data) {
		}
			});
		});

	
	function fetchClassification(){
		$.ajax({
			url:'ClassificationController',
			type:'get',
			success:function(data){
				
				$.each(data.classification,function(key,classificationList){
					//console.log(data.classification);
					var row = `<tr>
								<td>${classificationList.classification_id}</td>
								<td>${classificationList.classification_name}</td>
								<td><button class='deleteaction' data-id='${classificationList.classification_id}'>Delete</button></td>
								<td></td>
								</tr>`;
					$('#classificationTable tbody').append(row);
								 
				})
			}
		});
	}
	

	});	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	