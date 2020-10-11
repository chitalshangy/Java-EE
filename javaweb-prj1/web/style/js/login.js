function checkPassword(){
    var password=document.getElementById("password").value;
    if(password.length>6){
        alert("密码长度不能超过6位！");
    }
    if(password==""){
        alert("密码不能为空！");
    }
}