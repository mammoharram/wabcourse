let timer = null;
window.onload  = function(){

    document.getElementById('btnBigger').onclick = btnBiggerOnClick;
   
    $('#chkBling').on('change', chkBlingChanged);    

    document.getElementById("myText").style.fontSize = 12 + "pt";   
}

function btnBiggerOnClick (){
    if(timer == null){
        timer = setInterval(() => {
            getFontBigger();
        }, 500);
    }else
    {
        clearInterval(timer);
        timer = null;
    }
}
function getFontBigger(){
    var size = parseInt(document.getElementById("myText").style.fontSize);
    size += 4; 
    document.getElementById("myText").style.fontSize = size + "pt";
}

function chkBlingChanged (){
    if($('#chkBling').is(':checked') ){
        document.getElementById('myText').style.fontWeight = 'bold';
        document.getElementById('myText').style.textDecoration = 'underline';
    }
        else { document.getElementById('myText').style.fontWeight='normal';
        document.getElementById('myText').style.textDecoration = 'unset';
    }
}
