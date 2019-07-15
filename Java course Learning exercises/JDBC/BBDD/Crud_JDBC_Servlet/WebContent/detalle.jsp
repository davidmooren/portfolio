<%-- 
    Document   : detalle
    Created on : 09-oct-2013, 4:27:46
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
                <h3>DETALLE DE LOS DATOS DE UN PAIS</h3>
                <table border="1">

                    <tr>
                        <th>Codigo</th>
                        <td>${paises.code}</td>
                    </tr>
                    <tr>
                        <th>Nombre</th>
                        <td>${paises.nombre}</td>
                    </tr>
                    <tr>
                        <th>Continente</th>
                        <td>${paises.continente}</td>
                    </tr>
                    <tr>
                        <th>Region</th>
                        <td>${paises.region}</td>
                    </tr>
                    <tr>
                        <th>Hab. Población</th>
                        <td>${paises.poblacion}</td>
                    </tr>
                    <tr>
                        <th>Hab. Capital</th>
                        <td>${paises.capital}</td>
                    </tr>
                </table>
                <p><a href="paises?operacion=listado"><<< Volver al listado</a></p>
            </div>
        </div>
    </body>
</html>
