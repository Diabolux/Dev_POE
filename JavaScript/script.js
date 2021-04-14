//Exercice catch error

/*var num1, num2;
function division(num1, num2) {
    try {
        return num1 / num2;
    } catch (error) {
        console.log('Impossible de faire une division par 0');
    }
}
console.log(division(4, 'a'));*/

//Exemple héritage

// (function() {

//     function Person(firstName, lastName, age){
//       this.firstName = firstName;
//       this.lastName = lastName;
//       this.age = age;
//       this.isAdult = function() {return this.age > 18 }
//     }

//     function Student(firstName, lastName, age, level){
//       Person.call(this, firstName, lastName, age) //Permet de récupérer les paramètres de l'objet Person
//       this.level=level;
//     }

//     function Stagiaire(firstName, lastName, age, exp){
//       Person.call(this, firstName, lastName, age)
//       this.exp=exp;
//     }

//     Student.prototype = Object.create(Person.prototype); //On attribut le prototype de l'objet Person au prototype de l'objet Student pour créer l'héritage
//     Stagiaire.prototype = Object.create(Person.prototype);
//     let rishi = new Student('Rishi', 'BEN', 21, 5);
//     //display(rishi);
//     let lolo = new Stagiaire('Name', 'LOLO', 21, 6);
//     //display(lolo);
//   })();



//Exercice sur l'héritage et switch

// (function() {
//     function Document(numEnreg, titre){
//         this.numEnreg = numEnreg;
//         this.titre = titre;
//     }

//     function Livre(numEnreg, titre, auteur, nbrPages){
//         Document.call(this, numEnreg, titre)
//         this.auteur = auteur;
//         this.nbrPages = nbrPages;

//         this.nbPages = function nbPages(){
//             switch(true){ //Nécessaire de mettre true pour tester l'égalité (true == (nbrPages <= 100))
//                 case  this.nbrPages <= 100 :
//                     console.log('Nombre de pages entre 0 et 100');
//                 break;
//                 case  this.nbrPages <= 200 :
//                     console.log('Nombre de pages entre 101 et 200');
//                 break;
//                 case  this.nbrPages <= 300 :
//                     console.log('Nombre de pages entre 201 et 300');
//                 break;
//                 default :
//                     console.log('Nombre de pages supérieur à 300');
//             }
//         }

//     }

//     function Revue(numEnreg, titre, mois, annee){
//         Document.call(this, numEnreg, titre)
//         this.mois = mois;
//         this.annee = annee;
//     }

//     function Dictionnaire(numEnreg, titre, langue){
//         Document.call(this, numEnreg, titre)
//         this.langue = langue;
//     }

//     Livre.prototype = Object.create(Document.prototype);
//     Revue.prototype = Object.create(Document.prototype);
//     Dictionnaire.prototype = Object.create(Document.prototype);


//     let HarryPotter = new Livre(250, 'Harry Potter à l\'école des sorciers', 'JK Rowling', 150);

//     //console.log(HarryPotter);
//     //HarryPotter.nbPages();
// })();


// Exercice sur les class

// (function () {
//     class Document {
//         constructor(numEnreg, titre) {
//             this.numEnreg = numEnreg;
//             this.titre = titre;
//         };

//     };

//     class Livre extends Document {
//         constructor(numEnreg, titre, auteur, nbrPages) {
//             super(numEnreg, titre, auteur, nbrPages);
//             this.auteur = auteur;
//             this.nbrPages = nbrPages;
//         }
//     };

//     class Revue extends Document {
//         constructor(numEnreg, titre, mois, annee) {
//             super(numEnreg, titre, mois, annee);
//             this.mois = mois;
//             this.annee = annee;
//         }
//     };

//     class Dictionnaire extends Document {
//         constructor(numEnreg, titre, langue) {
//             super(numEnreg, titre, langue);
//             this.langue = langue;
//         }
//     };

//     let livre1 = new Livre(252, "Bonjour", "Moi", 256);
//     let doc1 = new Document(200, "Doc1");
//     let dico1 = new Dictionnaire(522, "Le Petit Larousse", "Français");

//     console.log(livre1);
// })();



// function a(i, j){
//     if ((i || j) == 1 || (i + j) == 1) return true;
//     else return false;
// }
// console.log(a(-2,3));

(function () {
    function factorial(n) {
        if(n <= 1) return 1;
        else return n * factorial(n - 1);
    };
    console.log(factorial(8));
})();

// (function () {
//     var array = [1,2,1,2,1,2,1];

//     function calc(array, n1, n2){
//         let resultat = 0;
//         for(let i = n1 ; i <= n2 ; i++){
//             resultat = resultat + array[i];
//         }
//         return resultat;
//     };

//     console.log(calc(array,1,3));
// })();

// (function () {
//     function reshape(n, str){

//     }
// })();