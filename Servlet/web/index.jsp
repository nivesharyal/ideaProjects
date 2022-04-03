<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/11/2022
  Time: 8:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="Success"method="GET">
    UserName: <input type="text" name="UserName"placeholder="UserName"><br>
    Password: <input type="password" name="Password"placeholder="Password"><br>

    <input type ="radio" name="Gender" value="Male">Male
    <input type ="radio" name="Gender" value="Female">Female

    <select name="Course" class="dropdown">
      <option value="JAVA"> java</option>
      <option value="Python">Python</option>
      <option value="NodeJS">NodeJS</option>
      <option value="JS">JS</option>
      <option value="PHP">PHP</option>
    </select>

    <input type="checkbox" name="bike" value="Honda">Honda
    <input type="checkbox" name="bike" value="Pulsar">Pulsar
    <input type="checkbox" name="bike" value="Yamaha">Yamaha
    <input type="submit" value="Submit">
  </form>
  </body>
</html>
