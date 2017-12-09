<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>All contacts</title>
    <link href="css/contacts.css" rel="stylesheet"/>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>email</th>
            <th>phone number</th>
        </tr>
        <#list contactList as contact>
        <tr>
            <td>${contact.id}</td>
            <td>${contact.name}</td>
            <td>${contact.email}</td>
            <td>${contact.phoneNumber}</td>
        </tr>
        </#list>
    </table>
</body>
</html>