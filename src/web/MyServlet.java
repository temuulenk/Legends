package web;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import main.java.net.temuulen.riot.api.ApiConfiguration;
import main.java.net.temuulen.riot.api.RiotApi;
import main.java.net.temuulen.riot.api.endpoints.matches.dto.Match;
import main.java.net.temuulen.riot.api.endpoints.summoner.dto.Summoner;
import main.java.net.temuulen.riot.constants.Platform;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private Document document;
	
	static boolean loaded = false;
	
	private String file;
	
    public MyServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(!loaded) {
	    	String file = getServletContext().getRealPath("/WEB-INF/data/summoners.xml");
			handleData(file);
			loaded = true;
		}
		
		ApiConfiguration apiConfiguration = new ApiConfiguration("RGAPI-6902fbf2-2ae4-482b-b019-b504068e6f2e");
		RiotApi api = new RiotApi(apiConfiguration);
      
		if(request.getParameter("usernames") != null) {
			
			Summoner summoner = exists(document.getElementsByTagName("account"), request.getParameter("usernames"));
			if(summoner == null) {
				System.out.println("USERNAMES: " + request.getParameter("usernames"));
				summoner = api.getSummonerByName(Platform.NA, request.getParameter("usernames"));
//				public void addNode(String username, long summonerLevel, long accountId, int profileIconId, Node parent) {
				addNode(summoner.getName(), summoner.getSummonerLevel(), summoner.getAccountID(), summoner.getProfileIconID(), document.getElementsByTagName("account").item(0).getParentNode());
			}else {
				System.out.println("SUMMONER ALREADY EXISTS IN DB");
			}
			request.getSession().setAttribute("profile", summoner);
			request.getSession().setAttribute("matches", api.getSummonerMatchHistoryByAccount(Platform.NA, summoner.getAccountID()));
			request.getSession().setAttribute("championList", api.getChampionList());
			response.sendRedirect("profile.jsp");
			
			

		}
      
		else if(request.getParameter("game_id") != null) {
			long gameId = Long.parseLong(request.getParameter("game_id"));
			System.out.println("GAMEID: " + gameId);
			Match match = api.getMatchByMatchId(Platform.NA, gameId);
			request.getSession().setAttribute("championList", api.getChampionList());
			request.getSession().setAttribute("match", match);
			request.getSession().setAttribute("participants", match.getParticipants());
			response.sendRedirect("MatchInformation.jsp");
		}
      
      
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	public void addNode(String username, long summonerLevel, long accountId, int profileIconId, Node parent) {
	    Document dom = parent.getOwnerDocument();
	     
	    Node node = dom.createElement("account");
	    
	    Node n = dom.createElement("username");
	    n.appendChild(dom.createTextNode(username));
	    node.appendChild(n);
	    
	    Node n1 = dom.createElement("summonerLevel");
	    n1.appendChild(dom.createTextNode("" + summonerLevel));
	    node.appendChild(n1);
	    
	    Node n2 = dom.createElement("accountId");
	    n2.appendChild(dom.createTextNode("" + accountId));
	    node.appendChild(n2);
	    
	    Node n3 = dom.createElement("profileIconId");
	    n3.appendChild(dom.createTextNode("" + profileIconId));
	    node.appendChild(n3);
	    
	    parent.appendChild(node);
	    try {
			save();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
	
	public void read(NodeList list) {
		
		for(int i=0; i<list.getLength(); i++) {
			Node node = list.item(i);
			System.out.println(node.getNodeName());
			Element element = (Element) node;
			System.out.println(element.getElementsByTagName("username").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("summonerLevel").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("accountId").item(0).getTextContent());
			System.out.println(element.getElementsByTagName("profileIconId").item(0).getTextContent());
		}
		
//		addNode("Next", 1, 1, 1, list.item(0).getParentNode());
		
	}
	
	
	
	private void handleData(String fname) {
	      try {
	    	  document = createDOM(fname);
	         
//	    	  NodeList nList = document.getElementsByTagName("account");
	    	
//	    	  read(nList);
	    	
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	}
	
	private void save() throws TransformerException {
    	Transformer transformer = TransformerFactory.newInstance().newTransformer();
    	Result output = new StreamResult(new File(getServletContext().getRealPath("/WEB-INF/data/summoners.xml")));
    	Source input = new DOMSource(document);
    	transformer.transform(input, output);
	}
	      
	   
	private Document createDOM(String fname) throws Exception {
		try {
			File datafile = new File(fname);
	        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
	        Document doc = dbuilder.parse(datafile);
	        return doc;
		}catch (Exception e) {
			e.printStackTrace();
		}
	    return null;
	} 
	
	private Summoner exists(NodeList list, String username) {
		for(int i=0; i<list.getLength(); i++) {
			Node node = list.item(i);
			Element element = (Element) node;
			if(element.getElementsByTagName("username").item(0).getTextContent().equalsIgnoreCase(username)) {
				return new Summoner(element.getElementsByTagName("username").item(0).getTextContent(), 
						Long.parseLong(element.getElementsByTagName("summonerLevel").item(0).getTextContent()),
						Long.parseLong(element.getElementsByTagName("accountId").item(0).getTextContent()),
						Integer.parseInt(element.getElementsByTagName("profileIconId").item(0).getTextContent()));

			}
		}
		return null;
	}

	
}
