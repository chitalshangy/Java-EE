function checkRegister(){
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    if(password.length>6){
        alert("密码长度不能超过6位！");
    }
    else if(password==""){
        alert("密码不能为空！");
    }
    else{
        alert("注册成功！");
    }
}