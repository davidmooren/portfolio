<%-- 
    Document   : update
    Created on : 09-oct-2013, 4:28:06
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
                <h3>MODIFICACIÓN DE LOS DATOS DE UN PAIS</h3>
                <form action="paises?operacion=update" method="POST">
                    <table border="1">
                        <tr>
                            <th>Codigo</th>
                            <td>${paises.code}</td>
                        </tr>
                        <tr>
                            <th>Nombre</th>
                            <td><input type="text" name="nombre" value="${paises.nombre}" size="30" /></td>
                        </tr>
                        <tr>
                            <th>Continente</th>
                            <td><input type="text" name="continente" value="${paises.continente}" size="30" /></td>
                        </tr>
                        <tr>
                            <th>Region</th>
                            <td><input type="text" name="region" value="${paises.region}" size="30" /></td>
                        </tr>
                        <tr>
                            <th>Hab. Población</th>
                            <td><input type="text" name="poblacion" value="${paises.poblacion}" size="30" /></td>
                        </tr>
                        <tr>
                            <th>Hab. Capital</th>
                            <td><input type="text" name="capital" value="${paises.capital}" size="30" /></td>
                        </tr>
                    </table>
                    <input type="hidden" name="code" value="${paises.code}" />
                    <input type="submit" value="Actualizar Datos" />
                </form>
                     <p><a href="paises?operacion=listado"><<< Volver al listado</a></p>
            </div>
        </div>
    </body>
</html>

