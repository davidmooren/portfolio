<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Proyecto: Restaurante
Versión: 3a
Descripción: Formato HTML
-->
<html>
    <head>
        <title>Restaurante v3a. Un Serlet (similar Spring) EL+JSTL</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>    
        <link href="css/restaurante.css" rel="stylesheet" type="text/css" />        
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Restaurante v3a. Un Serlet (similar Spring) EL+JSTL</h1>
                <h2>Paso 03 - Detalle Pedido</h2>
            </div>
            <div id="main">

                <p>Gracias por utilizar nuestros servicios.</p>
                <p>Enseguida le llevamos su pedido.<br/></p>

                <h3><strong>Datos del cliente</strong></h3>
                <ul>
                    <li> Nombre del cliente: <strong>${cliente.nombre}</strong></li>
                    <li> Habitacion del cliente: <strong>${cliente1.habitacion}</strong></li>
                </ul>   
                <h3><strong>Menu encargado para hoy</strong></h3>
                <ul>
                    <li> De Primero: <strong>${pedido.primero}</strong></li>
                    <li> De Segundo: <strong>${pedido.segundo}</strong></li>
                    <li> De Postre: <strong>${pedido.postre}</strong></li>
                </ul>
                <p>
                    Si existe algun problema, envia un mensaje a <a href="#">${initParam.reservas}</a>
                </p>
            </div>
        </div>
    </body>
</html>