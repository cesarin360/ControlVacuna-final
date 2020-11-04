/**
 * 
 */
function eliminar(id) {
	swal({
		title: "¿Esta seguro de Eliminar?",
		text: "Una vez eliminado no se prodra restablecer",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/clab/delete/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/clab/list";
					}
				});
			}else{
			   swal("No se ha eliminado");
			}
		});
}
function eliminar1(id) {
	swal({
		title: "¿Esta seguro de Eliminar?",
		text: "Una vez eliminado no se prodra restablecer",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/ctvacuna/delete/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/list/tipovacuna";
					}
				});
			}else{
			   swal("No se ha eliminado");
			}
		});
}
function eliminar2(id) {
	swal({
		title: "¿Esta seguro de Eliminar?",
		text: "Una vez eliminado no se prodra restablecer",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/tbivacuna/delete/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/list/inventario";
					}
				});
			}else{
			   swal("No se ha eliminado");
			}
		});
}
function eliminar3(id) {
	swal({
		title: "¿Esta seguro de Eliminar?",
		text: "Una vez eliminado no se prodra restablecer",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/tbpersona/delete/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/dpersona/list";
					}
				});
			}else{
			   swal("No se ha eliminado");
			}
		});
}
function eliminar4(id) {
	swal({
		title: "¿Esta seguro de Eliminar?",
		text: "Una vez eliminado no se prodra restablecer",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/delete/mdosis/" + id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("El registro ha sido eliminado!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href = "/mdosis/list";
					}
				});
			}else{
			   swal("No se ha eliminado");
			}
		});
}