window.onload = function () {
    document.getElementById('start').onclick = btnStartOnclick;
    document.getElementById('stop').onclick = btnStopOnclick;

}

function btnStartOnclick(){
    var animation = document.getElementById('animation').value;
    var size = document.getElementById('fontsize').value;
    var turbo = document.getElementById('turbo').checked ;

    document.getElementById('stop').disabled = false;
    document.getElementById('start').disabled = true;

    console.log(animation, size, turbo);
}

function btnStopOnclick(){
    document.getElementById('stop').disabled = true;
    document.getElementById('start').disabled = false;
}