### Requirements

Install postgres (I am using version 15) from their website. Keep track of the username, hostname, password, database name, port etc as you need them later.  
Then run -
```
npm install
```

### Secret File

Create an `.env` file in this folder with the following properties (might vary according to your machine) -

```
PORT=8080
DB_USER=postgres
DB_HOST=localhost
DB_NAME=postgres
DB_PASS=123
DB_PORT=5433
```

### Ignition

To run the test server -
```
npm run dev
```

