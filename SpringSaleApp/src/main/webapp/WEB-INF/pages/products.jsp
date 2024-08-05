<%-- 
    Document   : products
    Created on : Aug 4, 2024, 8:05:23 PM
    Author     : Ly Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-primary mt-1">QUẢN TRỊ SẢN PHẨM</h1>
<form:form method="post" modelAttribute="product">
    <div class="mb-3 mt-3">
        <label for="name" class="form-label">Tên sản phẩm:</label>
        <!--        //path là trường trong pojo-->
        <form:input path="name" type="text" class="form-control" id="name" placeholder="tên sản phẩm..." name="name" />
    </div>
    <div class="mb-3">
        <label for="price" class="form-label">Giá sản phẩm:</label>
        <form:input path="price" type="price" type="number" class="form-control" id="price" placeholder="Giá sản phẩm: " name="price" />
    </div>
    <select class="form-select">
        <form:select >
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        </form:select>
    </select>
</form:form>