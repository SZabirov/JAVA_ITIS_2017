<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Детишки</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Письма от детей:</h1>
<table class="table">
    <tr>
        <th>Номер ребенка</th>
        <th>Имя</th>
        <th>Индекс поведения</th>
        <th>Наличие письма</th>
    </tr>

    <#list kidList as kid>
    <tr>
        <td>${kid.id}</td>
        <td>${kid.name}</td>
        <td>${kid.rating}</td>
        <td>
            <#if kid.emailExists?string('yes','no') == 'no'>
                <!-- НАДО ДОБАВИТЬ ССЫЛКУ НА ЛОГИКУ ПИСЬМА -->
                <a href="/kidLetters/${kid.letterId}">
                    <img src="/images/mail.png" width="35" height="35">
                </a>
            </#if>
        </td>
    </tr>
    </#list>
</table>
</div>
</body>
</html>