require('dotenv').config();
const express = require('express');
const app = express();

const db = require('./database');

////////////////////////////////////////////

app.get('/', function (req, res) {
  db.query('SELECT NOW()', (error, result) => {
    if (error) {
      console.log(error)
      return
    }
    res.status(200).send(result.rows[0])
    db.end()
  })
});

////////////////////////////////////////////

const PORT = process.env.PORT || 8080;

app.listen(PORT, function () {
	console.log(`server started at http://localhost:${PORT}`);
});