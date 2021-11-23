<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
<a href="/dkmsbroswser-app/search"><button>Back to search</button></a>
	<table class="table table-striped">
		<caption></caption>
		<thead>
			<tr>
				<th>Label1</th>
				<th>Label2</th>
				<th>Label3</th>
				<th>Label4</th>
				<th>Label5</th>
				<th>Key Type</th>
				<th>Appl Name</th>
				<th>KeyNo</th>
			</tr>
		</thead>
		<tbody>
		<c:set var="counter" value="0" />
			<c:forEach items="${dbs}" var="db">
				<tr>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.label1}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.label2}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.label3}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.label4}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.label5}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.keyType}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.applName}</a></td>
					<td><a href="/dkmsbroswser-app/detail-db?id=${db.id}">${db.kno}</a></td>		
				</tr>	
				<c:set var="counter" value="${counter+1}" />  			
			</c:forEach>			
		</tbody>
	</table>
	 <b>Total : ${counter}</b>	 		
</div>
<%@ include file="common/footer.jspf"%>