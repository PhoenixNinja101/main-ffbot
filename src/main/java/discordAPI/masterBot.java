package discordAPI;


import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;

public class masterBot {
	
	public static void main (String [] args) throws LoginException{
		JDABuilder jda = JDABuilder.createDefault(token);
	
		jda.addEventListeners(new ffnetEvent());
		
		jda.build();
	}
	
	

}
