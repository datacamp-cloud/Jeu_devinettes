/*Publier votre solution sur GitHub et partagez le lien ici.

Démarrez un nouveau projet et construisez vous-même le jeu de devinettes. 
Suivez ces étapes pour compléter l'exercice.

    Générez un nombre aléatoire entre 1 et 100.
    Créez une boucle qui demande à l'utilisateur de deviner un nombre.
    Lisez l'entrée de l'utilisateur et comparez-la au nombre aléatoire.
    Indiquez à l'utilisateur si le nombre deviné est supérieur ou inférieur au nombre aléatoire.
    S'il a deviné le bon nombre, mettez fin à la boucle et dites-lui qu'il a gagné.
    S'il a utilisé les 10 essais, mettez fin à la boucle et dites-lui qu'il a perdu. */

package Jeu_devinettes;

import java.util.*;

public class JeuDev {

    public static void main(String[] args) {
        double nombreAleat = Math.random() * 100;
        int entier = (int) nombreAleat;
        System.out.println(entier);

        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (count <= 10) {
            System.out.print("Devinez le nombre: ");
            int userInput = scanner.nextInt();
            if (userInput < entier) {
                System.out.println("Le nombre est plus grand");
                count++;
            } else if (userInput > entier) {
                System.out.println("Le nombre est plus petit");
                count++;
            } else if (userInput == entier) {
                System.out.println("Vous avez deviné le nombre");
                break;
            }
            if (count == 10) {
                System.out.println("Vous avez epuisé les 10 tentatives");
                break;
            }
        }

    }
}