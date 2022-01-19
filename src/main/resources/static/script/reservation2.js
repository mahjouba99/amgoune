$(document)
		.ready(
				function() {

					table = $('#treservation2')
							.DataTable({
										ajax : {
											url : "reservations2/all",
											dataSrc : ''
										},
										columns : [
												
												{
													data : "date"
												},
												{
													data : "creneau.heureDebut"
												},
												{
													data : "creneau.heureFin"
												},
												{
													data : "salle.code"
												},
												{
													data : "users.username"
												},
												{
													data : "statut"
													
												},
												
												{
													"render" : function() {
														return '<button type="button" class="btn btn-outline-danger rejeter">Rejeter</button>';
													}
												},
												{
													"render" : function() {
														return '<button type="button" class="btn btn-outline-secondary accepter">Accepter</button>';
													}
												} ]

									});
							$('#table-content').on(
							'click',
							'.rejeter',
							function() {
								var btn = $('#btn');
								
								var statut = 'Rejetee';
								
								
								btn.text('Confirmer');
								$("#statut").val(statut);
								
								btn.click(function(e) {
									e.preventDefault();
									var p = {
										statut : $("#statut").val(),
										
										
										
									};
									if ($('#btn').text() == 'Confirmer') {
										$.ajax({
											url : 'reservations2/save',
											contentType : "application/json",
											dataType : "json",
											data : JSON.stringify(p),
											type : 'POST',
											async : false,
											success : function(data,
													textStatus, jqXHR) {
												table.ajax.reload();
												$("#statut").val('');
												btn.text('Confirmer');
											},
											error : function(jqXHR, textStatus,
													errorThrown) {
												console.log(textStatus);
											}
										});
										$("#main-content").load(
												"./page/reservation2.html");
									}
								});
							});

$('#table-content').on(
							'click',
							'.accepter',
							function() {
								var btn = $('#btn');
									var statut = 'accepter';
								
								btn.text('Confirmer');
							$("#id").val(id);
								$("#salle").val(salle);
								$("#creneau").val(creneau);
								$("#users").val(users);
								$("#statut").val(statut);
								
								btn.click(function(e) {
									e.preventDefault();
									var p = {
									id : $("#id").val(),
										salle : $("#salle").val(),
										creneau : $("#creneau").val(),
										users : $("#users").val(),
						
										statut : $("#statut").val(),
										
										
										
									};
									if ($('#btn').text() == 'Confirmer') {
										$.ajax({
											url : 'reservations2/save',
											contentType : "application/json",
											dataType : "json",
											data : JSON.stringify(p),
											type : 'POST',
											async : false,
											success : function(data,
													textStatus, jqXHR) {
												table.ajax.reload();
												$("#statut").val('');
												btn.text('Confirmer');
											},
											error : function(jqXHR, textStatus,
													errorThrown) {
												console.log(textStatus);
											}
										});
										$("#main-content").load(
												"./page/reservation2.html");
									}
								});
							});

				});
