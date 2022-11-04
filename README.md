# main-ffbot
A Discord version of the FanfictionLinker reddit bot that uses Jsoup and JDA API
Note: I am not responsible for hosting this bot. If you'd like to use it, I will let you host and use it on your own server as long as you link to this github repository.

If you'd like to incorporate this bot into your server. Please follow this https://www.youtube.com/watch?v=NxOxcgbikJo tutorial and be sure to enter your authToken in src/main/java/discordAPI/masterBot.java
  
  [Version 1.99]
    
    -Edited EmbedBuilder eb() | Decided to discard .setThumbnail() | Changed comments in src/main/java/webscrape/getHTMLelementsOfFanfiction.java
    (?) Need to add hyperlinks to title and description 
    
  [Version 1.9]
    
    -Edited EmbedBuilder eb() to finalize the format of master embed.
    (?) .setThumbnail() is not working | Fix or discard
  
  [Version 1.1]
  
    -removed sendMessage() and added EmbedBuilder() | Not linked with src/main/java/webscrape/getHTMLelementsOfFanfiction.java
    
  [Version 1.01] 
    
    -fixed bug in src/main/java/discordAPI/ffnet.java
    
  [Initial Commit]
    
    -created repository and added pom.xml, .classpath, .gitignore, .project, README.md, and added src/main/java/discordAPI and src/main/java/webscrape
    
 
  
  # Commands 
  
    - !linkffn [ffid] | Add the ID of your fanfiction that can be found in the profile of your chosen fanfiction.
    
    Open in Autocode
================

To add an Open in Autocode button to your GitHub repository,
simply copy and paste the following code anywhere into README.md

[&lt;img  data-src="https://deploy.stdlib.com/static/images/deploy.svg" width="192"&gt;](https://open.autocode.com/)

Enjoy!
  - Standard Library Team
