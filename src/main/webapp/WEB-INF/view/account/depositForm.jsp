<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>


        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>ATM 입금</h1>
            <hr />
            <form action="/account/deposit" method="post">
                <input type="text" name="amount" placeholder="Enter 입금금액" /><br />
                <input type="text" name="wAccountNumber" placeholder="Enter 입금계좌" /><br />
                <button>입금</button>
            </form>
        </body>

        </html>
        <%@ include file="../layout/footer.jsp" %>