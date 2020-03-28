package uvsq.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAffichage {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    void affiche(Logger lg,String msg)
    {
    	lg.info(msg);
    }
}	
