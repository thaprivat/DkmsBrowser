
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div style="float: left; width: 130px">
		<button onclick="history.back()">Back to list</button>
	</div>
	<div style="float: right;">
		<a href="/dkmsbroswser-app/diagram?id=${db.id} " class="btn btn-primary">Draw </a>
	</div>
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
			<tr>
				<td>${db.label1}</td>
				<td>${db.label2}</td>
				<td>${db.label3}</td>
				<td>${db.label4}</td>
				<td>${db.label5}</td>
				<td>${db.keyType}</td>
				<td>${db.applName}</td>
				<td>${db.kno}</td>
			</tr>
		</tbody>
	</table>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<div class="node__content cleardix">
		<div class="simple-box">
			<p style="text-align: center; color: grey; font-size: 160%;">
				<b>key Details </b>
			</p>
			<div id="parent">
				<div id="left">
					<div class="w3-container">
						<label for="checkboxG1" class="css-label">UKDS2 General</label> <input
							type="checkbox" id="checkboxG1" class="css-checkbox" name="cod2"
							checked="true" value="0" />
						<div id='select2'>
							<p style="text-align: center; color: blue; font-size: 160%;">
							<b>Information from UKDS2 </b><br><br>
							</p>
							<div class="w3-container">
								<label>Key Number&nbsp&nbsp&nbsp&nbsp : &nbsp </label> ${db.kno}<br>
								<label>Key
									Type&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp :&nbsp
								</label> ${db.keyType}<br> <label>Key
									Status&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp : &nbsp</label>${db.kmgKeyStatus}<br>
								<label>Groups&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
									: &nbsp</label>${db.kmgGroups}<br> <label>Appl.
									Name&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp : &nbsp </label>${db.applName}<br>
								<label>Kek
									Label&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp : &nbsp</label>${db.kmgKekLabel}<br>
								<label>KCV&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
									: &nbsp</label> ${db.kmgVidata} <br> <label>Origin&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
									: &nbsp</label> ${db.kmgOrigin} <br> <label>Activation
									date : &nbsp</label> ${db.kmgActiveDate} <br> <label>Create
									date&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp : &nbsp</label> ${db.kmgCreateDate}
								<br> <label>Update date&nbsp&nbsp&nbsp&nbsp&nbsp :
									&nbsp</label> ${db.kmgUpdateDate} <br>
								<br> <label>Token&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
									: &nbsp</label> xxxxxxxxxxx
							</div>
						</div>
					</div>
				</div>
				<div id="right">
					<div class="w3-container">
						<label for="checkboxG1" class="css-label">KDT (technician
							only)</label> <input type="checkbox" id="checkboxG1" class="css-checkbox"
							name="cod" checked="true" value="1" />
						<div id='select'>
							<p style="text-align: center; color: red; font-size: 160%;">
								<b>Information from Key Definition Table</b><br><br>
							</p>
							<label>MText&nbsp&nbsp&nbsp : &nbsp</label>${db.mText}<br>
							<br> <label>InfoText : &nbsp</label>${db.infoText}<br>
							<br> <label>KGropus : &nbsp</label>${db.kGropus}
						</div>
					</div>
				</div>
			</div>
			<div id="parent">
				<div id="left">
					<div class="w3-container">
						<label for="checkboxG1" class="css-label">MISS (Business
							Aera)</label> <input type="checkbox" id="checkboxG1" class="css-checkbox"
							name="cod3" checked="true" value="1" />
						<div id='select3'>
							<p style="text-align: center; color: green; font-size: 160%;">
							<b>miscellaneous information</b><br><br>
							</p>
							<label title="Keylevel in 3DES hierarchy">Key
								level&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.kmgKeyLevel}<br> <br> <label title="Explanation based on the naming structure of label 1">Label1
								explanation&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.kmgKeylabel1ToText}<br> <br> <label title="IBM manual">Key
								type
								explanation&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.translatedkeyType}<br> <br> <label title="IBM manual">Application
								Name explanation&nbsp&nbsp&nbsp&nbsp : &nbsp</label>${db.translatedapplName}<br>
							<br> <label title="Collected information from various sources">Key Number
								explanation&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.kmgKnoToText} <br> <br> <label title="Part in yearly sector keys exchange">Yearly
								Keyexchange&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.yearlyOrOther}<br> <label title="From NETS key-matrix">Yearly
								KeyExchange explanation : &nbsp</label>${db.groupYearlyKeyExchange}<br>
						</div>
					</div>
				</div>
				<div id="right">
					<div class="w3-container">
						<label for="checkboxG1" class="css-label">Other (technician
							only)</label> <input type="checkbox" id="checkboxG1" class="css-checkbox"
							name="cod1" checked="true" value="1" />
						<div id='select1'>
							<p style="text-align: center; color: black; font-size: 160%;">
								<b>Other information</b><br><br>
							</p>
							<label title="Where does the key belongs and what DC does it regards">Label 3
								explanation&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.bigKmgKeyLabel3ToText}<br> <br> <label title="Key extention translation">Key
								Extension Translation : &nbsp</label>${db.bigKeyExtensionText}<br>
							<br> <label title="Where is the key created">Key
								Origin&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.bigKmgKeyLabel1ToText2}<br> <br> <label>-------------------------------------
								Key Overview -------------------------------------------</label><br>
							<br> <label title="Where is the key used">System&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.system}<br> <br> <label title="What is it used for">Use&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.brug} <br> <br> <label title="Where i the key included">Sector/DKMS/Own&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.sektorDkmsEgen} <br> <br> <label title="Is the key stored in the CDE">CDE/NON-CDE&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.rodGronZone} <br> <br> <label title="Is the key stored in DKMS keystores">CKDS/PKDS&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								: &nbsp</label>${db.ckdsPkds}
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script>
	$('[name="cod"]').on('change', function() {
		$('#select').toggle(this.checked);
	}).change();
	$('[name="cod1"]').on('change', function() {
		$('#select1').toggle(this.checked);
	}).change();
	$('[name="cod2"]').on('change', function() {
		$('#select2').toggle(this.checked);
	}).change();
	$('[name="cod3"]').on('change', function() {
		$('#select3').toggle(this.checked);
	}).change();
</script>

<%@ include file="common/footer.jspf"%>