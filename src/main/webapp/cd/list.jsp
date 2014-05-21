<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>List CD</title>
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h2>List CD</h2>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<table border="1px" cellpadding="8px" class="table table-condensed table-hover table-striped table-bordered">
					<tr>
						<th>Auteur</th>
						<th>Titre</th>
						<th>Prix</th>
						<th>Action</th>
					</tr>
					<s:iterator value="cds" var="c">
						<tr>
							<td>${c.auteur }</td>
							<td>${c.titre }</td>
							<td>${c.prix }</td>
							<td><a href="delete.action?cd.id=${c.id }">Delete</a> <a
								href="update.action?cd.id=${c.id }">Update</a></td>
							<%-- 				<td><s:url id="deleteUrl" action="delete"> --%>
							<%-- 						<s:param name="cd.id">${c.id }</s:param> --%>
							<%-- 					</s:url> <s:a --%>
							<%-- 						preInvokeJS="confirm('Voulez vous vraiment supprimer ce CD ?')" --%>
							<%-- 						href="%{deleteUrl}"> --%>
							<!-- 				Delete -->
							<%-- 				</s:a></td> --%>
						</tr>
					</s:iterator>
				</table>
			</div>
		</div>
	</div>

</body>
</html>
