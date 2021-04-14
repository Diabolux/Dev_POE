//Exercice Calcul de salaire

(function calculSalaire () {
    let salaireBrut = document.querySelector("#grossSalary");
    let genre = document.querySelector("#gender");
    let nbPersonnesACharge = document.querySelector("#dependents")

    function employe(salaireBrut, genre, nbPersonnesACharge) {
        this.salaireBrut = parseInt(salaireBrut.value);
        this.genre = genre;
        this.nbPersonnesACharge = parseInt(nbPersonnesACharge.value);


        this.taxeReduction = function () {
            let pourcentage = 18;
            switch (true) {
                case nbPersonnesACharge == 3:
                    pourcentage -= 1;
                    break;
                case nbPersonnesACharge >= 4:
                    pourcentage -= 2;
                    break;
            }
            if (this.genre == 'F') pourcentage -= 2;
            var impotRevenu = Math.round((this.salaireBrut * (pourcentage / 100) * 100) / 100);
            console.log("Impôt sur le revenu : " + impotRevenu);
            return impotRevenu;
        }

        this.assEmploye = function () {
            var assuranceEmploye = Math.round((this.salaireBrut * 0.07 * 100) / 100);
            console.log("Assurance employé : " + assuranceEmploye);
            return assuranceEmploye;
        }

        this.regPension = function () {
            var regimePension = Math.round((this.salaireBrut * 0.05 * 100) / 100);
            console.log("Régime de pensions du Canada : " + regimePension);
            return regimePension;
        }

        this.salaire = function () {
            var salaireNet = this.salaireBrut - this.taxeReduction() - this.assEmploye() - this.regPension();
            if (document.querySelector("#additionBonus").checked) salaireNet += 100;
            if (document.querySelector("#additionAllowance").checked) salaireNet += 150;
            console.log("Salaire Net : " + salaireNet);
            return salaireNet;
        }



    }

    //Test dans la console
    let newPersonne = new employe(40000, 'F', 3);
    newPersonne.taxeReduction();
    newPersonne.assEmploye();
    newPersonne.regPension();
    newPersonne.salaire();

})();