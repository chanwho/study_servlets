<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>

  <body>
    
    <div>Check LogIn</div>
    <div>username : <%= session.getAttribute("username") %></div>
    <div>password : <%= session.getAttribute("password") %></div>
    <div>ID : <%= session.getId() %></div>
    
  </body>

</html>