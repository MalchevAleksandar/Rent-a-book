	function funkcijaDodadiKosnica(Kniga){
   	 	$("<li style='background-color: #ff3300; text-align: center; color: white; font-weight: bold; font-size: 13px;'>" + Kniga + "</li></br>").appendTo("ul#kosnica"); 
	}

	function funkcijaDodadiZelbi(Kniga){
		$("<li style='background-color: #ff3300; text-align: center; color: white; font-weight: bold; font-size: 13px;'>" + Kniga + "</li></br>").appendTo("ol#zelbi"); 
	}

	$(document).on('click', function(){
		localStorage.setItem("voKosnica", document.getElementById("kosnica").innerHTML);
		localStorage.setItem("voZelbi", document.getElementById("zelbi").innerHTML);
	});

	window.onload = function(){
   		$(localStorage.getItem("voKosnica")).appendTo("#kosnica");
    	$(localStorage.getItem("voZelbi")).appendTo("#zelbi");
	}

	function izbrisiKosnica(){
		$("#kosnica").children().remove();
	}
	
	function izbrisiZelbi(){
		$("#zelbi").children().remove();
	}
	
	function prefrliZelbiKosnica(){
		var x = document.getElementById("zelbi").innerHTML;
		$('#kosnica').append(x);
		$("#zelbi").children().remove();
	}
	
	function nasociMe(){
		window.location.href="razmena.html";
	}
