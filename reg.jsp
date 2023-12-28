<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form action="/request" modelAttribute="user" method="POST">
<h1>New User Registration Form</h1>
Name:<form:input path="name"/><p></p>
Password<form:password path="password"/><p></p>
Email:<form:input path="email"/><p></p>
Mobile Number:<form:input path="mno"/><p></p>
Address:<form:input path="address"/><p></p>
<input type="submit" value="register">
</form:form>