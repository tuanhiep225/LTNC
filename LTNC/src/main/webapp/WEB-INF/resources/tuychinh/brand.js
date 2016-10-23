$(document).ready(function() {
    $('#example').DataTable( {
        "ajax": "http://localhost:8080/LTNC/brand/getall"
    } );
} );