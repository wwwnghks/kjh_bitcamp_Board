<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/header.jsp"%>
<!-- 1명의 회사친구 정보 페이지 -->
<!-- Main content -->
<style>
table {
	width: 60%;
	height: 65;
	text-align: center;
}
</style>
<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box">
				<div class="box-header with-border">
					<form role="form" method="post"> 
						<h4>친구목록</h4>
						<table border="1" class="table table-bordered" style="width: 60%">
							<tr class="warning">
								<td colspan='2'><b>회사친구</b></td>
							<tr class="success">
								<td width="20%">이름</td>
								<td>${fr_com.fr_name }</td>
							<tr class="success">
								<td>핸드폰번호</td>
								<td>${fr_com.fr_phone}</td>
							<tr class="success">
								<td>이메일</td>
								<td>${fr_com.fr_email}</td>
							<tr class="success">
								<td>주소</td>
								<td>${fr_com.fr_address}</td>
							<tr class="success">
								<td>회사</td>
								<td>${fr_com.fr_c_company}</td>
						</table>
						<input type="hidden" name="idx" value="${fr_com.fr_ref }">
						<input type="hidden" name="fr_ref" value="${fr_com.fr_ref }">
						<input type="hidden" name="fr_name" value="${fr_com.fr_name }">
						<input type="hidden" name="fr_phone" value="${fr_com.fr_phone }">
						<input type="hidden" name="fr_email" value="${fr_com.fr_email }">
						<input type="hidden" name="fr_address" value="${fr_com.fr_address }">
						<input type="hidden" name="fr_c_company" value="${fr_com.fr_c_company }">
						<input type="hidden" name="fr_ref_idx" value="${fr_com.fr_ref_idx }">
					</form>
					<button type="submit" class="btn btn-warning">Modify</button>
						<button type="submit" class="btn btn-danger">REMOVE</button>
						<button type="submit" class="btn btn-primary">LIST ALL</button>

					
					<script>
					$(document).ready(function() {

						var formObj = $("form[role='form']");

						console.log(formObj);

						$(".btn-warning").on("click", function() {
							formObj.attr("action", "com_modify");
							formObj.attr("method", "get");
							formObj.submit();
						});

						$(".btn-danger").on("click", function() {
							formObj.attr("action", "com_delete");
							formObj.submit();
						});

						$(".btn-primary").on("click", function() {
							self.location = "mypage";
						});

					});
				</script>
				</div>
			</div>
		</div>
	</div>

</section>
<%@include file="../include/footer.jsp"%>