<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cervezas</title>
</head>
<body>
   <h1>Selector de cervezas</h1>
   <p>Somos tu proveedor de cervezas
   <p>Indicanos de que tipo de gustan</p>
   <form action="SelectBeer.do" method="post">
       <label for="tipo">Indica el tipo preferido</label>
       <select name="tipo" id="tipo">
           <option value="trigo">Una de trigo</option>
           <option value="tostada">Una tostadita</option>
       </select>
       <br>
       <input type="submit" value="Enviar tus gustos">
   </form>
    
</body>
</html>