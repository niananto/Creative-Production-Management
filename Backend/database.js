require('dotenv').config();

const { Client, Pool } = require('pg');

const pool = new Pool({
  user: process.env.DB_USER,
  host: process.env.DB_HOST,
  database: process.env.DB_NAME,
  password: process.env.DB_PASS,
  port: process.env.DB_PORT,
})

// pool.query('SELECT NOW()', (error, result) => {
//   if (error) {
//     console.log(error)
//     return
//   }
//   console.log(result.rows[0])
//   pool.end()
// })

module.exports = pool