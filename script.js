//Exercie catch error

var num1, num2;
function division(num1, num2) {
    try {
        return num1 / num2;
    } catch (error) {
        console.log('Impossible de faire une division par 0');
    }
}
console.log(division(4, 'a'));