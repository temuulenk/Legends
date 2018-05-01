<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="main.java.net.temuulen.riot.api.endpoints.matches.dto.*" %>
<%@ page import="main.java.net.temuulen.riot.constants.champion.*" %>
<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.Locale" %>


<html lang="en">
	<head>
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
			
			<font size="2">
			<table style="margin: auto;">
				<col width=350>
				<tr>
				<td></td>
				<%
					
					NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
					ChampionList championList = (ChampionList) session.getAttribute("championList");
					Participant[] participants = (Participant[]) session.getAttribute("participants");
					for(int i=0; i<participants.length; i++) {
						if(participants[i].getTeamId() == 100) {
							out.write("<td><img class='img-circle-ally' src='https://ddragon.leagueoflegends.com/cdn/8.8.2/img/champion/" + championList.getChampionKey(participants[i].getChampionId()) + ".png' width='40px' height='40px'></td>");							
						}else {
							out.write("<td><img class='img-circle-enemy' src='https://ddragon.leagueoflegends.com/cdn/8.8.2/img/champion/" + championList.getChampionKey(participants[i].getChampionId()) + ".png' width='40px' height='40px'></td>");
						}
					}
					
					out.write("<tr><th>Kills</th>");
					for(int i=0; i<participants.length; i++) {
						out.write("<td>" + participants[i].getStats().getKills() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Deaths</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getDeaths() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Assists</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getAssists() + "</td>");
					}
					out.write("</tr>");
					
					
					
					// SPREE
					out.write("<tr><th>Largest Killing Spree</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getLargestKillingSpree() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Unreal Kills</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getUnrealKills() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Largest Multi Kill</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getLargestMultiKill() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Killing Sprees</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getKillingSprees() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Double Kills</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getDoubleKills() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Triple Kills</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getTripleKills() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Quadra Kills</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getQuadraKills() + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Penta Kills</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getPentaKills() + "</td>");
					}
					out.write("</tr>");
					
					
					
					
					// DAMAGE
					out.write("<tr><th>Total Units Healed</th>");
					for(Participant p : participants) {
						out.write("<td>" + p.getStats().getTotalUnitsHealed() + "</td>");
					}
					out.write("</tr>");

					
					out.write("<tr><th>Total Damage Taken</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getTotalDamageTaken()) + "</td>");
					}
					out.write("</tr>");

					out.write("<tr><th>Physical Damage Dealt</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getPhysicalDamageDealt()) + "</td>");
					}
					out.write("</tr>");

					out.write("<tr><th>Physical Damage Dealt to Champions</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getPhysicalDamageDealtToChampions()) + "</td>");
					}
					out.write("</tr>");

					out.write("<tr><th>Magic Damage Dealt</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getMagicDamageDealt()) + "</td>");
					}
					out.write("</tr>");

					out.write("<tr><th>Magic Damage Dealt to Champions</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getMagicDamageDealtToChampions()) + "</td>");
					}
					out.write("</tr>");

					out.write("<tr><th>Damage Dealt to Objectives</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getDamageDealtToObjectives()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Total CC Damage Dealt</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getTotalTimeCrowdControlDealt()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Damage Dealt to Turrets</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getDamageDealtToTurrets()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Combat Player Score</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getCombatPlayerScore()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Damage Self Mitigated</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getDamageSelfMitigated()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>Magical Damage Taken</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getMagicalDamageTaken()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>True Damage Dealt</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getTrueDamageDealt()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>True Damage Dealt to Champions</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getTrueDamageDealtToChampions()) + "</td>");
					}
					out.write("</tr>");
					
					out.write("<tr><th>True Damage Taken</th>");
					for(Participant p : participants) {
						out.write("<td>" + numberFormat.format(p.getStats().getTrueDamageTaken()) + "</td>");
					}
					out.write("</tr>");

				
				// WARDS
					out.write("<tr><th>Vision Score</th>");
					for(Participant p : participants) out.write("<td>" + numberFormat.format(p.getStats().getVisionScore()) + "</td>");
					out.write("</tr>");
					
					out.write("<tr><th>Wards Placed</th>");
					for(Participant p : participants) out.write("<td>" + numberFormat.format(p.getStats().getWardsPlaced()) + "</td>");
					out.write("</tr>");
					
					out.write("<tr><th>Wards Destroyed</th>");
					for(Participant p : participants) out.write("<td>" + numberFormat.format(p.getStats().getWardsKilled()) + "</td>");
					out.write("</tr>");
					
					out.write("<tr><th>Control Wards Purchased</th>");
					for(Participant p : participants) out.write("<td>" + numberFormat.format(p.getStats().getVisionWardsBoughtInGame()) + "</td>");
					out.write("</tr>");
					
					
				


					
					
					
				%>
				</tr>
			
			</table>
			
			
			
    	</div>
    </div>
    
    <div class="container">
    	<p id="p1"></p>
    </div>
    
  
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    
  	</body>
  	
</html>