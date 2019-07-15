<%-- 
    Document   : crearPais
    Created on : 09-oct-2013, 3:44:35
    Author     : Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="estilos.css" rel="stylesheet" type="text/css" /> 
        <title>BBDD(CRUD) [EL + JDBC + DAO]</title>
    </head>
    <body>
        <div id="contenedor">
            <h2>BBDD(CRUD) [EL + JDBC + DAO]</h2>
            <div id="body">        
                <h3>ALTA DE UN PAIS</h3>
                <form action="paises?operacion=alta" method="POST">
                    <table border="1">
                        <thead>
                            <tr>
                                <td>Codigo</td>
                                <td><input type="text" name="code" value="" size="5" /></td>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nombre" value="" size="30" /></td>
                            </tr>
                            <tr>
                                <td>Continente</td>
                                <td><input type="text" name="continente" value="" size="30" /></td>
                            </tr>
                            <tr>
                                <td>Region</td>
                                <td><input type="text" name="region" value="" size="30" /></td>
                            </tr>
                            <tr>
                                <td>Habitantes de la población</td>
                                <td><input type="text" name="poblacion" value="" size="30" /></td>
                            </tr>
                            <tr>
                                <td>Habitantes de la Capital</td>
                                <td><input type="text" name="capital" value="" size="30" /></td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="submit" value="Enviar" />
                </form>
            </div>
        </div>
    </body>
</html>
