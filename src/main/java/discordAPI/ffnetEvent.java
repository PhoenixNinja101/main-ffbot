package discordAPI;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
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
						EmbedBuilder eb = new EmbedBuilder();
						eb.setTitle(g.getTitle(ffID), "https://www.fanfiction.net/s/11913447/");
					    eb.setDescription("By: ["+g.getAuthor(ffID)+"](https://www.fanfiction.net/u/5362799/tkepner)");
					    eb.setColor(new Color(13390553));
					    eb.addField("_______",g.getDesc(ffID), false);
					    eb.setFooter(g.getByLine(ffID),"https://i.pinimg.com/474x/ce/45/5e/ce455e6bcf90fc1826fb4102f1d247d9.jpg");
					    
					   
						
						event.getChannel().sendMessage(eb.build()).queue();
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