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

(function() {

    function Person(firstName, lastName, age){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.isAdult = function() {return this.age > 18 }
    }
  
    function Student(firstName, lastName, age, level){
      Person.call(this, firstName, lastName, age) //Permet de récupérer les paramètres de l'objet Person
      this.level=level;
    }
  
    function Stagiaire(firstName, lastName, age, exp){
      Person.call(this, firstName, lastName, age)
      this.exp=exp;
    }
  
    Student.prototype = Object.create(Person.prototype); //On attribut le prototype de l'objet Person au prototype de l'objet Student pour créer l'héritage
    Stagiaire.prototype = Object.create(Person.prototype);
    let rishi = new Student('Rishi', 'BEN', 21, 5);
    //display(rishi);
    let lolo = new Stagiaire('Name', 'LOLO', 21, 6);
    //display(lolo);
  })();



//Exercice sur l'héritage et switch

(function() {
    function Document(numEnreg, titre){
        this.numEnreg = numEnreg;
        this.titre = titre;
    }

    function Livre(numEnreg, titre, auteur, nbrPages){
        Document.call(this, numEnreg, titre)
        this.auteur = auteur;
        this.nbrPages = nbrPages;

        this.nbPages = function nbPages(){
            switch(true){ //Nécessaire de mettre true pour tester l'égalité (true == (nbrPages <= 100))
                case  this.nbrPages <= 100 :
                    console.log('Nombre de pages entre 0 et 100');
                break;
                case  this.nbrPages <= 200 :
                    console.log('Nombre de pages entre 101 et 200');
                break;
                case  this.nbrPages <= 300 :
                    console.log('Nombre de pages entre 201 et 300');
                break;
                default :
                    console.log('Nombre de pages supérieur à 300');
            }
        }

    }

    function Revue(numEnreg, titre, mois, annee){
        Document.call(this, numEnreg, titre)
        this.mois = mois;
        this.annee = annee;
    }

    function Dictionnaire(numEnreg, titre, langue){
        Document.call(this, numEnreg, titre)
        this.langue = langue;
    }

    Livre.prototype = Object.create(Document.prototype);
    Revue.prototype = Object.create(Document.prototype);
    Dictionnaire.prototype = Object.create(Document.prototype);


    let HarryPotter = new Livre(250, 'Harry Potter à l\'école des sorciers', 'JK Rowling', 150);

    //console.log(HarryPotter);
    //HarryPotter.nbPages();
})();


