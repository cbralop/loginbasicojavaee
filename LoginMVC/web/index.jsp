<%-- 
    Document   : index
    Created on : 07-02-2019, 17:08:51
    Author     : capacitacion
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <script src="js/funciones.js"></script>
        <title>Tutoriales</title>
    </head>
    <body>
        <h1>Tutoriales!</h1>
        <div>
            <form action="Autenticacion" method="post">
                <p><input type="text" name="user" id="user"/></p>
                <p><input type="password" name="pass" id="pass"/></p>
                <p><input type="submit" name="entrar" id="entrar" value="Entrar"/></p>
            </form>
        </div>
        <input type="button" value="saludar" onclick="saluda();"/>
    </body>
</html>
