<%@ taglib uri="/tags/struts-html" prefix="html" %>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
    <h2>Registration Form</h2>
    <html:form action="/register">
        <p>
            <html:text property="name" size="30" maxlength="50" />
            <html:errors property="name"/>
        </p>
        
        <p>
            <html:text property="dateOfBirth" size="30" maxlength="10" />
            <html:errors property="dateOfBirth"/>
        </p>
        
        <p>
            <html:password property="password" size="30" maxlength="30" />
            <html:errors property="password"/>
        </p>
        
        <p>
            <html:password property="confirmPassword" size="30" maxlength="30" />
            <html:errors property="confirmPassword"/>
        </p>
        
        <p>
            <html:textarea property="address" rows="3" cols="30"/>
            <html:errors property="address"/>
        </p>
        
        <p>
            <html:submit value="Register"/>
        </p>
    </html:form>
</body>
</html>
