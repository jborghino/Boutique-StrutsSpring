<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<link rel="stylesheet" href="<s:url value="/template/css/bootstrap.css"/>"/>
<link rel="stylesheet" href="<s:url value="/template/css/font-awesome.min.css" />"/>
<link rel="stylesheet" href="<s:url value="/template/css/font.css" />"/>
<link rel="stylesheet" href="<s:url value="/template/css/style.css" />"/>
<link rel="stylesheet" href="<s:url value="/template/css/plugin.css" />"/>
<link rel="stylesheet" href="<s:url value="/template/css/landing.css" />"/>

<!-- datepicker -->
<script src=<s:url value="/template/js/datepicker/bootstrap-datepicker.js" />></script>
<!-- / footer -->
<script src=<s:url value="/template/js/jquery.min.js" />></script>
<!-- Bootstrap -->
<script src=<s:url value="/template/js/bootstrap.js" />></script>
<!-- app -->
<script src=<s:url value="/template/js/app.js" />></script>
<script src=<s:url value="/template/js/app.plugin.js" />></script>
<script src=<s:url value="/template/js/app.data.js" />></script>
<!-- fuelux -->
<script src=<s:url value="/template/js/fuelux/fuelux.js" />></script>
<!-- slider -->
<script src=<s:url value="/template/js/slider/bootstrap-slider.js" />></script>
<!-- file input -->
<script src=<s:url value="/template/js/file-input/bootstrap.file-input.js" />></script>
<!-- combodate -->
<script src=<s:url value="/template/js/combodate/moment.min.js" />></script>
<script src=<s:url value="/template/js/combodate/combodate.js" />></script>
<!-- parsley -->
<script src=<s:url value="/template/js/parsley/parsley.min.js" />></script>
<!-- select2 -->
<script src=<s:url value="/template/js/select2/select2.min.js" />></script>

<!--[if lt IE 9]>
    <script src="/template/js/ie/respond.min.js" cache="false"></script>
    <script src="/template/js/ie/html5.js" cache="false"></script>
    <script src="/template/js/ie/excanvas.js" cache="false"></script>
  <![endif]-->



<title>JSP Page</title>


</head>
<body>


	<div class="container">
		<div class="jumbotron">
			<h2>Add CD</h2>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-lg-12">
			
				<s:fielderror key="*"/>

				<s:form action="add">

					<input type="hidden" name="id" value="${cd.id }">

					<%-- 		<s:textfield name="auteur" label="auteur" value="%{cd.auteur}"/> --%>
					<!-- 		Equivalant -->
					<input type="text" name="auteur" value="${cd.auteur }" placeholder="auteur">
					<br />
					<input type="text" name="titre" value="${cd.titre }" placeholder="titre">
					<br />
					<input type="text" name="prix" value="${cd.prix }" placeholder="prix">
					
					
					
					<s:submit />
				</s:form>
			</div>
		</div>
	</div>








</body>
</html>
