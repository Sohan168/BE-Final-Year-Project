<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Login Page Design</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/logincss.css">
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
</head>
<script>
      
    // When DOM is loaded this 
    // function will get executed
    $(document).ready(function () {

    $("#loginFrm").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();
        console.log("Inside method");
        var obj={
				email:$("#email").val(),
				password:$("#password").val()
				}
        $.ajax({
			url : '/api/login.lti',
			method : 'POST',
			data : JSON.stringify(obj),
			contentType : 'application/json',
			success : function(response) {
				//alert(JSON.stringify(response));
				if(response.message=="Valid User")
					{
					window.location.href=""
					}
				else
					{
					//window.location.href="login.html"
					$("#error").html("Invalid Credentials")
					}
			}
		});

    });

});
   
    </script>
<body>
    <section class="main">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 320"><path fill="#F9C226" fill-opacity="1" d="M0,192L18.5,213.3C36.9,235,74,277,111,256C147.7,235,185,149,222,133.3C258.5,117,295,171,332,197.3C369.2,224,406,224,443,192C480,160,517,96,554,101.3C590.8,107,628,181,665,197.3C701.5,213,738,171,775,176C812.3,181,849,235,886,229.3C923.1,224,960,160,997,133.3C1033.8,107,1071,117,1108,106.7C1144.6,96,1182,64,1218,69.3C1255.4,75,1292,117,1329,165.3C1366.2,213,1403,267,1422,293.3L1440,320L1440,0L1421.5,0C1403.1,0,1366,0,1329,0C1292.3,0,1255,0,1218,0C1181.5,0,1145,0,1108,0C1070.8,0,1034,0,997,0C960,0,923,0,886,0C849.2,0,812,0,775,0C738.5,0,702,0,665,0C627.7,0,591,0,554,0C516.9,0,480,0,443,0C406.2,0,369,0,332,0C295.4,0,258,0,222,0C184.6,0,148,0,111,0C73.8,0,37,0,18,0L0,0Z"></path></svg>
        
        <div class="navigation">
            <div class="brand">
                <h1>CropBazaar Login Page</h1>
            </div>
            <div class="toggle">
                <i class="fas fa-bars"></i>
            </div>
            <div class="nav-menu">
                <div class="close">
                    <i class="fas fa-window-close"></i>
                </div>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Community</a></li>
                    <li><a href="#">Blog</a></li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>
        </div>


        <div class="container">
            <div class="photo">
                <img src="/resources/img/cropimage.jpg">
            </div>

            <div class="form-cont">
                <div class="inner-form">
                    <img src="/resources/img/loginavatar.png" alt="avatar">
                    
                   

                    <div class="input-area">
                        <form id="loginFrm">
                            <div>
                                <i class="fas fa-envelope"></i>
                                <input type="email" placeholder="Email" id="email" required>
                            </div>
                            <div>
                                <i class="fas fa-lock"></i>
                                <input type="password" placeholder="Password" id="password" required>
                            </div>
                            <!--<div>
                                <span>Forget Passwoard? <a href="#">Click Here</a></span>
                            </div> -->
                            <button class="btn" type="submit" id="submitBtn">Login</button>

                            <span>Don't have account?<a href="#">Register Here as Farmer</a></span>
			                <br><span><a href="#">Register Here as Bidder</a></span>
			                
			             
                        </form>
		     <p id="error"></p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script>
        let toggler = document.querySelector('.toggle');
        let menu = document.querySelector('.nav-menu');
        let close = document.querySelector('.close');


        toggler.addEventListener('click', () =>{
            menu.style.display ='block';
            console.log('clicked')
        });

        close.addEventListener('click', () =>{
            menu.style.display = '';
            cons
        });
    </script>
</body>
</html>