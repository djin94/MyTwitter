<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>index.php</title>
    <link href="public/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<?php
require 'app/config.php';
?>
<div class="container">

    <div class="row">
        <div class="col-sm-2">
        </div>
        <div class="col-sm-8">
            <h1>Студенты</h1>
            <table class="table table-hover">
                <thead>
                <tr>
                    <td>Номер</td>
                    <td>Имя</td>
                    <td>Фамилия</td>
                </tr>
                </thead>
                <tbody>
                <?php
                $link = require
                $sql = mysql_query($link, "SELECT client_id, client_fname, client_sname FROM client");
                while ($result = mysql_fetch_array($sql)) {
                    echo "<tr><td>".$result['client_id']."</td><td>".$result['client_fname']."</td><td>".$result['client_sname']."</td></tr>";
                }
                ?>
                </tbody>
            </table>
        </div>
        <div class="col-sm-2">
        </div>
    </div>

    <div class="row">
        <div class="col-sm-3">
        </div>
        <div class="col-sm-6">

            <form role="form" action="" method="post">
                <div class="form-group">
                    <label for="idd">Номер</label>
                    <input type="text" name="id" class="form-control" id="idd" placeholder="Номер">
                </div>
                <div class="form-group">
                    <label for="fname">Имя</label>
                    <input type="text" name="fname" class="form-control" id="fname" placeholder="Имя">
                </div>
                <div class="form-group">
                    <label for="sname">Фамилия</label>
                    <input type="text" name="sname" class="form-control" id="sname" placeholder="Фамилия">
                </div>


                <button type="submit" class="btn btn-default">Отправить</button>
            </form>

            <?php
            $id = filter_input(INPUT_POST, 'client_id');
            $fname = filter_input(INPUT_POST, 'client_fname');
            $sname = filter_input(INPUT_POST, 'client_sname');

            if (isset($id) && isset($fname) && isset($sname)) {

                $sql = mysql_query($link, "INSERT INTO client (client_id, client_fname, client_sname) VALUES ('$id', '$fname', '$sname')");

                if ($sql) {
                    echo '<div class="alert alert-success">Данные успешно добавлены в таблицу.</div>';
                } else {
                    echo '<div class="alert alert-danger">Произошла ошибка.</div>';
                }

                header("Location: http://".$_SERVER['SERVER_NAME']."/".$_SERVER['REQUEST_URI']);
            }
            ?>
        </div>
        <div class="col-sm-3">
        </div>
    </div>
</div>
<div
<script src="public/js/jquery-3.1.0.min.js"></script>
<script src="public/js/bootstrap.min.js"></script>
</body>
</html>