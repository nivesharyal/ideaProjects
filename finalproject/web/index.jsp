<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/22/2022
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

  <style>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }
  </style>


  <!-- Custom styles for this template -->
  <link href="signin.css" rel="stylesheet">
</head>
<body class="text-center">

<main class="form-signin">
  <form action="user?page=register" method ="post">

    <h1 class="h3 mb-3 fw-normal">Sign in</h1>

    <div class="form-floating mb-2">
      <%--<label for="username">Username</label>--%>
      <input type="text" class="form-control" id="username" placeholder="Username">
    </div>
    <div class="form-floating">
      <%--<label for="password">Password</label>--%>
      <input type="password" class="form-control" id="password" placeholder="Password">
    </div>

    <%--        <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>--%>
    <button class="w-100 btn btn-lg btn-primary mb-3" type="submit">Sign in</button>
    <div class="text-center">
      <p>Not a member? <a href="user?page=newUsers">Register</a></p>
    </div>
  </form>
</main>
<%--
<div class="container">
    <div class = "card">
        <div class="card-body">
<form &lt;%&ndash;class="row g-5"&ndash;%&gt;>

    <div class="col-md-4 col-md-offset-4">
        <div class="form-group">
       &lt;%&ndash; <label class="form-label" for="username">Username</label>&ndash;%&gt;
        <input type="username" id="username" placeholder="Username" class="form-control mb-4" />

</div>

    <div class="form-group">
        &lt;%&ndash;<label class="form-label" for="password">Password</label>&ndash;%&gt;
        <input type="password" id="password" placeholder="Password" class="form-control mb-4" />
    </div>

        <div class="form-group">
    <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>
        </div>

    <!-- Register buttons -->
    <div class="text-center">
        <p>Not a member? <a href="#!">Register</a></p>
    </div>
    </div>
</form>
    </div>
    </div>
    </div>
--%>

</body>
</html>