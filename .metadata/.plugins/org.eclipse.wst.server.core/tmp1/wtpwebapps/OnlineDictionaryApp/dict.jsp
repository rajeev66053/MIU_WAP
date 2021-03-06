<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>WAP Online Dictionary</title>
		<link href="dict.css" type="text/css" rel="stylesheet">
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	    <script src="dict.js"></script>
	</head>
	<body>
	<%@ page import="java.util.*,com.miu.Entry" %>
		<div class="header">
		<h1>WAP Online Dictionary</h1>
		</div>
		<% 
			List<Entry> entry = (List<Entry>) request.getAttribute("entry");
		
			String word=(entry != null && !entry.isEmpty())?entry.get(0).getWord():"";
		%>
		<div class="searchArea">
			<form action="DictServlet" method="post">
				Term:<input type="text" id="term" name="word" value=<%= word %>>
					<input id="submit" type="submit" value="Lookup">
			</form>
		</div>
		<div class="result">
		 
		  <%= (!word.isEmpty())?"Search Word:"+word:""  %>
		
			<%
				if(entry != null && !entry.isEmpty()){
					// print the information about every category of the list
					int index=1;
					for(Entry e : entry) {
						out.print("<p>");
						out.print(index+"("+e.getWordtype()+") ::");
					    out.print(e.getDefinition());
						out.print("</p>");
					    index++;
					}
				}
			%>
		
		</div>
		
		 <div class="validator">
               <a href="http://validator.w3.org/check?uri=referer" onclick="this.href='http://validator.w3.org/check?uri=' + 
               document.URL">
               <img src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0!" height="31" width="88">
               </a>
            
               <a href="https://jigsaw.w3.org/css-validator/check/referer">
                  <img src="https://jigsaw.w3.org/css-validator/images/vcss"  alt="Valid CSS!" />
               </a>          			
			</div>
	
	</body>
</html>