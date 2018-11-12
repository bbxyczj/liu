<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form >

    <table>
        <tr>
            <td>用户名</td>
            <td> <input id="name" name="name" /></td>
        </tr>
        <tr>
            <td>password</td>
            <td>
                <input id="password" name="password"/>
            </td>

        </tr>

    </table>
    <div>
        <a style="width: 200px;height: 200px;color: brown" onclick="getUser()" >
            <i>提交</i>
        </a>

    </div>

</form>

</body>
<script src="/js/jquery-2.1.4.js" type="text/javascript"></script>
<script>
    function getUser() {
        var name=$("#name").val();
        var password=$("#password").val();
        $.ajax({
            url:"/login.do",
            dataType:"json",
            type:"post",
            data:"name="+name+"&password="+password,
            success:function (data) {
                if(data.success){
                    alert(data.name);
                }else {
                    alert(data.msg);



                }

            },
            error:function (data) {
                alert(data);
            }
        })

    }

</script>
</html>
