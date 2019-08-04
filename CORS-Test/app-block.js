var express = require('express');
var bodyParser = require('body-parser');
var app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));
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
app.listen(3001);
console.log("app is running on 3001");
