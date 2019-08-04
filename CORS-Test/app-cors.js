var express = require('express');
var bodyParser = require('body-parser');
var app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));
app.use(function (req, res, next) {
	res.header("Access-Control-Allow-Origin", "http://localhost:3000");
	res.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS");
	res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization, Access-Control-Allow-Credentials");
	res.header("Access-Control-Allow-Credentials", "true");
	next();
  });
app.post('/data',function(req,resp,next){
	resp.send({
		"name":"foo",
		"age":22
	});
});
app.get('/data',function(req,resp,next){
	resp.send({
		"name":"foo",
		"age":22
	});
});
app.listen(3002);
console.log("app is running on 3002");
