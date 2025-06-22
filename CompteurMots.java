import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurMots {
    
    public static void main(String[] args) {

        String nomFichier = "texte_test.txt";
        
        int nombreTotalMots = compterMots(nomFichier);
        
        // J'affiche le résultat
        if (nombreTotalMots >= 0) {
            System.out.println("=== RÉSULTAT DU COMPTAGE ===");
            System.out.println("Fichier analysé : " + nomFichier);
            System.out.println("Nombre total de mots : " + nombreTotalMots);
        }
    }
    
    // Méthode pour compter les mots dans un fichier
    public static int compterMots(String nomFichier) {
        int totalMots = 0;  
        int numeroLigne = 0; 
        
        try {
            // Je crée un lecteur de fichier (File Scanner)
            File fichier = new File(nomFichier);
            Scanner lecteur = new Scanner(fichier);
            
            System.out.println("=== ANALYSE DU FICHIER ===");
            System.out.println("Lecture du fichier : " + nomFichier);
            System.out.println();
            
            // Boucle qui lit chaque ligne dans une chaîne de caractères
            while (lecteur.hasNextLine()) {
                numeroLigne++;
                String ligne = lecteur.nextLine();  
                
                // Je sépare la chaîne en utilisant l'espace comme délimiteur
                String[] mots = ligne.split(" ");
                
                // Je compte les mots non vides dans cette ligne
                int motsVraisDansLigne = 0;
                for (String mot : mots) {

                    if (!mot.trim().isEmpty()) {
                        motsVraisDansLigne++;
                    }
                }
                
                totalMots += motsVraisDansLigne;
                
                // J'affiche les détails de chaque ligne
                System.out.println("Ligne " + numeroLigne + " : " + motsVraisDansLigne + " mots");
                System.out.println("Contenu : " + ligne);
                System.out.println();
            }
            
            // Je ferme le lecteur
            lecteur.close();
            
            System.out.println("=== FIN DE L'ANALYSE ===");
            System.out.println("Nombre total de lignes : " + numeroLigne);
            
        } catch (FileNotFoundException e) {
            // Si le fichier n'existe pas
            System.out.println("ERREUR : Le fichier '" + nomFichier + "' n'a pas été trouvé !");
            System.out.println("Vérifiez que le fichier existe dans le même dossier que le programme.");
            return -1;  
        }
        
        return totalMots;  
    }
}