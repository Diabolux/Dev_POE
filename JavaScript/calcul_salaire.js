//Exercice Calcul de salaire

(function () {

    let salaireBrut = document.querySelector("#grossSalary");
    let genre = document.querySelector("#gender");
    let nbPersonnesACharge = document.querySelector("#dependents")

    function employe(salaireBrut, genre, nbPersonnesACharge) {
        this.salaireBrut = salaireBrut;
        this.genre = genre;
        this.nbPersonnesACharge = nbPersonnesACharge;

        this.taxeReduction = function () {
            let pourcentage = 18;
            switch (nbPersonnesACharge) {
                case 3:
                    pourcentage -= 1;
                    break;
                case 4:
                    pourcentage -= 2;
                    break;
            }
            if (this.genre == 'F') pourcentage -= 2;
            let impotRevenu = Math.round((this.salaireBrut * (pourcentage / 100)*100)/100);
            console.log("Impôt sur le revenu : " + impotRevenu);
            return impotRevenu;
        }

        this.assEmploye = function () {
            let assuranceEmploye = Math.round((this.salaireBrut * 0.07*100)/100);
            console.log("Assurance employé : " + assuranceEmploye);
            return assuranceEmploye;
        }

        this.regPension = function () {
            let regimePension = Math.round((this.salaireBrut * 0.05*100)/100);
            console.log("Régime de pensions du Canada : " + regimePension);
            return regimePension;
        }

        console.log(this.regimePension);

        this.salaire = function () {
            let salaireNet = this.salaireBrut - this.impotRevenu - this.assuranceEmploye - this.regimePension;
            
            //Je n'arrive pas à récupérer la valeur des différentes parties
            console.log(this.impotRevenu);
            console.log(this.assuranceEmploye);
            console.log(this.regimePension);

            if (document.querySelector("#additionBonus")) salaireNet += 100;
            if (document.querySelector("#additionAllowance")) salaireNet += 150;
            console.log("Salaire Net : " + salaireNet);
            return salaireNet;
        }



    }

    //Test dans la console
    let newPersonne = new employe(35000, 'F', 0);
    newPersonne.taxeReduction();
    newPersonne.assEmploye();
    newPersonne.regPension();
    newPersonne.salaire();
})();