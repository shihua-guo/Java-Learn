var express = require('express');
var bodyParser = require('body-parser');
var app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));
app.get('/utils/jquery.js',function(req,resp,next){
	resp.setHeader('Content-Type', 'text/javascript');
	resp.sendfile(`${__dirname}/src/js/jquery-3.4.1.min.js`);
});
app.get('/index',function(req,resp,next){
	resp.setHeader('Content-Type', 'text/html');
	resp.sendfile(`${__dirname}/src/view/index.html`);
});
app.listen(3000);
console.log("app is running on 3000");
