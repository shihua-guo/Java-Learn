a simple node app can modify your linux server file and excute shell
### how to run
#### install the depandencies
```
npm install
```
#### run the app

   - 运行发起请求的客户端（主要就是一个html页面） 3000端口。对应的就是app.js文件
```
npm run client
```

   - 运行不允许跨域的服务端(3001端口)对应的就是app-block.js文件
```
npm run block
```
   - 运行允许跨域的服务端（3002端口）对应的就是app-cors.js文件
```
npm run cors
```
        
#### 访问
