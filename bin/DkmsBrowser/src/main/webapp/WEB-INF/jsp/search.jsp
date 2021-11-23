<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<form action="list-dbs">
		<h2>&nbsp&nbspSearch in UKDS2</h2>
		<br>
		<form action="/action_page.php">
			<div class="node__content cleardix">
				<div class="simple-box1">
					<label for="label1">Label 1 : </label><br> <input type="text"
						name="label1" value=""><br> <br> <label
						for="label2">Label 2 : </label><br> <input type="text"
						name="label2" value=""><br> <br> <label
						for="label3">Label 3 : </label><br> <input type="text"
						name="label3" value=""><br> <br> <label
						for="label4">Label 4 : </label><br> <input type="text"
						name="label4" value=""><br> <br> <label
						for="label5">Label 5 : </label><br> <input type="text"
						name="label5" value=""><br> <br> <label
						for="kno">Key Number : </label><br> <input type="text"
						name="kno" value=""><br> <br> <label
						for="kmgKeyStatus">Key Status : </label><br> <input
						type="text" name="kmgKeyStatus" value=""><br>
					<p>(H/A/D/I)</p>
					<br> <input type="submit" value="Search">
		</form>
		<img src="lund1.jpg" width="200" height="200" style="float: right">
</div>
</div>
<%@ include file="common/footer.jspf"%>