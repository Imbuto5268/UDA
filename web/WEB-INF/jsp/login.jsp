<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
            #casella:hover {
                background-color: #d5f5ff;
            }
            
            #entra:hover{
                background-color: #d5f5ff;
                border: 1px solid lightgray;
            }
        </style>
        <meta charset="UTF-8">
    </head>

    <body>
        <div class="container-fluid" style="background-color: #9ee8ff; width: 100%;height: 100%;padding-top: 50;">
            <div style="background-color: white;width: 75%;height: 100%; margin-left: 11.5%;border-top-left-radius: 25px;border-top-right-radius: 25px;">
                <h1 style="text-align: center;padding-top: 4%;font-size: 60px;font-family: arial;">EFFETTUA IL LOGIN</h1>
                <form style="text-align: center;margin-top: 13%;"> 
                    <p style="display: inline;font-size: 25px;">Username:</p> <input id="casella" type="text" style="border-radius: 10px; margin-left:25px; border:1px solid gray;width: 300px;height: 40px;padding-left: 10px;"><br>
                    <p style="display: inline;font-size: 25px;">Password:</p> <input id="casella" type="password" style="margin-left: 30px;margin-top: 4%;border-radius: 10px; border:1px solid gray;width: 300px;height: 40px;padding-left: 10px;"><br>
                    <input id="entra" type="submit" value="entra" style="text-align: center;margin-top: 45px;width: 170px;height: 41px;font-size: 22px; border: 1px solid lightgray;">
                </form>
                <p style="text-align: center; margin-top: 30px;">Non sei ancora registrato? <a href="puttana">registrati qui! </a> </p>
               
            </div>
        </div>
    </body>
    
</html>
