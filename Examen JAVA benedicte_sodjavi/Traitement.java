public class Traitement{
     
     final int taille=10;
        private int nbreService=0;
        private int nbreEmploye=0;
        private int nbreEmbauche=0;
        private int nbreJournalier=0;
     //Declaration des Tableaux
     private Service [] tabService;
     private Employe [] tabEmploye;
     private Embauche [] tabEmbauche;
     private Journalier [] tabJournalier;
 
     public Traitement(){
         //Creation des Tableaux
         tabService=new Serivce[taille];
         tabEmploye=new Employe[taille];
         tabEmbauche=new Embauche[taille];
         tabJournalier=new Journalier[taille];
 
     }
   
}