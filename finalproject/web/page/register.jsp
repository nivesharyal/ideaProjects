<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/23/2022
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="../register.css" rel="stylesheet">
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
    <link href="../signin.css" rel="stylesheet">
</head>
<body class="text-center">

<main class="form-signin">
    <form>

        <h1 class="h3 mb-3 fw-normal">Register</h1>

        <div class="form-floating mb-2">
            <%--<label for="username">Username</label>--%>
            <input type="text" class="form-control" id="fullname" placeholder="Your FullName">
        </div>
        <div class="form-floating mb-2">
            <input type="text" class="form-control" id="username" placeholder="Your Username">
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
        <button class="w-100 btn btn-lg btn-primary mb-3" type="submit">Register</button>

        <div class="text-center">
            <p>Already a member? <a href="user?page=index">SignIn</a></p>
        </div>
    </form>
</main>


<%--<section class="h-100 h-custom" style="background-color: #8fc4b7;">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-8 col-xl-6">
                <div class="card rounded-3">
                    <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                    <div class="card-body p-4 p-md-5">
                        <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Registration Info</h3>

                        <form class="px-md-2">

                            <div class="form-outline mb-4">
                                <input type="text" id="form3Example1q" class="form-control" />
                                <label class="form-label" for="form3Example1q">Name</label>
                            </div>

                            <div class="row">
                                <div class="col-md-6 mb-4">

                                    <div class="form-outline datepicker">
                                        <input
                                                type="text"
                                                class="form-control"
                                                id="exampleDatepicker1"
                                        />
                                        <label for="exampleDatepicker1" class="form-label">Select a date</label>
                                    </div>

                                </div>
                                <div class="col-md-6 mb-4">

                                    <select class="select">
                                        <option value="1" disabled>Gender</option>
                                        <option value="2">Female</option>
                                        <option value="3">Male</option>
                                        <option value="4">Other</option>
                                    </select>

                                </div>
                            </div>

                            <div class="mb-4">

                                <select class="select">
                                    <option value="1" disabled>Class</option>
                                    <option value="2">Class 1</option>
                                    <option value="3">Class 2</option>
                                    <option value="4">Class 3</option>
                                </select>

                            </div>

                            <div class="row mb-4 pb-2 pb-md-0 mb-md-5">
                                <div class="col-md-6">

                                    <div class="form-outline">
                                        <input type="text" id="form3Example1w" class="form-control" />
                                        <label class="form-label" for="form3Example1w">Registration code</label>
                                    </div>

                                </div>
                            </div>

                            <button type="submit" class="btn btn-success btn-lg mb-1">Submit</button>

                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>--%>

</body>
</html>
