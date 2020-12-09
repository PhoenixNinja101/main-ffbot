package discordAPI;


import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;

public class masterBot {
	
	public static void main (String [] args) throws LoginException{
		JDABuilder jda = JDABuilder.createDefault("Nzc2MTkzMTU4ODU3ODgzNjk5.X6xUNg.1d9Ux6OWmWG-u9_06Pab_1Xurcs");
	
		jda.addEventListeners(new ffnetEvent());
		
		jda.build();
	}
	
	

}
