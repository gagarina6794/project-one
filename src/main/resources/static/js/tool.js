$(document).ready(function() {
    $.ajax({
        url: "/test"
    }).then(function(data) {
            data.forEach(function(el) {
                $(".test").append("<p>" + el.id + ' ' + el.name + "</p>");
            });
    });
})