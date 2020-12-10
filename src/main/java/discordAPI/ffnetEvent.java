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
						
						eb.setTitle("Hello", "https://google.com");
						eb.setColor(Color.red);
						eb.setDescription("Text");
						eb.addField("Title blah blah blah blah", "Text blah blah blah", true);
						eb.addBlankField(false);
						eb.setAuthor("name", null, "https://github.com/zekroTJA/DiscordBot/blob/master/.websrc/zekroBot_Logo_-_round_small.png");
						eb.setFooter("Text", "https://github.com/zekroTJA/DiscordBot/blob/master/.websrc/zekroBot_Logo_-_round_small.png");
						eb.setImage("https://github.com/zekroTJA/DiscordBot/blob/master/.websrc/logo%20-%20title.png"); 	
						eb.setThumbnail("https://github.com/zekroTJA/DiscordBot/blob/master/.websrc/logo%20-%20title.png");
						
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