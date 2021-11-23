
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<p align="left" style="margin: 20;">
	<button onclick="history.back()">Back to Key Details</button>
</p>

<script type="text/javascript">
	google.charts.load('current', {
		packages : [ "orgchart" ]
	});
	google.charts.setOnLoadCallback(drawChart);

	function drawChart() {

		var data = new google.visualization.DataTable();
		data.addColumn('string', 'Entity');
		data.addColumn('string', 'ParentEntity');
		data.addColumn('string', 'ToolTip');

		<c:forEach items="${draws}" var="draw">
		data.addRows([ [
				{
					v : "${draw.label}",
					f : "${draw.label}" + "<div class='role'>"
							+ "${draw.level}" + "  " + "</div>"
				}, "${draw.reportsTo}","${draw.kno}"]]);	
		</c:forEach>

		// Create the chart.	
		
		var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));
		chart.draw(data, {allowHtml:true, 'size': 'large'});
	}
</script>

<div id="chart_div"></div>

<%@ include file="common/footer.jspf"%>