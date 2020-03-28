package uvsq.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class LogAffichage {
    
	private Logger logger ;
	public LogAffichage(Logger k)
	{
		logger=k;
	}
	
    void affiche(String msg)
    {

    	lg.info(msg);
    }
}	
