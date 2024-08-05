<%-- 
    Document   : index
    Created on : Jul 30, 2024, 5:12:24 PM
    Author     : Ly Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div class="row">
    <div class="col-md-3 col-12 bg-secondary">
        <c:url value="/" var="action"/>
        <form action="${action}" >
            <div class="mb-3 mt-3">
                <label for="q" class="form-label">Nhập tên:</label>
                <input type="search" class="form-control" id="q" placeholder="tên..." name="q">
            </div>
            <div class="mb-3 mt-3">
                <label for="fromPrice" class="form-label">Từ giá:</label>
                <input type="number" class="form-control" id="fromPrice" placeholder="Từ giá..." name="fromPrice">
            </div>
            <div class="mb-3 mt-3">
                <label for="toPrice" class="form-label">Đến giá:</label>
                <input type="number" class="form-control" id="toPrice" placeholder="Đến giá..." name="toPrice">
            </div>

            <div class="mb-3 mt-3">
                <input type="submit" value="Tìm" class="btn btn-success">
            </div>
        </form>
    </div>
    <div class="col-md-9 col-12">
        <a href="<c:url value="/products" />" class="btn btn-info">Thêm sản phẩm</a>

            <table class="table table-striped">
                <tr>
                    <th></th>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th></th>
                </tr>
                <c:forEach items="${prods}" var="p">
                    <tr>
                        <td>
                            <img width="120" src="${p.image}" alt="${p.name}"/>
                        </td>
                        <td>${p.name}</td>
                        <td>${String.format("%,d",p.price)} VNĐ</td>
                        <td>
                            <a href="#" class="btn btn-info">&longleftarrow;;</a> 
                            <button class="btn btn-danger">&times;</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
