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
						eb.setTitle("Amalgum – Lockhart's Folly", "https://www.fanfiction.net/s/11913447/");
					    eb.setDescription("By: [tkepnr](https://www.fanfiction.net/u/5362799/tkepner)");
					    eb.setColor(new Color(13390553));
					    eb.setFooter("Rated: Fiction T - English - Adventure/Humor - Harry P., Hermione G., Gilderoy L., Bellatrix L. - Chapters: 31 - Words: 192,977 - Reviews: 1,964 - Favs: 6,555 - Follows: 3,918 - Updated: Feb 20, 2017 - Published: Apr 24, 2016 - Status: Complete - id: 1191","https://i.pinimg.com/474x/ce/45/5e/ce455e6bcf90fc1826fb4102f1d247d9.jpg");
//debug this line					    eb.setThumbnail("https://fanfiction.net/image/1356205/75/");
					    eb.addField("_______", "Death wants free of its Master and proposes sending Harry back in time to avoid the unnecessary deaths in fighting Voldemort. Harry readily accepts, thinking he'll start anew as a Firstie. Instead, Harry's soul, magic, and memories end up at the beginning of Second Year — in GILDEROY LOCKHART!", false);
					   
						
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