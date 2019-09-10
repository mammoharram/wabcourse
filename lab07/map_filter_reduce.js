const a = [1,3,5,3,3]; 
function sum(myarr){
    return myarr.reduce((prev , elem) => prev + elem);
}
console.log( sum(a));

function multiply(myarr){
    return myarr.reduce((prev , elem) => prev * elem);
}
console.log( multiply(a));

////////////////////////////

function reverse(s) {
    let splitString = s.split("");
    return splitString
            .map((elem,i,array) => splitString[splitString.length-1-i])
            .join("");
}
console.log( reverse('hello'));

////////////////////////////

function filterLongWords(strArr, i){
    return strArr.filter((elem, ind, array) => elem.length > i);
}
console.log(filterLongWords(['hello','this','is','me'], 3));
