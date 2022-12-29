<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>

<head>
    <title></title>
</head>
<body>
<section>
    <h1>Alta</h1>
    <!--  JSP -->
    <form method="post"  action="<%=request.getContextPath()%>/CreateController">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">idPersona</label>
            <input name="id_persona"  type="number" class="form-control" id="exampleFormControlInput1" placeholder="id_persona" maxlength="50">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">Nombre</label>
            <input name="nombre" type="text" class="form-control" id="exampleFormControlTextarea1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">Apellido</label>
            <input name="apellido" type="text" class="form-control" id="exampleFormControlTextarea1">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlTextarea1" class="form-label">edad</label>
            <input name="edad" type="number" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
        </div>
        <button class="btn btn-primary">
            Dar de alta
        </button>

    </form>
</section>

</body>
</html>