$('a').removeClass('active');
$('a:contains(Statistiques)').addClass('active');
$("#main-content").load("page/statistiques.html");

function show(page) {
	if (page == 'blocs') {
		$('a').removeClass('active');
		$('a:contains(Blocs)').addClass('active');
		$("#main-content").load("page/bloc.html");

		event.preventDefault();
	}
	if (page == "statistiques") {
		$('a').removeClass('active');
		$('a:contains(Statistiques)').addClass('active');
		$("#main-content").load("page/statistiques.html");
		event.preventDefault();
	}
	if (page == "marques") {
		$('a').removeClass('active');
		$('a:contains(Marques)').addClass('active');
		$("#main-content").load("page/marque.html");
		event.preventDefault();
	}
	if (page == "machines") {
		$('a').removeClass('active');
		$('a:contains(Machines)').addClass('active');
		$("#main-content").load("page/machine.html");
		event.preventDefault();
	}
	if (page == "salles") {
		$('a').removeClass('active');
		$('a:contains(Salles)').addClass('active');
		$("#main-content").load("page/salle.html");
		event.preventDefault();
	}
	if (page == 'creneaus') {
		$('a').removeClass('active');
		$('a:contains(Creneaus)').addClass('active');
		$("#main-content").load("page/creneau.html");

		event.preventDefault();
	}
	if (page == 'users') {
		$('a').removeClass('active');
		$('a:contains(Users)').addClass('active');
		$("#main-content").load("page/user.html");

		event.preventDefault();
	}
	if (page == "reservations") {
		$('a').removeClass('active');
		$('a:contains(Reservations)').addClass('active');
		$("#main-content").load("page/reservation.html");
		event.preventDefault();
   
   }
if (page == "reservations2") {
		$('a').removeClass('active');
		$('a:contains(Reservations2)').addClass('active');
		$("#main-content").load("page/reservation2.html");
		event.preventDefault();
   
   }
}
