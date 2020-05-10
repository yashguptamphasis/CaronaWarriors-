   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
 <h1>These are the Helps we got</h1>  
  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Email</th><th>Phone</th><th>City</th><th>help</th><th>description</th></tr>  
   <c:forEach var="helper" items="${helper}">   
   <tr>  
   <td>${helper.name}</td>
   <td>${helper.email}</td>
   <td>${helper.phone}</td>
   <td>${helper.city}</td>
   <td>${helper.help}</td>
   <td>${helper.description}</td>  
  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
