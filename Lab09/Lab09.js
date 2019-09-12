$(function(){
    $('#bookingForm').submit(function(event){
        event.preventDefault();
        submitFlag = true;

        if($('#name').val() === ''){
            submitFlag = false;
            $("from").after($("<div>",{"text":"Name cannot be null. <br/>"}));
        }
        if($('#street').val() === ''){
            submitFlag = false;
            $('#street').append($("<p>",{"text":"street cannot be null. <br/>"}));
        }
        if($('#zipcode').val() === ''){
            submitFlag = false;
            $('#zipcode').append($("<p>",{"text":"zipcode cannot be null. <br/>"}));
        }
        if($('#seats').val() === ''){
            submitFlag = false;
            $('#seats').append($("<p>",{"text":"No of seets cannot be null, and cannot exceed 200 <br/>"}));
        }
        if($('#taxi').val() === ''){
            submitFlag = false;
            $('#taxi').append($("<p>",{"text":"you must select taxi type. <br/>"}));
        }

        if(submitFlag){
            this.submit();
        }
    
  });
});