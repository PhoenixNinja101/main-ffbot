package discordAPI;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import webscrape.getHTMLelementsOfFanfiction;

public class ffnetEvent extends ListenerAdapter {
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		getHTMLelementsOfFanfiction g = new getHTMLelementsOfFanfiction();
		
		String[] messageSent = event.getMessage().getContentRaw().split(" ");
		
		if (!event.getMember().getUser().isBot()) {
			if(messageSent[0].equalsIgnoreCase("!linkffn")) {
				String ffID = " ";
				if(messageSent.length == 2) {
					ffID = messageSent[1];
					
					if (!ffID.equals(" ") && g.canFindFF(ffID)) {
						event.getChannel().sendMessage(g.getTitle(ffID)).queue();	
						event.getChannel().sendMessage(g.getAuthor(ffID)).queue();
						event.getChannel().sendMessage(g.getDesc(ffID)).queue();
						event.getChannel().sendMessage(g.getByLine(ffID)).queue();
						
					}
					else {
						event.getChannel().sendMessage("I cannot find a fanfiction with that ID. Please try again.").queue();;
					}
				}
				else {
					event.getChannel().sendMessage("!linkffn (ffID) | Please use the command in this way and don't add multiple spaces.").queue();	
				}
				
				
				
				
				
				
			}
			
		}
		
	}
	
}