package uvsq.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UneClasseMetier {
  /**
   * methode qui fait un traitement metier et qui fait appel au module affichage.
   */
  public void methodeMetier() {
    LogAffichage.affiche(LoggerFactory.getLogger(App.class),"Debut de methode metier");
    // Traitements Métier
    LogAffichage.affiche(LoggerFactory.getLogger(App.class),"Fin de methode metier");
  }
}