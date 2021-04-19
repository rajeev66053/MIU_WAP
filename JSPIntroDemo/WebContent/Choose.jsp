<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <title>Choose</title>
 </head>
 <body>
 
 <form method='post' action='ChooseServlet'>
 <p>Is JSP cool?</p>
 <input type='radio' value='1' name='radioJSPCool' ${(radioJSPCool=="1")?"checked":"" }><span>Yes</span><br/>
 <input type='radio' value='0' name='radioJSPCool'  ${(radioJSPCool=="0")?"checked":"" }><span>No</span><br/>
 <input type='submit' name='btnSubmit' value='Submit'/>
 <p>Is JSF way cool?</p>
 <input type='radio' value='1' name='JSFwayCool' ${(JSFwayCool=="1")?"checked":"" }><span>Yes</span><br/>
 <input type='radio' value='0' name='JSFwayCool'  ${(JSFwayCool=="0")?"checked":"" }><span>No</span><br/>
 <input type='submit' name='btnSubmit' value='Submit'/>
 <p>Is the moon made of cheese?</p>
 <input type='radio' value='1' name='moonCheese' ${(moonCheese=="1")?"checked":"" } ><span>Yes</span><br/>
 <input type='radio' value='0' name='moonCheese' ${(moonCheese=="0")?"checked":"" } ><span>No</span><br/>
 <input type='submit' name='btnSubmit' value='Submit'/>
 </form>
 <p>EL Expression:</p>
  radioJSPCool ${(radioJSPCool=="1")?"checked Yes":(radioJSPCool=="0")?"checked No":"" }<br>
  JSFwayCool ${(JSFwayCool=="1")?"checked Yes":(JSFwayCool=="0")?"checked No":"" }<br>
  moonCheese ${(moonCheese=="1")?"checked Yes":(moonCheese=="0")?"checked No":"" }<br>
 </body>
</html>