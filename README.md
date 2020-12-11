# main-ffbot
A Discord version of the FanfictionLinker reddit bot that uses Jsoup and JDA API
  
  [Initial Commit]
    
    -created repository and added pom.xml, .classpath, .gitignore, .project, README.md, and added src/main/java/discordAPI and src/main/java/webscrape
  
  [Version 1.01] 
    
    -fixed bug in src/main/java/discordAPI/ffnet.java
    
  [Version 1.1]
  
    -removed sendMessage() and added EmbedBuilder() | Not linked with src/main/java/webscrape/getHTMLelementsOfFanfiction.java
    
  [Version 1.9]
    
    -Edited EmbedBuilder eb() to finalize the format of master embed.
    (?) .setThumbnail() is not working | Fix or discard
  
  # Commands 
  
    - !linkffn [ffid] | Add the ID of your fanfiction that can be found in the profile of your fanfiction.
