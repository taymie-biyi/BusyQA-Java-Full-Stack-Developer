$(document).ready(function() {

  $('#save').click(function(event){

    if ( !validateForm() ){
      return;
    }

    var first = $("#first").val();
    var last = $("#last").val();
    var username = $("#username").val();
    var password = $("#password").val();
    var birth = $("#birth").val();

    $.ajax({
      url: '/users',
      /*
       * Create a JSON Object with the Form information.
       */
      data: JSON.stringify({
             'firstName': first,
             'lastName': last,
             'username': username,
             'password': password,
             'birth': birth
      }),
      type: 'POST',
      contentType: 'application/json',
      success: function(data) {
        /* alert("The User was created successfully!"); */
        $(location).attr("href","/list/create");
      },
      error: function() {
        alert("Error while creating User!");
      }
    });
  });

  validateForm = function() {

    var first = $("#first").val();
    var last = $("#last").val();
    var username = $("#username").val();
    var password = $("#password").val();
    var birth = $("#birth").val();

    if (first.trim()=== "") {

      alert("Please, type the First Name!");

      $( "#first" ).focus();
      return false;
    }

    if (last.trim()=== "") {

      alert("Please, type the Last Name!");

      $( "#last" ).focus();
      return false;
    }

    if (username.trim()=== "") {

      alert("Please, type the Username!");

      $( "#username" ).focus();
      return false;
    }

    if (password.trim()=== "") {

      alert("Please, type the Password!");

      $( "#password" ).focus();
      return false;
    }

    if (birth.trim()=== "") {

        alert("Please, type the Date of Birth!");

        $( "#birth" ).focus();
        return false;
    }

    return true;
  };
});
