<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>안녕</title>
		
<script src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript"> 
$(document).ready(function() {
	$('body').on('click', '#saveBtn', function(e) {
		e.preventDefault();
		
        $.ajax({
            url: "/fileArticle/setProc",
            type: "POST",
            data: $("#major").serialize(),
            success: function(data){
            },
            error: function(){
            }
        });

	});
	
	$('body').on('click', '#saveBtn2', function(e) {
		e.preventDefault();
		
		var form = new FormData($('#major2')[0]);
        $.ajax({
            url: "/fileArticle/setFileProc",
            type: "POST",
            data: form,
            cache: false,
            contentType: false,
            processData: false,
            success: function(data){
            },
            error: function(){
            }
        });
	});
	
	$('body').on('click', '#saveBtn3', function(e) {
		e.preventDefault();
		
		var form = new FormData($('#major3')[0]);
        $.ajax({
            url: "/fileArticle/setFileListProc",
            type: "POST",
            data: form,
            cache: false,
            contentType: false,
            processData: false,
            success: function(data){
            },
            error: function(){
            }
        });
	});
	
});
</script>
		
	</head>
	<body>
		<form id="major" name="major" method="post">
			<input type="text" name="title" value="11"/>
			<input type="text" name="content" value="22"/>
			<button type="button" id="saveBtn">저장</button>
		</form>
		
		<form id="major2" name="major2" method="post">
			<input type="text" name="title" value="11"/>
			<input type="text" name="content" value="22"/>
			<input type="file" name="demoFile">
			<button type="button" id="saveBtn2">저장</button>
		</form>
		
		<form id="major3" name="major3" method="post">
			<input type="text" name="fileArticleList[0].title" value="11"/>
			<input type="text" name="fileArticleList[0].content" value="111"/>
			<input type="file" name="fileArticleList[0].demoFile">
			</br>
			<input type="text" name="fileArticleList[1].title" value="22"/>
			<input type="text" name="fileArticleList[1].content" value="222"/>
			<input type="file" name="fileArticleList[1].demoFile">
			</br>
			<input type="text" name="fileArticleList[2].title" value="33"/>
			<input type="text" name="fileArticleList[2].content" value="333"/>
			<input type="file" name="fileArticleList[2].demoFile">
			</br>
			<button type="button" id="saveBtn3">저장</button>
		</form>
	</body>
</html>