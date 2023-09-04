$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});


function getAll() {
	// Tạo ra 1 request.
	$.ajax({
		type: "GET",
		headers: {
			'Accept': 'application/json',
		},
		url: "http://localhost:8080",
		success: function (data) {
			show(data);
		},
		error: function (err) {
			console.log(err)
			// lỗi
		}
	});

}

getAll();

function show(arr) {
	let str = "";
	for (const a of arr) {
		str += ` <tr>
              <td>${a.id}</td>
              <td>${a.name}</td>
              <td>${a.dateOfBirth}</td>
              <td>${a.address}</td>
              <td>${a.number}</td>
              <td>${a.email}</td>
			  <td>${a.classroom.name}</td>
<!--              <td><button type="button" class="btn btn-warning" onclick="" data-toggle="modal" data-target="#modalEdit" >Edit</button></td>-->
			  <td><a href="#editStudentModal" class="btn btn-warning" data-toggle="modal" onclick="showEdit(${a.id})"><span >Edit</span></a></td>
              <td><a href="#deleteStudentModal" class="btn btn-danger" data-toggle="modal" ><span >Delete</span></a></td>
             </tr>`

	}
	document.getElementById("show").innerHTML = str;
}

function deleteA(idA){
	$.ajax({
		type: "GET",
		url: "http://localhost:8080/delete/"+idA,
		success: function (data) {
			getAll();
		},
		error: function (err) {
			console.log(err)
		}
	});
}

function add() {
	let name = document.getElementById("name").value;
	let dateOfBirth = document.getElementById("dateOfBirth").value;
	let address = document.getElementById("address").value;
	let number = document.getElementById("number").value;
	let email = document.getElementById("email").value;
	let classroomId = document.getElementById("classroom.name").value;
	let student = { name,dateOfBirth ,address, number, email, classroom : {id : classroomId}};

	$.ajax({
		type: "Post",
		headers: {
			'Content-Type': 'application/json'
		},
		url: "http://localhost:8080/create",
		data: JSON.stringify(student),
		success: function (data) {
			getAll();
		},
		error: function (err) {
			console.log(err)
		}
	});
}

function showEdit(idA){
	$.ajax({
		type: "GET",
		headers: {
			'Accept': 'application/json',
		},
		url: "http://localhost:8080/edit/"+idA,
		success: function (data) {
			document.getElementById("nameE").value = data.name;
			document.getElementById("dateOfBirthE").value = data.dateOfBirth;
			document.getElementById("addressE").value = data.address;
			document.getElementById("numberE").value = data.number;
			document.getElementById("emailE").value = data.email;
			document.getElementById("classroom.nameE").value = data.classroom.name;
		},
		error: function (err) {
			console.log(err)
		}
	});
}

function edit(idA) {
	let name = document.getElementById("nameE").value;
	let dateOfBirth = document.getElementById("dateOfBirthE").value;
	let address = document.getElementById("addressE").value;
	let number = document.getElementById("numberE").value;
	let email = document.getElementById("emailE").value;
	let classroomId = document.getElementById("classroom.nameE").value;
	let student = { name, dateOfBirth, address, number, email, classroom : {id : classroomId}};

	$.ajax({
		type: "POST",
		headers: {
			'Content-Type': 'application/json'
		},
		url: "http://localhost:8080/edit/"+idA,
		data: JSON.stringify(student),
		success: function (data) {
			getAll();
		},
		error: function (err) {
			console.log(err)
		}
	});
}


function search() {
	let nameS = document.getElementById("searchA").value;
	$.ajax({
		type: "GET",
		headers: {
			'Content-Type': 'application/json'
		},
		url: "http://localhost:8080/search/"+nameS,
		data: JSON.stringify(nameS),
		success: function (data) {
			show(data);
		},
		error: function (err) {
			console.log(err)
		}
	});
}