<!DOCTYPE html>

<%@ page import="main.java.net.temuulen.riot.api.endpoints.summoner.dto.*" %>
<%@ page import="main.java.net.temuulen.riot.api.endpoints.match_history.dto.*" %>
<%@ page import="main.java.net.temuulen.riot.constants.champion.*" %>

<html lang="en">
	<head>
    	<meta charset="utf-8">
    	<meta name="author" content="Temuulen Khurelbaatar">
		<meta name="description" content="League of Legends Profile Lookup">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">  
    	<meta name="viewport" content="width=device-width, initial-scale=1">
  
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" /> 
    	<link rel="stylesheet" type="text/css" href="mystyle.css">

    	<style>
      		body { padding-top: 50px; }    
    	</style>
    
    	<title>League of Legends</title>
        
  	</head>
  	<body>
    	<header>
    		<nav class="navbar navbar-inverse navbar-fixed-top">

        	<div class="container">        
          		<div class="navbar-header">
          
           
            		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
              			<span class="sr-only">Toggle navigation</span>
              			<span class="icon-bar"></span>
              			<span class="icon-bar"></span>
              			<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.html">League of Legends</a>
          		</div>
		
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            	<ul class="nav navbar-nav navbar-right">
              	<li><a href="#">About</a></li>
              	<li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Services<span class="caret"></span></a>
                <ul class="dropdown-menu">
                	<li><a href="profile.html">Profile</a></li>
                  	<li><a href="MatchHistory.html">Match History</a></li>
                  	<li><a href="#">Live Game Information</a></li>
                </ul>
              	</li>
              	<li><a href="#">Contact</a></li>
            	</ul>
            </div>
        	</div>
		</nav>    
	</header>
            
 
    <div class="jumbotron">
    	<div class="container">
        	<p>
				<%
					
					Summoner summoner = (Summoner) session.getAttribute("profile");
					out.write("<p><img class=\"img-circle-profile\" hspace='20' src=\"http://ddragon.leagueoflegends.com/cdn/8.8.2/img/profileicon/" + summoner.getProfileIconID() + ".png\" width='100px' height='100px'>Quantex (" + summoner.getSummonerLevel() + ")</p>");
					
				%>
				
    		</p>       
    	</div>
    </div>
    
    <div class="container">
    	
    	
    	<%
    		MatchList matchList = (MatchList) session.getAttribute("matches");
    		ChampionList championList = (ChampionList) session.getAttribute("championList");
    		
			for(MatchReference m : matchList.getMatches()) {
				out.write("<div class='card'>");
				out.write("<a href='MyServlet?game_id=" + m.getGameId() + "'>");
				out.write("<img class='img-circle-matchlist' src='https://ddragon.leagueoflegends.com/cdn/8.8.2/img/champion/" + championList.getChampionKey(m.getChampion()) + ".png' width='50px' height='50px'>");
				out.write("</a>");
				out.write("<a class='a-test' href='MyServlet?game_id=" + m.getGameId() + "'>" + championList.getChampionName(m.getChampion()) + "</a>");
				out.write("</div>");
			}
    		
    	
    	%>
    	
    	
    </div>
    
  
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    
  	</body>
  	
</html>